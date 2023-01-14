package Util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class cajaContacto extends javax.swing.JLabel{

    private final String nombre;
    private final String correo;
    private final int ANCHO;
    private final int LARGO;
    private boolean seleccionado= false;
    int I = 50;
    int F = 255;
    Color nc;

    public cajaContacto(int ANCHO, int LARGO, String nombre, String correo) {
        this.nombre = nombre ;
        this.correo = correo;
        this.setFont(new Font("arial",Font.BOLD,18));
        this.setText("  "+nombre+"                       "+ correo);
        this.ANCHO = ANCHO;
        this.LARGO = LARGO;
        
        nc = new Color(255,255,255);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(nc);
        g.fillRect(0, 0, ANCHO, LARGO);
        super.paint(g);
    }

    public void cambiarEstado(boolean n) {
        seleccionado = n;
    }
    public boolean estado(){
        return  seleccionado;
    }
    public boolean obtenerEsado() {
        return seleccionado;
    }

    public void setNc(Color nc) {
        this.nc = nc;
    }

    public Color getNc() {
        return nc;
    }

    public String getNumero() {
        return nombre;
    }
}
