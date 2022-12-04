/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.ControladorDiagnostico;
import Controladores.ControladorModulos;
import Dao.DaoPuntuacion;
import Dao.DaoUser;
import Dao.IDaoPuntuacion;
import Dao.IDaoUser;
import Modelos.ModeloUsuario;
import Modelos.Puntuacion;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VistaDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form VistaDiagnostico
     */
    public VistaDiagnostico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtP2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BarraProgreso = new javax.swing.JProgressBar();
        btnVolver = new javax.swing.JButton();
        txtBarra = new javax.swing.JLabel();
        o4p1 = new javax.swing.JCheckBox();
        op1P1 = new javax.swing.JCheckBox();
        o2p1 = new javax.swing.JCheckBox();
        o3p1 = new javax.swing.JCheckBox();
        txtP4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        o1p3 = new javax.swing.JCheckBox();
        o2p3 = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        o4p4 = new javax.swing.JCheckBox();
        o1p4 = new javax.swing.JCheckBox();
        txtP3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        o1p2 = new javax.swing.JCheckBox();
        o2p2 = new javax.swing.JCheckBox();
        o3p4 = new javax.swing.JCheckBox();
        o2p4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtP2.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        txtP2.setText("Pregunta 2");
        jPanel1.add(txtP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombre.setText("jLabel1");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 280, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("La definición de una variable se realiza de la sieguiente manera");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, 30));
        jPanel1.add(BarraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 960, -1));

        btnVolver.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver.setText("volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        txtBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBarra.setText("jLabel12");
        jPanel1.add(txtBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 960, -1));

        o4p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o4p1.setText("cout << \"biblioteca\";");
        o4p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4p1ActionPerformed(evt);
            }
        });
        jPanel1.add(o4p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        op1P1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        op1P1.setText("#include (stdlib)");
        op1P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1P1ActionPerformed(evt);
            }
        });
        jPanel1.add(op1P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        o2p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o2p1.setText("#include<stdlib>");
        o2p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2p1ActionPerformed(evt);
            }
        });
        jPanel1.add(o2p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        o3p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o3p1.setText("cin >> Variable 1;");
        o3p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3p1ActionPerformed(evt);
            }
        });
        jPanel1.add(o3p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        txtP4.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        txtP4.setText("Pregunta 4");
        jPanel1.add(txtP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("¿La sentencia Escribir en Pseudocódigo equivale a");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, 30));

        o1p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o1p3.setText("Verdadero");
        o1p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1p3ActionPerformed(evt);
            }
        });
        jPanel1.add(o1p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        o2p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o2p3.setText("Falso");
        o2p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2p3ActionPerformed(evt);
            }
        });
        jPanel1.add(o2p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(153, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 160, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("en C++ ?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, 30));

        txtP1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        txtP1.setText("Pregunta 1");
        jPanel1.add(txtP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Para incluir una biblioteca en C++ se utliza la siguente sentencia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("\" cout << \"");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 452, -1, 30));

        o4p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o4p4.setText("int variable1=25;");
        o4p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4p4ActionPerformed(evt);
            }
        });
        jPanel1.add(o4p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        o1p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o1p4.setText("include variable1;");
        o1p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1p4ActionPerformed(evt);
            }
        });
        jPanel1.add(o1p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, -1));

        txtP3.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        txtP3.setText("Pregunta 3");
        jPanel1.add(txtP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("La sentencia cin >> var 1, se utiliza para ingresar un valor a una variable desde teclado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 30));

        o1p2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o1p2.setText("Verdadero");
        o1p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1p2ActionPerformed(evt);
            }
        });
        jPanel1.add(o1p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        o2p2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o2p2.setText("Falso");
        o2p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2p2ActionPerformed(evt);
            }
        });
        jPanel1.add(o2p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        o3p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o3p4.setText("const int variable1=25;");
        o3p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3p4ActionPerformed(evt);
            }
        });
        jPanel1.add(o3p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        o2p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o2p4.setText("int variable1,");
        o2p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2p4ActionPerformed(evt);
            }
        });
        jPanel1.add(o2p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Diagnosticoinicio.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int opcionP1 = 0, opcionP2 = 0, opcionP3 = 0, opcionP4 = 0;
            
    private void o4p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4p1ActionPerformed
        // TODO add your handling code here:
        op1P1.setSelected(false);
        o2p1.setSelected(false);
        o3p1.setSelected(false);
        o4p1.setSelected(true);
        opcionP1 = 4;
    }//GEN-LAST:event_o4p1ActionPerformed

    private void op1P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1P1ActionPerformed
        // TODO add your handling code here:
        
        op1P1.setSelected(true);
        o2p1.setSelected(false);
        o3p1.setSelected(false);
        o4p1.setSelected(false);
        opcionP1 = 1;
    }//GEN-LAST:event_op1P1ActionPerformed

    private void o2p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2p1ActionPerformed
        // TODO add your handling code here:
        op1P1.setSelected(false);
        o2p1.setSelected(true);
        o3p1.setSelected(false);
        o4p1.setSelected(false);
        opcionP1 = 2;
    }//GEN-LAST:event_o2p1ActionPerformed

    private void o3p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3p1ActionPerformed
        // TODO add your handling code here:
        op1P1.setSelected(false);
        o2p1.setSelected(false);
        o3p1.setSelected(true);
        o4p1.setSelected(false);
        opcionP1 = 3;
    }//GEN-LAST:event_o3p1ActionPerformed

    private void o1p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1p3ActionPerformed
        // TODO add your handling code here:
        o1p3.setSelected(true);
        o2p3.setSelected(false);
        opcionP3 = 1;
        
    }//GEN-LAST:event_o1p3ActionPerformed

    private void o2p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2p3ActionPerformed
        // TODO add your handling code here:
        o1p3.setSelected(false);
        o2p3.setSelected(true);
        opcionP3 = 2;
    }//GEN-LAST:event_o2p3ActionPerformed

    private void o4p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4p4ActionPerformed
        // TODO add your handling code here:
        o1p4.setSelected(false);
        o2p4.setSelected(false);
        o3p4.setSelected(false);
        o4p4.setSelected(true);
        
        opcionP4 = 4;
    }//GEN-LAST:event_o4p4ActionPerformed

    private void o1p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1p4ActionPerformed
        // TODO add your handling code here:
        o1p4.setSelected(true);
        o2p4.setSelected(false);
        o3p4.setSelected(false);
        o4p4.setSelected(false);
        
        opcionP4 = 1;
    }//GEN-LAST:event_o1p4ActionPerformed

    private void o1p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1p2ActionPerformed
        // TODO add your handling code here:
        o1p2.setSelected(true);
        o2p2.setSelected(false);
        
        opcionP2 = 1;
    }//GEN-LAST:event_o1p2ActionPerformed

    private void o2p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2p2ActionPerformed
        // TODO add your handling code here:
        o1p2.setSelected(false);
        o2p2.setSelected(true);
        
        opcionP2 = 2;
    }//GEN-LAST:event_o2p2ActionPerformed

    private void o3p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3p4ActionPerformed
        // TODO add your handling code here:
        o1p4.setSelected(false);
        o2p4.setSelected(false);
        o3p4.setSelected(true);
        o4p4.setSelected(false);
        opcionP4 = 3;
    }//GEN-LAST:event_o3p4ActionPerformed

    private void o2p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2p4ActionPerformed
        // TODO add your handling code here:
        o1p4.setSelected(false);
        o2p4.setSelected(true);
        o3p4.setSelected(false);
        o4p4.setSelected(false);
        
        opcionP4 = 2;
    }//GEN-LAST:event_o2p4ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int porcentaje = 0, cant = 0;
        if(opcionP1 == 2){
            porcentaje += 25;
            cant += 1;
            txtP1.setForeground(Color.green);
        }
        else{
            txtP1.setForeground(Color.red);
            op1P1.setForeground(Color.GREEN);
        }
        if(opcionP2 == 1){
            porcentaje += 25;
            cant += 1;
            txtP2.setForeground(Color.green);
        }
        else{
            txtP2.setForeground(Color.red);
            o1p2.setForeground(Color.GREEN);
        }
        if(opcionP3 == 1){
            porcentaje += 25;
            cant += 1;
            txtP3.setForeground(Color.green);
        }
        else{
            txtP3.setForeground(Color.red);
            o1p3.setForeground(Color.GREEN);
        }
        if(opcionP4 == 4){
            porcentaje += 25;
            cant += 1;
            txtP4.setForeground(Color.green);
        }
        else{
            txtP4.setForeground(Color.red);
            o4p4.setForeground(Color.GREEN);
        }
        
        btnGuardar.setVisible(false);
        BarraProgreso.setValue(porcentaje);
        txtBarra.setText("Usted tuvo " + cant + " respuestas acertadas");
        
        BarraProgreso.setVisible(true);
        txtBarra.setVisible(true);
        btnVolver.setVisible(true);
        
        Puntuacion puntuacion = new Puntuacion();
        
        puntuacion.setIdEjercicio(1);
        puntuacion.setPuntuacion("" + cant);
        
        IDaoUser iDaoUser = new DaoUser();
        
        String nomUser = "";
        
        for(ModeloUsuario usuario : iDaoUser.verUsuarios()){
            nomUser = usuario.getNombre_usuario() + " " + usuario.getApellido_usuario();
            if(nomUser.equals(txtNombre.getText())){
                puntuacion.setIdEstudiante(usuario.getId_estudiante());
            }
        }
        
        IDaoPuntuacion iDaoPuntuacion = new DaoPuntuacion();
        
        if(iDaoPuntuacion.addPuntuacion(puntuacion)){
            JOptionPane.showMessageDialog(null, "Se ha registrado su puntuación");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar BarraProgreso;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox o1p2;
    private javax.swing.JCheckBox o1p3;
    private javax.swing.JCheckBox o1p4;
    private javax.swing.JCheckBox o2p1;
    private javax.swing.JCheckBox o2p2;
    private javax.swing.JCheckBox o2p3;
    private javax.swing.JCheckBox o2p4;
    private javax.swing.JCheckBox o3p1;
    private javax.swing.JCheckBox o3p4;
    private javax.swing.JCheckBox o4p1;
    private javax.swing.JCheckBox o4p4;
    private javax.swing.JCheckBox op1P1;
    public javax.swing.JLabel txtBarra;
    public javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtP1;
    private javax.swing.JLabel txtP2;
    private javax.swing.JLabel txtP3;
    private javax.swing.JLabel txtP4;
    // End of variables declaration//GEN-END:variables
}