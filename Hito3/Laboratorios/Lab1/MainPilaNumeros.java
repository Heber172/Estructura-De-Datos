package EDD_ejercicios;

public class MainPilaNumeros {
    public static void main(String[] args) {
        PilaNumeros pila1 = new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);


        numeroMayor(pila1);
        pila1.mostrar();
//        pila1.mostrar();
//        numeros5(pila1, 5);
//        pila1.mostrar();
    }
    public static void numeroMayor(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();

        int num = 0;
        int max = 0;

        while(!pila.esVacio() ){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Mayor: "+max);

    }
    public static void numeros5(PilaNumeros pila, int buscar){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int cont = 0;

        while (!pila.esVacio()){
            num = pila.eliminar();
            if(num == buscar){
                cont++;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad: "+cont);
    }
}
