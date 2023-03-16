package Ejercicio;

public class Main {
    public static void main(String[] args) {

        int[] edad = new int[5];
        edad[0] = 10;
        edad[1] =25;
        edad[2]=19;
        edad[3]=45;
        edad[4]=22;

        int[]edad2 = new int[5];
        edad2[0] = 33;
        edad2[1] =20;
        edad2[2]=19;
        edad2[3]=42;
        edad2[4]=25;
        Array ar = new Array(edad, edad2);
        intercambiarValores(ar);
        ar.mostrarEdad();

    }
    public static void intercambiarValores(Array ar)
    {

        int[] array1 = ar.getEdad();
        int[] array2 = ar.getEdad2();

        int a, b;

        int a1 = 0;
        int a2 = 0;
        for(int i = 0; i < array1.length; i++)
        {
            // Primer valor de array 2 reemplzado
            if(i == 0){
                a1 = array2[i];
                array2[i] = array1[array1.length - 2];
            }
            // Segundo valor de array 1 reemplzado
            if(i == 2){
                a2 = array1[i];
                array1[i] = array2[array2.length - 2];
            }
            // Tercer y cuarto valor de array 1 y 2 reemplzado
            if(i == (array1.length - 2)){
                array1[i] = a1;
                array2[i] = a2;
            }
        }

        ar.setEdad(array1);

        ar.setEdad2(array2);



    }
}
