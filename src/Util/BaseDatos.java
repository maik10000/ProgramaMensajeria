/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
    File archivo;
    FileWriter w;
    BufferedWriter bw;
    PrintWriter wr;
    FileReader fr;
    BufferedReader br;
    int numeroUsuarios;
    private Usuario[] usuarios;

    public BaseDatos() {
        usuarios = new Usuario[0];
        numeroUsuarios = 0;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }
    public void cargarUsuarios() {
        String linea;
        String aux = "";
        int nombre = 0;
        boolean bandera = true;
        TiempoEspera tp = new TiempoEspera(bandera);
        String[] datos = new String[6];
        tp.start();
        while (bandera) {
            int cont = 0;
            try {
                archivo = new File("src\\usuarios\\" + "Usuario" + nombre + ".txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                linea = br.readLine();
                for (int i = 0; i < linea.length(); i++) {
                    System.out.println(cont);
                    if (linea.charAt(i) != ',') {
                        aux += linea.charAt(i);
                    } else {
                        datos[cont] = aux;
                        aux = "";
                        cont++;
                    }
                }

                anadirUsuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
            } catch (IOException e) {
                System.out.println("no hay usuarios");
                bandera = tp.isTiempo();
            }
            nombre++;
        }

    } //listo

    public void cargarContactos(int usuario) {
        String linea;
        String aux = "";
        String[] datos = new String[4];

        try {
            archivo = new File("src\\contactos\\" + "ContactoUsuario" + usuario + ".txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while (null != (linea = br.readLine())) {
                int cont = 0;
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) != ',') {
                        aux += linea.charAt(i);
                    } else {
                        datos[cont] = aux;
                        aux = "";
                        cont++;
                    }
                }
                usuarios[usuario].anadirContacto(datos[0], datos[1], datos[2], datos[3]);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("no hay contactos");

        }
    } //listo

    public void cargarGrupos(int usuarioNum) {
        String linea;
        String aux = "";
        int cont = 0;
        try {
            archivo = new File("src\\grupos\\" + "GurpoUsuario" + usuarioNum + ".txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while (null != (linea = br.readLine())) {
                char identificador = ':';
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) != identificador) { //Famili:michael,alejandra,joel,
                        aux += linea.charAt(i);
                    } else {
                        if (identificador == ':') {
                            
                            usuarios[usuarioNum].anadirGrupos(aux);
                            identificador = ',';
                            aux = "";

                        } else {
                            
                            usuarios[usuarioNum].getGrupos()[cont].anairIntegrante(aux);

                            aux = "";
                        }
                    }
                }
                cont++;
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("no hay grupos");

        }
    }

    public int buscarUsuarios(String nombre, String contrasena) {
        int existe = -1;
        for (int i = 0; i < usuarios.length; i++) {
            if ((usuarios[i].getNombre().equals(nombre) | usuarios[i].getCorreo().equals(nombre))& usuarios[i].getContrasena().equals(contrasena)) {
                existe = i;
                break;
            } 
        }
        return existe;
    }//listo
    public boolean buscarGrupo(String nombre, int id){
        boolean existe = false;
        System.out.println("Numero grupos"+usuarios[id].getGrupos().length);
        System.out.println(usuarios[id].getGrupos().length);
        for (int i = 0; i < usuarios[id].getNumeroGrupos(); i++) {
            if ((usuarios[id].getGrupos()[i].getNombre().equals(nombre))) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean buscarIntegrantes(String nombre, int id, int idGrupo){
        boolean existe = false;
        System.out.println("Numero: " +usuarios[id].getGrupos()[idGrupo].getIntegrantes().length);
        for (int i = 0; i < usuarios[id].getGrupos()[idGrupo].getIntegrantes().length; i++) {
            if ((usuarios[id].getGrupos()[idGrupo].getIntegrantes()[i].equals(nombre))) {
                existe = true;
                break;
            }
        }
        return existe;
    }
  
    public void anadirUsuario(String id, String nombre, String apellido, String correo, String celular, String contrasena) {
        Usuario conAux[];
        if (numeroUsuarios == usuarios.length) {
            conAux = new Usuario[numeroUsuarios + 1];
            System.arraycopy(usuarios, 0, conAux, 0, numeroUsuarios);
            usuarios = conAux;
        }
        usuarios[numeroUsuarios] = new Usuario(id, nombre, apellido, correo, celular, contrasena);
        numeroUsuarios++;
    }//listo

    public void guardarContactos(int usuarioNum, String nombre, String apellido, String correo, String celular) {
        usuarios[usuarioNum].anadirContacto(nombre, apellido, correo, celular);

        try {
            archivo = new File("src\\contactos\\" + "ContactoUsuario" + usuarioNum + ".txt");
            w = new FileWriter(archivo, true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            wr.write(nombre + "," + apellido + "," + correo + "," + celular + ",");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
        wr.close();
    } //listo

    public void editarContacto(int usuario) {
        int cont = 0;
        archivo = new File("src\\contactos\\" + "ContactoUsuario" + usuario + ".txt");
        try {
            w = new FileWriter(archivo);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            while (cont < usuarios[usuario].getNumeroContactos()) {
                wr.write(usuarios[usuario].getContactos()[cont].getNombre()
                        + "," + usuarios[usuario].getContactos()[cont].getApellido()
                        + "," + usuarios[usuario].getContactos()[cont].getCorreo()
                        + "," + usuarios[usuario].getContactos()[cont].getCelular() + ",");
                bw.newLine();
                cont++;
            }
        } catch (IOException e) {
            System.out.println("Error de archivo");
        }
        wr.close();
    } //listo

    public void guardarUsuarios(String nombre, String apellido, String correo, String celular, String contrasena) {
        anadirUsuario("UCE00" + nombre.charAt(0) + celular.charAt(celular.length() - 2) + celular.charAt(celular.length() - 1) + (numeroUsuarios + 1), nombre, apellido, correo, celular, contrasena);
        try {
            archivo = new File("src\\usuarios\\" + "Usuario" + (numeroUsuarios - 1) + ".txt");
            w = new FileWriter(archivo);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            wr.write(usuarios[numeroUsuarios - 1].getId() + "," + nombre + "," + apellido + "," + correo + "," + celular + "," + contrasena + ",");
            wr.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    } //listo

    public void guardarGrupos(int usuarioNum, String nombre, String integrante) {
        usuarios[usuarioNum].anadirGrupos(nombre);
        usuarios[usuarioNum].getGrupos()[usuarioNum].anairIntegrante(integrante);
        try {
            archivo = new File("src\\grupos\\" + "GurpoUsuario" + usuarioNum + ".txt");
            w = new FileWriter(archivo, true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            bw.newLine();
            wr.write(nombre + ":" + integrante + ",");
            
        } catch (IOException e) {
            System.out.println("Error");
        }
        wr.close();
    }
}

class TiempoEspera extends Thread {
    boolean tiempo;

    public TiempoEspera(boolean tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            tiempo = false;
        } catch (InterruptedException ex) {
            Logger.getLogger(TiempoEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isTiempo() {
        return tiempo;
    }
}
