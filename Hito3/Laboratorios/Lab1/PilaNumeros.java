package EDD_ejercicios;

public class PilaNumeros {
   private int max;     //cantidad maxima
   private int tope;    //elementos
   private int[] numeros;

   public PilaNumeros(){
       this.max = 10;
       this.tope =0;
       this.numeros = new int[this.max+1];
   }
   public boolean esVacio(){

       if(this.tope == 0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   public boolean esLlena(){
       if(this.tope == this.max){
           return true;
       }
       else{
           return false;
       }
   }
   public int nroElementos(){
       return this.tope;
   }
   public void adicionar(int nuevoNumero){
       if(esLlena() == true){
           System.out.println("Pila llena");
       }
       else{
           tope=tope+1;
           numeros[tope] = nuevoNumero;

       }
   }
   public int eliminar(){
       int itemEliminado=0;

       if(esVacio()==true){
           System.out.println("Pila vacia");
       }
       else{

           itemEliminado = numeros[tope];
           tope = tope-1;

       }
       return itemEliminado;
   }
   public void vaciar(PilaNumeros pila){
       while(esVacio() == false){
           adicionar(pila.eliminar());
       }
   }
   public void mostrar(){
       int item = 0;

       if(esVacio() == true){
           System.out.println("No hay items que mostrar");

       }
       else{
           System.out.println("Mostrar Pila De Numeros");
           PilaNumeros aux = new PilaNumeros();
           while(esVacio() == false){
               item = eliminar();
               System.out.println("Numero = "+ item);
               aux.adicionar(item);
           }
       }
   }
}
