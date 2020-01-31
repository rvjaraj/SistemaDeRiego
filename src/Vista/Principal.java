/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorArduino;
import java.awt.Desktop;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VINICIO
 */
public class Principal extends javax.swing.JFrame {

    private Usuarios ventanaUsuarios;
    private boolean bandera = true;
    private ControladorArduino arduino;
    private Programar ventanaProgramar;

    //private coneccion coneccion;
    public Principal() {
        int n;
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ventanaUsuarios = new Usuarios(btnClientes);
        ventanaProgramar = new Programar(btnProgramar);
        escritorio.setFocusable(false);
       // arduino = new ControladorArduino();
      //  arduino.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        btnClientes = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        btnRiego = new javax.swing.JToggleButton();
        btnProgramar = new javax.swing.JButton();
        btnProgramar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        btnClientes.setText("PERSONAS");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        salir.setText("LOGIN");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        btnRiego.setText("RIEGO");
        btnRiego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiegoActionPerformed(evt);
            }
        });

        btnProgramar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kardex.png"))); // NOI18N
        btnProgramar.setText("PROGRAMAR");
        btnProgramar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramarActionPerformed(evt);
            }
        });

        btnProgramar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kardex.png"))); // NOI18N
        btnProgramar1.setText("DATOS RIEGO");
        btnProgramar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(1070, 1070, 1070)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClientes)
                    .addComponent(btnProgramar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(btnProgramar)
                .addGap(166, 166, 166))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProgramar)
                    .addComponent(btnRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes))
                .addGap(94, 94, 94)
                .addComponent(btnProgramar1)
                .addGap(45, 45, 45)
                .addComponent(salir))
        );
        escritorio.setLayer(btnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnRiego, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnProgramar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnProgramar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiegoActionPerformed
        if (btnRiego.isSelected()) {
            btnRiego.setText("OFF");
            arduino.enviarDatos("1");
        } else {
            arduino.enviarDatos("2");
            btnRiego.setText("ON");
        }
    }//GEN-LAST:event_btnRiegoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Login vu = new Login();
        String[] args = null;
        vu.main(args);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        if (ventanaUsuarios.isShowing() != true) {
            ventanaUsuarios = new Usuarios(btnClientes);
            btnClientes.setEnabled(false);
            escritorio.add(ventanaUsuarios);
            ventanaUsuarios.setVisible(true);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProgramarActionPerformed

    private void btnProgramar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProgramar1ActionPerformed

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalzado");
    }

    /**
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProgramar;
    private javax.swing.JButton btnProgramar1;
    private javax.swing.JToggleButton btnRiego;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}
