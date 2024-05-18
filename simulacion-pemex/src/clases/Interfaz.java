/*
Instituto Tecnológico Superior de Tacámbaro
Ingeniería en Sistemas Computacionales 
5º Semestre
Docente: MC Oscar Alvarez Arriaga   
Almunos: Celestino Moreno Rodrigez N.Control: 20940087
          Luis Alberto Zavala cruz N.Control: 
          Jair Ziranda Villalon N.Control:

Este es un programa el cual genera numeros pseudoaleatorios a partir del método congruencial mixto
y que estos posteriormente son validos las pruebas estadicas de medias, varianza y forma.
*/



package Clases;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Celes
 */
public class Interfaz extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
   
    
   
    public static double arrayAleatorios [];
    public static double contadorConjunto = 1;
    public static double primerConjunto[];
    public static double segundoConjunto[];
    Object [] fila;
    
    
    /**
     * Creates new form Interfaz
     */
    
    //Este es el constructor donde se definen algunas propiedades de la ventana y de la tabla 
    public Interfaz() {
        initComponents();
        model.addColumn("No.");
        model.addColumn("#Pseudo");
        tabla = new JTable(model);
        jScrollPane2.setViewportView(tabla);
        btnRealizarPruebas.setVisible(false);
       
        
        this.setResizable(false);
        setSize(776, 689);
        btnGenerarNumeros.setBackground(new Color(98,17,50));
        btnGenerarNumeros.setForeground(Color.WHITE);
        btnRealizarPruebas.setBackground(new Color(98,17,50));
        btnRealizarPruebas.setForeground(Color.WHITE);
        panel.setBackground(new Color(195,182,159));
        
        //tabla.setBackground(Color.green);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadNumeros = new javax.swing.JTextField();
        txtSemilla = new javax.swing.JTextField();
        txtAlpha = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtModulo = new javax.swing.JTextField();
        btnGenerarNumeros = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRealizarPruebas = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("n");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(72, 130, 9, 19);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Semilla");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 193, 50, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("alpha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 260, 38, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("c");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(72, 336, 8, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Generador de numeros Pseudoaleatorios");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(146, 30, 471, 32);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("modulo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(37, 409, 52, 19);

        txtCantidadNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadNumerosActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidadNumeros);
        txtCantidadNumeros.setBounds(91, 126, 129, 24);

        txtSemilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemillaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSemilla);
        txtSemilla.setBounds(91, 189, 129, 24);
        getContentPane().add(txtAlpha);
        txtAlpha.setBounds(91, 256, 129, 24);
        getContentPane().add(txtC);
        txtC.setBounds(91, 332, 129, 24);
        getContentPane().add(txtModulo);
        txtModulo.setBounds(91, 405, 129, 24);

        btnGenerarNumeros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerarNumeros.setText("generar numeros");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarNumeros);
        btnGenerarNumeros.setBounds(73, 475, 152, 35);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(249, 142, 453, 403);

        btnRealizarPruebas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRealizarPruebas.setText("Realizar pruebas");
        btnRealizarPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPruebasActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarPruebas);
        btnRealizarPruebas.setBounds(70, 519, 150, 35);
        getContentPane().add(panel);
        panel.setBounds(0, 0, 1140, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSemillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemillaActionPerformed

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed
        model.setRowCount(0);


        
        int auxiliar = 0;
        int auxiliarN =0;
        if(txtAlpha.getText().trim().equals("")){
            txtAlpha.setBackground(Color.red);
        }else{
             auxiliar++;
             txtAlpha.setBackground(Color.green);
            } 
        if(txtC.getText().trim().equals("")){
            txtC.setBackground(Color.red);
        }else{
            auxiliar++;
            txtC.setBackground(Color.green);
            } 
        if(txtCantidadNumeros.getText().trim().equals("")){
            txtCantidadNumeros.setBackground(Color.red);
        }else{
            auxiliar++;
            txtCantidadNumeros.setBackground(Color.GREEN);
            } 
         if(txtModulo.getText().trim().equals("")){
            txtModulo.setBackground(Color.red);
            
        }else{
             auxiliar++;
             txtModulo.setBackground(Color.green);
         }
         if(txtSemilla.getText().trim().equals("")){
            txtSemilla.setBackground(Color.red);
        }else{
             auxiliar++;
             txtSemilla.setBackground(Color.green);
         }
        
         try{
         if(auxiliar==5){
             auxiliarN = Integer.parseInt(txtCantidadNumeros.getText().trim());
             if(auxiliarN<=599){
         
        arrayAleatorios = new double[Integer.parseInt(txtCantidadNumeros.getText().trim())];
        numerosAletorios();
        btnRealizarPruebas.setVisible(true);
      
      
             }else{
                 JOptionPane.showMessageDialog(null,"Solo se aceptan menos de 200 numeros");
                         
             }
        
        
         }else{
             JOptionPane.showMessageDialog(null, "Llene todos los campos");
             btnRealizarPruebas.setVisible(false);
         }
        
 
        
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ingrese solo datos numericos a los campos");
             btnRealizarPruebas.setVisible(false);
         }
        
    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    //este es para abrir la ventana de las pruebas al momento que presionamos el boton de realizar pruebas
    private void btnRealizarPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPruebasActionPerformed
          Pruebas u = new Pruebas();
        u.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btnRealizarPruebasActionPerformed

    private void txtCantidadNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadNumerosActionPerformed

    /**
     * 
     * 
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnRealizarPruebas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAlpha;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCantidadNumeros;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtSemilla;
    // End of variables declaration//GEN-END:variables

public void numerosAletorios() {
        System.out.println("Funcionando");

        int n = Integer.parseInt(txtCantidadNumeros.getText());
        int semilla = Integer.parseInt(txtSemilla.getText());
        int alpha = Integer.parseInt(txtAlpha.getText());
        int modulo = Integer.parseInt(txtModulo.getText());
        int c = Integer.parseInt(txtC.getText());
        
        
        

         for(int i = 0; i<n; i++){
            fila = new Object[2];
             
            
             double auxliar = 0;
            int enteros = 0;
            double resta = 0;
            double numero = 0;
            auxliar = (alpha * semilla) + c;
            enteros = (int) (auxliar / modulo);
            resta = auxliar - (enteros * modulo);
            semilla = (int) resta;
            numero = resta / (modulo - 1);
            numero = Math.round(numero*100000)/ 100000d;
            
            fila[0] =i+1;
            fila [1] = numero;
            model.addRow(fila);

           
            arrayAleatorios[i] = numero;
               
         }
    }
}
