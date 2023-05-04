package PilaDeClientes;

public class Clientes {
    private String nombres;
    private String apellidos;
    private int edad;
    private String direccion;
    private String genero;

    public Clientes(String nombres, String apellidos, int edad, String direccion, String genero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void muestraCliente(){
        System.out.println("Datos de Cliente:");
        System.out.println("Nombre: "+ nombres);
        System.out.println("Apellido: "+ apellidos);
        System.out.println("Edad: "+ edad);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Genero: "+ genero);
        System.out.println();
    }

}
