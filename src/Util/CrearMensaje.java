/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public final class CrearMensaje extends javax.swing.JFrame {

    private final BaseDatos bs;
    private final int idUsuario;
    private final String[] contactos;
    boolean n = false, s = false, k = false;

    public CrearMensaje(BaseDatos bs, int idUsuario, String[] contactos) {
        this.bs = bs;
        this.idUsuario = idUsuario;
        this.contactos = contactos;
        initComponents();
           this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Mensajeria");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setIconImage(getIconImage());
        cargarDatos();
    }

    public void cargarDatos() {
        correoUsuario.setText(bs.getUsuarios()[idUsuario].getCorreo());
        
        for (int i = 0; i < contactos.length; i++) {
            correoContacto.setText(correoContacto.getText()+ " " + contactos[i]);
        }
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
        jPanel2 = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        enviar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        correoUsuario = new javax.swing.JLabel();
        asunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorTxt = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        correoContacto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 90, 30));

        enviar.setBackground(new java.awt.Color(0, 153, 153));
        enviar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText(" Enviar");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        jPanel2.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 80, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nuevo Mensaje");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 30));

        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        correoUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        correoUsuario.setForeground(new java.awt.Color(0, 102, 102));
        correoUsuario.setText("mail@mail.com");
        jPanel1.add(correoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 750, 30));

        asunto.setColumns(10);
        asunto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        asunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.add(asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 760, 30));

        jScrollPane1.setViewportView(editorTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 980, 360));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setText("Asunto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 80, 30));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setText("De:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 30));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setText("Para:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 70, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N

        correoContacto.setBackground(new java.awt.Color(255, 255, 255));
        correoContacto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        correoContacto.setForeground(new java.awt.Color(0, 102, 102));
        correoContacto.setOpaque(true);
        jScrollPane2.setViewportView(correoContacto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 760, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        int cont = 0;
        String mensaje="";
        String From = bs.getUsuarios()[idUsuario].getCorreo(),
                FromName = bs.getUsuarios()[idUsuario].getNombre() + " " + bs.getUsuarios()[idUsuario].getApellido();
        while (cont < contactos.length) {
            String To = contactos[cont],
                    SMTP_UserName = "pruebeejuna@gmail.com",
                    SMTP_Password = "hola456.",
                    ConfigSet = "ConfigSet",
                    Host = "smtp.gmail.com",
                    Subject = asunto.getText(),
                    Body =  editorTxt.getText();
            int Port = 587;
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.port", Port);
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(From, SMTP_Password);
                }
            });
            MimeMessage msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(From, FromName));
                msg.setRecipient(Message.RecipientType.TO, new InternetAddress(To));
                msg.setSubject(Subject);
                msg.setContent(Body, "text/html");
                msg.setHeader("X-SES-CONFIGURATION-SET", ConfigSet);
                Transport transport = session.getTransport();
                 JOptionPane.showMessageDialog(null, "Enviando...");
                transport.connect(Host, SMTP_UserName, SMTP_Password);
                transport.sendMessage(msg, msg.getAllRecipients());
                mensaje = "Mensaje Enviado";
                transport.close();
               
            } catch (UnsupportedEncodingException | MessagingException ex) {
                  mensaje = "No se pudo enviar el mensaje Enviado";
            }
            cont++;
        }
        JOptionPane.showMessageDialog(null, mensaje);
          this.dispose();
    }//GEN-LAST:event_enviarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        int cont = 0;
        String mensaje="";
        String From = bs.getUsuarios()[idUsuario].getCorreo(),
                FromName = bs.getUsuarios()[idUsuario].getNombre() + " " + bs.getUsuarios()[idUsuario].getApellido();
        while (cont < contactos.length){
            String To = contactos[cont],
                    SMTP_UserName = "pruebeejuna@gmail.com",
                    SMTP_Password = "hola456.",
                    ConfigSet = "ConfigSet",
                    Host = "smtp.gmail.com",
                    Subject = asunto.getText(),
                    Body =  editorTxt.getText();
            int Port = 587;
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.port", Port);
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(From, SMTP_Password);
                }
            });
            MimeMessage msg = new MimeMessage(session);
             
            try {
                msg.setFrom(new InternetAddress(From, FromName));
                msg.setRecipient(Message.RecipientType.TO, new InternetAddress(To));
                msg.setSubject(Subject);
                msg.setContent(Body, "text/html");
                msg.setHeader("X-SES-CONFIGURATION-SET", ConfigSet);
                Transport transport = session.getTransport();
                 JOptionPane.showMessageDialog(null, "Enviando...");
                transport.connect(Host, SMTP_UserName, SMTP_Password);
                transport.sendMessage(msg, msg.getAllRecipients());
                mensaje = "Mensaje Enviado";
                transport.close();
               
            } catch (UnsupportedEncodingException | MessagingException ex) {
                  mensaje = "No se pudo enviar el mensaje Enviado";
                 
            }
            cont++;
        }
        JOptionPane.showMessageDialog(null, mensaje);
          this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asunto;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel correoContacto;
    private javax.swing.JLabel correoUsuario;
    private javax.swing.JTextPane editorTxt;
    private javax.swing.JLabel enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
