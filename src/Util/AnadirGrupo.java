/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AnadirGrupo extends javax.swing.JFrame {
    private final validaciones val ;
    private  BaseDatos bs ;
     private  String [] contactos;
     private final int usuarioSesion;
     private VentanaPerfil venp ;
     private String integrantes="";
    /**
     * Creates new form anadirGrupo
     * @param bs
     * @param usuarioSesion
     * @param contactos
     * @param venp
     */
    public AnadirGrupo(BaseDatos bs, int usuarioSesion,String [] contactos, VentanaPerfil venp) {
        initComponents();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        val = new  validaciones();
        this.bs = bs;
        this.contactos = contactos;
        this.usuarioSesion = usuarioSesion;
        this.venp = venp;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Añadir Grupo");
        integrantesSeleccionados.setEditable(false);
        cargarItegrantes();
    }
    public void cargarItegrantes(){
        String mostrar="";
        for (int i = 0; i < contactos.length; i++) {
             integrantes += contactos[i]+",";
             mostrar +="\t"+" "+contactos[i]+"\n";
        }
        System.out.println(integrantes);
        integrantesSeleccionados.setText(mostrar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        cancelar = new javax.swing.JLabel();
        aceptar = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        integrantesSeleccionados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nuevo Grupo");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 30));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setColumns(10);
        nombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 360, 30));

        cancelar.setBackground(new java.awt.Color(0, 51, 51));
        cancelar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("   Cancelar");
        cancelar.setOpaque(true);
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 150, 40));

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
        jPanel2.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, 40));

        errorNombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(errorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 290, 30));

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Nombre del Grupo");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 250, 30));

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Integrantes:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 30));

        integrantesSeleccionados.setColumns(20);
        integrantesSeleccionados.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        integrantesSeleccionados.setRows(5);
        jScrollPane2.setViewportView(integrantesSeleccionados);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 580, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, 450));

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

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
         if(val.validarSoloLetras(nombre.getText())){
             if(!bs.buscarGrupo(nombre.getText(), usuarioSesion)){
                 bs.guardarGrupos(0, nombre.getText(), integrantes);
                    venp.limpiarGrupos();
                    venp.cargarGrupos();
                    this.dispose();
             }else{
                  JOptionPane.showMessageDialog(null, "Ese grupo ya existe");
             }
         }else{
             JOptionPane.showMessageDialog(null, "Ingrese un nombre");
         } 
    }//GEN-LAST:event_aceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptar;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JTextArea integrantesSeleccionados;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
