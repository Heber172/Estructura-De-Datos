package Procesual_H4_COLAS;

public class Clientes {
    private String nombre;
    private String apellido;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public Clientes(String nombre, String apellido, int edad, String pais, String genero, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getPais(){
        return pais;
    }
    public String getGenero(){
        return genero;
    }
    public String getTipo(){
        return tipo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPais(String pais){
        this.pais = pais;

    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void muestraCliente(){
        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Pais: "+ getPais());
        System.out.println("Genero: "+ getGenero());
        System.out.println("Tipo: "+ getTipo());
        System.out.println();
    }
}
