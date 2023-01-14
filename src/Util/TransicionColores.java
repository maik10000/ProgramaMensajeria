/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class TransicionColores extends Thread{
    
    private final Caja boton;
    private final int rojo;
    private final int verde;
    private final int azul;
    private final int[] R_V_A;
    private int[] R_V_A2;

    public TransicionColores(Caja boton, int rojo, int verde, int azul) {
        R_V_A = new int[3];
        R_V_A2 = new int[3];
        this.boton = boton;
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public void extraerRGB2() {
        R_V_A2[0] = rojo;
        R_V_A2[1] = verde;
        R_V_A2[2] = azul;
    }

    public void extraerRGB() {
        R_V_A[0] = boton.getNc().getRed();
        R_V_A[1] = boton.getNc().getGreen();
        R_V_A[2] = boton.getNc().getBlue();
    }

    public void trans() {
        int rangoMax = rangoMacx()[0];
        for (int i = 0; i < rangoMacx().length - 1; i++) {
            if (rangoMacx()[i] < rangoMacx()[i + 1]) {
                rangoMax = rangoMacx()[i + 1];
            }
        }

        for (int i = 0; i <= rangoMax; i++) {
            if (R_V_A[0] != R_V_A2[0]) {
                if (R_V_A[0] < R_V_A2[0]) {
                    R_V_A[0]++;
                } else {
                    R_V_A[0]--;
                }
            }
            if (R_V_A[1] != R_V_A2[1]) {
                if (R_V_A[1] < R_V_A2[1]) {
                    R_V_A[1]++;
                } else {
                    R_V_A[1]--;
                }
            }
            if (R_V_A[2] != R_V_A2[2]) {
                if (R_V_A[2] < R_V_A2[2]) {
                    R_V_A[2]++;
                } else {
                    R_V_A[2]--;
                }
            }
            
            boton.setNc(new Color(R_V_A[0], R_V_A[1], R_V_A[2]));

        }
       
    }

    public int[] rangoMacx() {
        int[] r = new int[3];
        for (int i = 0; i < R_V_A.length; i++) {
            if ((R_V_A[i] - R_V_A2[i]) < 0) {
                r[i] = -(R_V_A[i] - R_V_A2[i]);
            } else {
                r[i] = R_V_A[i] - R_V_A2[i];
            }
        }
        return r;
    }

    @Override
    public void run() {
        extraerRGB2();
        extraerRGB();
        trans();
    }
}
