package Colas;

import java.util.Arrays;

public class MainColas {
    public static void main(String[] args) {
        ColaDeNumeros cola = new ColaDeNumeros();
        cola.adicionar(12);
        cola.adicionar(12);
        cola.adicionar(3);
        cola.adicionar(1);
        cola.adicionar(6);
        cola.adicionar(123);
//        multiploDe3(cola,5);
//        eliminarValoresIguales(cola);
//        cola.mostrar();
        eliminaElementosRepetidos(cola);
//        System.out.println(verificaSiExisteUnoMas(cola, 1));
    }
    public static void multiploDe3(ColaDeNumeros cola, int numMult){
        ColaDeNumeros aux  =  new ColaDeNumeros();
        int item=0, cont = 0;
        while (!cola.esVacia()){
            item = cola.eliminar();
            if(item % numMult == 0){
                cont++;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("Hay "+ cont+ " numeros con el multiplo de "+ numMult);
    }

    public static void numeroIgual(ColaDeNumeros cola){
        ColaDeNumeros aux = new ColaDeNumeros();

        int item1 = 0, item2 = 0;

        while(!cola.esVacia()){
            item1 = cola.eliminar();
            while(!cola.esVacia()){
                item2 = cola.eliminar();
                if(item1 != item2){
                    aux.adicionar(item2);
                }
            }
            cola.vaciar(aux);
        }

    }
    public static void eliminarValoresIguales(ColaDeNumeros cola) {
        ColaDeNumeros aux = new ColaDeNumeros();
        ColaDeNumeros aux2 = new ColaDeNumeros();
        while (!cola.esVacia()) {
            int item1 = cola.eliminar();

            boolean encontrado = false;

            while (!cola.esVacia()) {
                int item2 = cola.eliminar();
                if (item1 != item2) {
                    aux.adicionar(item2);
                } else {
                    encontrado = true;
                }
            }
            cola.vaciar(aux);

            if (!encontrado) {
                aux2.adicionar(item1);
            }
        }
        cola.vaciar(aux2);
    }
    public static void eliminaElementosRepetidos(ColaDeNumeros cola){
        int nroElem = cola.nroElementos();
        int item = 0;
        for(int i = 1; i <= nroElem; i++){

            item = cola.eliminar();

            if(!verificaSiExisteUnoMas(cola, item)){
                cola.adicionar(item);
            }

        }
        System.out.println("Ini = "+ cola.getIni());
        System.out.println("Fin = "+ cola.getFin());
        cola.mostrar();

    }
    public static boolean verificaSiExisteUnoMas(ColaDeNumeros cola, int num){
        int cont = 0;
        int item=0;
        int nroElem = cola.nroElementos();


        for(int i = 1; i<= nroElem ; i++){
            item = cola.eliminar();

            if(item == num){
                cont++;
            }
            else {
                cola.adicionar(item);
            }
        }

        if(cont > 0){
            return true;
        }
        else {
            return false;
        }
    }
}