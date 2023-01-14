/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BaseDatos bs = new BaseDatos();
        bs.cargarUsuarios();
        bs.cargarContactos(0);
        bs.cargarGrupos(0);
        System.out.println("Ingree el nombre el grupo");
        String grupo = leer.next();
        System.out.println("Ingrese el nombre de integrante");
        String integrante = leer.next();
       bs.guardarGrupos(0, grupo, integrante);
        System.out.println(bs.getUsuarios()[0].getGrupos()[0].getIntegrantes()[0]);
        System.out.println("numero integrantes" + bs.getUsuarios()[0].getNumeroContactos());
        System.out.println(bs.getUsuarios()[0].getGrupos()[0].getNombre() + "en memoria");
         System.out.println("Ingree el nombre el grupo");
         grupo = leer.next();
        System.out.println("Ingrese el nombre de integrante");
         integrante = leer.next();
         System.out.println("Existe el grupo"+ bs.buscarGrupo(grupo, 0));
         System.out.println("Existe el integrante"+ bs.buscarIntegrantes(integrante, 0, 0));
    }
}
