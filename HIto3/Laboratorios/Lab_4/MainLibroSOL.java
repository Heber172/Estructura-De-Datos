package PilaLibro;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Homero", 500, 30.00, "La Odisea", "Historia");
        Libro libro2 = new Libro("Gabriel García Márquez", 400, 95.00, "Cien años de soledad", "Ficción");
        Libro libro3 = new Libro("Stephen Hawking", 300, 150.00, "Historia del tiempo", "Ciencia");
        Libro libro4 = new Libro("Jane Austen", 600, 150.00, "Orgullo y prejuicio", "Ficción");
        Libro libro5 = new Libro("Friedrich Nietzsche", 200, 150.00, "Así habló Zaratustra", "Filosofía");


        PilaDeLibros pila = new PilaDeLibros();
        pila.adicionar(libro1);
        pila.adicionar(libro2);
        pila.adicionar(libro3);
        pila.adicionar(libro4);
        pila.adicionar(libro5);

        Libro libro6 = new Libro("J.R.R. Tolkien", 450, 190.00, "El señor de los anillos", "Fantasía");
        Libro libro7 = new Libro("Ernest Hemingway", 350, 62.00, "El viejo y el mar", "Ficción");
        Libro libro8 = new Libro("Miguel de Cervantes", 550, 82.00, "Don Quijote de la Mancha", "Novela");
        Libro libro9 = new Libro("Agatha Christie", 250, 88.00, "Asesinato en el Expreso de Oriente", "Misterio");
        Libro libro10 = new Libro("Gustavo Adolfo Bécquer", 150, 104.00, "Rimas y Leyendas", "Poesía");


        PilaDeLibros pilaB = new PilaDeLibros();
        pilaB.adicionar(libro6);
        pilaB.adicionar(libro7);
        pilaB.adicionar(libro8);
        pilaB.adicionar(libro9);
        pilaB.adicionar(libro10);


//        pila.mostrar();
//        pilaB.mostrar();


        cambiar(pila, pilaB);
        System.out.println("Libros 1");
        pila.mostrar();
        System.out.println("Libros 2");
        pilaB.mostrar();
    }
    public static void cambiar(PilaDeLibros pilaA, PilaDeLibros pilaB){
        PilaDeLibros auxA = new PilaDeLibros();
        PilaDeLibros auxB = new PilaDeLibros();

        double precioA = PrecioMayor(pilaA);
        double precioB = PrecioMayor(pilaB);

        Libro libroA = null, libroB = null;

        while (!pilaA.esVacio()) {
            libroA = pilaA.eliminar();
            if (libroA.getPrecio() == precioA) {

                while (!pilaB.esVacio()) {
                    libroB = pilaB.eliminar();

                    if (libroB.getPrecio() == precioB) {
                        auxA.adicionar(libroB);
                        auxB.adicionar(libroA);
                    } else {
                        auxB.adicionar(libroB);
                    }
                }
            }
           else{
                auxA.adicionar(libroA);
            }
        }

        pilaA.vaciar(auxA);
        pilaB.vaciar(auxB);
    }
    public static Double  PrecioMayor(PilaDeLibros lib){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        double mayor = 0;
        while (!lib.esVacio()){
            item = lib.eliminar();
            if(item.getPrecio() > mayor){
                mayor = item.getPrecio();
            }
            aux.adicionar(item);
        }
        lib.vaciar(aux);
        return mayor;
    }
}
