package Util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public final class VentanaSesion extends javax.swing.JFrame {

    BaseDatos bs;

    public VentanaSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Iniciar Sesion");
        this.setIconImage(getIconImage());
        CargarBaseDatos cagar = new CargarBaseDatos(bs = new BaseDatos());
        cagar.start();
        bs = cagar.getBs();
    }

    @Override
    public Image getIconImage() {
        Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\imgenes\\logoUce.png");
        return nuevoIcono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registro = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Contraseña:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Iniciar Sesion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        registro.setBackground(new java.awt.Color(0, 51, 51));
        registro.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText(" Registrarse");
        registro.setOpaque(true);
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 130, 40));

        nombreUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        nombreUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 40));

        contrasena.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        contrasena.setText("jPasswordField1");
        contrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 330, 40));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Correo Electronico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        iniciarSesion.setBackground(new java.awt.Color(0, 51, 51));
        iniciarSesion.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.setText("   Entrar");
        iniciarSesion.setOpaque(true);
        iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        VentanaRegistro venR = new VentanaRegistro(bs);
        this.dispose();
        venR.setVisible(true);

    }//GEN-LAST:event_registroMouseClicked

    private void iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseClicked
        System.out.println(nombreUsuario.getText().equals("") + " " + nombreUsuario.getText().equals(" "));
        if (!nombreUsuario.getText().equals("") & !nombreUsuario.getText().equals(" ")) {
            int val = bs.buscarUsuarios(nombreUsuario.getText(), contrasena.getText());
            if (-1 != val) {
                VentanaPerfil venP = new VentanaPerfil(bs, val);
                venP.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido xd :3 ");
                System.out.println();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario contraseña incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campos Obligatorios");
        }
    }//GEN-LAST:event_iniciarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JLabel registro;
    // End of variables declaration//GEN-END:variables
}

class CargarBaseDatos extends Thread {

    BaseDatos bs;

    public CargarBaseDatos(BaseDatos bs) {
        this.bs = bs;
    }

    public BaseDatos getBs() {
        return bs;
    }

    public void run() {
        bs.cargarUsuarios();
    }
}
