/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import com.sun.javafx.font.FontFactory;
import java.awt.Color;
import java.awt.Image;
import java.time.LocalTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celes
 */
public class Simulacion extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();

   
    public Simulacion() {
          initComponents();
          
        Interfaz u = new Interfaz();
      
        for (int i = 0; i < u.primerConjunto.length; i++) {
            System.out.println(u.primerConjunto[i]);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < u.segundoConjunto.length; i++) {
            System.out.println(u.segundoConjunto[i]);
        }
   
        
        setSize(1774, 800);
        setLocationRelativeTo(null);
        
        model.addColumn("No. aleatorio");
        model.addColumn("Tiempo llegada");
        model.addColumn("Hora llegada");
        model.addColumn("No.Aleatorio");
        model.addColumn("Tiempo Servicio");
        model.addColumn("Inicio servicio");
        model.addColumn("Fin servicio");
        model.addColumn("Tiempo Espera");
        model.addColumn("Tiempo Ocio");
        
        tablaSimulacion = new JTable(model);
        jScrollPane1.setViewportView(tablaSimulacion);
        tablaSimulacion.setFont(new java.awt.Font("Arial", 0, 15));
        
        realizarSimulacion();
        
        ImageIcon imagen = new ImageIcon("src\\main\\java\\imagenes\\imagenInversa.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenTransformadas.getWidth(), imagenTransformadas.getHeight(), Image.SCALE_DEFAULT));
        imagenTransformadas.setIcon(icono);
        this.repaint();
         imagenTransformadas.setVisible(true);
         panel.setBackground(new Color(195,182,159));
     
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSimulacion = new javax.swing.JTable();
        imagenTransformadas = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Simulacion");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 0, 180, 40);

        tablaSimulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaSimulacion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 100, 1020, 630);

        imagenTransformadas.setText("jLabel2");
        getContentPane().add(imagenTransformadas);
        imagenTransformadas.setBounds(1160, 20, 630, 710);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Tomando en cuenta el inicio de operaciones a las 11:00 am");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addContainerGap(1202, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(674, Short.MAX_VALUE))
        );

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1820, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public void realizarSimulacion(){
        Interfaz u = new Interfaz();
        
       // double aleatorios [] = {0.5350, 0.664,0.923,0.826,0.535,0.282,0.217,0.314,0.98,0.839,0.003,0.188};
       // double segundo[] = {0.283,0.137,0.333,0.524,0.824,0.052,0.227,0.904,0.915,0.869,0.729,0.326};
         Object fila[] = new Object[9];
        
          String time = "11:00";
          String finServicio = "11:00";
          String tiempoEspera = "";
          String tiempoOcio = "0";
          String inicioServicio = "";
          int tiempoLlegada = 0;
          int tiempoServicio=0;
          
        for (int i = 0; i < u.primerConjunto.length; i++) {
            if(u.primerConjunto[i]<0.02439){
                    tiempoLlegada = 0;
            
                }else if(u.primerConjunto[i]>=0.02439 && u.primerConjunto[i]<0.14634){
                    tiempoLlegada =1;
                
                }else if(u.primerConjunto[i]>=0.14634 && u.primerConjunto[i] <0.29268){
                    tiempoLlegada =2;
                
                }else if(u.primerConjunto[i]>=0.29268 && u.primerConjunto[i]<0.39024){
                    tiempoLlegada = 3;
                }else if(u.primerConjunto[i]>=0.39024 && u.primerConjunto[i]<0.51219){
                    tiempoLlegada = 4;
                
                }else if(u.primerConjunto[i]>=0.51219 && u.primerConjunto[i]<0.63454){
                    tiempoLlegada = 5;
                }else if(u.primerConjunto[i]>=0.63415 && u.primerConjunto[i]<0.65824){
                    tiempoLlegada =6;
                
                }else if(u.primerConjunto[i]>= 0.65824 && u.primerConjunto[i]< 0.70732){
                    tiempoLlegada = 7;
                }else if(u.primerConjunto[i]>=0.70732 && u.primerConjunto[i]<0.75610){
                    tiempoLlegada=8;
                
                }else if(u.primerConjunto[i]>=0.75610 && u.primerConjunto[i]<0.82927){
                    tiempoLlegada=9;
                
                }else if(u.primerConjunto[i]>=0.82927 && u.primerConjunto[i]<0.87805){
                    tiempoLlegada=10;
                
                }else if(u.primerConjunto[i]>=0.87805 && u.primerConjunto[i]<0.90244){
                    tiempoLlegada=11;
                
                }else if(u.primerConjunto[i]>=0.90244 && u.primerConjunto[i]<0.92683){
                    tiempoLlegada=12;
                
                }else if(u.primerConjunto[i]>=0.92683 && u.primerConjunto[i]<0.95122){
                    tiempoLlegada=17;
                
                }else if(u.primerConjunto[i]>=0.95122 && u.primerConjunto[i]<0.100){
                    tiempoLlegada=18;
                
                }
            
            
            
            
            
           if(u.segundoConjunto[i] <0.09524){
                 tiempoServicio = 1;
            
            }else if(u.segundoConjunto[i]>=0.09524 && u.segundoConjunto[i]<0.45238){
                  tiempoServicio = 2;
        
            }else if(u.segundoConjunto[i]>=0.45238 && u.segundoConjunto[i]<0.69048){
                  tiempoServicio = 3;
        
            }else if(u.segundoConjunto[i]>=0.69048 && u.segundoConjunto[i]<0.83334){
                  tiempoServicio = 4;
        
            }else if(u.segundoConjunto[i]>=0.83334 && u.segundoConjunto[i]<0.85714){
                  tiempoServicio = 5;
        
            }else if(u.segundoConjunto[i]>=0.85714 && u.segundoConjunto[i]<0.90476){
                  tiempoServicio = 7;
        
            }else if(u.segundoConjunto[i]>=0.90476 && u.segundoConjunto[i]<0.92857){
                  tiempoServicio = 8;
        
            }else if(u.segundoConjunto[i]>=0.92857 && u.segundoConjunto[i]<0.95238){
                  tiempoServicio = 10;
        
            }else if(u.segundoConjunto[i]>=0.95238 && u.segundoConjunto[i]<1){
                  tiempoServicio = 11;
        
            }
            
            
            
            String horaString = String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1));
            String minutosString = String.valueOf(time.charAt(3)) + String.valueOf(time.charAt(4));
            
            
            
              int hora = Integer.parseInt(horaString);
              int minutos = Integer.parseInt(minutosString);
              LocalTime llegada = LocalTime.of(hora,minutos).plusMinutes(tiempoLlegada);
              
              
              String finHoraString  = String.valueOf(finServicio.charAt(0) + String.valueOf(finServicio.charAt(1)));
              String finMinutosString = String.valueOf(finServicio.charAt(3) + String.valueOf(finServicio.charAt(4)));
              
              int finHora = Integer.parseInt(finHoraString);
              int finMinutos = Integer.parseInt(finMinutosString);
              
              
              LocalTime servicioFin = LocalTime.of(finHora,finMinutos);
           
              if(servicioFin.isBefore(llegada)){
                   inicioServicio = String.valueOf(llegada);
                  LocalTime servicioIncio = llegada.plusMinutes(tiempoServicio);
                  finServicio = String.valueOf(servicioIncio);
                 
                    LocalTime ocio = llegada.minusHours(servicioFin.getHour()).minusMinutes(servicioFin.getMinute());
                    tiempoOcio= String.valueOf(ocio);
                  
              }else{
                  inicioServicio = String.valueOf(servicioFin);
                  LocalTime servicioInicio = servicioFin.plusMinutes(tiempoServicio);
                  finServicio = String.valueOf(servicioInicio);
                  LocalTime espera = servicioFin.minusHours(llegada.getHour()).minusMinutes(llegada.getMinute());
                  tiempoEspera = String.valueOf(espera);
              }
              
              
              time = String.valueOf(llegada);
             fila[0] = u.primerConjunto[i];
             fila[1] = tiempoLlegada;
             fila[2] = time;
             fila[3] = u.segundoConjunto[i];
             fila[4] = tiempoServicio;
             fila[5] = inicioServicio;
             fila[6] = finServicio;
             fila[7] = tiempoEspera;
             fila[8] = tiempoOcio;
             
             model.addRow(fila);
              
              
              System.out.println(u.primerConjunto[i] + " " + tiempoLlegada + " "+ time + " " + u.segundoConjunto[i] + " " + tiempoServicio + " " + finServicio + " " + tiempoEspera +" ");
              tiempoEspera ="0";
                tiempoOcio = "0";
            
            }
      
        
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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenTransformadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaSimulacion;
    // End of variables declaration//GEN-END:variables
}
