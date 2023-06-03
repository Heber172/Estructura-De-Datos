package Colas.Objetos;

public class MainLibro {
    public static void main(String[] args) {
        ColaDeLibros cola =  new ColaDeLibros();
        Libro libro1 = new Libro(1,"Juan", "masculino", "MANGA", 80);
        Libro libro2= new Libro(2,"Saul", "masculino", "MANGA", 100);
        Libro libro3 = new Libro(3,"Ana", "femenino", "HISTORIA", 40);
        Libro libro4 = new Libro(4,"Micaela", "femenino", "HISTORIA", 30);
        Libro libro5 = new Libro(5,"Pepito", "otro", "NOVELA", 20);
        Libro libro6 = new Libro(6,"Pep", "otro", "NOVELA", 20);
        Libro libro7 = new Libro(7,"Carlos", "masculino", "ARTE", 200);

        cola.adicionar(libro1);
        cola.adicionar(libro2);
        cola.adicionar(libro3);
        cola.adicionar(libro4);
        cola.adicionar(libro5);
        cola.adicionar(libro6);
        cola.adicionar(libro7);

//        cola.mostrar();

//        determinarLibroMenor(cola).mostrar();
//        ordenarColaDeLibroGenero(cola);
        ordenarPaginasAscendente(cola);
    }
    public static Libro determinarLibroMenor(ColaDeLibros cola){
        ColaDeLibros aux =  new ColaDeLibros();
        int menorPag = Integer.MAX_VALUE;
        Libro menorLibro = null;

        while(!cola.esVacia()){
            Libro item = cola.eliminar();
            if(item.getPaginas() < menorPag){
                menorPag = item.getPaginas();
                menorLibro = item;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        return menorLibro;
    }
    public static void ordenarColaDeLibroGenero(ColaDeLibros cola){
        ColaDeLibros femenino = new ColaDeLibros();
        ColaDeLibros masculino =  new ColaDeLibros();
        ColaDeLibros otro = new ColaDeLibros();

        Libro item = null;

        while (!cola.esVacia()){
            item = cola.eliminar();

            if(item.getGenero() == "femenino"){
                femenino.adicionar(item);
            }
            else if (item.getGenero() =="masculino") {

                masculino.adicionar(item);
            }
            else{
                otro.adicionar(item);
            }

        }
        cola.vaciar(femenino);
        cola.vaciar(masculino);
        cola.vaciar(otro);
        cola.mostrar();

    }
    public static void ordenarPaginasAscendente(ColaDeLibros cola){
        ColaDeLibros ordenado = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nroElem = cola.nroElementos();

        for(int i = 1; i <= nroElem; i++){

            Libro  libro = determinarLibroMenor(cola);

            while(!cola.esVacia()){
                Libro item = cola.eliminar();

                if(item.getPaginas() == libro.getPaginas()){
                    ordenado.adicionar(item);
                }
                else{
                    aux.adicionar(item);
                }
            }
            cola.vaciar(aux);
        }
        cola.vaciar(ordenado);
        cola.mostrar();
    }
}
