package defensa_colas_hito4;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;
    private int id;

    public Cliente(String nombre, String apellido, int edad, String pais, String genero, String tipo, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }
    public int getId(){
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setId(int id){
        this.id = id;
    }
    public void muestraCliente(){
        System.out.println("Mostrando datos del cliente: ");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: "+ this.getApellido());
        System.out.println("Edad: "+ this.getEdad());
        System.out.println("Pais: "+ this.getPais());
        System.out.println("Genero: "+ this.getGenero());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("ID: "+ this.getId());
        System.out.println();
    }
}
