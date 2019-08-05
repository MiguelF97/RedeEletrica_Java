package Projeto;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.SeparateChainingHashST;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.FlowEdge;
import edu.princeton.cs.algs4.FordFulkerson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Rede {

    private int num_cidades;

    private int num_fontes;

    private SeparateChainingHashST<Integer, Distribuidor> cidades = new SeparateChainingHashST<>();

    private SeparateChainingHashST<Integer, Casa> casasT = new SeparateChainingHashST<>();

    private SeparateChainingHashST<Integer, Equipamento> equipamentosT = new SeparateChainingHashST<>();

    private RedBlackBST<Integer, HistDistribuicao> historicoT = new RedBlackBST<>();

    private ArrayList<Fonte> Fontes = new ArrayList<>();

    private CommunicationGraph grafo;

    public Rede() {
        lerFontes();
    }

//Vai buscar os distribuidores para a list no Gui
    public ArrayList<String> getDistribuidores(String Nome) {
        ArrayList<String> NomesCidades = new ArrayList<>();
        ArrayList<Integer> Ligacao1 = new ArrayList<>();
        ArrayList<Integer> Ligacao2 = new ArrayList<>();

        for (int i = 0; i < this.num_fontes; i++) {
            if (this.Fontes.get(i).getTipo().equals(Nome)) {

                int n_fontes = this.num_fontes;

                String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoesG-D.txt";
                String Teste;

                try (BufferedReader as = new BufferedReader(new FileReader(FILENAME))) {

                    String sCurrentLines;

                    while ((sCurrentLines = as.readLine()) != null) {

                        String[] token = sCurrentLines.split(";");
                        Ligacao1.add(Integer.parseInt(token[0]));
                        Ligacao2.add(Integer.parseInt(token[1]));
                    }

                    as.close();
                } catch (IOException e) {
                }
                //-----

                for (int b = 0; b < Ligacao1.size(); b++) {
                    if (Ligacao1.get(b) == i) {
                        NomesCidades.add(this.cidades.get(Ligacao2.get(b)).getName());
                    }
                }
                return NomesCidades;

            }

        }
        return null;

    }
//Vai buscar as casas para a list no Gui
/**
 * 
 * @param Nome
 * @return 
 */
    public ArrayList<String> getCasas(String Nome) {
        ArrayList<String> Casas = new ArrayList<>();
        String casa = "Casa";
        String coisa;

        for (int i = 0; i < this.cidades.size(); i++) {
            if (this.cidades.get(i).getName().equals(Nome)) {
                for (int b = 0; b < cidades.get(i).getnCasas(); b++) {
                    String str = String.valueOf(b);
                    coisa = casa + "-" + str;
                    Casas.add(coisa);
                }

                return Casas;
            }

        }

        return null;
    }
//Edita uma fonte na base de dados

    public boolean EditarFonte(String Nome, String NomeEditar, int Energia) {
        for (int i = 0; i < this.num_fontes; i++) {
            if (this.Fontes.get(i).getTipo().equals(Nome)) {
                this.Fontes.get(i).setTipo(NomeEditar);
                this.Fontes.get(i).seteGerada(Energia);
                criarFontes("", 0, 0);
                return true;
            }
        }
        return false;
    }

//verifica se a potencia contratada e suficiente para os equipamentos todos ligados
    public void CheckPotenciaContratada(String nomeZona, int idCasa) {
        int energiaInsta = 0;
        int sumTotalGasta = 0;
        int sumTotalGerada = 0;
        int energiaInstaGerada = 0;
        int constante = 0;
        int i, c;

        for (i = 0; i < cidades.size(); i++) {

            if (cidades.get(i).getName().equals(nomeZona)) {
                if (cidades.get(i).getnCasas() > idCasa ) {
                    for (c = 0; c < cidades.get(i).getCasas().get(idCasa).getNum_equipamentos(); c++) {
                        if (cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getTipo().equals("Consumidor") && cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).isEstado() == true) {
                            constante++;
                            energiaInsta = energiaInsta + cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).geteConsumida();
                        }

                        if (cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getTipo().equals("Gerador") && cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).isEstado() == true) {
                            constante++;
                            energiaInstaGerada = energiaInstaGerada + cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).geteConsumida();
                        }

                    }
                }
            }
        }
        System.out.println("---");

        if (cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaTotalGasta() >= cidades.get(i - 1).getCasas().get(idCasa).getPotenciaContratada()) {
            System.out.println("\n-----Com Todos os Equipamentos Consumidores Ligados, a Energia Gasta ultrapassa a Potencia Contratada----\n");
            System.out.println("Energia Total--->" + cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaTotalGasta() + "\nPotenciaContratada--->" + cidades.get(i - 1).getCasas().get(idCasa).getPotenciaContratada());
            //FALTA ADICIONAR A PERGUNTA DE POR UM GERADOR NA CASA!

            if (cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaG() - cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaTotalGasta() <= cidades.get(i - 1).getCasas().get(idCasa).getPotenciaContratada() + cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaG()) {
                System.out.println("\nNo Entanto Com os Equipamentos Geradores Ligados Ja Nao ultrapassa a PotenciaContratada:");
                System.out.println("PotenciaContratada--->" + cidades.get(i - 1).getCasas().get(idCasa).getPotenciaContratada());
                System.out.println("Energia Consumida (Tudo Ligado)--->" + (cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaG() - cidades.get(i - 1).getCasas().get(idCasa).calcularEnergiaTotalGasta()) * -1);
            }

            if (constante == 0) {
                System.out.println("\n--------Nao foram encontrados registos nesta pesquisa :< --------\n");
            }

        }

    }
//print aparelhos de uma zona/distribuidor

    public ArrayList<String> PrintAparelhosdeUmaCasa(String nomeZona) {

        ArrayList<String> Equipamentos = new ArrayList<>();
        int constant = 0, idZona = 0;

        String[] token = nomeZona.split("-");

        idZona = Integer.parseInt(token[0]);
        int idCasa = Integer.parseInt(token[2]);

        for (int c = 0; c < cidades.get(idZona).getCasas().get(idCasa).getNum_equipamentos(); c++) {
            constant++;
            Equipamentos.add(cidades.get(idZona).getCasas().get(idCasa).getEquipamentos().get(c).getNome());
        }

        if (constant == 0) {

            System.out.println("\n--------Nao foram encontrados registos nesta pesquisa :< --------\n");
        }

        return Equipamentos;
    }
//Print das casas mais gastadoras num intervalo de tempo

    public String PrintCasasMaisGastadoras(String data1, String data2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        java.util.Date date1 = sdf.parse(data1);//milli
        java.util.Date date2 = sdf.parse(data2);
        int constante = 0;
        double count = 0;
        String Tudo = "";

        ArrayList<Double> Custos = new ArrayList<>();
        ArrayList<Double> CustosOrder = new ArrayList<>();
        ArrayList<Integer> Ids = new ArrayList<>();

        for (int i = 0; i < cidades.size(); i++) {

            for (int c = 0; c < cidades.get(i).getCasas().size(); c++) {
                count = 0;
                for (int as = 0; as < cidades.get(i).getCasas().get(c).getEquipamentos().size(); as++) {

                    for (int and = 0; and < cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().size(); and++) {

                        /*
                              if(count==0)
                              {
                                  System.out.println("\n------------------------------------------------Zona->"+cidades.get(i).getName()+"||Casa->"+cidades.get(i).getCasas().get(c).getId()+"||NumEquipamentos->"+cidades.get(i).getCasas().get(c).getNum_equipamentos()+"------------------------------------------------\n");
                              }*/
                        if (cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().get(and).getStartTime() >= date1.getTime() && cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().get(and).getOffTime() <= date2.getTime() && cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().get(and).getOffTime() != 0 && cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getTipo().equals("Consumidor")) {

                            constante++;
                            Calendar calendar = Calendar.getInstance();
                            //                   System.out.println("Gastou\\Gerou--->"+cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().get(and).getEnergiaGasta()+" EnergiaEletrica\n");

                            count = cidades.get(i).getCasas().get(c).getEquipamentos().get(as).getHistorico().get(and).getEnergiaGasta() + count;
                        }

                    }

                }
                //    System.out.println(count);
                Ids.add(cidades.get(i).getCasas().get(c).getId());
                Custos.add(count);
                CustosOrder.add(count);
            }

        }

        Collections.sort(CustosOrder);
        int peim = 0;
        for (int i = CustosOrder.size() - 1; i != 0; i--) {
            for (int b = CustosOrder.size() - 1; b != 0; b--) {
                if (CustosOrder.get(i).equals(Custos.get(b))) {
                    if (peim == 0) {
                        Tudo = Tudo + "\n-------------CASAS ORDENADAS POR CUSTO NO INTERVALO DE TEMPO PEDIDO-------------\n";
                    }
                    if (CustosOrder.get(i) != 0) {
                        Tudo = Tudo + "ZONA--->" + casasT.get(constante).getZona() + "  CASA--->" + Ids.get(0) + "  CUSTOS--->" + CustosOrder.get(i) + "\n";
                        peim++;
                    }

                }
            }
        }

        if (constante == 0) {
            Tudo = Tudo + "\n--------Nao foram encontrados registos nesta pesquisa :< --------\n";
            return Tudo;
        }
        return Tudo;
    }
//print historico de uma casa num intervalo de tempo

    public String PrintHistCasa(String nomeZona, int idCasa, String data1, String data2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        java.util.Date date1 = sdf.parse(data1);
        java.util.Date date2 = sdf.parse(data2);
        String Tudo = "";
        int constante = 0;

        for (int i = 0; i < cidades.size(); i++) {

            if (cidades.get(i).getName().equals(nomeZona)) {
                if (cidades.get(i).getnCasas() >= idCasa + 1) {
                    for (int c = 0; c < cidades.get(i).getCasas().get(idCasa).getNum_equipamentos(); c++) {
                        int count = 0;
                        for (int as = 0; as < cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().size(); as++) {

                            if (cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getStartTime() >= date1.getTime() && cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getOffTime() <= date2.getTime() && cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getOffTime() != 0) {
                                if (count == 0) {
                                    Tudo = Tudo + "\n------------------------------------------------" + cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getNome() + "------------------------------------------------\n";
                                }

                                constante++;
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getStartTime());
                                Tudo = Tudo + "Ligado no dia--->" + calendar.getTime();
                                calendar.setTimeInMillis(cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getOffTime());
                                Tudo = Tudo + "Desligad no dia--->" + calendar.getTime();
                                Tudo = Tudo + "Gastou\\Gerou--->" + cidades.get(i).getCasas().get(idCasa).getEquipamentos().get(c).getHistorico().get(as).getEnergiaGasta() + " EnergiaEletrica\n\n";

                                count++;
                            }

                        }

                    }
                }
            }
        }

        if (constante == 0) {
            String Erro = "\n--------Nao foram encontrados registos nesta pesquisa :< --------\n";
            return Erro;
        }
        return Tudo;
    }
//print os equipamentos das casas

    public String PrintCasasEquipamentos(String zona, int casa) {
        int count = 0;
        String Tudo = "";
        for (int i = 0; i < this.num_cidades; i++) {
            if (this.cidades.get(i).getName().equals(zona)) {
                for (int b = 0; b < cidades.get(i).getnCasas(); b++) {
                    if (casa == -1) {
                        Tudo = Tudo + "\nZona-->" + zona + "\nCasa-->" + b;
                        for (int c = 0; c < cidades.get(i).getCasas().get(b).getNum_equipamentos(); c++) {
                            Tudo = Tudo + cidades.get(i).getCasas().get(b).getEquipamentos().get(c).toString();
                        }
                        count++;
                    }
                    if (b == casa) {
                        Tudo = Tudo + "\nZona-->" + zona + "\nCasa-->" + casa;
                        for (int c = 0; c < cidades.get(i).getCasas().get(b).getNum_equipamentos(); c++) {
                            Tudo = Tudo + cidades.get(i).getCasas().get(b).getEquipamentos().get(c).toString();
                        }
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            Tudo = Tudo + "\n---REGISTOS NAO ENCONTRADOS---\n";
        }
        return Tudo;
    }

//Verifica se o grafo e conexo
    public void GraphConexo() {
        DepthFirstSearch teste = new DepthFirstSearch(this.getGrafo(), 0);
        System.out.println(teste.count());
        if (teste.count() == this.getGrafo().V()) {
            System.out.println("\n--------------\nGRAFO É CONEXO\n--------------\n");
        } else {
            System.out.println("\n--------------\nGRAFO NAO CONEXO\n--------------\n");
        }
    }
//Atualiza as ligacoes entre geradores e distribuidores do grafo

    public void AtualizarLigacoesD(CommunicationGraph graph, ArrayList<CommunicationNode> nodosD, ArrayList<CommunicationNode> nodosG) {
        int ligacao1 = 0, ligacao2 = 0;
        String pathLigacoes = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoes.txt";
        String pathLigacoes2 = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoesG-D.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(pathLigacoes))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] token = sCurrentLine.split(";");

                ligacao1 = Integer.parseInt(token[0]);
                ligacao2 = Integer.parseInt(token[1]);

                graph.addEdge(nodosD.get(ligacao1), nodosD.get(ligacao2), 10000, 0);
                graph.addEdge(nodosD.get(ligacao2), nodosD.get(ligacao1), 10000, 0);

            }
            br.close();
        } catch (IOException e) {
        }

        try (BufferedReader as = new BufferedReader(new FileReader(pathLigacoes2))) {

            String sCurrentLine;

            while ((sCurrentLine = as.readLine()) != null) {
                String[] token = sCurrentLine.split(";");

                ligacao1 = Integer.parseInt(token[0]);
                ligacao2 = Integer.parseInt(token[1]);

                graph.addEdge(nodosG.get(ligacao1), nodosD.get(ligacao2), this.getFontes().get(ligacao1).geteGerada(), 0);
                //      graph.addEdge(nodosG.get(ligacao2),nodosD.get(ligacao1),10000,0);

            }
            as.close();
        } catch (IOException e) {
        }

    }
//Suppostamente criava e organizava o flow /Incorreto

    public void AjustarTodasLigacoes(CommunicationGraph graph, ArrayList<CommunicationNode> nodosD) {
        //  int teste=(int) graph.adj(1).iterator().next().;

        String ligBarata = null;
        int flowTotal = 0, capacidadeT = 0;
        int flowTotalG = 0, capacidadeTG = 0;
        System.out.println("\n---\nV:" + graph.V() + "  E:" + graph.E() + "\n");
        for (int v = (graph.V() - 1); v != -1; v--) {
            System.out.println(v + ":  ");
            for (FlowEdge e : graph.adj(v)) {

                if (v >= graph.V() - casasT.size()) {
                    if (e.to() == v) {
                        DijkstraSP caminhoCurto = new DijkstraSP(graph, 0);

// FordFulkerson maxflow = new FordFulkerson(graph, 0, 8);
                        capacidadeT = 0;
                        flowTotal = 0;
                        int energiaGastaC = casasT.get(v - this.getNum_cidades() - 1).calcularEnergia() - casasT.get(v - this.getNum_cidades() - 1).calcularEnergiaG();
                        if (energiaGastaC < 0) {
                            energiaGastaC = 0; //CASO A CASA PRODUZA MAIS ENERGIA DO QUE A QUE PRECISA :>
                        }
                        int capacidadeM = casasT.get(v - this.getNum_cidades() - 1).getPotenciaContratada();
                        flowTotal = flowTotal + energiaGastaC;
                        capacidadeT = capacidadeT + capacidadeM;
                        //   e.setFlow(flowTotal);
                        for (FlowEdge g : caminhoCurto.pathTo(e.to())) {
                            System.out.println(g.from() + "->" + g.to() + ":" + g.capacity());
                            g.setCapacity(capacidadeT + g.capacity());
                            g.setFlow(flowTotal + g.flow());
                        }
                        //-----------------

                        DijkstraSP caminhoCurtoG = new DijkstraSP(graph, v);
                        capacidadeTG = 0;
                        flowTotalG = 0;
                        int energiaGerada = casasT.get(v - this.getNum_cidades() - 1).calcularEnergiaG() - casasT.get(v - this.getNum_cidades() - 1).calcularEnergia();
                        int capacidadeMG = casasT.get(v - this.getNum_cidades() - 1).calcularEnergiaG() - casasT.get(v - this.getNum_cidades() - 1).calcularEnergia();
                        capacidadeTG = capacidadeTG + capacidadeMG;
                        flowTotalG = energiaGerada;
                        if (capacidadeTG < 0) {
                            capacidadeTG = 0;
                            flowTotalG = 0;
                        }
                        for (FlowEdge c : caminhoCurtoG.pathTo(0)) {

                            c.setCapacity(capacidadeTG + c.capacity());
                            c.setFlow(flowTotalG + c.flow());
                            System.out.println(flowTotalG + c.flow());
                        }
                    }

                }

            }

        }

    }
//Cria os nodos e ligacoes do grafo

  public void CriarGrafo(int numeroNodos, int numCidades) {
        ArrayList<CommunicationNode> nodosD = new ArrayList<CommunicationNode>();
        ArrayList<CommunicationNode> nodosG = new ArrayList<CommunicationNode>();

        CommunicationGraph graph = new CommunicationGraph(numeroNodos + this.getNum_fontes() + numCidades);
        this.setGrafo(graph);
   
            for (int as = 0; as < this.getNum_fontes(); as++) {
                CommunicationNode c0 = new CommunicationNode();
                graph.addNode(c0);
                nodosG.add(c0);
            
            /*
         CommunicationNode c0 = new CommunicationNode();//energia gerada
         CommunicationNode c1 = new CommunicationNode();//energia distribuida
         nodosD.add(c1);
         graph.addNode(c0);
         graph.addNode(c1);
         graph.addEdge(c0, c1,0,0);
         graph.addEdge(c1, c0,10000,0);//1000watts por hora transferidos para o ponto de distribuicao c1==0
             */
        }
        for (int b = 0; b < numCidades; b++)//for para os nodos de distribuicao ook???????
        {
            CommunicationNode c0 = new CommunicationNode();
            graph.addNode(c0);
            nodosD.add(c0);
        }
        AtualizarLigacoesD(graph, nodosD, nodosG);

        for (int b = 0; b < numCidades; b++) {
            int EnergiaConsumida = 0;
            for (int c = 0; c < cidades.get(b).getnCasas(); c++) {
                CommunicationNode c0 = new CommunicationNode();
                graph.addNode(c0);
                EnergiaConsumida = EnergiaConsumida + cidades.get(b).getCasas().get(c).calcularEnergia();//
                graph.addEdge(nodosD.get(b), c0, 2000, 0);

                graph.addEdge(c0, nodosD.get(b), 2000, 0);

                //---------------CASO HAJA FALTA DE ENERGIA MANDAR UM CATCH---------------
                //alterar a energia que é necessaria na casa
            }

        }
        // System.out.println("\n+++"+graph.adj(0).iterator().next().);
        //   AjustarTodasLigacoes(graph,nodosD);      
        //  FordFulkerson();

        System.out.println("Graph: " + graph);
        System.out.println("Graph -> V: " + graph.V());
        System.out.println("Graph -> edges: ");
        for (FlowEdge de : graph.edges()) {
            System.out.println(de.from() + " " + de.to() + " " + de.capacity());
        }


    }
//*Mete todas as casas Equipamentos e Historiso de toda a base de dados nas STs

    public void allTogether() {
        int countC = 0;
        int countE = 0;
        int countH = 0;
        for (int i = 0; i < getCidades().size(); i++) {
            for (int b = 0; b < getCidades().get(i).getCasas().size(); b++) {
                for (int c = 0; c < getCidades().get(i).getCasas().get(b).getEquipamentos().size(); c++) {
                    for (int d = 0; d < getCidades().get(i).getCasas().get(b).getEquipamentos().get(c).getHistorico().size(); d++) {

                        historicoT.put(countH, getCidades().get(i).getCasas().get(b).getEquipamentos().get(c).getHistorico().get(d));
                        countH++;
                    }
                    equipamentosT.put(countE, getCidades().get(i).getCasas().get(b).getEquipamentos().get(c));
                    countE++;
                }
                casasT.put(countC, getCidades().get(i).getCasas().get(b));
                countC++;
            }
        }
        System.out.println("\n--Total feito--\n");
        CriarGrafo(casasT.size(), cidades.size());
    }

//Remove uma fonte da base de dados
    public void removeFontes(String nome) {
        ArrayList<Integer> LigG = new ArrayList<>();
        ArrayList<Integer> LigD = new ArrayList<>();

        int count = 0;
        int G = 0;
        int D = 0;
        int asd = 0;
        for (int i = 0; i < this.getNum_fontes(); i++) {
            if (getFontes().get(i).getTipo().equals(nome)) {
                getFontes().remove(i);
                this.setNum_fontes(this.getNum_fontes() - 1);
                criarFontes(null, 0, 0);
                count++;
                asd = i;

                String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoesG-D.txt";

                try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

                    //String sCurrentLine;
                    for (String line; (line = br.readLine()) != null;) {

                        String[] token = line.split(";");

                        G = Integer.parseInt(token[0]);
                        D = Integer.parseInt(token[1]);

                        if (G != i) {
                            if (i < G) {
                                LigG.add(G - 1);
                                LigD.add(D);
                            }
                            if (i > G) {
                                LigG.add(G);
                                LigD.add(D);
                            }
                        }

                    }

                    br.close();
                } catch (IOException e) {
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

                    for (int b = 0; b < LigG.size(); b++) {
                        bw.write(LigG.get(b) + ";" + LigD.get(b) + ";");
                        bw.newLine();
                    }

                    System.out.println("Done");
                    bw.close();
                } catch (IOException e) {
                }

            }

        }
        if (count == 0) {
            System.out.println("\nRegisto Nao Encontrado");
        } else {
            //HElP
        }

    }
//*Le fontes dos ficheiros txt

    public void lerFontes() {
        int n_fontes = 0;

        String FONTESPATH = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\n_fontes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FONTESPATH))) {

            n_fontes = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
        }
        System.out.printf("NºFontes->%d\n", n_fontes);
        this.setNum_fontes(n_fontes);

        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Fontes.txt";
        int Energia = 0;
        String Nome;

        try (BufferedReader as = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLines = as.readLine();

            while ((sCurrentLines = as.readLine()) != null) {

                String[] token = sCurrentLines.split(";");
                Energia = Integer.parseInt(token[0]);
                Nome = token[1];
                Fonte c1 = new Fonte(Nome, Energia);
                getFontes().add(c1);

            }

            as.close();
        } catch (IOException e) {
        }

    }
//*Criar uma nova Fonte ou atualiza o ficheiro txt caso haja alguma ediçao (flag)

    public void criarFontes(String name, int energia, int flag) {
        String numero_cidades = null;
        if (flag == 1) {
            Fonte c1 = new Fonte(name, energia);
            getFontes().add(c1);

            this.setNum_fontes(this.getNum_fontes() + 1);
        }
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\n_fontes.txt";
        String FILENAME2 = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Fontes.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            int nfontes = this.getNum_fontes();
            numero_cidades = Integer.toString(nfontes);
            bw.write(numero_cidades);

        } catch (IOException e) {
        }
        try (BufferedWriter bs = new BufferedWriter(new FileWriter(FILENAME2))) {

            bs.write(numero_cidades);
            bs.newLine();
            for (int i = 0; i < this.getNum_fontes(); i++) {
                bs.write(getFontes().get(i).geteGerada() + ";" + getFontes().get(i).getTipo() + ";");
                bs.newLine();
            }
            bs.close();
        } catch (IOException e) {
        }
    }

//Edita o nome das cidades/distribuidores
    public void editarCidades(String nome, String novoNome) {
        for (int i = 0; i < this.num_cidades; i++) {
            if (this.getCidades().get(i).getName().equals(nome)) {
                this.getCidades().get(i).setName(novoNome);
                criarCidade(null, -1);
            }
        }
    }
//Le as cidades dos ficheiros txt 

    public void lerCidades() {

        int n_cidades = 0;
        int count = 0;

        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\n_cidades.txt";
        // String[] cidades = null;

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {

                if (count == 0) {
                    n_cidades = Integer.parseInt(sCurrentLine);
                    //cidades = new String[n_cidades];
                } else {
                    Distribuidor cd1 = new Distribuidor(sCurrentLine, count - 1);
                    this.getCidades().put(count - 1, cd1);
                    //cidades[count-1]=sCurrentLine;
                }
                count++;
            }
            br.close();
        } catch (IOException e) {
        }
        System.out.printf("NºCidades->%d\n", n_cidades);
        this.setNum_cidades(n_cidades);

        // System.out.println(cidades.get(0).getName());
    }

    public boolean RemoverCidades(String Nome) {
        for (int i = 0; i < this.num_cidades; i++) {
            if (this.getCidades().get(i).getName().equals(Nome)) {
                this.cidades.delete(i);
                this.num_cidades--;
                criarCidade(null, 1);
                ApagarFileCidade(i);
                RefreshLigacoesDist(i);
                RefreshLigacoesEntreDist(i);

                return true;
            }
        }
        return false;
    }

    public void RefreshLigacoesDist(int id) {
        ArrayList<Integer> LigG = new ArrayList<>();
        ArrayList<Integer> LigD = new ArrayList<>();

        int count = 0;
        int G = 0;
        int D = 0;
        int peim = 0;

        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoesG-D.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            for (String line; (line = br.readLine()) != null;) {

                String[] token = line.split(";");

                G = Integer.parseInt(token[0]);
                D = Integer.parseInt(token[1]);

                if (D == id) {
                    peim = 1;
                }

                if (D != id) {
                    LigG.add(G);
                    LigD.add(D);
                }

            }
            br.close();
        } catch (IOException e) {
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            for (int b = 0; b < LigG.size(); b++) {
                if (peim == 1) {
                    if (LigD.get(b) > id) {
                        bw.write(LigG.get(b) + ";" + (LigD.get(b) - 1) + ";");
                        bw.newLine();
                    }
                    if (LigD.get(b) < id) {
                        bw.write(LigG.get(b) + ";" + LigD.get(b) + ";");
                        bw.newLine();
                    }
                } else {

                    bw.write(LigG.get(b) + ";" + LigD.get(b) + ";");
                    bw.newLine();
                }

            }

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {

        }
        if (count == 0) {
            System.out.println("\nRegisto Nao Encontrado");
        } else {
            //HElP
        }

    }

    public void RefreshLigacoesEntreDist(int id) {
        ArrayList<Integer> LigG = new ArrayList<>();
        ArrayList<Integer> LigD = new ArrayList<>();

        int count = 0;
        int G = 0;
        int D = 0;
        int peim = 0;

        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            for (String line; (line = br.readLine()) != null;) {

                String[] token = line.split(";");

                G = Integer.parseInt(token[0]);
                D = Integer.parseInt(token[1]);

                if (D == id) {
                    peim = 1;
                }
                if (D != id && G != id) {
                    if (G > id && peim == 1) {
                        LigG.add(G - 1);
                    }
                    if (D > id && peim == 1) {
                        LigD.add(D - 1);
                    }
                    if (G < id && peim == 1) {
                        LigG.add(G);
                    }
                    if (D < id && peim == 1) {
                        LigD.add(D);
                    }

                    if (peim == 0) {
                        LigG.add(G);
                        LigD.add(D);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            for (int b = 0; b < LigG.size(); b++) {

                bw.write(LigG.get(b) + ";" + LigD.get(b) + ";");
                bw.newLine();

            }

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {

        }
        if (count == 0) {
            System.out.println("\nRegisto Nao Encontrado");
        } else {
            //HElP
        }

    }

    public void ApagarFileCidade(int id) {
        String str = Integer.toString(id);
        String str2 = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\Cidade" + str;
        File file = new File(str2);

        if (file.delete()) {
            System.out.println("Ficheiro apagado");
        } else {
            System.out.println("Erro ao apagar o ficheiro");
        }

    }

//*Criar uma nova cidade/distribuidor ou atualiza o ficheiro txt caso haja alguma ediçao (flag)
    public void criarCidade(String name, int flag) {

        int n_cidade = this.getNum_cidades();
        String str = Integer.toString(n_cidade);
        String str2 = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\Cidade" + str;
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\n_cidades.txt";
        if (flag == 0) {
            Distribuidor cd1 = new Distribuidor(name, n_cidade - 1);
            this.getCidades().put(n_cidade, cd1);
            this.num_cidades = this.getCidades().size();
            n_cidade++;
            new File(str2).mkdirs();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            String numero_cidades = Integer.toString(n_cidade);

            bw.write(numero_cidades);
            for (int i = 0; i < n_cidade; i++) {
                bw.newLine();
                bw.write(getCidades().get(i).getName());
            }

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {
        }
    }
//*Adiciona Novas ligacoes entre Geradores e Distribuidores

    public void adicionarLigacoes(String nome, int id) {
        ArrayList<Integer> LigG = new ArrayList<>();
        ArrayList<Integer> LigD = new ArrayList<>();
        int idd = 0;
        for (idd = 0; idd < this.num_cidades; idd++) {
            if (this.cidades.get(idd).getName().equals(nome)) {
                break;
            }
        }
        if (id > this.cidades.size()) {
            return;
        }

        int count = 0;
        int G = 0;
        int D = 0;
        int asd = 0;

        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\ligacoesG-D.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            for (String line; (line = br.readLine()) != null;) {

                String[] token = line.split(";");

                G = Integer.parseInt(token[0]);
                D = Integer.parseInt(token[1]);

                LigG.add(G);
                LigD.add(D);

            }

            br.close();
        } catch (IOException e) {
        }
        LigG.add(id);
        LigD.add(idd);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            for (int b = 0; b < LigG.size(); b++) {
                bw.write(LigG.get(b) + ";" + LigD.get(b) + ";");
                bw.newLine();
            }

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {

        }
        if (count == 0) {
            System.out.println("\nRegisto Nao Encontrado");
        } else {
            //HElP
        }

    }

    public void AtualizarPotenciaCasaNova(int id_cidade) {
        int n_casas = this.cidades.get(id_cidade).getnCasas();

        String auxStr = Integer.toString(n_casas - 1);
        String str = Integer.toString(id_cidade);
        String str2 = "\\Cidade";
        String str4 = "\\Casa";
        String str5 = "\\info_casa.txt";
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades";
        String FILENAME2 = FILENAME + str2 + str + str4 + auxStr + str5;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME2))) {

            bw.write(0);
            bw.newLine();
            bw.write(String.valueOf(this.cidades.get(id_cidade).getCasas().get(n_casas - 1).getPotenciaContratada()));

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {
        }

    }

    public void EditarCasas(int IdCidade, int IdCasa, int PotenciaContratada) {
        String auxStr = Integer.toString(IdCasa);
        String str = Integer.toString(IdCidade);
        String str2 = "\\Cidade";
        String str4 = "\\Casa";
        String str5 = "\\info_casa.txt";
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades";
        String FILENAME2 = FILENAME + str2 + str + str4 + auxStr + str5;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME2))) {

            bw.write(String.valueOf(this.getCidades().get(IdCidade).getCasas().get(IdCasa).getNum_equipamentos()));
            bw.newLine();
            bw.write(String.valueOf(PotenciaContratada));

            System.out.println("Done");
            bw.close();
        } catch (IOException e) {
        }

    }

    public String CasasComProdutores() {
        String Tudo = "";

        for (int i = 0; i < this.getNum_cidades(); i++) {
            for (int b = 0; b < this.getCidades().get(i).getnCasas(); b++) {
                for (int c = 0; c < this.getCidades().get(i).getCasas().get(b).getEquipamentos().size(); c++) {
                    if (this.getCidades().get(i).getCasas().get(b).getEquipamentos().get(c).getTipo().equals("Gerador")) {
                        Tudo = Tudo + "\nDistribuidor->" + this.getCidades().get(i).getName() + "\nCasa->Casa" + this.getCidades().get(i).getCasas().get(b).getId() + "\nEquipamento->" + this.getCidades().get(i).getCasas().get(b).getEquipamentos().get(c).getNome();
                    }
                }
            }
            Tudo = Tudo + "\n";

        }
        if (Tudo.equals("")) {
            Tudo = Tudo + "Nao foram Encontradas casas com geradors :<";
        }
        return Tudo;
    }

    public String CasasSustentaveis() {
        String Tudo = "";
        int energiaGasta = 0;
        int energiaGerada = 0;

        for (int i = 0; i < this.getNum_cidades(); i++) {
            for (int b = 0; b < this.getCidades().get(i).getnCasas(); b++) {

                energiaGasta = this.getCidades().get(i).getCasas().get(b).calcularEnergia();
                energiaGerada = this.getCidades().get(i).getCasas().get(b).calcularEnergiaG();
                if (energiaGerada >= energiaGasta && energiaGasta != 0) {
                    Tudo = Tudo + "\nDistribuidor->" + this.getCidades().get(i).getName() + "\nCasa->Casa" + this.getCidades().get(i).getCasas().get(b).getId() + "\nEnergiaGasta-->" + energiaGasta + "\nEnergiaGerada-->" + energiaGerada + "\n\n";
                }
            }

        }
        return Tudo;
    }

    public String PrintCasasSustentaveis() {

        int constante = 0;
        double count = 0;
        String Tudo = "";

        ArrayList<Double> Custos = new ArrayList<>();
        ArrayList<Double> CustosOrder = new ArrayList<>();
        ArrayList<Integer> Ids = new ArrayList<>();

        for (int i = 0; i < cidades.size(); i++) {

            for (int c = 0; c < cidades.get(i).getCasas().size(); c++) {
                count = 0;
                for (int as = 0; as < cidades.get(i).getCasas().get(c).getEquipamentos().size(); as++) {
                    constante++;
                    count = cidades.get(i).getCasas().get(c).calcularEnergia() - cidades.get(i).getCasas().get(c).calcularEnergiaG() + count;

                }

                Ids.add(cidades.get(i).getCasas().get(c).getId());
                Custos.add(count);
                CustosOrder.add(count);

            }

        }

        Collections.sort(CustosOrder);
        int peim = 0;
        for (int i = CustosOrder.size() - 1; i != 0; i--) {
            for (int b = CustosOrder.size() - 1; b != 0; b--) {
                if (CustosOrder.get(i).equals(Custos.get(b))) {
                    if (peim == 0) {
                        Tudo = Tudo + "\n-------------CASAS ORDENADAS POR POIR SUSTENTABILIDADE-------------\n";
                    }
                    if (CustosOrder.get(i) != 0) {
                        Tudo = Tudo + "ZONA--->" + casasT.get(b).getZona() + "  CASA--->" + Ids.get(b) + "  CUSTOS--->" + CustosOrder.get(i) + "\n";
                        peim++;
                    }

                }
            }
        }

        if (constante == 0) {
            Tudo = Tudo + "\n--------Nao foram encontrados registos nesta pesquisa :< --------\n";
            return Tudo;
        }
        return Tudo;

    }

    public String VerCasasMaiorQueWH(String data1, String data2, int Energia) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        java.util.Date date1 = sdf.parse(data1);
        java.util.Date date2 = sdf.parse(data2);
        String Tudo = "";
        int constante = 0;
        int count = 0;

        for (int i = 0; i < cidades.size(); i++) {
            for (int c = 0; c < cidades.get(i).getnCasas(); c++) {
                count = 0;
                for (int b = 0; b < cidades.get(i).getCasas().get(c).getNum_equipamentos(); b++) {
                    for (int a = 0; a < cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getNumVezesOnOff(); a++) {
                        if (cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getHistorico().get(a).getStartTime() >= date1.getTime() && cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getHistorico().get(a).getOffTime() <= date2.getTime() && cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getHistorico().get(a).getOffTime() != 0) {

                            constante++;
                            count = (int) (cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getHistorico().get(a).getEnergiaGasta() + count);

                        }

                    }
                }
                Tudo = Tudo + "\nZona" + i + "\nCasa" + c + "\nEnergiaGasta" + count + "\n";
            }

        }
        System.out.println("---");

        if (constante == 0) {
            String Erro = "\n--------Nao foram encontrados registos nesta pesquisa :< --------\n";
            return Erro;
        }
        return Tudo;
    }

    public String VerEnergiaZonas(String Zona) {
        String Tudo = "";
        int count = 0;
        for (int i = 0; i < this.num_cidades; i++) {
            if (this.getCidades().get(i).equals(Zona)) {

                for (int c = 0; c < cidades.get(i).getnCasas(); c++) {
                    count = 0;
                    for (int b = 0; b < cidades.get(i).getCasas().get(c).getNum_equipamentos(); b++) {
                        if (cidades.get(i).getCasas().get(c).getEquipamentos().get(b).isEstado() == true && cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getTipo().equals("Consumidor")) {
                            count = (int) (cidades.get(i).getCasas().get(c).getEquipamentos().get(b).geteConsumida() + count);
                        }

                        if (cidades.get(i).getCasas().get(c).getEquipamentos().get(b).isEstado() == true && cidades.get(i).getCasas().get(c).getEquipamentos().get(b).getTipo().equals("Gerador")) {
                            count = (int) (-(cidades.get(i).getCasas().get(c).getEquipamentos().get(b).geteConsumida()) + count);
                        }

                    }
                    Tudo = Tudo + "\nZona" + i + "\nCasa" + c + "\nEnergiaGasta" + count + "\n";
                }

            }
        }

        if (count > 0) {
            System.out.println("Zona nao sustentavel");
            System.out.println("Energia Gasta-->" + count);
        } else {
            System.out.println("Zona Sustentavel");
            System.out.println("Energia Gerada->" + count);
        }

        return Tudo;
    }

    public int getNum_cidades() {
        return num_cidades;
    }

    /**
     * @param num_cidades the num_cidades to set
     */
    public void setNum_cidades(int num_cidades) {
        this.num_cidades = num_cidades;
    }

    /**
     * @return the cidades
     */
    public SeparateChainingHashST<Integer, Distribuidor> getCidades() {
        return cidades;
    }

    /**
     * @param cidades the cidades to set
     */
    public void setCidades(SeparateChainingHashST<Integer, Distribuidor> cidades) {
        this.cidades = cidades;
    }

    /**
     * @return the casasT
     */
    public SeparateChainingHashST<Integer, Casa> getCasasT() {
        return casasT;
    }

    /**
     * @param casasT the casasT to set
     */
    public void setCasasT(SeparateChainingHashST<Integer, Casa> casasT) {
        this.casasT = casasT;
    }

    /**
     * @return the equipamentosT
     */
    public SeparateChainingHashST<Integer, Equipamento> getEquipamentosT() {
        return equipamentosT;
    }

    /**
     * @param equipamentosT the equipamentosT to set
     */
    public void setEquipamentosT(SeparateChainingHashST<Integer, Equipamento> equipamentosT) {
        this.equipamentosT = equipamentosT;
    }

    /**
     * @return the historicoT
     */
    public RedBlackBST<Integer, HistDistribuicao> getHistoricoT() {
        return historicoT;
    }

    /**
     * @param historicoT the historicoT to set
     */
    public void setHistoricoT(RedBlackBST<Integer, HistDistribuicao> historicoT) {
        this.historicoT = historicoT;
    }

    /**
     * @return the num_fontes
     */
    public int getNum_fontes() {
        return num_fontes;
    }

    /**
     * @param num_fontes the num_fontes to set
     */
    public void setNum_fontes(int num_fontes) {
        this.num_fontes = num_fontes;
    }

    /**
     * @return the Fontes
     */
    public ArrayList<Fonte> getFontes() {
        return Fontes;
    }

    /**
     * @param Fontes the Fontes to set
     */
    public void setFontes(ArrayList<Fonte> Fontes) {
        this.Fontes = Fontes;
    }

    /**
     * @return the grafo
     */
    public CommunicationGraph getGrafo() {
        return grafo;
    }

    /**
     * @param grafo the grafo to set
     */
    public void setGrafo(CommunicationGraph grafo) {
        this.grafo = grafo;
    }

}
