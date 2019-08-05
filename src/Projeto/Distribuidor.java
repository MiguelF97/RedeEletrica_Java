package Projeto;

import edu.princeton.cs.algs4.SeparateChainingHashST;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Distribuidor {
    
    private String name;
    private int nCasas;
    private int id;
    private SeparateChainingHashST<Integer, Casa> casas = new SeparateChainingHashST<>();
    
    public Distribuidor(String name, int id)
{
    this.name=name;
    this.id=id;
    loadCasas(this.id);
    
    
}
    
    public void removeCasa(int idCasa,int id_cidade)
    {
           
        String auxStr=Integer.toString(idCasa);
        String str=Integer.toString(id_cidade);
        String str2="\\Cidade";
        String str3="\\info_cidade.txt";
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades";

        FILENAME=FILENAME+str2+str+str3;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

                       this.setnCasas(this.getnCasas() -1);
                       String numero_casas= Integer.toString(getnCasas());
                       
			bw.write(numero_casas);
                        bw.close();
			System.out.println("Done");
                      bw.close();
		} catch (IOException e) {
		}
 

    }
    public void ApagarFileCasa(int id_cidade, int idCasa)
    { 

        String str=Integer.toString(id_cidade);
             
        String straux2="C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\Cidade"+str+"\\Casa"+idCasa;
        File file = new File("C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\Cidade"+str+"\\Casa"+idCasa+"\\Equipamentos");
         
        if(file.delete())
        {
            System.out.println("Ficheiro apagado");
        }
        else
        {
            System.out.println("Erro ao apagar o ficheiro");
        }
        
        File file3= new File("C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades\\Cidade"+str+"\\Casa"+idCasa+"\\info_casa.txt");
        if(file3.delete())
        {
            System.out.println("Ficheiro apagado");
        }
        else
        {
            System.out.println("Erro ao apagar o ficheiro");
        }
        
        
        
        File file2= new File(straux2);
         if(file2.delete())
        {
            System.out.println("Ficheiro apagado");
        }
        else
        {
            System.out.println("Erro ao apagar o ficheiro");
        }
        
        
    }
    
//Le as informaçoes das casas nos ficheiros
    public void loadCasas(int id)
    {
        int count=0;
        int n_casas;
        String str=Integer.toString(id);
        String str2="\\Cidade";
        String str3="\\info_cidade.txt";
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades";
        String PATHCASAS;
        PATHCASAS=FILENAME+str2+str;
        FILENAME=FILENAME+str2+str+str3;
        System.out.println(FILENAME);
        
        File file = new File(PATHCASAS);
		
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
         
      // String[] cidades = null;

	try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine=br.readLine();
                        n_casas=Integer.parseInt(sCurrentLine);
                               
                            for(int i=0;i<n_casas;i++)
                            {
                                    Casa c1 = new Casa(this.getName(),i,PATHCASAS,0);
                                    
                                    this.getCasas().put(i,c1);		
                                    c1.seteTotal((int) c1.calcularEnergia());                                    System.out.println(c1.geteTotal());
                                    System.out.printf("Id da Casa->%d--",getCasas().get(i).getId());
                                    System.out.println(getCasas().get(i).getZona());
                                    
                            }
                            this.setnCasas(n_casas);
                            br.close();
		} catch (IOException e) {
		}

               // System.out.println(n_casas);
               // System.out.println(casas.get(0).getZona());
    }    

    @Override
    public String toString() {
        return "Distribuidor{" + "name=" + name + ", nCasas=" + nCasas + ", id=" + id + '}';
    }
 //Permite criar uma Nova Casa
    public void criarCasa(int id_cidade,int PotenciaContratada)
    {
        
        int n_casas=this.getnCasas();
        
        String auxStr=Integer.toString(n_casas);
        String str=Integer.toString(id_cidade);
        String str2="\\Cidade";
        String str4="\\Casa";
        String str3="\\info_cidade.txt";
        String FILENAME = "C:\\Users\\migue\\Documents\\NetBeansProjects\\Project\\src\\Projeto\\Cidades";
        String PATHCASAS;
        PATHCASAS=FILENAME+str2+str;
        FILENAME=FILENAME+str2+str+str3;
        String PATHNOVACASA=PATHCASAS+str4+auxStr;
        
        
        new File(PATHNOVACASA).mkdirs();
        Casa c1 = new Casa(this.getName(), getnCasas(),PATHCASAS,PotenciaContratada);
        this.getCasas().put(nCasas, c1);
        new File(PATHNOVACASA+"\\Equipamentos").mkdirs();
        
        

        		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

                            this.setnCasas(this.getnCasas() + 1);
                       String numero_casas= Integer.toString(getnCasas());
                       
			bw.write(numero_casas);

			System.out.println("Done");
                        bw.close();
		} catch (IOException e) {
		}
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nCasas
     */
    public int getnCasas() {
        return nCasas;
    }

    /**
     * @param nCasas the nCasas to set
     */
    public void setnCasas(int nCasas) {
        this.nCasas = nCasas;
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
     * @return the casas
     */
    public SeparateChainingHashST<Integer, Casa> getCasas() {
        return casas;
    }

    /**
     * @param casas the casas to set
     */
    public void setCasas(SeparateChainingHashST<Integer, Casa> casas) {
        this.casas = casas;
    }
    

}
            
        
    
    
