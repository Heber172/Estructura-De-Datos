package Colas.Objetos;

import Colas.ColaDeNumeros;

public class ColaDeLibros {
    private int ini;
    private int fin;
    private int max;
    private Libro[] libros;
    public ColaDeLibros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.libros = new Libro[this.max+1];
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
    public void adicionar(Libro nuevoLibro){
        if(esLlena()){
            System.out.println("Cola de libro llena");
        }
        else{
            fin = fin+1;
            libros[fin]=nuevoLibro;
        }
    }
    public Libro eliminar(){
        Libro libroEliminado = null;

        if(esVacia()){
            System.out.println("Cola VACIA");
        }else{
            ini = ini+1;
            libroEliminado = libros[ini];
            if(ini == fin){
                ini=0;
                fin=0;
            }
        }
        return libroEliminado;
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


    public void vaciar(ColaDeLibros cola){
        Libro elemEliminado = null;
        while(!cola.esVacia()){
            elemEliminado = cola.eliminar();
            adicionar(elemEliminado);
        }
    }
    public void mostrar(){
        Libro item=null;
        if(esVacia()){
            System.out.println("La cola de libro esta vacia, no hay ITEMS");
        }else
        {
            System.out.println("Mostrando los datos de la cola");
            ColaDeLibros aux = new ColaDeLibros();
            while(!esVacia()){
                item = eliminar();
                item.mostrar();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}
