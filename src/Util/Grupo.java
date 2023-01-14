package Util;

public class Grupo {

    private String nombre;
    private String[] integrantes;
    private int numeroIntegrante;

    public Grupo(String nombre) {
        this.nombre = nombre;
        integrantes = new String[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void anairIntegrante(String integr) {
        String conAux[];
        if (numeroIntegrante == integrantes.length) {
            conAux = new String[numeroIntegrante + 1];
            System.arraycopy(integrantes, 0, conAux, 0, numeroIntegrante);
            integrantes = conAux;
        }
        integrantes[numeroIntegrante] = integr;
        numeroIntegrante++;
        System.out.println(numeroIntegrante);
    }

    public int getNumeroIntegrante() {
        return numeroIntegrante;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroIntegrante(int numeroIntegrante) {
        this.numeroIntegrante = numeroIntegrante;
    }

}
