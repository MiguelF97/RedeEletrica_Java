/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ASU
 */
public class Project {


    
    public static void main(String[] args) {
        
        
        
         Rede r1= new Rede();
            r1.lerCidades();
            //System.out.println(r1.getCidades().get(1).getCasas().get(0).getEquipamentos().get(0));
            r1.allTogether();
            

           
       //    r1.criarCidade("Guarda");
        //      r1.getCidades().get(4).criarCasa(4);
       //r1.getCidades().get(1).getCasas().get(0).criarEquipamentos(false,"N sei",400,"Painel Solar","Gerador",0,0);
        
        //   r1.criarCidade("Vila Real");boolean estado,String tipoEnergia,int eConsumida,String nome,String tipo,int id
        
        
        //-----TEM QUE TAR OS 2 JUNTOS-----
     //  r1.getCidades().get(3).getCasas().get(0).getEquipamentos().get(0).turnOnOff();
      //  r1.getCidades().get(3).getCasas().get(0).getEquipamentos().get(1).turnOnOff();
       // r1.getCidades().get(3).getCasas().get(0).criarEquipamentos(true, null, 0, null,null, 0, 1);   
        
        //   System.out.println(r1.getEquipamentosT().get(1).getNome());
        //    System.out.println(r1.getCidades().get(3).getCasas().get(0).calcularEnergia());

        try {
            r1.PrintHistCasa("Braga",0,"31-05-2018 22:19:00","06-06-2018 02:24:00");
        
        } catch (ParseException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            r1.PrintCasasMaisGastadoras("15-05-2018 22:19:00","06-06-2018 02:24:00");

        } catch (ParseException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        r1.CheckPotenciaContratada("Braga",0);
        
            //   r1.PrintAparelhosdeUmaCasa("Braga",0);
            //   r1.getCidades().get(3).getCasas().get(0).getEquipamentos().get(1).TurnOnOff();
            //System.out.println("\n-----\n"+r1.getCidades().get(2).getCasas().get(0).getPotenciaContratada());
        
            
  //        r1.criarFontes("Eolicas", 15000,1);
    //        r1.removeFontes("Eolicas");
              r1.PrintCasasEquipamentos("Porto",-1);
                          

           
   }
}
    

