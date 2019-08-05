package Projeto;

import edu.princeton.cs.algs4.RedBlackBST;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;





public class Equipamento {

  private String tipo;

  private String nome;

  private int eConsumida;

  private String tipoEnergia;

  private boolean estado;
  
  private int id;
  
  private String pathEquipamento;
  
  private int numVezesOnOff;

  private RedBlackBST<Integer,HistDistribuicao> historico = new RedBlackBST<>();

  //public Vector  historicos
  
  public Equipamento(boolean estado,String tipoEnergia,int eConsumida,String nome,String tipo,int id, String pathEquipamentos)
  {
      this.estado=estado;
      this.tipoEnergia=tipoEnergia;
      this.eConsumida=eConsumida;
      this.nome=nome;
      this.tipo=tipo;
      this.id=id;
      this.pathEquipamento=pathEquipamentos;
      loadHistorico();
  }
  
  
  public void MudarNomeFile(String NovoNome,int idCasa,int idCidades,int idEquipamentos)
  {
      String pathHistorico=getPathEquipamento()+"\\"+"equipamento"+this.getId()+"-"+getNome()+".txt";
      String pathHistorico2=getPathEquipamento()+"\\"+"equipamento"+this.getId()+"-"+NovoNome+".txt";
      File file = new File(pathHistorico);
      File file2= new File(pathHistorico2);
      file.renameTo(file2);
  }
  
      public void removeEquipamento(int Id_Equipamento,String Nome)
    {
        String pathHistorico=getPathEquipamento()+"\\"+"equipamento"+Id_Equipamento+"-"+Nome+".txt";
        File file= new File(pathHistorico);
        file.delete();         
    }
  

  //da load do historio num ficheiro txt de um equipamento
    public void loadHistorico()
    {
        
        int count=0,n_historico=0;
        double energiaGasta;
        long startTime,offTime;
        String pathHistorico=getPathEquipamento()+"\\"+"equipamento"+this.getId()+"-"+getNome()+".txt";
  
        
	try (BufferedReader br = new BufferedReader(new FileReader(pathHistorico))) {

			String sCurrentLine;
                      

			while ((sCurrentLine = br.readLine()) != null) {
				
                                if(count==0)
                                {
                                    n_historico=Integer.parseInt(sCurrentLine);
                                    //cidades = new String[n_cidades];
                                }
                                else
                                {
                                      String[] token = sCurrentLine.split(";");
                
                                      startTime =  Long.parseLong(token[0]);
                                    offTime = Long.parseLong(token[1]);      
                                    energiaGasta=Double.parseDouble(token[2]);
                                    HistDistribuicao HiDi = new HistDistribuicao(startTime,offTime,energiaGasta);
                                    System.out.printf("\nStartTime->");
                                    System.out.println(HiDi.getStartTime());
                                    System.out.printf("\nOffTime->");
                                    System.out.println(HiDi.getOffTime());
                                    System.out.printf("\nEnergiaGasta->");
                                    System.out.println(HiDi.getEnergiaGasta());
                                    
                                    this.getHistorico().put(count-1,HiDi);
                                 
                                                                     
                                }
                             count++;
			}

                        br.close();

		} catch (IOException e) {
		}
                System.out.printf("NºHistorico->%d\n",n_historico);
                this.setNumVezesOnOff(n_historico);
               
               // System.out.println(cidades.get(0).getName());                     
    }
    
  //Criar um historico de um equipamento
    public void criarHistorico(long startTime,int flag)
    {
            String pathHistorico=getPathEquipamento()+"\\"+"equipamento"+(this.getId())+"-"+getNome()+".txt";

        if(flag==0)
        {
        this.numVezesOnOff++;
        HistDistribuicao HiDi = new HistDistribuicao(startTime,0,0);
        this.historico.put(numVezesOnOff-1, HiDi);    
        }
    
        
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathHistorico))) {
                    
                       String numero_historico= Integer.toString(numVezesOnOff);
                       bw.write(numero_historico);
                       bw.newLine();
                   
                        for(int i=0;i<numVezesOnOff;i++)
                        {
                            System.out.println(this.historico.get(i).getStartTime());
      			bw.write(this.historico.get(i).getStartTime()+";");
                        bw.write(this.historico.get(i).getOffTime()+";");
                        bw.write(this.historico.get(i).getEnergiaGasta()+";"); 
                        bw.newLine();
                        }

                        
			System.out.println("Done");
                        bw.close();

		} catch (IOException e) {
		}
    
    }  
 
   
 // permite calcular a energia gasta por hora de um equipamento apos ser desligado
 public double TurnOff(long startTime,long offTime,int energia)
 {
     double intervaloTempo=((offTime-startTime));
     intervaloTempo= (0.00000027778*intervaloTempo);
     double energiaGasta= (intervaloTempo*energia);
     System.out.println("\n\n"+energiaGasta);

     return energiaGasta;
 }
    
    //permite ligar ou desligar um equipamento
    public int turnOnOff()
    {
        long time;
        if(!this.estado){
            this.estado=true;
            time= System.currentTimeMillis();
            criarHistorico(time,0);
            return 0;
           
        }
        else{
            this.estado=false;
            time= System.currentTimeMillis();
            this.historico.get(this.numVezesOnOff-1).setOffTime(time);
            double energiaConsumida=TurnOff(this.historico.get(this.numVezesOnOff-1).getStartTime(),time,this.eConsumida);
            this.historico.get(this.numVezesOnOff-1).setEnergiaGasta(energiaConsumida);
            criarHistorico(time,1);
            return 1;
        }
    }    

    /**
     * @return the eConsumida
     */
    public int geteConsumida() {
        return eConsumida;
    }

    /**
     * @param eConsumida the eConsumida to set
     */
    public void seteConsumida(int eConsumida) {
        this.eConsumida = eConsumida;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tipoEnergia
     */
    public String getTipoEnergia() {
        return tipoEnergia;
    }

    /**
     * @param tipoEnergia the tipoEnergia to set
     */
    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the pathEquipamento
     */
    public String getPathEquipamento() {
        return pathEquipamento;
    }

    /**
     * @param pathEquipamento the pathEquipamento to set
     */
    public void setPathEquipamento(String pathEquipamento) {
        this.pathEquipamento = pathEquipamento;
    }

    /**
     * @return the numVezesOnOff
     */
    public int getNumVezesOnOff() {
        return numVezesOnOff;
    }

    /**
     * @param numVezesOnOff the numVezesOnOff to set
     */
    public void setNumVezesOnOff(int numVezesOnOff) {
        this.numVezesOnOff = numVezesOnOff;
    }

    /**
     * @return the historico
     */
    public RedBlackBST<Integer,HistDistribuicao> getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(RedBlackBST<Integer,HistDistribuicao> historico) {
        this.historico = historico;
    }
    
     @Override
    public String toString() {
        return "Equipamento{" + "tipo=" + tipo + ", nome=" + nome + ", eConsumida=" + eConsumida + ", tipoEnergia=" + tipoEnergia + ", estado=" + estado + ", id=" + id + ",  NumVezesOnOff=" +numVezesOnOff+"\n\n"+ '}';
    }

}