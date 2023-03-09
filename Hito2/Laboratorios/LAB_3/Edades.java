package Manejo_de_pilas;

public class Edades {
    private String universdidad;
    private String paralelo;
    private int[] edades;


    public Edades(String universdidad, String paralelo, int[] edades){
        this.universdidad = universdidad;
        this.paralelo = paralelo;
        this.edades = edades;
    }

    public String getUniversdidad() {
        return universdidad;
    }

    public String getParalelo() {
        return paralelo;
    }

    public int[] getEdades() {
        return edades;
    }
    public void setUniversdidad(String universdidad){
        this.universdidad =universdidad;
    }
    public void setParalelo(String parareloo){
        this.paralelo = parareloo;
    }
    public void setEdades(int[] edades){
        this.edades = edades;
    }

    public void mostrar() {
        System.out.println("MOSTRANDO CLASE EDADES");

        System.out.println("Universidad: " + this.getUniversdidad());
        System.out.println("Paralelo: " + this.getParalelo());

        for (int i = 0; i < this.getEdades().length ; i++)
        {
            //length retorna numero

            System.out.print( this.getEdades()[i]+ ", ");
        }

        System.out.println();
    }
}
