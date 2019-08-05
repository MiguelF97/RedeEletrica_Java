/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;
/*
*Codigo feito por:
*Miguel Silva
*Luis Azevedo
*Pedro Ramalho
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author ASU
 */
public class Gui extends javax.swing.JFrame {

    Rede r1= new Rede();
    
    public Gui() {
        initComponents();
            r1.lerCidades();
            //System.out.println(r1.getCidades().get(1).getCasas().get(0).getEquipamentos().get(0));
            r1.allTogether();
            
        ErroFonteJ.setVisible(false);
        ErroFonteJ2.setVisible(false);
        FonteCriadaSucessoJ.setVisible(false);
        
      SucessoEditarFonteJ.setVisible(false);
     ErroNomeFonteJ.setVisible(false);
     ErroNomeEditarFonteJ.setVisible(false);
     ErroEnergiaEditarFonteJ.setVisible(false);
     
          SucessoRemoverFonteJ.setVisible(false);
     ErroNomeFonteRemoveJ1.setVisible(false);
  
        
     
     
             ErroCriarDistJ.setVisible(false);
        ErroCriarligJ.setVisible(false);
        SucessoCriarDistJ.setVisible(false);
        
             SucessoEditarDistJ.setVisible(false);
     ErroDistEditarJ.setVisible(false);

          RemoverEditarDistJ1.setVisible(false);
     ErroDistRemoverJ1.setVisible(false);
     
     
     
             ErroDistCriarJ.setVisible(false);
        DistCriadaSucessoJ.setVisible(false);
     
                ErroDistEditarJ1.setVisible(false);
        DistEditadaSucessoJ1.setVisible(false);
        ErroDistEditarJ2.setVisible(false);
        
                ErroCasaRemoverJ2.setVisible(false);
        RemoverCasaJ2.setVisible(false);
        
                ErroEquipCriarJ1.setVisible(false);
        EquipCriadaSucessoJ1.setVisible(false);

           ErroEquipCriarJ2.setVisible(false);
           
                   ErroEquipEditarJ3.setVisible(false);
        ErroEquipEditarJ4.setVisible(false);
        EquipCriadaSucessoJ2.setVisible(false);
                EquipCriadaSucessoJ3.setVisible(false);
                EquipCriadaSucessoJ4.setVisible(false);
                 EquipCriadaSucessoJ2.setVisible(false);
 EquipCriadaSucessoJ5.setVisible(false);
                 
                         ErroEquipCriarJ4.setVisible(false);
        ErroEquipCriarJ3.setVisible(false);
      
  
     
     
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<r1.getNum_fontes();i++)
        {
           model.addElement(r1.getFontes().get(i).getTipo());
        }
        
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        for(int i=0;i<r1.getNum_cidades();i++)
        {
           model2.addElement(r1.getCidades().get(i).getName());
        }
        
        DefaultComboBoxModel RemoveModelDist = new DefaultComboBoxModel();
        for(int i=0;i<r1.getNum_cidades();i++)
        {
           RemoveModelDist.addElement(r1.getCidades().get(i).getName());
        }
        DefaultComboBoxModel AddCasasJ= new DefaultComboBoxModel();
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            AddCasasJ.addElement(r1.getCidades().get(i).getName());
        }
        
        ComboBoxPrintHistJ.setModel(AddCasasJ);
        ComboBoxCriarEquipamentosJ2.setModel(AddCasasJ);
        ComboBoxCriarEquipamentosJ1.setModel(AddCasasJ);
        ComboBoxPrintCasasJ.setModel(AddCasasJ);
        RemoverDropBoxJ1.setModel(AddCasasJ);
        ComboBoxEditarCasasJ1.setModel(AddCasasJ);
        ComboBoxCriarCasasJ.setModel(AddCasasJ);
        RemoverDropBoxJ.setModel(RemoveModelDist);
        BoxNomeEditarDistJ.setModel(model2);
        RedeListaFontesJ.setModel(model);
                    
          System.out.println("\n?????????????????????????????????");  
        r1.GraphConexo();
        
    
           
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
//            r1.GraphConexo();
/*
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
        */
//        r1.CheckPotenciaContratada("Braga",0);
        
            //   r1.PrintAparelhosdeUmaCasa("Braga",0);
            //   r1.getCidades().get(3).getCasas().get(0).getEquipamentos().get(1).TurnOnOff();
            //System.out.println("\n-----\n"+r1.getCidades().get(2).getCasas().get(0).getPotenciaContratada());
        
            
  //        r1.criarFontes("Eolicas", 15000,1);
    //        r1.removeFontes("Eolicas");
    //            r1.PrintCasasEquipamentos("Porto",-1);
           
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rede = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RedeListaFontesJ = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RedeListaDistJ = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        RedeListaEquipJ = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        RedeListaCasasJ = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        CriarFonteNomeJ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CriarFonteEnergiaJ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CriarButtonFonteJ = new javax.swing.JButton();
        ErroFonteJ = new javax.swing.JLabel();
        ErroFonteJ2 = new javax.swing.JLabel();
        FonteCriadaSucessoJ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoFonteCriadaJ = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NomeFonteEditarJ = new javax.swing.JTextField();
        NovoNomeEditarJ = new javax.swing.JTextField();
        NovaEnergiaEditarJ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SucessoEditarFonteJ = new javax.swing.JLabel();
        ErroNomeEditarFonteJ = new javax.swing.JLabel();
        ErroEnergiaEditarFonteJ = new javax.swing.JLabel();
        ErroNomeFonteJ = new javax.swing.JLabel();
        EditarFonteButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        NomeRemoverFonteJ = new javax.swing.JTextField();
        NomeRemoveFonteJ = new javax.swing.JLabel();
        ErroNomeFonteRemoveJ1 = new javax.swing.JLabel();
        RemoveFonteButton = new javax.swing.JButton();
        SucessoRemoverFonteJ = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        PainelFontesTodasJ = new javax.swing.JTextPane();
        PrintFontesTodasJ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        CriarDistNomeJ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CriarDistLig = new javax.swing.JTextField();
        CriarDistButtonJ = new javax.swing.JButton();
        SucessoCriarDistJ = new javax.swing.JLabel();
        ErroCriarDistJ = new javax.swing.JLabel();
        ErroCriarligJ = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        PaneCriarDistJ = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        NovoNomeEditarDistJ = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        EditarDistButtonJ = new javax.swing.JButton();
        SucessoEditarDistJ = new javax.swing.JLabel();
        ErroDistEditarJ = new javax.swing.JLabel();
        BoxNomeEditarDistJ = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ErroDistRemoverJ1 = new javax.swing.JLabel();
        RemoverEditarDistJ1 = new javax.swing.JLabel();
        RemoverDropBoxJ = new javax.swing.JComboBox<>();
        RemoverDistButtonJ1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        ButtonPrintDistJ = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TextoDistribuidoresJ = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CriarCasaPotenciaJ = new javax.swing.JTextField();
        ErroDistCriarJ = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DistCriadaSucessoJ = new javax.swing.JLabel();
        CriarButtonCasaJ1 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TextoCasasCriadaJ = new javax.swing.JTextArea();
        ComboBoxCriarCasasJ = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        EditarCasaPotenciaJ1 = new javax.swing.JTextField();
        ComboBoxEditarCasasJ1 = new javax.swing.JComboBox<>();
        ErroDistEditarJ1 = new javax.swing.JLabel();
        EditarButtonCasaJ2 = new javax.swing.JButton();
        DistEditadaSucessoJ1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TextFieldEditarCasasJ = new javax.swing.JTextField();
        ErroDistEditarJ2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        RemoverDropBoxJ1 = new javax.swing.JComboBox<>();
        ErroCasaRemoverJ2 = new javax.swing.JLabel();
        RemoverCasaButtonJ2 = new javax.swing.JButton();
        RemoverCasaJ2 = new javax.swing.JLabel();
        TextFieldRemoverCasasJ1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        PrintCasasJ = new javax.swing.JButton();
        ComboBoxPrintCasasJ = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextAreaPrintCasasJ = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ComboBoxCriarEquipamentosJ1 = new javax.swing.JComboBox<>();
        CriarEquipamentosIdJ = new javax.swing.JTextField();
        ErroEquipCriarJ1 = new javax.swing.JLabel();
        CriarButtonEquipamentoJ = new javax.swing.JButton();
        EquipCriadaSucessoJ1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TextoEquipamentosCriarJ = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        TipoTextFieldJ = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        NomeTextJ = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        EnergiaTextJ = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        TextEquipamentoIdJ = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        PrintOnOff = new javax.swing.JButton();
        ErroEquipCriarJ2 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        ComboBoxCriarEquipamentosJ2 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        IdCasaEditarEquipJ = new javax.swing.JTextField();
        ErroEquipEditarJ3 = new javax.swing.JLabel();
        ErroEquipEditarJ4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        IdCASDJ = new javax.swing.JTextField();
        NomeEquipJ = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        NovoTipoJ = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        EnergiaEditarEquipJ = new javax.swing.JTextField();
        EditarEquipj = new javax.swing.JButton();
        EditarEquipJ = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        EquipCriadaSucessoJ2 = new javax.swing.JLabel();
        EquipCriadaSucessoJ3 = new javax.swing.JLabel();
        EquipCriadaSucessoJ4 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EquipCriadaSucessoJ5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        IdCasaHistJ = new javax.swing.JTextField();
        ComboBoxPrintHistJ = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        ErroEquipCriarJ3 = new javax.swing.JLabel();
        ErroEquipCriarJ4 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        IdEquipamentoJ = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        TextPaneHistJ = new javax.swing.JTextPane();
        Date1J = new javax.swing.JTextField();
        Date2J = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rede Eletrica :>");
        setResizable(false);

        RedeListaFontesJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedeListaFontesJMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RedeListaFontesJ);

        jLabel4.setText("Distribuidores");

        RedeListaDistJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedeListaDistJMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RedeListaDistJ);

        jLabel5.setText("Fontes");

        jScrollPane4.setViewportView(RedeListaEquipJ);

        RedeListaCasasJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedeListaCasasJMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(RedeListaCasasJ);

        jLabel6.setText("Casas");

        jLabel7.setText("Equipamentos");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel7))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Rede.addTab("Rede", jPanel1);

        CriarFonteNomeJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarFonteNomeJActionPerformed(evt);
            }
        });

        jLabel1.setText("Criar Fonte/Gerador");

        jLabel2.setText("Nome:");

        CriarFonteEnergiaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarFonteEnergiaJActionPerformed(evt);
            }
        });

        jLabel3.setText("Energia:");

        CriarButtonFonteJ.setText("Criar");
        CriarButtonFonteJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarButtonFonteJActionPerformed(evt);
            }
        });

        ErroFonteJ.setForeground(new java.awt.Color(204, 0, 0));
        ErroFonteJ.setText("Erro");

        ErroFonteJ2.setForeground(new java.awt.Color(255, 0, 0));
        ErroFonteJ2.setText("Erro");

        FonteCriadaSucessoJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        FonteCriadaSucessoJ.setForeground(new java.awt.Color(0, 153, 0));
        FonteCriadaSucessoJ.setText("Fonte Criada com Sucesso");

        TextoFonteCriadaJ.setEditable(false);
        TextoFonteCriadaJ.setColumns(15);
        TextoFonteCriadaJ.setLineWrap(true);
        TextoFonteCriadaJ.setRows(5);
        TextoFonteCriadaJ.setAutoscrolls(false);
        jScrollPane1.setViewportView(TextoFonteCriadaJ);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CriarFonteEnergiaJ, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(CriarFonteNomeJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErroFonteJ)
                            .addComponent(ErroFonteJ2))
                        .addGap(47, 47, 47)
                        .addComponent(CriarButtonFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119)
                        .addComponent(FonteCriadaSucessoJ)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FonteCriadaSucessoJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CriarFonteNomeJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErroFonteJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CriarFonteEnergiaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErroFonteJ2)))
                    .addComponent(CriarButtonFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setText("Editar Fonte/Gerador");

        jLabel9.setText("Nome da Fonte:");

        NomeFonteEditarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeFonteEditarJActionPerformed(evt);
            }
        });

        jLabel10.setText("Novo Nome:");

        jLabel11.setText("Nova Energia:");

        SucessoEditarFonteJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        SucessoEditarFonteJ.setForeground(new java.awt.Color(0, 153, 51));
        SucessoEditarFonteJ.setText("Editado Com Sucesso");

        ErroNomeEditarFonteJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroNomeEditarFonteJ.setText("Erro");

        ErroEnergiaEditarFonteJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroEnergiaEditarFonteJ.setText("Erro");

        ErroNomeFonteJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroNomeFonteJ.setText("Erro");

        EditarFonteButton1.setText("Editar");
        EditarFonteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarFonteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeFonteEditarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErroNomeFonteJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovaEnergiaEditarJ, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(NovoNomeEditarJ))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErroNomeEditarFonteJ)
                    .addComponent(ErroEnergiaEditarFonteJ))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(EditarFonteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SucessoEditarFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoNomeEditarJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ErroNomeEditarFonteJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovaEnergiaEditarJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(ErroEnergiaEditarFonteJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SucessoEditarFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditarFonteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeFonteEditarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErroNomeFonteJ))))
                .addGap(32, 32, 32))
        );

        jLabel12.setText("Remover Fonte/Gerador");

        NomeRemoverFonteJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeRemoverFonteJActionPerformed(evt);
            }
        });

        NomeRemoveFonteJ.setText("Nome da Fonte:");

        ErroNomeFonteRemoveJ1.setForeground(new java.awt.Color(153, 0, 0));
        ErroNomeFonteRemoveJ1.setText("Erro");

        RemoveFonteButton.setText("Remover");
        RemoveFonteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFonteButtonActionPerformed(evt);
            }
        });

        SucessoRemoverFonteJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        SucessoRemoverFonteJ.setForeground(new java.awt.Color(0, 153, 0));
        SucessoRemoverFonteJ.setText("Removido Com Sucesso");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SucessoRemoverFonteJ))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(NomeRemoveFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeRemoverFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErroNomeFonteRemoveJ1)
                        .addGap(29, 29, 29)
                        .addComponent(RemoveFonteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(SucessoRemoverFonteJ)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeRemoverFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeRemoveFonteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErroNomeFonteRemoveJ1)
                    .addComponent(RemoveFonteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PainelFontesTodasJ.setEditable(false);
        jScrollPane6.setViewportView(PainelFontesTodasJ);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        PrintFontesTodasJ.setText("Print");
        PrintFontesTodasJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintFontesTodasJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintFontesTodasJ, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrintFontesTodasJ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        Rede.addTab("Geradores", jPanel2);

        jLabel13.setText("Criar Distribuidor/Cidade");

        CriarDistNomeJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarDistNomeJActionPerformed(evt);
            }
        });

        jLabel14.setText("Nome:");

        jLabel15.setText("Id de ligação:");

        CriarDistLig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarDistLigActionPerformed(evt);
            }
        });

        CriarDistButtonJ.setText("Criar");
        CriarDistButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarDistButtonJActionPerformed(evt);
            }
        });

        SucessoCriarDistJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        SucessoCriarDistJ.setForeground(new java.awt.Color(0, 153, 0));
        SucessoCriarDistJ.setText("Criado Com Sucesso");

        ErroCriarDistJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroCriarDistJ.setText("Erro");

        ErroCriarligJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroCriarligJ.setText("Erro");

        PaneCriarDistJ.setEditable(false);
        jScrollPane7.setViewportView(PaneCriarDistJ);

        jLabel19.setText("(-1 para nao existir ligação)");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CriarDistNomeJ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErroCriarDistJ))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CriarDistLig, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErroCriarligJ))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel19)))
                        .addGap(76, 76, 76)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SucessoCriarDistJ)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CriarDistButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SucessoCriarDistJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CriarDistButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CriarDistNomeJ)
                            .addComponent(ErroCriarDistJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(CriarDistLig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ErroCriarligJ, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11)))
                        .addComponent(jLabel19))))
        );

        jLabel16.setText("Editar Distribuidor/Cidade");

        jLabel17.setText("Nome:");

        NovoNomeEditarDistJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoNomeEditarDistJActionPerformed(evt);
            }
        });

        jLabel18.setText("Novo Nome:");

        EditarDistButtonJ.setText("Editar");
        EditarDistButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDistButtonJActionPerformed(evt);
            }
        });

        SucessoEditarDistJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        SucessoEditarDistJ.setForeground(new java.awt.Color(0, 153, 0));
        SucessoEditarDistJ.setText("Editado Com Sucesso");

        ErroDistEditarJ.setForeground(new java.awt.Color(153, 0, 0));
        ErroDistEditarJ.setText("Erro");

        BoxNomeEditarDistJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxNomeEditarDistJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoxNomeEditarDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NovoNomeEditarDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErroDistEditarJ)
                .addGap(56, 56, 56)
                .addComponent(EditarDistButtonJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SucessoEditarDistJ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxNomeEditarDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(NovoNomeEditarDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErroDistEditarJ)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditarDistButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SucessoEditarDistJ))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel20.setText("Nome:");

        jLabel21.setText("Remover Distribuidor");

        ErroDistRemoverJ1.setForeground(new java.awt.Color(153, 0, 0));
        ErroDistRemoverJ1.setText("Erro");

        RemoverEditarDistJ1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        RemoverEditarDistJ1.setForeground(new java.awt.Color(0, 153, 0));
        RemoverEditarDistJ1.setText("Editado Com Sucesso");

        RemoverDropBoxJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverDropBoxJActionPerformed(evt);
            }
        });

        RemoverDistButtonJ1.setText("Remover");
        RemoverDistButtonJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverDistButtonJ1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoverDropBoxJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErroDistRemoverJ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(RemoverDistButtonJ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(RemoverEditarDistJ1)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoverDropBoxJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(ErroDistRemoverJ1)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoverDistButtonJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoverEditarDistJ1))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        ButtonPrintDistJ.setText("Print");
        ButtonPrintDistJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPrintDistJActionPerformed(evt);
            }
        });

        TextoDistribuidoresJ.setEditable(false);
        TextoDistribuidoresJ.setColumns(20);
        TextoDistribuidoresJ.setRows(5);
        jScrollPane8.setViewportView(TextoDistribuidoresJ);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ButtonPrintDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ButtonPrintDistJ, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        Rede.addTab("Distribuidores", jPanel3);

        jLabel22.setText("Distribuidor:");

        jLabel23.setText("Potencia Contratada:");

        CriarCasaPotenciaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarCasaPotenciaJActionPerformed(evt);
            }
        });

        ErroDistCriarJ.setForeground(new java.awt.Color(255, 0, 0));
        ErroDistCriarJ.setText("Erro");

        jLabel24.setText("Criar Casa");

        DistCriadaSucessoJ.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        DistCriadaSucessoJ.setForeground(new java.awt.Color(0, 153, 0));
        DistCriadaSucessoJ.setText("Casa Criada Com Sucesso");

        CriarButtonCasaJ1.setText("Criar");
        CriarButtonCasaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarButtonCasaJ1ActionPerformed(evt);
            }
        });

        TextoCasasCriadaJ.setEditable(false);
        TextoCasasCriadaJ.setColumns(15);
        TextoCasasCriadaJ.setLineWrap(true);
        TextoCasasCriadaJ.setRows(5);
        TextoCasasCriadaJ.setAutoscrolls(false);
        jScrollPane9.setViewportView(TextoCasasCriadaJ);

        ComboBoxCriarCasasJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCriarCasasJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DistCriadaSucessoJ)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CriarCasaPotenciaJ, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(ComboBoxCriarCasasJ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErroDistCriarJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CriarButtonCasaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DistCriadaSucessoJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(ComboBoxCriarCasasJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(CriarCasaPotenciaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ErroDistCriarJ)))
                            .addComponent(CriarButtonCasaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel25.setText("Distribuidor:");

        jLabel26.setText("Nova Potencia Contratada:");

        EditarCasaPotenciaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCasaPotenciaJ1ActionPerformed(evt);
            }
        });

        ComboBoxEditarCasasJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEditarCasasJ1ActionPerformed(evt);
            }
        });

        ErroDistEditarJ1.setForeground(new java.awt.Color(255, 0, 0));
        ErroDistEditarJ1.setText("Erro");

        EditarButtonCasaJ2.setText("Editar");
        EditarButtonCasaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonCasaJ2ActionPerformed(evt);
            }
        });

        DistEditadaSucessoJ1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        DistEditadaSucessoJ1.setForeground(new java.awt.Color(0, 153, 0));
        DistEditadaSucessoJ1.setText("Casa Editada Com Sucesso");

        jLabel27.setText("Casa:");

        TextFieldEditarCasasJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEditarCasasJActionPerformed(evt);
            }
        });

        ErroDistEditarJ2.setForeground(new java.awt.Color(255, 0, 0));
        ErroDistEditarJ2.setText("Erro");

        jLabel30.setText("Editar Casa");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(ComboBoxEditarCasasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(TextFieldEditarCasasJ, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErroDistEditarJ2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditarCasaPotenciaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErroDistEditarJ1)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DistEditadaSucessoJ1)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(EditarButtonCasaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DistEditadaSucessoJ1)
                .addGap(11, 11, 11)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditarCasaPotenciaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ErroDistEditarJ1)
                        .addComponent(jLabel26))
                    .addComponent(EditarButtonCasaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(ComboBoxEditarCasasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TextFieldEditarCasasJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErroDistEditarJ2))
                .addGap(16, 16, 16))
        );

        jLabel28.setText("Remover Casas");

        jLabel29.setText("Nome:");

        RemoverDropBoxJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverDropBoxJ1ActionPerformed(evt);
            }
        });

        ErroCasaRemoverJ2.setForeground(new java.awt.Color(153, 0, 0));
        ErroCasaRemoverJ2.setText("Erro");

        RemoverCasaButtonJ2.setText("Remover");
        RemoverCasaButtonJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverCasaButtonJ2ActionPerformed(evt);
            }
        });

        RemoverCasaJ2.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        RemoverCasaJ2.setForeground(new java.awt.Color(0, 153, 0));
        RemoverCasaJ2.setText("Removido Com Sucesso");

        TextFieldRemoverCasasJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRemoverCasasJ1ActionPerformed(evt);
            }
        });

        jLabel31.setText("Casa:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(3, 3, 3)
                                .addComponent(RemoverDropBoxJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldRemoverCasasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErroCasaRemoverJ2)
                                .addGap(37, 37, 37)))
                        .addComponent(RemoverCasaButtonJ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoverCasaJ2))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoverDropBoxJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(TextFieldRemoverCasasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ErroCasaRemoverJ2)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoverCasaButtonJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoverCasaJ2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PrintCasasJ.setText("Print Casas");
        PrintCasasJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintCasasJActionPerformed(evt);
            }
        });

        jTextAreaPrintCasasJ.setColumns(20);
        jTextAreaPrintCasasJ.setRows(5);
        jScrollPane10.setViewportView(jTextAreaPrintCasasJ);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrintCasasJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxPrintCasasJ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(PrintCasasJ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxPrintCasasJ)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Rede.addTab("Casas", jPanel4);

        jLabel32.setText("Distribuidor:");

        jLabel33.setText("Id da Casa:");

        jLabel34.setText("Criar Equipamentos");

        ComboBoxCriarEquipamentosJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCriarEquipamentosJ1ActionPerformed(evt);
            }
        });

        CriarEquipamentosIdJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarEquipamentosIdJActionPerformed(evt);
            }
        });

        ErroEquipCriarJ1.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipCriarJ1.setText("Erro");

        CriarButtonEquipamentoJ.setText("Criar");
        CriarButtonEquipamentoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarButtonEquipamentoJActionPerformed(evt);
            }
        });

        EquipCriadaSucessoJ1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        EquipCriadaSucessoJ1.setForeground(new java.awt.Color(0, 153, 0));
        EquipCriadaSucessoJ1.setText("Equipamento Criada Com Sucesso");

        TextoEquipamentosCriarJ.setEditable(false);
        TextoEquipamentosCriarJ.setColumns(15);
        TextoEquipamentosCriarJ.setLineWrap(true);
        TextoEquipamentosCriarJ.setRows(5);
        TextoEquipamentosCriarJ.setAutoscrolls(false);
        jScrollPane11.setViewportView(TextoEquipamentosCriarJ);

        jLabel35.setText("Tipo(Consumidor/Gerador):");

        TipoTextFieldJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoTextFieldJActionPerformed(evt);
            }
        });

        jLabel36.setText("Equipamento:");

        jLabel37.setText("Energia:");

        jLabel38.setText("On||Off");

        jLabel39.setText("Id_Equipamento");

        PrintOnOff.setText("On|Off");
        PrintOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOnOffActionPerformed(evt);
            }
        });

        ErroEquipCriarJ2.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipCriarJ2.setText("Erro");

        jLabel58.setText("Print Equipamentos de uma Casa");

        jToggleButton1.setText("Print");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoTextFieldJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                        .addComponent(EquipCriadaSucessoJ1))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CriarEquipamentosIdJ, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                            .addComponent(ComboBoxCriarEquipamentosJ1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EnergiaTextJ, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addComponent(ErroEquipCriarJ1)
                                                .addGap(31, 31, 31)
                                                .addComponent(CriarButtonEquipamentoJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addComponent(jLabel39)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addComponent(ErroEquipCriarJ2)
                                                .addGap(29, 29, 29)))
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextEquipamentoIdJ, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(PrintOnOff))))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NomeTextJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EquipCriadaSucessoJ1)
                            .addComponent(jLabel38))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel32)
                                            .addComponent(ComboBoxCriarEquipamentosJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel33)
                                            .addComponent(CriarEquipamentosIdJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ErroEquipCriarJ1)))
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ErroEquipCriarJ2)
                                        .addComponent(CriarButtonEquipamentoJ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TipoTextFieldJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextEquipamentoIdJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(PrintOnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(EnergiaTextJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(NomeTextJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jScrollPane11))
                .addContainerGap())
        );

        jLabel40.setText("Editar Equipamentos");

        ComboBoxCriarEquipamentosJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCriarEquipamentosJ2ActionPerformed(evt);
            }
        });

        jLabel41.setText("Distribuidor:");

        jLabel42.setText("Id da Casa:");

        IdCasaEditarEquipJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCasaEditarEquipJActionPerformed(evt);
            }
        });

        ErroEquipEditarJ3.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipEditarJ3.setText("Erro");

        ErroEquipEditarJ4.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipEditarJ4.setText("Erro");

        jLabel43.setText("Id_Equipamento");

        jLabel44.setText("Novo Equipamento:");

        jLabel45.setText("Tipo(Consumidor/Gerador):");

        NovoTipoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoTipoJActionPerformed(evt);
            }
        });

        jLabel46.setText("Nova Energia:");

        EditarEquipj.setText("Editar");
        EditarEquipj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEquipjActionPerformed(evt);
            }
        });

        EditarEquipJ.setText("Editar");
        EditarEquipJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEquipJActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        EquipCriadaSucessoJ2.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        EquipCriadaSucessoJ2.setForeground(new java.awt.Color(0, 153, 0));
        EquipCriadaSucessoJ2.setText("Editado");

        EquipCriadaSucessoJ3.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        EquipCriadaSucessoJ3.setForeground(new java.awt.Color(0, 153, 0));
        EquipCriadaSucessoJ3.setText("Editado");

        EquipCriadaSucessoJ4.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        EquipCriadaSucessoJ4.setForeground(new java.awt.Color(0, 153, 0));
        EquipCriadaSucessoJ4.setText("Editado");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdCASDJ))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdCasaEditarEquipJ)
                                    .addComponent(ComboBoxCriarEquipamentosJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ErroEquipEditarJ4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErroEquipEditarJ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeEquipJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditarEquipJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EquipCriadaSucessoJ3)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(EnergiaEditarEquipJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EquipCriadaSucessoJ4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(NovoTipoJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EditarEquipj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EquipCriadaSucessoJ2)))))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(ComboBoxCriarEquipamentosJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(IdCasaEditarEquipJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ErroEquipEditarJ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(IdCASDJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErroEquipEditarJ4)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NovoTipoJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditarEquipj)
                            .addComponent(EquipCriadaSucessoJ2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(NomeEquipJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditarEquipJ)
                            .addComponent(EquipCriadaSucessoJ3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EnergiaEditarEquipJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)
                                .addComponent(EquipCriadaSucessoJ4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel47.setText("Remover Equipamento");

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EquipCriadaSucessoJ5.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        EquipCriadaSucessoJ5.setForeground(new java.awt.Color(0, 153, 0));
        EquipCriadaSucessoJ5.setText("Removido");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EquipCriadaSucessoJ5)
                .addGap(93, 93, 93))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel47)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EquipCriadaSucessoJ5)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Rede.addTab("Equipamentos", jPanel5);

        IdCasaHistJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCasaHistJActionPerformed(evt);
            }
        });

        ComboBoxPrintHistJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPrintHistJActionPerformed(evt);
            }
        });

        jLabel48.setText("Distribuidor:");

        jLabel49.setText("Id da Casa:");

        ErroEquipCriarJ3.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipCriarJ3.setText("Erro");

        ErroEquipCriarJ4.setForeground(new java.awt.Color(255, 0, 0));
        ErroEquipCriarJ4.setText("Erro");

        jLabel50.setText("Id_Equipamento");

        jScrollPane12.setViewportView(TextPaneHistJ);

        Date1J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date1JActionPerformed(evt);
            }
        });

        Date2J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date2JActionPerformed(evt);
            }
        });

        jLabel51.setText("Data 1:");

        jLabel52.setText("Data 2:");

        jLabel53.setText("Print Historico de uma Casa num Intervaldo de Tempo");

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel54.setText("Formato-> DD/MM/AAAA HH:MM:SS");

        jLabel55.setText("Print Casas Que Gastam Mais:");

        jButton4.setText("Print Casas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel56.setText("Print Casas Auto Sustentavais");

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel57.setText("Print Casas Com Geradores");

        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel59.setText("num intervalo de tempo");

        jLabel60.setText("Print Pior Casas Consumo");

        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date2J, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date1J, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel54))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel59))))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IdCasaHistJ)
                            .addComponent(ComboBoxPrintHistJ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdEquipamentoJ, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErroEquipCriarJ4)
                            .addComponent(ErroEquipCriarJ3)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jLabel57)
                            .addComponent(jButton5)
                            .addComponent(jLabel60)
                            .addComponent(jButton7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Date1J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Date2J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxPrintHistJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdCasaHistJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(ErroEquipCriarJ4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdEquipamentoJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(ErroEquipCriarJ3)
                            .addComponent(jLabel56))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 858, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Rede.addTab("Historico/Prints", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rede, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rede)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CriarFonteNomeJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarFonteNomeJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarFonteNomeJActionPerformed

    private void CriarFonteEnergiaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarFonteEnergiaJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarFonteEnergiaJActionPerformed

    private void CriarButtonFonteJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarButtonFonteJActionPerformed
      int energia=0;
        ErroFonteJ.setVisible(false);
        ErroFonteJ2.setVisible(false);
        FonteCriadaSucessoJ.setVisible(false);
      
      
      
        if(!CriarFonteNomeJ.getText().equals("") && !CriarFonteEnergiaJ.getText().equals("") && isInteger(CriarFonteEnergiaJ.getText()))
        {
        
           System.out.println(CriarFonteEnergiaJ.getText());
           energia=Integer.parseInt(CriarFonteEnergiaJ.getText());
           r1.criarFontes(CriarFonteNomeJ.getText(),energia, 1); 
           FonteCriadaSucessoJ.setVisible(true);
           TextoFonteCriadaJ.setText("Fonte Criada:\n"+"Nome--->"+CriarFonteNomeJ.getText()+"\nEnergia--->"+energia);
  
        }
        if(CriarFonteNomeJ.getText().equals(""))
        {
         ErroFonteJ.setVisible(true); 
         TextoFonteCriadaJ.setText("\n-----ERRO-----\n--INTRODUZA UM NOME-- ");
        }

        if(CriarFonteEnergiaJ.getText().equals("") || isInteger(CriarFonteEnergiaJ.getText())==false)
        {
        ErroFonteJ2.setVisible(true);
        TextoFonteCriadaJ.setText("\n-----ERRO-----\n--INTRODUZA UM NUMERO QUE SEJA INTEIRO-- ");
        }
        
            CriarFonteEnergiaJ.setText("");
            CriarFonteNomeJ.setText("");

            
            
    }//GEN-LAST:event_CriarButtonFonteJActionPerformed

    private void RedeListaFontesJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedeListaFontesJMouseClicked
        String NomeFonte;
        ArrayList <String> Distribuidores= new ArrayList<>();
        NomeFonte=RedeListaFontesJ.getSelectedValue();
        Distribuidores=r1.getDistribuidores(NomeFonte);
        
   DefaultListModel modelaux= new DefaultListModel();
   DefaultListModel model = new DefaultListModel();
        for(int i=0;i<Distribuidores.size();i++)
        {
           model.addElement(Distribuidores.get(i));
        }
        RedeListaDistJ.setModel(model);
        RedeListaCasasJ.setModel(modelaux);
        RedeListaEquipJ.setModel(modelaux);
        refreshfontes();
        
    }//GEN-LAST:event_RedeListaFontesJMouseClicked

    private void refreshfontes(){     
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<r1.getNum_fontes();i++)
        {
           model.addElement(r1.getFontes().get(i).getTipo());
        }
        RedeListaFontesJ.setModel(model);
    } 
    private void refreshCidadesCasas()
    {
               DefaultComboBoxModel AddCasasJ= new DefaultComboBoxModel();
              
      for(int i=0;i<r1.getNum_cidades();i++)
        {
            AddCasasJ.addElement(r1.getCidades().get(i).getName());
        }

        ComboBoxPrintCasasJ.setModel(AddCasasJ);
        ComboBoxCriarCasasJ.setModel(AddCasasJ);
        ComboBoxEditarCasasJ1.setModel(AddCasasJ);
        RemoverDropBoxJ1.setModel(AddCasasJ);
    }
    
    private void RedeListaDistJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedeListaDistJMouseClicked
       
        String NomeDistribuidor=RedeListaDistJ.getSelectedValue();
        ArrayList <String> Casas= r1.getCasas(NomeDistribuidor);
        int b=0;
        for(b=0;b<r1.getNum_cidades();b++)
        {
            if(r1.getCidades().get(b).getName().equals(RedeListaDistJ.getSelectedValue()))
            {
                break;
            }
        }
        DefaultListModel modelaux = new DefaultListModel();
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<Casas.size();i++)
        {
           model.addElement(b+"-"+Casas.get(i));
        }
        RedeListaCasasJ.setModel(model);
        RedeListaEquipJ.setModel(modelaux);
  
        
        
    }//GEN-LAST:event_RedeListaDistJMouseClicked

    private void RedeListaCasasJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedeListaCasasJMouseClicked
     
        String NomeDistribuidor=RedeListaCasasJ.getSelectedValue();
        ArrayList <String> Casas= r1.PrintAparelhosdeUmaCasa(NomeDistribuidor);
        
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<Casas.size();i++)
        {
           model.addElement(Casas.get(i));
        }
        RedeListaEquipJ.setModel(model);
   
    }//GEN-LAST:event_RedeListaCasasJMouseClicked

    private void NomeFonteEditarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeFonteEditarJActionPerformed
        
    }//GEN-LAST:event_NomeFonteEditarJActionPerformed
         
    
    private void RemoveFonteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFonteButtonActionPerformed
   
            
    
         String NomeFonte;
     SucessoRemoverFonteJ.setVisible(false);
     ErroNomeFonteRemoveJ1.setVisible(false);
  
        if(!NomeRemoverFonteJ.getText().equals("") )
        {
           NomeFonte=NomeRemoverFonteJ.getText();
           r1.removeFontes(NomeFonte);
                    
           SucessoRemoverFonteJ.setVisible(true);
  
        }
        if(NomeRemoverFonteJ.getText().equals(""))
        {
         ErroNomeFonteRemoveJ1.setVisible(true); 
        }

        
           NomeRemoverFonteJ.setText("");

            refreshfontes();
    
  
    }//GEN-LAST:event_RemoveFonteButtonActionPerformed

    private void NomeRemoverFonteJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeRemoverFonteJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeRemoverFonteJActionPerformed

    private void EditarFonteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarFonteButton1ActionPerformed
    
          
     String NomeFonte;
     String NomeEditar;
     int Energia=0;
     SucessoEditarFonteJ.setVisible(false);
     ErroNomeFonteJ.setVisible(false);
     ErroNomeEditarFonteJ.setVisible(false);
     ErroEnergiaEditarFonteJ.setVisible(false);
      
        if(!NomeFonteEditarJ.getText().equals("") && !NovoNomeEditarJ.getText().equals("") && !NovaEnergiaEditarJ.getText().equals("") && isInteger(NovaEnergiaEditarJ.getText()))
        {
           NomeFonte=NomeFonteEditarJ.getText();
           NomeEditar=NovoNomeEditarJ.getText();
           Energia=Integer.parseInt(NovaEnergiaEditarJ.getText());
           r1.EditarFonte(NomeFonte, NomeEditar, Energia);
                    
           SucessoEditarFonteJ.setVisible(true);
  
        }
        if(NomeFonteEditarJ.getText().equals(""))
        {
         ErroNomeFonteJ.setVisible(true); 
        }

        if(NovoNomeEditarJ.getText().equals(""))
        {
        ErroNomeEditarFonteJ.setVisible(true);
        }
        
        if(NovaEnergiaEditarJ.getText().equals("") || isInteger(NovaEnergiaEditarJ.getText())==false)
        {
        ErroEnergiaEditarFonteJ.setVisible(true);
        }
        
            NomeFonteEditarJ.setText("");
            NovoNomeEditarJ.setText("");
            NovaEnergiaEditarJ.setText("");
            refreshfontes();
    
    }//GEN-LAST:event_EditarFonteButton1ActionPerformed

    private void PrintFontesTodasJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintFontesTodasJActionPerformed
        
  
            PainelFontesTodasJ.setText(r1.getFontes().toString());
        
    }//GEN-LAST:event_PrintFontesTodasJActionPerformed

    private void CriarDistNomeJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarDistNomeJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarDistNomeJActionPerformed

    private void CriarDistLigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarDistLigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarDistLigActionPerformed

    private void CriarDistButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarDistButtonJActionPerformed
       
        int energia=0;
        ErroCriarDistJ.setVisible(false);
        ErroCriarligJ.setVisible(false);
        SucessoCriarDistJ.setVisible(false);
      
      
      
        if(!CriarDistNomeJ.getText().equals("") && !CriarDistLig.getText().equals("") && isInteger(CriarDistLig.getText()))
        {
           energia=Integer.parseInt(CriarDistLig.getText());
           r1.criarCidade(CriarDistNomeJ.getText(),0);
           AjustarLigacoesD();
          // r1.adicionarLigacoes(CriarDistNomeJ.getText() ,energia);CriarDistLig.getText()

           if(energia!=-1)
           {
            r1.adicionarLigacoes(CriarDistNomeJ.getText() ,energia);
            PaneCriarDistJ.setText("Cidade\\Distribuidor Criado:\n"+"Nome--->"+CriarDistNomeJ.getText()+"\nLigacao--->"+r1.getFontes().get(energia).getTipo());
           }           
           if(energia==-1)
           {
            PaneCriarDistJ.setText("Cidade\\Distribuidor Criado:\n"+"Nome--->"+CriarDistLig.getText()+"\nSem Ligacao");
           }
         SucessoCriarDistJ.setVisible(true);
        }
        if(CriarDistNomeJ.getText().equals(""))
        {
         ErroCriarDistJ.setVisible(true); 
         PaneCriarDistJ.setText("\n-----ERRO-----\n--INTRODUZA UM NOME-- ");
        }

        if(ErroCriarligJ.getText().equals(""))
        {
        ErroCriarligJ.setVisible(true);
        PaneCriarDistJ.setText("\n-----ERRO-----\n--INTRODUZA UM NUMERO QUE SEJA INTEIRO-- ");
        }
        
            
            CriarDistLig.setText("");
            CriarDistNomeJ.setText("");
             UpdateModelBoxRemoveDist();
    
    }//GEN-LAST:event_CriarDistButtonJActionPerformed

    private void NovoNomeEditarDistJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoNomeEditarDistJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoNomeEditarDistJActionPerformed

    public void AjustarLigacoesD(){
    DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        for(int i=0;i<r1.getNum_cidades();i++)
        {
           model2.addElement(r1.getCidades().get(i).getName());
        }

        BoxNomeEditarDistJ.setModel(model2);
    
}
    
    public void UpdateModelBoxRemoveDist()
    {
       DefaultComboBoxModel RemoveModelDist = new DefaultComboBoxModel();
        for(int i=0;i<r1.getNum_cidades();i++)
        {
           RemoveModelDist.addElement(r1.getCidades().get(i).getName());
        }
       RemoverDropBoxJ.setModel(RemoveModelDist);
    }
    
    private void EditarDistButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDistButtonJActionPerformed
         
     String NomeDist;
     String NomeEditar;
     int Id=0;
     int NovoId=0;
     SucessoEditarDistJ.setVisible(false);
     ErroDistEditarJ.setVisible(false);

      
        if(!NovoNomeEditarDistJ.getText().equals(""))
        {
           NomeDist=(String) BoxNomeEditarDistJ.getSelectedItem(); 
           NomeEditar=NovoNomeEditarDistJ.getText();
           r1.editarCidades(NomeDist, NomeEditar);
                    
           SucessoEditarDistJ.setVisible(true);
  
        }


        if(NovoNomeEditarDistJ.getText().equals(""))
        {
        ErroDistEditarJ.setVisible(true);
        }
        
     
            NovoNomeEditarDistJ.setText("");
            AjustarLigacoesD();
            UpdateModelBoxRemoveDist();

    }//GEN-LAST:event_EditarDistButtonJActionPerformed

    private void BoxNomeEditarDistJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxNomeEditarDistJActionPerformed
       
    }//GEN-LAST:event_BoxNomeEditarDistJActionPerformed

    private void RemoverDropBoxJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverDropBoxJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverDropBoxJActionPerformed

    private void RemoverDistButtonJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverDistButtonJ1ActionPerformed
                
     String NomeDist;
     
     RemoverEditarDistJ1.setVisible(false);

           NomeDist=(String) RemoverDropBoxJ.getSelectedItem(); 
           
           r1.RemoverCidades(NomeDist);
                    
           RemoverEditarDistJ1.setVisible(true);
  

            NovoNomeEditarDistJ.setText("");
            AjustarLigacoesD();
            UpdateModelBoxRemoveDist();
           
 
    }//GEN-LAST:event_RemoverDistButtonJ1ActionPerformed

    private void ButtonPrintDistJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPrintDistJActionPerformed
  
        String Tudo="---\n";
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            Tudo=Tudo+r1.getCidades().get(i).toString()+"\n";
        }
        
     TextoDistribuidoresJ.setText(Tudo); 
        
    }//GEN-LAST:event_ButtonPrintDistJActionPerformed

    private void CriarCasaPotenciaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarCasaPotenciaJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarCasaPotenciaJActionPerformed

    private void CriarButtonCasaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarButtonCasaJ1ActionPerformed
            
        int energia=0;
        String NomeDist;
        ErroDistCriarJ.setVisible(false);
        DistCriadaSucessoJ.setVisible(false);
      
      
      
        if(!CriarCasaPotenciaJ.getText().equals("") && isInteger(CriarCasaPotenciaJ.getText()))
        {
           energia=Integer.parseInt(CriarCasaPotenciaJ.getText());
           NomeDist=(String) ComboBoxCriarCasasJ.getSelectedItem();
           for(int i=0;i<r1.getNum_cidades();i++)
           {
               if(r1.getCidades().get(i).getName().equals(NomeDist))
               {
                   r1.getCidades().get(i).criarCasa(i,energia);
                   r1.AtualizarPotenciaCasaNova(i);
                   TextoCasasCriadaJ.setText("Criado Com Sucesso\n"+"\nDistribuidor:"+NomeDist+"\nPotencia Nova Casa:"+energia);
               }
           }
           AjustarLigacoesD();
          
         DistCriadaSucessoJ.setVisible(true);
        }
        if(CriarCasaPotenciaJ.getText().equals("") && !isInteger(CriarCasaPotenciaJ.getText()))
        {
         ErroDistCriarJ.setVisible(true); 
         TextoCasasCriadaJ.setText("---ERRO---\nESCREVA UM NUMERO INTEIRO NA POTENCIA CONTRATADA");
        }
                    
         CriarCasaPotenciaJ.setText("");
         refreshCidadesCasas();
    
    }//GEN-LAST:event_CriarButtonCasaJ1ActionPerformed

    private void ComboBoxCriarCasasJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCriarCasasJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCriarCasasJActionPerformed

    private void EditarCasaPotenciaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCasaPotenciaJ1ActionPerformed
    
    }//GEN-LAST:event_EditarCasaPotenciaJ1ActionPerformed

    private void ComboBoxEditarCasasJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEditarCasasJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEditarCasasJ1ActionPerformed

    private void EditarButtonCasaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonCasaJ2ActionPerformed
                  
        int energia=0;
        String NomeDist;
        int IdCasa=0;
        ErroDistEditarJ1.setVisible(false);
        DistEditadaSucessoJ1.setVisible(false);
 
        
        if(!EditarCasaPotenciaJ1.getText().equals("") && isInteger(EditarCasaPotenciaJ1.getText()) && !TextFieldEditarCasasJ.getText().equals("") && isInteger(TextFieldEditarCasasJ.getText()))
        {
           energia=Integer.parseInt(EditarCasaPotenciaJ1.getText());
           NomeDist=(String) ComboBoxEditarCasasJ1.getSelectedItem();
           IdCasa=Integer.parseInt(TextFieldEditarCasasJ.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {
                  if(r1.getCidades().get(i).getnCasas()<IdCasa)
                  {
                      ErroDistEditarJ2.setVisible(true);
                      return;
                  }
                  else
                  {
                      r1.EditarCasas(i,IdCasa,energia);
                  }
                      
            }

        } 
   
           AjustarLigacoesD();       
         DistEditadaSucessoJ1.setVisible(true);
        }
        if(EditarCasaPotenciaJ1.getText().equals("") && !isInteger(EditarCasaPotenciaJ1.getText())&& TextFieldEditarCasasJ.getText().equals("") && !isInteger(TextFieldEditarCasasJ.getText()))
        {
         ErroDistEditarJ1.setVisible(true);    
         ErroDistEditarJ2.setVisible(true);
        }           

         refreshCidadesCasas();
       
    }//GEN-LAST:event_EditarButtonCasaJ2ActionPerformed

    private void TextFieldEditarCasasJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEditarCasasJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEditarCasasJActionPerformed

    private void RemoverDropBoxJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverDropBoxJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverDropBoxJ1ActionPerformed

    private void RemoverCasaButtonJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverCasaButtonJ2ActionPerformed
       
        String NomeDist;
        int IdCasa=0;
        ErroCasaRemoverJ2.setVisible(false);
        RemoverCasaJ2.setVisible(false);
 
        
        if(!TextFieldRemoverCasasJ1.getText().equals("") && isInteger(TextFieldRemoverCasasJ1.getText()))
        {
           NomeDist=(String) RemoverDropBoxJ1.getSelectedItem();
           IdCasa=Integer.parseInt(TextFieldRemoverCasasJ1.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {
                  if(r1.getCidades().get(i).getnCasas()<=IdCasa)
                  {
                      ErroCasaRemoverJ2.setVisible(true);
                      return;
                  }
                  else
                  {
                     r1.getCidades().get(i).removeCasa(IdCasa,i);
                     r1.getCidades().get(i).ApagarFileCasa(i, IdCasa);
                  }
                      
            }

        } 
   
           AjustarLigacoesD();       
         RemoverCasaJ2.setVisible(true);
        }
        if(TextFieldRemoverCasasJ1.getText().equals("") && !isInteger(TextFieldRemoverCasasJ1.getText()))
        {
         ErroCasaRemoverJ2.setVisible(true);    
         ErroCasaRemoverJ2.setVisible(true);
        }           

         refreshCidadesCasas();
  
    }//GEN-LAST:event_RemoverCasaButtonJ2ActionPerformed

    private void TextFieldRemoverCasasJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRemoverCasasJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRemoverCasasJ1ActionPerformed

    private void PrintCasasJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintCasasJActionPerformed
        String Dist=(String) ComboBoxPrintCasasJ.getSelectedItem();
        String Print="---\n";
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(Dist))
            {
                for(int b=0;b<r1.getCidades().get(i).getCasas().size();b++)
                {
                    Print=Print+r1.getCidades().get(i).getCasas().get(b).toString()+"\n";
                }
            }
        }
        jTextAreaPrintCasasJ.setText(Print);
    }//GEN-LAST:event_PrintCasasJActionPerformed

    private void ComboBoxCriarEquipamentosJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCriarEquipamentosJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCriarEquipamentosJ1ActionPerformed

    private void CriarEquipamentosIdJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarEquipamentosIdJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriarEquipamentosIdJActionPerformed

    private void CriarButtonEquipamentoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarButtonEquipamentoJActionPerformed
            
        int IdCasa=0;
        String Tipo=null;
        String Nome=null;
        int Potencia=0;
        ErroEquipCriarJ1.setVisible(false);
        EquipCriadaSucessoJ1.setVisible(false);

        if(!CriarEquipamentosIdJ.getText().equals("") && isInteger(CriarEquipamentosIdJ.getText()))
        {
           IdCasa=Integer.parseInt(CriarEquipamentosIdJ.getText());
           Tipo=TipoTextFieldJ.getText();
           Nome=NomeTextJ.getText();
           Potencia=Integer.parseInt(EnergiaTextJ.getText());
           String Selected=(String) ComboBoxCriarEquipamentosJ1.getSelectedItem();
           
           for(int i=0;i<r1.getNum_cidades();i++)
           {
               if(r1.getCidades().get(i).getName().equals(Selected))
               {
                  r1.getCidades().get(i).getCasas().get(IdCasa).criarEquipamentos(false,"N sei",Potencia, Nome, Tipo, 0, 0);
                  TextoEquipamentosCriarJ.setText("Distribuidor->"+Selected+"\nCasa->"+IdCasa+"\nEquipamento->"+Nome+"\n"+Tipo+"\n"+Potencia);
               }
           }
           
           AjustarLigacoesD();
          // r1.adicionarLigacoes(CriarDistNomeJ.getText() ,energia);CriarDistLig.getText()

         EquipCriadaSucessoJ1.setVisible(true);
        }
        if(CriarEquipamentosIdJ.getText().equals(""))
        {
         ErroEquipCriarJ1.setVisible(true); 
        }
      
    }//GEN-LAST:event_CriarButtonEquipamentoJActionPerformed

    private void TipoTextFieldJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoTextFieldJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoTextFieldJActionPerformed

    private void PrintOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintOnOffActionPerformed
    
        String Dist=(String) ComboBoxCriarEquipamentosJ1.getSelectedItem();
        ErroEquipCriarJ2.setVisible(false);
        
        if(!TextEquipamentoIdJ.getText().equals(""))
        {
            for(int i=0;i<r1.getNum_cidades();i++)
            {
                if(r1.getCidades().get(i).getName().equals(Dist))
                {
                        int id_Equipamento=Integer.parseInt(TextEquipamentoIdJ.getText());
                        int Id_Casa=Integer.parseInt(CriarEquipamentosIdJ.getText());
                  
                    r1.getCidades().get(i).getCasas().get(Id_Casa).getEquipamentos().get(id_Equipamento).turnOnOff();
                    r1.getCidades().get(i).getCasas().get(Id_Casa).criarEquipamentos(true, null, 0, null,null, 0, 1);
                    TextoEquipamentosCriarJ.setText("Equipamento-->"+r1.getCidades().get(i).getCasas().get(Id_Casa).getEquipamentos().get(id_Equipamento).getNome()+"-->"+r1.getCidades().get(i).getCasas().get(Id_Casa).getEquipamentos().get(id_Equipamento).isEstado());
                }
            }
        }
        
        if(TextEquipamentoIdJ.getText().equals(""))
        {
            ErroEquipCriarJ2.setVisible(true);
        }
    
    }//GEN-LAST:event_PrintOnOffActionPerformed

    private void ComboBoxCriarEquipamentosJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCriarEquipamentosJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCriarEquipamentosJ2ActionPerformed

    private void IdCasaEditarEquipJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCasaEditarEquipJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCasaEditarEquipJActionPerformed

    private void NovoTipoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoTipoJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoTipoJActionPerformed

    private void EditarEquipjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEquipjActionPerformed

        String Novo_Tipo;
        String NomeDist;
        int IdEquipamento=0;
        int IdCasa=0;
        ErroEquipEditarJ3.setVisible(false);
        ErroEquipEditarJ4.setVisible(false);
        EquipCriadaSucessoJ2.setVisible(false);
 
        
        if(!IdCasaEditarEquipJ.getText().equals("") && isInteger(IdCasaEditarEquipJ.getText()) && !IdCASDJ.getText().equals("") && isInteger(IdCASDJ.getText())&& !NovoTipoJ.getText().equals(""))
        {
           Novo_Tipo=NovoTipoJ.getText();
           NomeDist=(String) ComboBoxCriarEquipamentosJ2.getSelectedItem();
           IdCasa=Integer.parseInt(IdCasaEditarEquipJ.getText());
           IdEquipamento=Integer.parseInt(IdCASDJ.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {
                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).setTipo(Novo_Tipo);
                 r1.getCidades().get(i).getCasas().get(IdCasa).criarEquipamentos(true, null, 0, null,null, 0, 1); 
                 EquipCriadaSucessoJ2.setVisible(true);
            }

        } 
   
           AjustarLigacoesD();       
    
        }
        if(IdCasaEditarEquipJ.getText().equals("") && !isInteger(IdCasaEditarEquipJ.getText())&& IdCASDJ.getText().equals("") && !isInteger(IdCASDJ.getText()))
        {
         ErroEquipEditarJ3.setVisible(true);    
         ErroEquipEditarJ4.setVisible(true);
        }           

         refreshCidadesCasas();
       
    }//GEN-LAST:event_EditarEquipjActionPerformed

    private void EditarEquipJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEquipJActionPerformed
                String Novo_Tipo;
        String NomeDist;
        int IdEquipamento=0;
        int IdCasa=0;
        ErroEquipEditarJ3.setVisible(false);
        ErroEquipEditarJ4.setVisible(false);
        EquipCriadaSucessoJ4.setVisible(false);
 
        
        if(!IdCasaEditarEquipJ.getText().equals("") && isInteger(IdCasaEditarEquipJ.getText()) && !IdCASDJ.getText().equals("") && isInteger(IdCASDJ.getText())&& !NomeEquipJ.getText().equals(""))
        {
           Novo_Tipo=NomeEquipJ.getText();
           NomeDist=(String) ComboBoxCriarEquipamentosJ2.getSelectedItem();
           IdCasa=Integer.parseInt(IdCasaEditarEquipJ.getText());
           IdEquipamento=Integer.parseInt(IdCASDJ.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {   
                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).MudarNomeFile(Novo_Tipo,IdCasa,i,IdEquipamento);
                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).setNome(Novo_Tipo);
                 r1.getCidades().get(i).getCasas().get(IdCasa).criarEquipamentos(true, null, 0, null,null, 0, 1); 
                 EquipCriadaSucessoJ3.setVisible(true);
            }

        } 
   
           AjustarLigacoesD();       
       
        }
        if(IdCasaEditarEquipJ.getText().equals("") && !isInteger(IdCasaEditarEquipJ.getText())&& IdCASDJ.getText().equals("") && !isInteger(IdCASDJ.getText()))
        {
         ErroEquipEditarJ3.setVisible(true);    
         ErroEquipEditarJ4.setVisible(true);
        }           

         refreshCidadesCasas();
    
    }//GEN-LAST:event_EditarEquipJActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int Novo_Tipo;
        String NomeDist;
        int IdEquipamento=0;
        int IdCasa=0;
        ErroEquipEditarJ3.setVisible(false);
        ErroEquipEditarJ4.setVisible(false);
        EquipCriadaSucessoJ3.setVisible(false);
 
        
        if(!IdCasaEditarEquipJ.getText().equals("") && isInteger(IdCasaEditarEquipJ.getText()) && !IdCASDJ.getText().equals("") && isInteger(IdCASDJ.getText())&& !EnergiaEditarEquipJ.getText().equals(""))
        {
           Novo_Tipo=Integer.parseInt(EnergiaEditarEquipJ.getText());
           NomeDist=(String) ComboBoxCriarEquipamentosJ2.getSelectedItem();
           IdCasa=Integer.parseInt(IdCasaEditarEquipJ.getText());
           IdEquipamento=Integer.parseInt(IdCASDJ.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {   

                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).seteConsumida(Novo_Tipo);
                 r1.getCidades().get(i).getCasas().get(IdCasa).criarEquipamentos(true, null, 0, null,null, 0, 1); 
                 EquipCriadaSucessoJ4.setVisible(true);
            }

        } 
   
           AjustarLigacoesD();       
     
        }
        if(IdCasaEditarEquipJ.getText().equals("") && !isInteger(IdCasaEditarEquipJ.getText())&& IdCASDJ.getText().equals("") && !isInteger(IdCASDJ.getText()))
        {
         ErroEquipEditarJ3.setVisible(true);    
         ErroEquipEditarJ4.setVisible(true);
        }           

         refreshCidadesCasas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             

        String NomeDist;
        int IdEquipamento=0;
        int IdCasa=0;
        ErroEquipEditarJ3.setVisible(false);
        ErroEquipEditarJ4.setVisible(false);
        EquipCriadaSucessoJ2.setVisible(false);
 
        
        if(!IdCasaEditarEquipJ.getText().equals("") && isInteger(IdCasaEditarEquipJ.getText()) && !IdCASDJ.getText().equals("") && isInteger(IdCASDJ.getText()))
        {
           NomeDist=(String) ComboBoxCriarEquipamentosJ2.getSelectedItem();
           IdCasa=Integer.parseInt(IdCasaEditarEquipJ.getText());
           IdEquipamento=Integer.parseInt(IdCASDJ.getText());
  
        for(int i=0;i<r1.getNum_cidades();i++)
        {
            if(r1.getCidades().get(i).getName().equals(NomeDist))
            {
                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).removeEquipamento(IdEquipamento,r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().get(IdEquipamento).getNome());
                 r1.getCidades().get(i).getCasas().get(IdCasa).getEquipamentos().delete(IdEquipamento);
                 r1.getCidades().get(i).getCasas().get(IdCasa).setNum_equipamentos(r1.getCidades().get(i).getCasas().get(IdCasa).getNum_equipamentos()-1);
                 r1.getCidades().get(i).getCasas().get(IdCasa).criarEquipamentos(true, null, 0, null,null, 0, 1); 
                 EquipCriadaSucessoJ2.setVisible(true);
            }

        } 
   
           AjustarLigacoesD();       
    
        }
        if(IdCasaEditarEquipJ.getText().equals("") && !isInteger(IdCasaEditarEquipJ.getText())&& IdCASDJ.getText().equals("") && !isInteger(IdCASDJ.getText()))
        {
         ErroEquipEditarJ3.setVisible(true);    
         ErroEquipEditarJ4.setVisible(true);
        }           

         refreshCidadesCasas();
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IdCasaHistJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCasaHistJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCasaHistJActionPerformed

    private void ComboBoxPrintHistJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPrintHistJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxPrintHistJActionPerformed

    private void Date1JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date1JActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date1JActionPerformed

    private void Date2JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date2JActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date2JActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               
        int IdCasa=0;
        int IdEquipamento=0;
        String Tudo = "";
        ErroEquipCriarJ4.setVisible(false);
        ErroEquipCriarJ3.setVisible(false);
        String Distribuidor=(String) ComboBoxPrintHistJ.getSelectedItem();
        String Data1=Date1J.getText();
        String Data2=Date2J.getText();
                
        if(!IdCasaHistJ.getText().equals("") && isInteger(IdCasaHistJ.getText()))
        {
           IdCasa=Integer.parseInt(IdCasaHistJ.getText());
           
            try {
                Tudo=r1.PrintHistCasa(Distribuidor,IdCasa,Data1,Data2);
            } catch (ParseException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }

            TextPaneHistJ.setText(Tudo);


        }
        if(IdCasaHistJ.getText().equals(""))
        {
         ErroEquipCriarJ4.setVisible(true); 
        }

             UpdateModelBoxRemoveDist();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String Data1=Date1J.getText();
        String Data2=Date2J.getText();
        String Tudo="";

            try {
                 Tudo=r1.PrintCasasMaisGastadoras(Data1,Data2);
            } catch (ParseException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            TextPaneHistJ.setText(Tudo);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String Tudo="";
        Tudo=r1.CasasSustentaveis();
        TextPaneHistJ.setText(Tudo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Tudo="";
        Tudo=r1.CasasComProdutores();
        TextPaneHistJ.setText(Tudo);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        int IdCasa=0;
        String Tudo="";
        String Selected="";
        ErroEquipCriarJ1.setVisible(false);
        EquipCriadaSucessoJ1.setVisible(false);

        if(!CriarEquipamentosIdJ.getText().equals("") && isInteger(CriarEquipamentosIdJ.getText()))
        {
           IdCasa=Integer.parseInt(CriarEquipamentosIdJ.getText());
           Selected=(String) ComboBoxCriarEquipamentosJ1.getSelectedItem();
           Tudo=r1.PrintCasasEquipamentos(Selected,IdCasa);
           TextoEquipamentosCriarJ.setText(Tudo);
           
           AjustarLigacoesD();
          // r1.adicionarLigacoes(CriarDistNomeJ.getText() ,energia);CriarDistLig.getText()

         EquipCriadaSucessoJ1.setVisible(true);
        }
        if(CriarEquipamentosIdJ.getText().equals(""))
        {
         ErroEquipCriarJ1.setVisible(true); 
        }
   
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String Tudo="";
        Tudo=r1.PrintCasasSustentaveis();
        TextPaneHistJ.setText(Tudo);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }catch(NullPointerException e)
        {
            return false;
        }
        return true;
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxNomeEditarDistJ;
    private javax.swing.JButton ButtonPrintDistJ;
    private javax.swing.JComboBox<String> ComboBoxCriarCasasJ;
    private javax.swing.JComboBox<String> ComboBoxCriarEquipamentosJ1;
    private javax.swing.JComboBox<String> ComboBoxCriarEquipamentosJ2;
    private javax.swing.JComboBox<String> ComboBoxEditarCasasJ1;
    private javax.swing.JComboBox<String> ComboBoxPrintCasasJ;
    private javax.swing.JComboBox<String> ComboBoxPrintHistJ;
    private javax.swing.JButton CriarButtonCasaJ1;
    private javax.swing.JButton CriarButtonEquipamentoJ;
    private javax.swing.JButton CriarButtonFonteJ;
    private javax.swing.JTextField CriarCasaPotenciaJ;
    private javax.swing.JButton CriarDistButtonJ;
    private javax.swing.JTextField CriarDistLig;
    private javax.swing.JTextField CriarDistNomeJ;
    private javax.swing.JTextField CriarEquipamentosIdJ;
    private javax.swing.JTextField CriarFonteEnergiaJ;
    private javax.swing.JTextField CriarFonteNomeJ;
    private javax.swing.JTextField Date1J;
    private javax.swing.JTextField Date2J;
    private javax.swing.JLabel DistCriadaSucessoJ;
    private javax.swing.JLabel DistEditadaSucessoJ1;
    private javax.swing.JButton EditarButtonCasaJ2;
    private javax.swing.JTextField EditarCasaPotenciaJ1;
    private javax.swing.JButton EditarDistButtonJ;
    private javax.swing.JButton EditarEquipJ;
    private javax.swing.JButton EditarEquipj;
    private javax.swing.JButton EditarFonteButton1;
    private javax.swing.JTextField EnergiaEditarEquipJ;
    private javax.swing.JTextField EnergiaTextJ;
    private javax.swing.JLabel EquipCriadaSucessoJ1;
    private javax.swing.JLabel EquipCriadaSucessoJ2;
    private javax.swing.JLabel EquipCriadaSucessoJ3;
    private javax.swing.JLabel EquipCriadaSucessoJ4;
    private javax.swing.JLabel EquipCriadaSucessoJ5;
    private javax.swing.JLabel ErroCasaRemoverJ2;
    private javax.swing.JLabel ErroCriarDistJ;
    private javax.swing.JLabel ErroCriarligJ;
    private javax.swing.JLabel ErroDistCriarJ;
    private javax.swing.JLabel ErroDistEditarJ;
    private javax.swing.JLabel ErroDistEditarJ1;
    private javax.swing.JLabel ErroDistEditarJ2;
    private javax.swing.JLabel ErroDistRemoverJ1;
    private javax.swing.JLabel ErroEnergiaEditarFonteJ;
    private javax.swing.JLabel ErroEquipCriarJ1;
    private javax.swing.JLabel ErroEquipCriarJ2;
    private javax.swing.JLabel ErroEquipCriarJ3;
    private javax.swing.JLabel ErroEquipCriarJ4;
    private javax.swing.JLabel ErroEquipEditarJ3;
    private javax.swing.JLabel ErroEquipEditarJ4;
    private javax.swing.JLabel ErroFonteJ;
    private javax.swing.JLabel ErroFonteJ2;
    private javax.swing.JLabel ErroNomeEditarFonteJ;
    private javax.swing.JLabel ErroNomeFonteJ;
    private javax.swing.JLabel ErroNomeFonteRemoveJ1;
    private javax.swing.JLabel FonteCriadaSucessoJ;
    private javax.swing.JTextField IdCASDJ;
    private javax.swing.JTextField IdCasaEditarEquipJ;
    private javax.swing.JTextField IdCasaHistJ;
    private javax.swing.JTextField IdEquipamentoJ;
    private javax.swing.JTextField NomeEquipJ;
    private javax.swing.JTextField NomeFonteEditarJ;
    private javax.swing.JLabel NomeRemoveFonteJ;
    private javax.swing.JTextField NomeRemoverFonteJ;
    private javax.swing.JTextField NomeTextJ;
    private javax.swing.JTextField NovaEnergiaEditarJ;
    private javax.swing.JTextField NovoNomeEditarDistJ;
    private javax.swing.JTextField NovoNomeEditarJ;
    private javax.swing.JTextField NovoTipoJ;
    private javax.swing.JTextPane PainelFontesTodasJ;
    private javax.swing.JTextPane PaneCriarDistJ;
    private javax.swing.JButton PrintCasasJ;
    private javax.swing.JButton PrintFontesTodasJ;
    private javax.swing.JButton PrintOnOff;
    private javax.swing.JTabbedPane Rede;
    private javax.swing.JList<String> RedeListaCasasJ;
    private javax.swing.JList<String> RedeListaDistJ;
    private javax.swing.JList<String> RedeListaEquipJ;
    private javax.swing.JList<String> RedeListaFontesJ;
    private javax.swing.JButton RemoveFonteButton;
    private javax.swing.JButton RemoverCasaButtonJ2;
    private javax.swing.JLabel RemoverCasaJ2;
    private javax.swing.JButton RemoverDistButtonJ1;
    private javax.swing.JComboBox<String> RemoverDropBoxJ;
    private javax.swing.JComboBox<String> RemoverDropBoxJ1;
    private javax.swing.JLabel RemoverEditarDistJ1;
    private javax.swing.JLabel SucessoCriarDistJ;
    private javax.swing.JLabel SucessoEditarDistJ;
    private javax.swing.JLabel SucessoEditarFonteJ;
    private javax.swing.JLabel SucessoRemoverFonteJ;
    private javax.swing.JTextField TextEquipamentoIdJ;
    private javax.swing.JTextField TextFieldEditarCasasJ;
    private javax.swing.JTextField TextFieldRemoverCasasJ1;
    private javax.swing.JTextPane TextPaneHistJ;
    private javax.swing.JTextArea TextoCasasCriadaJ;
    private javax.swing.JTextArea TextoDistribuidoresJ;
    private javax.swing.JTextArea TextoEquipamentosCriarJ;
    private javax.swing.JTextArea TextoFonteCriadaJ;
    private javax.swing.JTextField TipoTextFieldJ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextAreaPrintCasasJ;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
