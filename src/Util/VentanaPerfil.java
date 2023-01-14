package Util;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public final class VentanaPerfil extends javax.swing.JFrame {

    BaseDatos bs;
    int usuarioSesion;
    Caja[] cajasC;
    Caja[] cajasG;
    contaacto[] co1;

    public VentanaPerfil(BaseDatos bs, int usuarioSesion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("!Bienvenido! :3");
        this.setIconImage(getIconImage());
        this.usuarioSesion = usuarioSesion;
        this.bs = bs;
        bs.cargarContactos(usuarioSesion);
        bs.cargarGrupos(usuarioSesion);
        cargarPerfil();
        cargarContacto();
        cargarGrupos();
    }

    @Override
    public Image getIconImage() {
        Image nuevoIcono = Toolkit.getDefaultToolkit().getImage("src\\imgenes\\logoUce.png");
        return nuevoIcono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        base = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonEditarContacto = new javax.swing.JLabel();
        BotonNuevoMensaje = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        num_contacto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ScrollGrupos = new javax.swing.JScrollPane();
        gruposContenedor = new javax.swing.JPanel();
        ScrollContactos = new javax.swing.JScrollPane();
        contenedorContactos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        num_grupos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        añadirGrupo = new javax.swing.JLabel();
        añadirContacto = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Informacion:");
        base.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 220, 30));

        BotonEditarContacto.setBackground(new java.awt.Color(102, 102, 102));
        BotonEditarContacto.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        BotonEditarContacto.setForeground(new java.awt.Color(255, 255, 255));
        BotonEditarContacto.setText("   Editar");
        BotonEditarContacto.setOpaque(true);
        BotonEditarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarContactoMouseClicked(evt);
            }
        });
        base.add(BotonEditarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 120, 40));

        BotonNuevoMensaje.setBackground(new java.awt.Color(0, 51, 51));
        BotonNuevoMensaje.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        BotonNuevoMensaje.setForeground(new java.awt.Color(255, 255, 255));
        BotonNuevoMensaje.setText("   Nuevo ");
        BotonNuevoMensaje.setOpaque(true);
        BotonNuevoMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNuevoMensajeMouseClicked(evt);
            }
        });
        base.add(BotonNuevoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 120, 40));
        base.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        base.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, -1));

        num_contacto.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        num_contacto.setForeground(new java.awt.Color(0, 153, 153));
        num_contacto.setText("0");
        base.add(num_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 50, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        base.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 300, -1));

        gruposContenedor.setBackground(new java.awt.Color(255, 255, 255));
        gruposContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        javax.swing.GroupLayout gruposContenedorLayout = new javax.swing.GroupLayout(gruposContenedor);
        gruposContenedor.setLayout(gruposContenedorLayout);
        gruposContenedorLayout.setHorizontalGroup(
            gruposContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        gruposContenedorLayout.setVerticalGroup(
            gruposContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        ScrollGrupos.setViewportView(gruposContenedor);

        base.add(ScrollGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 300, 130));

        contenedorContactos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorContactos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        javax.swing.GroupLayout contenedorContactosLayout = new javax.swing.GroupLayout(contenedorContactos);
        contenedorContactos.setLayout(contenedorContactosLayout);
        contenedorContactosLayout.setHorizontalGroup(
            contenedorContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        contenedorContactosLayout.setVerticalGroup(
            contenedorContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        ScrollContactos.setViewportView(contenedorContactos);

        base.add(ScrollContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 320, 350));

        informacion.setColumns(20);
        informacion.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        base.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 390, 270));

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Mis Grupos:");
        base.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 30));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Contactos");
        base.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 30));

        user_id.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        user_id.setForeground(new java.awt.Color(153, 153, 153));
        user_id.setText("user_id");
        base.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 30));

        num_grupos.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        num_grupos.setForeground(new java.awt.Color(0, 153, 153));
        num_grupos.setText("0");
        base.add(num_grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 50, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Mis Contactos:");
        base.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 220, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        base.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 390, -1));

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Grupos");
        base.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 30));

        getContentPane().add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 570));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        añadirGrupo.setBackground(new java.awt.Color(255, 255, 255));
        añadirGrupo.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        añadirGrupo.setForeground(new java.awt.Color(255, 255, 255));
        añadirGrupo.setText("Añadir Grupo");
        añadirGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirGrupoMouseClicked(evt);
            }
        });
        jPanel1.add(añadirGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 140, 30));

        añadirContacto.setBackground(new java.awt.Color(255, 255, 255));
        añadirContacto.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        añadirContacto.setForeground(new java.awt.Color(255, 255, 255));
        añadirContacto.setText("Añadir Contacto");
        añadirContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirContactoMouseClicked(evt);
            }
        });
        jPanel1.add(añadirContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 170, 30));

        user_name.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setText("user_name");
        jPanel1.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 450, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirContactoMouseClicked
        String accion = "Añadir Nuevo Contacto";
        EditarAnadirContacto editarC = new EditarAnadirContacto(accion, bs, usuarioSesion, this);
        editarC.setVisible(true);
    }//GEN-LAST:event_añadirContactoMouseClicked

    private void BotonNuevoMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMensajeMouseClicked
        String[] contactos = new String[0];
        int t = 0;
        for (int i = 0; i < cajasC.length; i++) {
            String[] aux = contactos;
            if (cajasC[i].estado()) {
                contactos = new String[t + 1];
                System.arraycopy(aux, 0, contactos, 0, aux.length);
                contactos[t] = cajasC[i].getCorreo();
                t++;
            }
        }
        if(contactos.length!=0){
             CrearMensaje mensaje = new CrearMensaje(bs, usuarioSesion, contactos);
              mensaje.setVisible(true);
        }else{
             JOptionPane.showMessageDialog(null, "Seleccione uno o más contactos");
        }
    }//GEN-LAST:event_BotonNuevoMensajeMouseClicked
    private void BotonEditarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarContactoMouseClicked
        System.out.println(seleccionarContacto());
        EditarAnadirContacto editarC;
        if (seleccionarContacto() != -1) {
            String accion = "Editar Contacto";
            System.out.println(accion);
            System.out.println(seleccionarContacto());
            System.out.println(bs.getUsuarios()[usuarioSesion].getContactos()[seleccionarContacto()].getCelular());
            editarC = new EditarAnadirContacto(accion, bs, usuarioSesion, seleccionarContacto(), this);
            editarC.setVisible(true);
        } else {
             JOptionPane.showMessageDialog(null, "Selecciones solo un usuario para editar");
        }
    }//GEN-LAST:event_BotonEditarContactoMouseClicked

    private void añadirGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirGrupoMouseClicked
         String [] contactos = new String[0];
        int t = 0;
        for (int i = 0; i < cajasC.length; i++) {
            String[] aux = contactos;
            if (cajasC[i].estado()) { 
                contactos = new String[t + 1];
                System.arraycopy(aux, 0, contactos, 0, aux.length);
                contactos[t] = cajasC[i].getNombre();
                t++;
            }
        }
        for (int i = 0; i < contactos.length; i++) {
            System.out.println(contactos[i]);
        }
        if(contactos.length!=0){
             AnadirGrupo addG = new AnadirGrupo(bs,usuarioSesion,contactos,this);
             addG.setVisible(true);
        }else{
             JOptionPane.showMessageDialog(null, "Seleccione uno o más contactos");
        }
    }//GEN-LAST:event_añadirGrupoMouseClicked
    private void cargarPerfil() {
        user_name.setText(bs.getUsuarios()[usuarioSesion].getNombre() + " " + bs.getUsuarios()[usuarioSesion].getApellido());
        user_id.setText(bs.getUsuarios()[usuarioSesion].getId());
        num_contacto.setText(bs.getUsuarios()[usuarioSesion].getNumeroContactos() + "");
        num_grupos.setText(bs.getUsuarios()[usuarioSesion].getNumeroGrupos()+"");
        informacion.setEditable(false);
    }

    public int seleccionarContacto() {
        int cont = 0, index = -1;
        while (cont < cajasC.length) {
            if (cajasC[cont].estado()) {
                index++;
                if (index == 0) {
                    System.out.println(index);
                    index = cont;
                } else {
                    index = -1;
                    break;
                }
            }
            cont++;
        }

        return index;
    }

    public void cargarContacto() {
        cajasC = new Caja[bs.getUsuarios()[usuarioSesion].getContactos().length];
        int PC = 0;
        for (int i = 0; i < cajasC.length; i++) {
            cajasC[i] = new Caja(contenedorContactos.getWidth(), 80, i + 1, bs.getUsuarios()[usuarioSesion].getContactos()[i].getNombre(), bs.getUsuarios()[usuarioSesion].getContactos()[i].getCorreo());
            cajasC[i].setBounds(0, PC, contenedorContactos.getWidth(), 80);
            contenedorContactos.add(cajasC[i]);
            contenedorContactos.repaint();
            EventosRatonContactos evntR = new EventosRatonContactos(cajasC[i], informacion, bs, usuarioSesion);
            cajasC[i].addMouseListener(evntR);
            PC += cajasC[0].getHeight();
            if (PC > contenedorContactos.getHeight()) {
                contenedorContactos.setPreferredSize(new Dimension(0, contenedorContactos.getHeight() + (PC - contenedorContactos.getHeight())));
            } else {
                contenedorContactos.setPreferredSize(new Dimension(0, 0));
            }
        }
    }

    public void limpiarContactos() {
        for (int i = 0; i < cajasC.length; i++) {
            cajasC[i].setBounds(0, 0, 0, 0);
            contenedorContactos.add(cajasC[i]);
            contenedorContactos.repaint();
        }
    }
    public void limpiarGrupos() {
        for (int i = 0; i < cajasG.length; i++) {
            cajasG[i].setBounds(0, 0, 0, 0);
            contenedorContactos.add(cajasG[i]);
            contenedorContactos.repaint();
        }
    }

    public void cargarGrupos() {
        cajasG = new Caja[bs.getUsuarios()[usuarioSesion].getNumeroGrupos()];
        int PG = 0;
        for (int i = 0; i < cajasG.length; i++) {
            cajasG[i] = new Caja(gruposContenedor.getWidth(), 40,i, bs.getUsuarios()[usuarioSesion].getGrupos()[i].getIntegrantes().length, bs.getUsuarios()[usuarioSesion].getGrupos()[i].getNombre());
            cajasG[i].setBounds(0, PG, gruposContenedor.getWidth(), 40);
            gruposContenedor.add(cajasG[i]);
            gruposContenedor.repaint();
            EventosRatonContactos evntR = new EventosRatonContactos(cajasG[i], informacion, bs, usuarioSesion);
            cajasG[i].addMouseListener(evntR);
            PG += cajasG[0].getHeight();
            if (PG > gruposContenedor.getHeight()) {
                gruposContenedor.setPreferredSize(new Dimension(0, gruposContenedor.getHeight() + (PG - gruposContenedor.getHeight())));
            } else {
                gruposContenedor.setPreferredSize(new Dimension(0, 0));
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEditarContacto;
    private javax.swing.JLabel BotonNuevoMensaje;
    private javax.swing.JScrollPane ScrollContactos;
    private javax.swing.JScrollPane ScrollGrupos;
    private javax.swing.JLabel añadirContacto;
    private javax.swing.JLabel añadirGrupo;
    private javax.swing.JPanel base;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel contenedorContactos;
    private javax.swing.JPanel gruposContenedor;
    private javax.swing.JTextArea informacion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel num_contacto;
    private javax.swing.JLabel num_grupos;
    private javax.swing.JLabel user_id;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}

class EventosRatonContactos implements MouseListener {

    Caja caja;
    JTextArea informacion;
    BaseDatos bs;
    int id;

    public EventosRatonContactos(Caja caja, JTextArea infomacion, BaseDatos bs, int id) {
        this.caja = caja;
        this.informacion = infomacion;
        this.bs = bs;
        this.id = id;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!caja.estado()) {
            System.out.println(e.getComponent().getName());
            caja.cambiarEstado(true);
            TransicionColores trasCOn = new TransicionColores(caja, 0, 102, 102);
            trasCOn.start();
            caja.repaint();
            if(e.getComponent().getName().equals("c")){
                 informacion.setText(
                    "\n"
                    + "   Nombre:   " + bs.getUsuarios()[id].getContactos()[caja.getId()-1].getNombre() + "\n"
                    + "\n"
                    + "   Apellido: " + bs.getUsuarios()[id].getContactos()[caja.getId()-1].getApellido() + "\n"
                    + "\n"
                    + "   Correo:   " + bs.getUsuarios()[id].getContactos()[caja.getId()-1].getCorreo() + "\n"
                    + "\n"
                    + "   Celular:  " + bs.getUsuarios()[id].getContactos()[caja.getId()-1].getCelular() + "\n"
            );
            }else{
                String integrantes = "";
                for (int i = 0; i < bs.getUsuarios()[id].getGrupos()[caja.getId()].getIntegrantes().length; i++) {
                   integrantes += "  - "+bs.getUsuarios()[id].getGrupos()[caja.getId()].getIntegrantes()[i]+"\n";
                }
                   informacion.setText(
                    "\t"+"\t"+"Integrantes"+"\n"
                      +integrantes
                     );
            }
        } else {
            caja.cambiarEstado(false);
            TransicionColores trasCOn = new TransicionColores(caja, 255, 255, 255);
            trasCOn.start();
            caja.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (!caja.estado()) {
            TransicionColores trasCOn = new TransicionColores(caja, 0, 153, 153);
            trasCOn.start();
            caja.repaint();
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //[0,153,153]
        if (!caja.estado()) {
            TransicionColores trasCOn = new TransicionColores(caja, 255, 255, 255);
            trasCOn.start();
            caja.repaint();
        }
    }

}
