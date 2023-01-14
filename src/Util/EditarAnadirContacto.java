package Util;

import java.awt.Image;
import java.awt.Toolkit;

public final class EditarAnadirContacto extends javax.swing.JFrame {

    private final validaciones val;
    private final String accion;
    private final BaseDatos bs;
    private final int sesionUsuario;
    private int numContacto;
    private static VentanaPerfil venp;
    public boolean activo = true;

    public EditarAnadirContacto(String accion, BaseDatos bs, int sesionUsuario, int numContacto, VentanaPerfil venp) {
        initComponents();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ajustar();
        this.sesionUsuario = sesionUsuario;
        this.numContacto = numContacto;
        this.bs = bs;
        this.accion = accion;
        titulo.setText(accion);
        val = new validaciones();
        EditarAnadirContacto.venp = venp;
        cargarUsuario();
    }

    public EditarAnadirContacto(String accion, BaseDatos bs, int sesionUsuario, VentanaPerfil venp) {
        initComponents();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ajustar();
        this.accion = accion;
        this.sesionUsuario = sesionUsuario;
        this.bs = bs;
        EditarAnadirContacto.venp = venp;
        titulo.setText(accion);
        val = new validaciones();
    }
    @Override
       public Image getIconImage() {
        Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\imgenes\\logoUce.png");
        return nuevoIcono;
    }
      public void ajustar(){
           this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle(accion);
        this.setIconImage(getIconImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        aceptar = new javax.swing.JLabel();
        cancelar = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        errorApellido = new javax.swing.JLabel();
        errorCorreo = new javax.swing.JLabel();
        errorCelular = new javax.swing.JLabel();
        errorFormulario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("op_cot");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Nombres:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        nombre.setColumns(10);
        nombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 30));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        apellido.setColumns(10);
        apellido.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoFocusLost(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 360, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Correo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        correo.setColumns(10);
        correo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 360, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Celular:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        celular.setColumns(10);
        celular.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        celular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularFocusLost(evt);
            }
        });
        jPanel1.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 360, 30));

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
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 130, 30));

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
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 130, 30));

        errorNombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(errorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 30));

        errorApellido.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorApellido.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(errorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 30));

        errorCorreo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorCorreo.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(errorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 310, 30));

        errorCelular.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorCelular.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(errorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 30));

        errorFormulario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorFormulario.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(errorFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
        if (val.validarSoloLetras(nombre.getText()) & val.validarSoloLetras(apellido.getText()) & val.validarCorreo(correo.getText()) & val.validarNumeroTel(celular.getText())) {
            if (accion.equals("Editar Contacto")) {
                bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].setNombre(nombre.getText());
                bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].setApellido(apellido.getText());
                bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].setCorreo(correo.getText());
                bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].setCelular(celular.getText());
                bs.editarContacto(sesionUsuario);
                venp.limpiarContactos();
                venp.cargarContacto();
            } else {
                System.out.println(nombre.getText() + apellido.getText() + correo.getText() + celular.getText());
                bs.guardarContactos(sesionUsuario, nombre.getText(), apellido.getText(), correo.getText(), celular.getText());
                venp.limpiarContactos();
                venp.cargarContacto();
            }
            this.dispose();
        } else {
            errorFormulario.setText("Llene el bien el formulario");
        }

    }//GEN-LAST:event_aceptarMouseClicked
    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    public void cargarUsuario() {
        nombre.setText(bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].getNombre());
        apellido.setText(bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].getApellido());
        correo.setText(bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].getCorreo());
        celular.setText(bs.getUsuarios()[sesionUsuario].getContactos()[numContacto].getCelular());
    }
    public boolean isActivo() {
        return activo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptar;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel cancelar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel errorApellido;
    private javax.swing.JLabel errorCelular;
    private javax.swing.JLabel errorCorreo;
    private javax.swing.JLabel errorFormulario;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
