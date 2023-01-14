package Util;
public class validaciones {
    public boolean validarSoloLetras(String cadena) {
        return (cadena.matches("[a-zA-ZäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙñÑ, ]*$"));
    }
    public boolean validarCorreo(String cadena) {
        return (cadena.matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$"));
    }
     public boolean validarNumeroTel(String cadena){
        return (cadena.matches("^[0-9]{10}$"));
    }
}
