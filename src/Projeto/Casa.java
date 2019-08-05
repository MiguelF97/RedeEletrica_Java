package Projeto;


import edu.princeton.cs.algs4.SeparateChainingHashST;
import edu.princeton.cs.introcs.In;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Casa {

  private int eTotal;

  private int num_equipamentos;
  
  private String zona;
  
  private int id;
  
  private String pathCidade;
  
  private int potenciaContratada;
  

private SeparateChainingHashST<Integer, Equipamento> equipamentos = new SeparateChainingHashST<>();


    public Casa(String zona,int id,String pathCidade,int potenciaContratada)
    {
        this.id=id;
        this.zona=zona;
        this.pathCidade=pathCidade;
        this.potenciaContratada=potenciaContratada;
        loadEquipamentos(this.id);
    }

    //Faz load dos equipamentos de uma casa dos ficheiros
    public void loadEquipamentos(int id)
    {
        int count=0;
        int n_equipamentos;
            
        String pathEquipamento;
        
            String tipo ;
            String nome ;
            int eConsumida ;
            String tipoEnergia ;
            boolean estado;
            
        String str=Integer.toString(id);
        String str2="\\Casa";
        String str3="\\info_casa.txt";
        String str4="\\Equipamentos";
        String str5="\\equipamento";
        String str6=".txt";
        String FILENAME=getPathCidade()+str2+str+str3;
        pathEquipamento=getPathCidade()+str2+str+str4+str5+str6;
        String FILENAME2=getPathCidade()+str2+str;
  
        System.out.println(FILENAME2);
        
  
        File file = new File(FILENAME2);
		
	if(file.isDirectory()){
			
		if(file.list().length>0){
				
			System.out.println("Directory is not empty!");
				
		}else{
				
			System.out.println("Directory is empty!");
                        return ;
				
		}
			
	}else{
			
		System.out.println("This is not a directory");			
	}

	try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine=br.readLine();
                        n_equipamentos=Integer.parseInt(sCurrentLine);
                        sCurrentLine=br.readLine();
                        this.potenciaContratada=Integer.parseInt(sCurrentLine);
                        
                        
                                 

            In in = new In(pathEquipamento);
            
            while (count<n_equipamentos) {
                String[] token = in.readLine().split(";");
                
                tipo =  token[0];
                nome = token[1];
                eConsumida = Integer.parseInt(token[2]);
                tipoEnergia = token[3];
                estado = Boolean.valueOf(token[4]);
                                    Equipamento eq1 = new Equipamento(estado,tipoEnergia,eConsumida,nome,tipo,count,(getPathCidade()+str2+str+str4));
                                    System.out.printf("\nNome->");
                                    System.out.println(eq1.getNome());
                                    System.out.printf("\nEstado->");
                                    System.out.println(eq1.isEstado());
                                    System.out.printf("\nTipoEnergia->");
                                    System.out.println(eq1.getTipoEnergia());
                                    System.out.printf("\nEnergiaConsumida->");
                                    System.out.println(eq1.geteConsumida());
                                    this.eTotal=this.eTotal+eq1.geteConsumida();
                                    this.getEquipamentos().put(count, eq1);
                                    count++;
            }
            this.setNum_equipamentos(count);
            br.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
             
     
    }
    //Cria um novo equipamento no ficheiro txt ou atualiza o ficheiro(flag)
    public void criarEquipamentos(boolean estado,String tipoEnergia,int eConsumida,String nome,String tipo,int id,int flag)
    {
        
        String str=Integer.toString(this.getId());
        String str2="\\Casa";
        String str4="\\Equipamentos";
        String str5="\\equipamento";
        String str6=".txt";
        String FILENAME=getPathCidade()+str2+str+str4+str5+str6;

        if(flag==0)
        {
        this.setNum_equipamentos(this.getNum_equipamentos() + 1);
        Equipamento eq1 = new Equipamento(estado,tipoEnergia,eConsumida,nome,tipo, this.getNum_equipamentos(),(getPathCidade()+str2+str+str4));
     //   this.getEquipamentos().put(getNum_equipamentos(), eq1);
        this.equipamentos.put(this.num_equipamentos-1, eq1);
        }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
                    
                       String numero_cidades= Integer.toString(getNum_equipamentos());

                       System.out.println(this.equipamentos.size());
                        for(int i=0;i<getNum_equipamentos();i++)
                        {
      			bw.write(this.getEquipamentos().get(i).getTipo()+";");
                        bw.write(this.getEquipamentos().get(i).getNome()+";");
                        bw.write(this.getEquipamentos().get(i).geteConsumida()+";");
                        bw.write(this.getEquipamentos().get(i).getTipoEnergia()+";");
                        bw.write(this.getEquipamentos().get(i).isEstado()+";");
                        bw.newLine();
                        }
                                      try (BufferedWriter as = new BufferedWriter(new FileWriter(getPathCidade()+str2+str+"\\info_casa.txt"))) {
                                                        
                                                        as.write(Integer.toString(getNum_equipamentos()));
                                                        as.newLine();
                                                        as.write(Integer.toString(this.getPotenciaContratada()));
                                            
                                            		} catch (IOException e) {
                                                        }

			System.out.println("Done");
                        bw.close();
		} catch (IOException e) {
		}
    
    }    

    
    //calcula a energia total dos equipamentos consumidores
   public int calcularEnergiaTotalGasta()
   {
      int somatorio=0;      
       for(Integer si: getEquipamentos().keys()){

                      //  /*------*/System.out.println(getEquipamentos().get(si).getTipo());
                if(getEquipamentos().get(si).getTipo().equals("Consumidor"))
                {     
                 somatorio+= getEquipamentos().get(si).geteConsumida(); 
                }
            
       }
     return somatorio;
 
   }
    
    //Calcula energia gasta dos equipamentos gastadores ligados
   public int calcularEnergia() {
      
    int somatorio=0;      
       for(Integer si: getEquipamentos().keys()){
            if(getEquipamentos().get(si).isEstado())
            {
                     //   /*------*/System.out.println(getEquipamentos().get(si).getTipo());
                if(getEquipamentos().get(si).getTipo().equals("Consumidor"))
                {     
                 somatorio+= getEquipamentos().get(si).geteConsumida(); 
                }
            }
       }
     return somatorio;
    }
   

   //calcula a energia dos equipamentos geradores ligados
   public int calcularEnergiaG()
   {
       int somatorio=0;
       for(Integer si: getEquipamentos().keys())
       {
            if(getEquipamentos().get(si).isEstado())
            {
                if(getEquipamentos().get(si).getTipo().equals("Gerador"))
                {     
                 somatorio+= getEquipamentos().get(si).geteConsumida(); 
                }
            }
       }
     return somatorio;
    }
   

    
    
    
    /**
     * @return the eTotal
     */
    public int geteTotal() {
        return eTotal;
    }

    /**
     * @param eTotal the eTotal to set
     */
    public void seteTotal(int eTotal) {
        this.eTotal = eTotal;
    }

    /**
     * @return the num_equipamentos
     */
    public int getNum_equipamentos() {
        return num_equipamentos;
    }

    @Override
    public String toString() {
        return "Casa{" + "eTotal=" + eTotal + ", num_equipamentos=" + num_equipamentos + ", zona=" + zona + ", id=" + id + ", potenciaContratada=" + potenciaContratada + '}';
    }

    /**
     * @param num_equipamentos the num_equipamentos to set
     */
    public void setNum_equipamentos(int num_equipamentos) {
        this.num_equipamentos = num_equipamentos;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
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
     * @return the pathCidade
     */
    public String getPathCidade() {
        return pathCidade;
    }

    /**
     * @param pathCidade the pathCidade to set
     */
    public void setPathCidade(String pathCidade) {
        this.pathCidade = pathCidade;
    }

    /**
     * @return the equipamentos
     */
    public SeparateChainingHashST<Integer, Equipamento> getEquipamentos() {
        return equipamentos;
    }

    /**
     * @param equipamentos the equipamentos to set
     */
    public void setEquipamentos(SeparateChainingHashST<Integer, Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    /**
     * @return the potenciaContratada
     */
    public int getPotenciaContratada() {
        return potenciaContratada;
    }

    /**
     * @param potenciaContratada the potenciaContratada to set
     */
    public void setPotenciaContratada(int potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }
    

  }

