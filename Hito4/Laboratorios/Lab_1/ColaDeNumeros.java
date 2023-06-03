package Colas;

public class ColaDeNumeros {
    private int ini;
    private int fin;
    private int max;
    private int[] numeros;
    public ColaDeNumeros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max+1];
    }
    public boolean esVacia(){
        if(ini == 0 && fin == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean esLlena(){
        if(fin == max){
            return true;
        }
        else {
            return false;
        }


    }
    public void adicionar(int nuevoNumero){
        if(esLlena()){
            System.out.println("Cola de numeros llena");
        }
        else{
            fin = fin+1;
            numeros[fin]=nuevoNumero;
        }
    }
    public int eliminar(){
        int numEliminado = 0;

        if(esVacia()){
            System.out.println("Cola VACIA");
        }else{
            ini = ini+1;
            numEliminado = numeros[ini];
            if(ini == fin){
                ini=0;
                fin=0;
            }
        }
        return numEliminado;
    }
    public int nroElementos(){
        return fin - ini;
    }
    public int getIni(){
        return ini;
    }
    public int getFin(){
        return fin;
    }


    public void vaciar(ColaDeNumeros cola){
        int elemEliminado;
        while(!cola.esVacia()){
            elemEliminado = cola.eliminar();
            adicionar(elemEliminado);
        }
    }
    public void mostrar(){
        int item=0;
        if(esVacia()){
            System.out.println("La cola de numeros esta vacia, no hay ITEMS");
        }else
        {
            System.out.println("Mostrando los datos de la cola");
            ColaDeNumeros aux = new ColaDeNumeros();
            while(!esVacia()){
                item = eliminar();
                System.out.println("Valor: "+item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

}
