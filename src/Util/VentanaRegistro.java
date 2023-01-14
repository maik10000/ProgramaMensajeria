/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author Usuario
 */
public final class VentanaRegistro extends javax.swing.JFrame {

    private final BaseDatos bs;
    private final validaciones val;
   
    public VentanaRegistro(BaseDatos bs) {
        this.bs = bs;
        val = new validaciones();
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registrarse");
        this.setIconImage(getIconImage());
    }

      public Image getIconImage() {
        Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\imgenes\\logoUce.png");
        return nuevoIcono;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        contrasena = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contrasenados = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancelar = new javax.swing.JLabel();
        aceptar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        errorApellido = new javax.swing.JLabel();
        errorCorreo = new javax.swing.JLabel();
        errorCelular = new javax.swing.JLabel();
        errorFormulario = new javax.swing.JLabel();
        errorContrasena1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Confirmar Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 300, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Correo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 30));

        correo.setColumns(10);
        correo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 360, 30));

        contrasena.setColumns(10);
        contrasena.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        contrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 360, 30));

        nombre.setColumns(10);
        nombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 360, 30));

        apellido.setColumns(10);
        apellido.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoFocusLost(evt);
            }
        });
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 360, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Apellidos:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        contrasenados.setColumns(10);
        contrasenados.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        contrasenados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(contrasenados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 360, 30));

        celular.setColumns(10);
        celular.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        celular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularFocusLost(evt);
            }
        });
        jPanel2.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 360, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Celular:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 30));

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Contraseña:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 180, 30));

        cancelar.setBackground(new java.awt.Color(0, 51, 51));
        cancelar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("  Cancelar");
        cancelar.setOpaque(true);
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 130, 30));

        aceptar.setBackground(new java.awt.Color(0, 51, 51));
        aceptar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("   Aceptar");
        aceptar.setOpaque(true);
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
        });
        jPanel2.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 130, 30));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Nombres:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 30));

        errorNombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 30));

        errorApellido.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorApellido.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, 30));

        errorCorreo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorCorreo.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 310, 30));

        errorCelular.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorCelular.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 220, 30));

        errorFormulario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorFormulario.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 330, 30));

        errorContrasena1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorContrasena1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 220, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        VentanaSesion venSesion ;
        venSesion = new VentanaSesion();
        venSesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked

        if (val.validarSoloLetras(nombre.getText()) & val.validarSoloLetras(apellido.getText()) & val.validarCorreo(correo.getText()) & val.validarNumeroTel(celular.getText()) & validarContraseñas()) {
            bs.guardarUsuarios(nombre.getText(), apellido.getText(), correo.getText(), celular.getText(), contrasena.getText());
             VentanaSesion venSesion ;
            venSesion = new VentanaSesion();
            venSesion.setVisible(true);
            this.dispose();
            
        } else {
            errorFormulario.setText("Llene el bien el formulario");
            System.out.println("Llene el formulario");
        }
    }//GEN-LAST:event_aceptarMouseClicked

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
           if (val.validarSoloLetras(nombre.getText())) {
            errorNombre.setText("");
            System.out.println("estaBien");
        } else {
            errorNombre.setText("Solo letras");

        }
    }//GEN-LAST:event_nombreFocusLost

    private void apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusLost
         if (val.validarSoloLetras(apellido.getText())) {
           errorApellido.setText("");
        } else {
            errorApellido.setText("Solo letras");

        }
    }//GEN-LAST:event_apellidoFocusLost

    private void correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusLost
        if (val.validarCorreo(correo.getText())) {
           errorCorreo.setText("");
        } else {
            errorCorreo.setText("Ingrese un correo valido");

        }
    }//GEN-LAST:event_correoFocusLost

    private void celularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularFocusLost
         if (val.validarNumeroTel(celular.getText())) {
            errorCelular.setText("");
        } else {
            errorCelular.setText("Ingrese un telefono valido");
        }
    }//GEN-LAST:event_celularFocusLost
    public boolean validarContraseñas() {
         System.out.println("holaa");
        if (contrasena.getText().equals("") || contrasena.getText().equals(" ")) {
            errorContrasena1.setText("Llene lo campos!");
            return false;
        } else {
            if (contrasena.getText().equals(contrasenados.getText())) {
               
                 errorContrasena1.setText("");
                return true;
            } else {
                
                errorContrasena1.setText("Las contraeña no coinsiden");
                return false;
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptar;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel cancelar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField contrasena;
    private javax.swing.JTextField contrasenados;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel errorApellido;
    private javax.swing.JLabel errorCelular;
    private javax.swing.JLabel errorContrasena1;
    private javax.swing.JLabel errorCorreo;
    private javax.swing.JLabel errorFormulario;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
