
package iplot9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class IPlot9 {
    JPanel pan,tapa;
     Grafica gra;
     
     
     
           //JFrame frame ;
            JFrame frame2 ;
    public IPlot9(){
        
//            frame = new JFrame("IPlotK9");
//            frame.setBounds(700, 20, 200, 500);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setVisible(true);
//            frame.setLayout(null);
             
             frame2= new JFrame("IPlotK9");
        frame2.setBounds(183, 20, 515, 545);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLayout(null);
        
        panel();
        //frame f
        frame fra= new frame();
        
        gra = new Grafica();
        frame2.add(gra);
        gra.setVisible(true);
        //Grafica.nuevo=1;
        JLabel la = new JLabel("hola asdfasd");
        
        frame2.repaint();
//        la.setBounds(500, 500, 200, 200);
//        super.add(la);
//         
// 
//    
//    a1 = new JLabel("a");
//    a1.setBounds(500,500,30,30);
//    super.add(a1);
//    ecua = new JComboBox();
//    ecua.addItem("SELCCIONE");
//    ecua.setBounds(500,550,30,30);
//    super.add(ecua);
    
    
    
         // frame.componentes();
   }
    

    public static void main(String[] args) {
       IPlot9 h = new IPlot9();
       
//       JFrame frame = new JFrame("IPlotK9");
//        frame.setBounds(200, 20, 900, 700);
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.add(h);
//       frame.setVisible(true);
        
       
    }
 
    private void panel(){
//    pan = new JPanel();
//        pan.setLayout(null);
//        pan.setBounds(500, 0, 400, 680);
//        pan.setBackground(Color.red);
//        pan.setVisible(true);
//        super.add(pan);
    
        tapa = new JPanel();
        tapa.setLayout(null);
        tapa.setBounds(0, 0, 500, 500);
        tapa.setBackground(Color.white);
        tapa.setVisible(true);
        //frame2.add(tapa);
    
    }
    
    
    
    
    
    
    
    
}


class frame extends JFrame{
JTabbedPane tab = new JTabbedPane();
    JLabel a1,a2,a3,a4;
    JTextField text1,text2,text3,text4;
    JComboBox ecua,ecua2,ecua3;
    JButton graficar,graficar2,graficar3,graficar9;
    static String[][] lista;
    static String[][] hilos;   
    static double[][] listatemp; 
    static String[][] tempmuestra; 
    
    static int flag=0;
    JTable tabla;
    JTable tablah;
    JScrollPane scroll;
    JScrollPane scroll2;
    
    public frame(){
        lista = new String[500][3];
        hilos = new String[20][1];
        listatemp = new double[500][2];
        tempmuestra = new String[500][2];
        
             this.setLayout(null);
            super.setBounds(700, 20, 600, 500);
            //super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            super.setVisible(true);
            //super.setLayout(null);
    componentes();
    repaint();
    tablas();
    
    }
    
    private void componentes(){
        
        
        
        
        
        
        ecua = new JComboBox();
        ecua.setBounds(10,10,150,20);
        ecua.addItem("Ecuacion");
        ecua.addItem("(aX^b) +c");
        ecua.addItem("(X^2) +(Y^2)=a^2");
        ecua.addItem("E^x + a");
        ecua.addItem("Ln(x) +a");
        ecua.addItem("a*X^(1/b) +c");

        a1 = new JLabel("a");
        a1.setBounds(10,50,30,30);

        text1 = new JTextField("1");
        text1.setBounds(40,50,50,30);


        a2 = new JLabel("b");
        a2.setBounds(10,90,30,30);

        text2 = new JTextField("1");
        text2.setBounds(40,90,50,30);

        a3 = new JLabel("c");
        a3.setBounds(10,130,30,30);

        text3 = new JTextField("1");
        text3.setBounds(40,130,50,30);
        
        ecua2 = new JComboBox();
        ecua2.setBounds(10,170,150,20);
        ecua2.addItem("Color");
        ecua2.addItem("Azul");
        ecua2.addItem("Verde");
        ecua2.addItem("Amarillo");
        ecua2.addItem("Rojo");
        ecua2.addItem("Negro");
        
        ecua3 = new JComboBox();
        ecua3.setBounds(10,200,150,20);
        ecua3.addItem("Tipo de Linea");
        ecua3.addItem("Punteada Gruesa");
        ecua3.addItem("Delgada Punteada");
        ecua3.addItem("Delgada");
        ecua3.addItem("Gruesa");
        
        
        a4 = new JLabel("Detener");
        a4.setBounds(10,220,200,30);

        text4 = new JTextField();
        text4.setBounds(10,250,50,30);
        text4.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                try{
                Grafica.detener=Integer.parseInt(text4.getText());
                }catch(Exception r){
                Grafica.detener=0;
                }
                
                
            }
        
        
        
        });
        
        final JSlider slider=new JSlider(1,100,10);
         slider.setBounds(10,300,200,50);

                
        slider.setMinimum(0);
        //Valor máximo
        slider.setMaximum(100);
        //valor inicial
        slider.setValue(10);
        //Valores para mostrar regla
        //mínimo para mostrar
        slider.setMinorTickSpacing(1);
        //máximo para mostrar
        slider.setMajorTickSpacing(10);
        
        
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
         slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                
                System.out.println("as "+slider.getValue() );
                AnimacionC.velocidad=10*slider.getValue();
                System.out.println("ejecuta esto 5555555555555555555555555555555555555555555555555555555555555");
            }
  });
         
//         ecua = new JComboBox();
//        ecua.setBounds(10,280,150,20);
//        ecua.addItem("Velocidad");
//        ecua.addItem("Rapido");
//        ecua.addItem("Rapido");

        
        
        graficar = new JButton("Graficar");
        graficar.setBounds(10,350,150,20);
        graficar.addActionListener(new ActionListener(){
            
           
            
            
            @Override
            public void actionPerformed(ActionEvent e) {

               
               try{
               int ecuacion =  ecua.getSelectedIndex();
               
                   System.out.println("ecuacion"+ecuacion);
//                   try{
                   double numero1= Double.parseDouble(text1.getText());
                   double numero2= Double.parseDouble(text2.getText());
                   double numero3= Double.parseDouble(text3.getText());
//                   }catch(Exception h){
//                       
//                   double numero1= 0;
//                   double numero2= Double.parseDouble(text2.getText());
//                   double numero3= Double.parseDouble(text3.getText());
//                   }
                   System.out.println("SE EJECUTA EL BOTON HACE PERO NOSE+++++++++++++");
               Grafica.nuevo=1;
               Grafica.ecua=ecuacion;

               System.out.println("paso1");
               Grafica.linea=ecua3.getSelectedIndex();//linea
               Grafica.color=ecua2.getSelectedIndex();
               System.out.println("paso2");
               Grafica.a=numero1;
               Grafica.b=numero2;
               Grafica.c=numero3;
               System.out.println("VALOR QUE OBTIEN//// "+Grafica.c);

               }catch(Exception ed){
                
               }
               text1.setText("1");
               text2.setText("1");
               text3.setText("1");

            }
        });

//        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25); 
//        slider.setBounds(10, 230, 200, 200);
//        slider.setMinorTickSpacing(2);  
//        slider.setMajorTickSpacing(10);  
//        slider.setPaintTicks(true);  
//        slider.setPaintLabels(true);  
        
        graficar2 = new JButton("Actualizar");
        graficar2.setBounds(10,380,150,20);
        graficar2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                scroll.setVisible(false);
                remove(scroll);
                
                tablas();
                
                

            }
        });
        
        
        
        graficar3 = new JButton("Detener");
        graficar3.setBounds(10,410,150,20);
        graficar3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=1;
                System.out.println("valor dominio"+Grafica.dominio);
                System.out.println("valor dominiocosnsulta "+Grafica.domimioconsultado);
             Grafica.dominio=Grafica.domimioconsultado;
                System.out.println("valor post domiinio"+Grafica.dominio);
             //Grafica.dominio=500;

            }
        });
        

        graficar9 = new JButton("Ordenar");
        graficar9.setBounds(200,410,100,20);
        graficar9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                scroll.setVisible(false);
                remove(scroll);
                ordena();
             tablastemp();

            }
        });
        
                
        add(slider);
        add(ecua);
        add(ecua2);
        add(ecua3);
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(graficar);
        add(graficar2);
        add(graficar3);
        add(graficar9);
        }
    
    private void tablas(){
    String matriz[];
        matriz = new String[3];
        matriz[0]="No.";
        matriz[1]="X";
        matriz[2]="Y";
        
        tabla = new JTable(lista,matriz);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(380, 20, 150, 400);
        add(scroll);
        scroll.setVisible(true);
        
        
        String hilosx[];
        hilosx = new String[1];
        hilosx[0]="Hilos Activos";
        
        
        
        
        tablah = new JTable(hilos,hilosx);
        scroll2 = new JScrollPane(tablah);
        scroll2.setBounds(200, 20, 150, 200);
        add(scroll2);
        scroll2.setVisible(true);
    
    }

     private void tablastemp(){
    String matriz[];
        matriz = new String[2];
        matriz[0]="No.";
        matriz[1]="Y";
        
        tabla = new JTable(tempmuestra,matriz);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(380, 20, 150, 400);
        add(scroll);
        scroll.setVisible(true);
        
        
        String hilosx[];
        hilosx = new String[1];
        hilosx[0]="Hilos Activos";
        
        
        
        
        tablah = new JTable(hilos,hilosx);
        scroll2 = new JScrollPane(tablah);
        scroll2.setBounds(200, 20, 150, 200);
        add(scroll2);
        scroll2.setVisible(true);
    
    }
    private void ordena(){

    for(int i=0;i<=499;i++){   
         listatemp[i][0]=0;   
         listatemp[i][1]=0;   
         
         tempmuestra[i][0]=null;
         tempmuestra[i][1]=null;
         
     }
        
        
        System.out.println("ordenoas sdfsdf0000000000000000000000000000000000000000000000000000000000000000000000000000000");
     for(int i=0;i<=499;i++){
         if(lista[i][2]==null){
         
         }else{
             System.out.println("valor"+lista[i][0]);
         listatemp[i][0]=Double.parseDouble( lista[i][0]);   
         listatemp[i][1]=Double.parseDouble( lista[i][2]);   
         }
     }
     

     Insercion(listatemp);

        for(int i=0;i<=499;i++){
         if(listatemp[i][0]==0){
         
         }else{
             System.out.println("valor"+lista[i][0]);
        tempmuestra[i][0]= Double.toString(listatemp[i][0]) ;
        tempmuestra[i][1]= Double.toString(listatemp[i][1]) ;
 
         }
     }
    
    }
    
    
    public void Insercion(double vector [][]) {
      for (int i=1; i < vector.length; i++) {
          
         double aux = vector[i][1];
        // double aux2 = vector[i][0];
         
         int j;
         for (j=i-1; j>=0 && vector[j][1] > aux; j--){
             
              vector[j+1][1] = vector[j][1];
              //vector[j+1][0] = vector[j][0];
          }
            //vector[j+1][0] = aux;
            vector[j+1][1] = aux;
      }
   }
    
    
}

    


   