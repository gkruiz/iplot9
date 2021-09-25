
package iplot9;


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Grafica extends JPanel implements Runnable{
    
    static Graphics2D d;
    static int nuevo;
    static int ecua=0;
    static double a=0;
    static double b=0;
    static double c=0;
    static int color=0;
    static int linea=0;
    static int  contadorh=1;
    static int repinta;
    static int detener;
    static double dominio;
    static double domimioconsultado=0;
    JComboBox box;
    
    public Grafica(){ 
       dominio=500;
        nuevo=0;
        detener=0;
        
       // super.setLayout(null);
        System.out.println("ejecuta contructor"+a);
        
        
        repinta=1;
//        box = new JComboBox();
//        box.addItem("Hola1");
//        box.setBounds(50, 50, 200, 50);
//        add(box);
//        System.out.println("paso por qui");
       
        super.setBounds(0,0,500,500);
    //setSize(500,500);
//    super.setLocation(350, 50);
       // super.setBounds(50,30,500,500);
        super.setLayout(null);
   super.setBackground(Color.white);
//          JPanel pan;
//        pan = new JPanel();
//        //pan.setLayout(null);
//        pan.setBounds(10, 10, 200, 200);
//        pan.setBackground(Color.red);
//        pan.setVisible(true);
//        super.add(pan);
    //repaint();
    }
   
    
    @Override
   public void paint(Graphics g){
       //componentes();
//       System.out.println("gra"+a);
//        System.out.println("valor "+nuevo);

        int dx=0;
        int dy=0;
       try{
           
       d= (Graphics2D) g;
       //super.paintComponent(super.getComponentGraphics(g));
       super.paintComponent(d);
       //super.getComponents();
       //d.setPaint((Paint) d);
       
       //super.paintComponent(g);
       d.drawLine(0+dx,250 +dy, 500+dx, 250+dy);
        d.drawLine(250+dx,0 +dy, 250+dx, 500+dy);
        //d.getPaint();
        
        
        d.setColor(Color.red);
        //super.getComponentGraphics(d);
        
        //super.paintComponent(super.getGraphics());
       //super.paint(super.getGraphics());
       }catch(Exception e){
       
       }
    
        System.out.println("valor contador "+contadorh);
        System.out.println("valor detener "+detener);
//    hace(200,20);
//    hace(50,100);
    if(nuevo==1){
            System.out.println("SE CREO UNO NUEVO");
            
            AnimacionC ani= new AnimacionC(ecua,a,b,c,linea,color,contadorh);
  
            ani.start();
            nuevo=0;
//            contadorh=contadorh+1;
            System.out.println("valor condator pero en crea"+contadorh);
    }else{
    System.out.println("valor condator pero en crea"+contadorh);
    }
     
     
        //System.out.println("repinta 8888888888888888888888");
       try {
          
            //System.out.println("Slept");
            //Thread.sleep(AnimacionC.velocidad);
            Thread.sleep(500);
            
        } catch (InterruptedException ex) {
           // System.out.println("ERRO SLEPTS");
            //repaint();
        }

    repaint();
    
        
    }
   
   
   
   
   public void actualiza(){
   super.repaint();
   
   }
   
//   
//    @Override
//   public void update (Graphics g)
//   {
//       System.out.println("paso aqui----------------");
//      paint (g);
//   }
   
//    @Override
//   public void repaint (){
//       //paint (g);
//       //super.getGraphics();
//       //paint(d);
//       System.out.println("hola dijo paso ++++++++++++++++");
//   }

    @Override
    public void run() {
        
    }
  
   
    
}








class AnimacionC extends Thread{
         double x;
        double y;
         double xa;
        double ya;
        
        
        static int velocidad,velocidad2;
        double paso;
        double dominio;
        
         double matrizx[];
           double matrizy[];
           int tamanomatriz=500;
        int ecuacion;
        double a;
        double b;
        double c;
        int linea;
        int color;
        int ID=1;
           int sumatoria=0;
      Grafica gra;
      int radio=5;
      
      
       public AnimacionC(int ecua,double a, double b, double c,int linea,int color,int contadorh){
           gra= new Grafica();
//           pinta= new Pinta();
       ecuacion=0;
       this.a=1;
       this.b=1;
       this.c=0;
       this.linea=0;
       this.color=0;
       
       
       
       
       x=0;
       y=250;
       velocidad=500;
       velocidad2=1;
       paso=2;
       
       if(linea==1){
       radio=8;
       paso=3;
       }else if(linea==2){
       radio=3;
       paso=3;
       }else if(linea==3){
      radio=6;
       paso=2;
       }else if(linea==4){
        radio=8;
        paso=2;
       }
       
       
       
       matrizx= new double[tamanomatriz];
       matrizy= new double[tamanomatriz];
       
       
       this.ID=contadorh;
       
       
       dominio=x+489;
       
           System.out.println("ID "+ID);
           System.out.println("valor eliminia"+Grafica.detener);
       this.ecuacion=ecua;
       this.a=a;
       this.b=b;
       this.c=c;
       this.linea=linea;
       this.color=color;
           System.out.println("valor recogido de a--------------- "+a);
       inicia();
       }
       @Override
       public void run(){
       //int ecuacion=2;
           
       if(ecuacion==0){
       
       }else if(ecuacion==1){
           System.out.println("iniciafor--------------------------------------------------------------------");
           
           
           for(int i=0;i<=19;i++){
               
               if(frame.hilos[i][0]==null){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else if(frame.hilos[i][0].trim()==""){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else{
               
               }
           
           
           }
           
           
           Grafica.contadorh++;
           //double b= 2;
               //hay 120 diferencia pixeles
              for(double i=x;i<dominio+10;i+=paso){
                  System.out.println("dominio actual= "+dominio);
                  System.out.println("paso= "+paso);
                  
                  
                  
                  
                  Grafica.domimioconsultado=i;
                  System.out.println("ID**************************"+ID);
                  System.out.println("CONTADODRH**************************"+Grafica.contadorh);
                  
           if(Grafica.detener==ID){
               try{
                   
                   for(int c=0;c<=19;c++){
               
               if(frame.hilos[c][0]==null){
               
               
               }else if(frame.hilos[c][0].trim().equals(Integer.toString(ID))){
               frame.hilos[c][0]=null;
               break;
               }else{
               
               }
           }
                   
                   
               stop();
               
               
               }catch(Exception xs){
                   System.out.println("error al detener");
               }
           
           
           }
           
                  x=i;//tenia 625 tralacion x
                  double resultado=(i-250)/10;//se define ampitud
                  double valores= (a*Math.pow(resultado, b))+c;
                  y=245-valores;
                  //centro = 300
                  //se define traslalcion Y
                  //tenia 300
                  //System.out.println("vaor deu"+y);
                  
                  for(int v=0;v<=tamanomatriz-1;v++){
                      //System.out.println("consulta matriz ingreso"+matrizx[v]);
                      if(matrizx[v]==999999999){
                          //System.out.println("ejecuta for para ingresar");
                      matrizx[v]=i;
                      matrizy[v]=y;
                      
                      
                      frame.lista[sumatoria][0]=String.valueOf(sumatoria);
                      frame.lista[sumatoria][1]=String.valueOf(i-250);
                      frame.lista[sumatoria][2]=String.valueOf(y);
                      sumatoria++;
                      
                      break;
                      }else{
                      //System.out.println("es nda");
                      }
                      
                  }
                  
        for(int j=0;j<=i-paso;j+=paso){   
            double temp = matrizy[j] ;
            double tempx = matrizx[j] ;
            try{
                Ellipse2D oval= new Ellipse2D.Double((int) tempx+0,(int)temp+1,radio,radio);
                if(color==0){
                    Grafica.d.setColor(Color.black);
                
                }else if(color==1){
                Grafica.d.setColor(Color.blue);
                }else if(color==2){
                Grafica.d.setColor(Color.green);
                }else if(color==3){
                Grafica.d.setColor(Color.yellow);
                }else if(color==4){
                Grafica.d.setColor(Color.red);
                }else if(color==5){
                Grafica.d.setColor(Color.black);
                }else{
                }
            
            
            Grafica.d.fill(oval);
            
            
            }catch(Exception es){
                System.out.println("error........................");
            }
        //pinta.hace((int) j+120 ,(int)temp+1);
            //System.out.println("ejecutasssssssssssssssssss  "+y);
        }
        
        
        try {
            //System.out.println("ejecuta");
            Thread.sleep(velocidad,velocidad2);
        } catch (InterruptedException ex) {
            Logger.getLogger(IPlot9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i>=dominio){
            System.out.println("ERA MAYOR ************************************************");
        i=i-paso;
        }else{  
            
        }
        
        
                  System.out.println("valor dominio antes cambio"+dominio);
                  System.out.println(" contador h ante de evalues"+Grafica.contadorh);
                  System.out.println("valor de id antres de evaluar"+ID);
        if((ID==Grafica.contadorh-1)&&(frame.flag==1)){
//                      System.out.println("dominico consultado"+Grafica.domimioconsultado);
                      
                    dominio=Grafica.domimioconsultado;
                    frame.flag=0;
                    System.out.println("CAMBIA DOMINIO A "+dominio);
                    System.out.println("se cumple0000000000 igual888888888888888888888888888888888");
                    }else{
                        
                    //dominio=x+500;
                    }
        
        
        
         System.out.println("terminafor--------------------------------------------------------------------");

    } 
               
               
           
           }else if(ecuacion==2){
               
               
               for(int i=0;i<=19;i++){
               
               if(frame.hilos[i][0]==null){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else if(frame.hilos[i][0].trim()==""){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else{
               
               }
           
           
           }
               
               
               
               Grafica.contadorh++;
           int aumento=1;
           double b= 2;
               //hay 120 diferencia pixeles
              for(double i=x;i<=dominio+10;i+=paso+5){
                  Grafica.domimioconsultado=i;
                  if(Grafica.detener==ID){
               try{
                   
                   for(int c=0;c<=19;c++){
               
               if(frame.hilos[c][0]==null){
               
               
               }else if(frame.hilos[c][0].trim().equals(Integer.toString(ID))){
               frame.hilos[c][0]=null;
               break;
               }else{
               
               }
           }
               stop();
               }catch(Exception xs){
                   System.out.println("error al detener");
               }
           
           
           }
                  
           
                  x=i;//tenia 620 tralacion x
                  double resultado=(i-250)/1.01;//se define ampitud 1.01
//                  System.out.println("valro de resultado"+resultado);
                  double valores= Math.pow((-Math.pow(resultado, b)+a*500), 0.5);
                  
                 // double valoress= -Math.pow((Math.pow(resultado, b)+40000), 0.5);
                  
                  //tenia 245
                  y=245-valores;
                  ya=500-y;
                  //System.out.println("valor de ya"+ya);
                  //centro = 300
                  //se define traslalcion Y
                  //tenia 300
                  //System.out.println("vaor deu"+y);
                  
                  
//        for(double j=x;j<=i;j+=paso){   
//        pinta.hace((int)j,(int)y+1);
//        pinta.hace((int)j,(int)ya+1);
//        }

        for(int v=0;v<=tamanomatriz-1;v+=paso+aumento){
                      //System.out.println("consulta matriz ingreso"+matrizx[v]);
                      if(matrizx[v]==999999999){
                        //  System.out.println("ejecuta for para ingresar");
                      matrizx[v]=i;
                      matrizy[v]=y;
                      frame.lista[sumatoria][0]=String.valueOf(sumatoria);
                      frame.lista[sumatoria][1]=String.valueOf(i-250);
                      frame.lista[sumatoria][2]=String.valueOf(y);
                      sumatoria++;
                      break;
                      }else{
                     // System.out.println("es nda");
                      }
                      
                  }
                  
        for(int j=0;j<=i-paso;j+=paso+aumento){   
            double temp = matrizy[j] ;
            double tempx = matrizx[j] ;
            try{
                Ellipse2D oval1= new Ellipse2D.Double((int) tempx+0,(int)temp+1,radio,radio);
                Ellipse2D oval2= new Ellipse2D.Double((int) tempx+0,(int)-temp+500,radio,radio);
                if(color==0){
                    Grafica.d.setColor(Color.black);
                
                }else if(color==1){
                Grafica.d.setColor(Color.blue);
                }else if(color==2){
                Grafica.d.setColor(Color.green);
                }else if(color==3){
                Grafica.d.setColor(Color.yellow);
                }else if(color==4){
                Grafica.d.setColor(Color.red);
                }else if(color==5){
                Grafica.d.setColor(Color.black);
                }else{
                }
                
            Grafica.d.fill(oval1);
            Grafica.d.fill(oval2);
            
            
            }catch(Exception es){
                System.out.println("error........................");
                gra.repaint();
            }
     
//            
//            
//        pinta.hace((int) j+120 ,(int)temp+1);
//        pinta.hace((int) j+120 ,(int)-temp+1);
           // System.out.println("ejecutasssssssssssssssssss  "+y);
        }
        
        
        
        
        
        
        
        try {
            System.out.println("ejecuta");
            Thread.sleep(velocidad,velocidad2);
        } catch (InterruptedException ex) {
            Logger.getLogger(IPlot9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i>=dominio){
            System.out.println("i mayor dominio "+i);
            System.out.println("dominio"+dominio);
        i=i-15;
            System.out.println("nevo valor de i"+i);
        }else{
            //System.out.println("no mayor dominio "+i);
            //System.out.println("dominio"+dominio);
            if(i>dominio-paso-5){
            i=i-20;
            }else{
            
            }
            
            System.out.println("paso por qui");
        }
                  System.out.println("valor de dominio antes de entrar"+dominio);
        if((ID==Grafica.contadorh-1)&&(frame.flag==1)){
//                      System.out.println("dominico consultado"+Grafica.domimioconsultado);
                      
                    dominio=Grafica.domimioconsultado+20;
                    frame.flag=0;
                    System.out.println("CAMBIA DOMINIO A "+dominio);
                    System.out.println("se cumple0000000000 igual888888888888888888888888888888888");
                    }else{
                        
                    //dominio=x+500;
                    }
        

    } 
               
               
           
           }else if(ecuacion==3){
               
               
               
           for(int i=0;i<=19;i++){
               
               if(frame.hilos[i][0]==null){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else if(frame.hilos[i][0].trim()==""){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else{
               
               }
           
           
           }
               
               Grafica.contadorh++;
           double b= 2;
               //hay 120 diferencia pixeles
              for(double i=x;i<=dominio+10;i+=paso){
                  
                   Grafica.domimioconsultado=i;
                  if(Grafica.detener==ID){
               try{
                   
                   
                   for(int c=0;c<=19;c++){
               
               if(frame.hilos[c][0]==null){
               
               
               }else if(frame.hilos[c][0].trim().equals(Integer.toString(ID))){
               frame.hilos[c][0]=null;
               break;
               }else{
               
               }
           }
               stop();
               }catch(Exception xs){
                   System.out.println("error al detener");
               }
           
           
           }
           
                  x=i;//tenia 620 tralacion x
                  double resultado=(i-250)/20;//se define ampitud
                  System.out.println("valro de resultado"+resultado);
                  double valores= (Math.pow(Math.E, resultado))+a;
                   
                  y=245-valores;
                  //centro = 300
                  //se define traslalcion Y
                  //tenia 300
                  System.out.println("vaor deu"+y);
//                  

                    for(int v=0;v<=tamanomatriz-1;v+=paso){
                      //System.out.println("consulta matriz ingreso"+matrizx[v]);
                      if(matrizx[v]==999999999){
                          //System.out.println("ejecuta for para ingresar");
                      matrizx[v]=i;
                      matrizy[v]=y;
                      frame.lista[sumatoria][0]=String.valueOf(sumatoria);
                      frame.lista[sumatoria][1]=String.valueOf(i-250);
                      frame.lista[sumatoria][2]=String.valueOf(y);
                      sumatoria++;
                      
                      break;
                      }else{
                      //System.out.println("es nda");
                      }
                      
                  }




        for(int j=0;j<=i-1;j+=paso){
         double temp = matrizy[j] ;
         double tempx = matrizx[j] ;   
         try{
             Ellipse2D oval= new Ellipse2D.Double((int) tempx+0,(int)temp+1,radio,radio);
             if(color==0){
                    Grafica.d.setColor(Color.black);
                
                }else if(color==1){
                Grafica.d.setColor(Color.blue);
                }else if(color==2){
                Grafica.d.setColor(Color.green);
                }else if(color==3){
                Grafica.d.setColor(Color.yellow);
                }else if(color==4){
                Grafica.d.setColor(Color.red);
                }else if(color==5){
                Grafica.d.setColor(Color.black);
                }else{
                }
        Grafica.d.fill(oval);
         
         }catch(Exception sx){
         
         
         }
         
        
        //pinta.hace((int)j,(int)y+1);
        }
        
        
        
        
        
        try {
            System.out.println("ejecuta");
            Thread.sleep(velocidad,velocidad2);
        } catch (InterruptedException ex) {
            
        }
        
        if(i>=dominio){
        i=i-paso;
        }else{
            if(i>dominio-paso-5){
            i=i-20;
            }else{
            
            }
            
        
        }
        
        
        if((ID==Grafica.contadorh-1)&&(frame.flag==1)){
//                      System.out.println("dominico consultado"+Grafica.domimioconsultado);
                      
                    dominio=Grafica.domimioconsultado+10;
                    frame.flag=0;
                    System.out.println("CAMBIA DOMINIO A "+dominio);
                    System.out.println("se cumple0000000000 igual888888888888888888888888888888888");
                    }else{
                        
                    //dominio=x+500;
                    }
        

    } 
               
               
           
           }else if(ecuacion==4){
           
               
               
               for(int i=0;i<=19;i++){
               
               if(frame.hilos[i][0]==null){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else if(frame.hilos[i][0].trim()==""){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else{
               
               }
           
           
           }
               Grafica.contadorh++;
           double b= 2;
               //hay 120 diferencia pixeles
              for(double i=x;i<=dominio+10;i+=paso){
                   Grafica.domimioconsultado=i;
                  
                  if(Grafica.detener==ID){
               try{
                   for(int c=0;c<=19;c++){
               
               if(frame.hilos[c][0]==null){
               
               
               }else if(frame.hilos[c][0].trim().equals(Integer.toString(ID))){
               frame.hilos[c][0]=null;
               break;
               }else{
               
               }
           }
                   
                   
               stop();
               }catch(Exception xs){
                   System.out.println("error al detener");
               }
           
           
           }
                  
           
                  x=i;//tenia 620 tralacion x
                  double resultado=(i-250);//se define 
                  System.out.println("valro de resultado"+resultado);
                  double valores= Math.pow(Math.log(resultado), 2.5)+a;
                   
                  y=245-valores;
                  //centro = 300
                  //se define traslalcion Y
                  //tenia 300
                  System.out.println("vaor deu "+y);
//        for(double j=x;j<=i;j+=paso){   
//        pinta.hace((int)j,(int)y+1);
//        }
        
        
                    for(int v=0;v<=tamanomatriz-1;v++){
                      //System.out.println("consulta matriz ingreso"+matrizx[v]);
                      if(matrizx[v]==999999999){
                          //System.out.println("ejecuta for para ingresar");
                      matrizx[v]=i;
                      matrizy[v]=y;
                      frame.lista[sumatoria][0]=String.valueOf(sumatoria);
                      frame.lista[sumatoria][1]=String.valueOf(i-250);
                      frame.lista[sumatoria][2]=String.valueOf(y);
                      sumatoria++;
                      
                      break;
                      }else{
                      //System.out.println("es nda");
                      }
                      
                  }




        for(int j=0;j<=i-1;j+=paso){
         double temp = matrizy[j] ;
         double tempx = matrizx[j] ;   
         try{
             Ellipse2D oval= new Ellipse2D.Double((int) tempx+0,(int)temp+1,radio,radio);
             if(color==0){
                    Grafica.d.setColor(Color.black);
                
                }else if(color==1){
                Grafica.d.setColor(Color.blue);
                }else if(color==2){
                Grafica.d.setColor(Color.green);
                }else if(color==3){
                Grafica.d.setColor(Color.yellow);
                }else if(color==4){
                Grafica.d.setColor(Color.red);
                }else if(color==5){
                Grafica.d.setColor(Color.black);
                }else{
                }
        Grafica.d.fill(oval);
         
         }catch(Exception sx){
         
         
         }
         
        
        //pinta.hace((int)j,(int)y+1);
        }
//        
        try {
            System.out.println("ejecuta");
            Thread.sleep(velocidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(IPlot9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i>=dominio){
        i=i-paso;
        }else{
            if(i>dominio-paso-5){
            i=i-20;
            }else{
            
            }
        
        }

        
        if((ID==Grafica.contadorh-1)&&(frame.flag==1)){
//                      System.out.println("dominico consultado"+Grafica.domimioconsultado);
                      
                    dominio=Grafica.domimioconsultado;
                    frame.flag=0;
                    System.out.println("CAMBIA DOMINIO A "+dominio);
                    System.out.println("se cumple0000000000 igual888888888888888888888888888888888");
                    }else{
                        
                    //dominio=x+500;
                    }
        
    } 
               
               
           
           }else if(ecuacion==5){
               
               
               
               
               
               for(int i=0;i<=19;i++){
               
               if(frame.hilos[i][0]==null){
                   
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else if(frame.hilos[i][0].trim()==""){
               frame.hilos[i][0]=Integer.toString( Grafica.contadorh );
               break;
               }else{
               
               }
           
           
           }
               
           Grafica.contadorh++;
           //double b= 2;
               //hay 120 diferencia pixeles
               
               
               
              for(double i=x;i<=dominio+10;i+=paso){
                   Grafica.domimioconsultado=i;
                  
                  System.out.println("valor de detener"+Grafica.detener);
                  System.out.println("id"+ID);
           if(Grafica.detener==ID){
               try{
                   
                   for(int c=0;c<=19;c++){
               
               if(frame.hilos[c][0]==null){
               
               
               }else if(frame.hilos[c][0].trim().equals(Integer.toString(ID))){
               frame.hilos[c][0]=null;
               break;
               }else{
               
               }
           }
               stop();
               
               
               }catch(Exception xs){
                   System.out.println("error al detener");
               }
           
           
           }
           
                  x=i;//tenia 625 tralacion x
                  
                  
                  double resultado=(i-250)/10;//se define ampitud
                  
                  //System.out.println("valro de resultado"+resultado);
                  
                  double valores= (10*a*Math.pow(resultado,1/ b))+c;
                  y=245-valores;
                  //centro = 300
                  //se define traslalcion Y
                  //tenia 300
                  //System.out.println("vaor deu"+y);
                  
                  for(int v=0;v<=tamanomatriz-1;v++){
                      //System.out.println("consulta matriz ingreso"+matrizx[v]);
                      if(matrizx[v]==999999999){
                          //System.out.println("ejecuta for para ingresar");
                      matrizx[v]=i;
                      matrizy[v]=y;
                      
                      frame.lista[sumatoria][0]=String.valueOf(sumatoria);
                      frame.lista[sumatoria][1]=String.valueOf(i-250);
                      frame.lista[sumatoria][2]=String.valueOf(y);
                      sumatoria++;
                      
                      break;
                      }else{
                      //System.out.println("es nda");
                      }
                      
                  }
                  
        for(int j=0;j<=i-1;j+=paso){   
            double temp = matrizy[j] ;
            double tempx = matrizx[j] ;
            try{
                Ellipse2D oval= new Ellipse2D.Double((int) tempx+0,(int)temp+1,radio,radio);
                if(color==0){
                    Grafica.d.setColor(Color.black);
                
                }else if(color==1){
                Grafica.d.setColor(Color.blue);
                }else if(color==2){
                Grafica.d.setColor(Color.green);
                }else if(color==3){
                Grafica.d.setColor(Color.yellow);
                }else if(color==4){
                Grafica.d.setColor(Color.red);
                }else if(color==5){
                Grafica.d.setColor(Color.black);
                }else{
                }
            
            
            Grafica.d.fill(oval);
            
            
            }catch(Exception es){
                System.out.println("error........................");
            }
        //pinta.hace((int) j+120 ,(int)temp+1);
            //System.out.println("ejecutasssssssssssssssssss  "+y);
        }
        
        
        try {
            //System.out.println("ejecuta");
            Thread.sleep(velocidad,velocidad2);
        } catch (InterruptedException ex) {
            Logger.getLogger(IPlot9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i>=dominio){
            
        i=i-paso;
        }else{
        
            if(i>=dominio-paso-4){
            
        i=i-paso;
        }
            
        }

        
        if((ID==Grafica.contadorh-1)&&(frame.flag==1)){
//                      System.out.println("dominico consultado"+Grafica.domimioconsultado);
                      
                    dominio=Grafica.domimioconsultado;
                    frame.flag=0;
                    System.out.println("CAMBIA DOMINIO A "+dominio);
                    System.out.println("se cumple0000000000 igual888888888888888888888888888888888");
                    }else{
                        
                    //dominio=x+500;
                    }
        
    } 
               
               
           
           }else{
           
               System.out.println("fuea de rango");
           }/////
           
       
       
       
       
       
       
       
       
       
       
        
       }
       
       private void inicia(){
        for(int i=0;i<=tamanomatriz-1;i+=1){   
       matrizx[i]= 999999999;
        matrizy[i]= 999999999;
        }
       }
  
  
   }




