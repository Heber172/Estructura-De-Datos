package Ejercicio;

public class Array {
    private int[] edad;
    private int[] edad2;

    public Array(int [] edad, int[] edad2 ){
        this.edad = edad;
        this.edad2 = edad2;
    }

    public void setEdad(int[] edad){
        this.edad = edad;
    }
    public int[] getEdad(){
        return edad;
    }
    public void setEdad2(int[] edad2){
        this.edad2 = edad2;
    }
    public int[] getEdad2()    {
        return edad2;
    }


    public void mostrarEdad(){
        System.out.println("Array 1: ");
        for(int i = 0; i< this.getEdad().length; i++){
            System.out.print(this.getEdad()[i]+ " ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for(int i = 0; i< this.getEdad2().length; i++){
            System.out.print(this.getEdad2()[i]+ " ");
        }
    }
}
