package Util;

import java.awt.Color;
import java.awt.Graphics;
public class Caja extends javax.swing.JLabel{
    private  String correo;
    private  int numero;
    private String nombre;
    private final int ANCHO;
    private final int LARGO;
    private int id ;
    private boolean seleccionado= false;
    int I = 50;
    int F = 255;
    Color nc;
    
    public Caja(int ANCHO, int LARGO,int id, String nombre, String correo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.setText(id+"  "+nombre+"                       "+ correo);
        this.ANCHO = ANCHO;
        this.LARGO = LARGO;
       this.setName("c");
        nc = new Color(255,255,255);
    }
    public Caja(int ANCHO, int LARGO,int id, int numero, String nombre) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.setText("  "+nombre+"                       "+ numero);
        this.ANCHO = ANCHO;
        this.LARGO = LARGO;
        this.setName("g");
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getId() {
        return id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
