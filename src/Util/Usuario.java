
package Util;

public class Usuario {
   private String nombre;
   private String apellido;
   private String celular;
   private String correo ;
   private String contrasena; 
   private Usuario [] contactos;
   private Grupo[] grupos;
   private int numeroContactos = 0; 
   private int numeroGrupos=0;
   private final String id ;
    public Usuario(String id,String nombre,String apellido,String correo, String celular,String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.contrasena = contrasena;
        this.id = id;
        contactos = new Usuario[0];
        grupos = new Grupo[0];
    }
 
    public Usuario(String id, String nombre,String apellido,String correo, String celular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.id = id;
    }
    public Usuario[] getContactos() {
        return contactos;
    }
        public void anadirContacto(String nombre, String apellido, String correo, String celular) {
        Usuario conAux[];
        if (numeroContactos == contactos.length) {
            conAux = new Usuario[numeroContactos + 1];
            System.arraycopy(contactos, 0, conAux, 0, numeroContactos);
            contactos = conAux;
        }
        contactos[numeroContactos] = new Usuario("c"+numeroContactos, nombre, apellido, correo, celular);
        numeroContactos++;
    }
      public void anadirGrupos(String nombre) {
        Grupo conAux[];
        if (numeroGrupos == grupos.length) {
            conAux = new Grupo[numeroGrupos + 1];
            System.arraycopy(grupos, 0, conAux, 0, numeroGrupos);
            grupos = conAux;
        }
        grupos[numeroGrupos] = new Grupo(nombre);
        numeroGrupos++;
         
    }

    public Grupo[] getGrupos() {
        
        return grupos;
    }

    public int getNumeroGrupos() {
        return numeroGrupos;
    }
      
    public int getNumeroContactos() {
        return numeroContactos;
    }
    public void setContactos(Usuario[] contactos) {
        this.contactos = contactos;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }
    public void añadirContactos(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getId() {
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
