package PilaDeClientes;

import java.util.Objects;

public class MainCliente {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Adrian", "Condori", 18, "Plaza Murillo", "Masculino");
        Clientes cliente2 = new Clientes("Matias", "Chambi", 32, "Calle 2", "Masculino");
        Clientes cliente3 = new Clientes("Helen", "Rodriguez", 46, "Calle Gregorio Lanza", "Femenino");
        Clientes cliente4 = new Clientes("Daniela", "Leuca", 20, "Calle Linares", "Femenino");
        Clientes cliente5 = new Clientes("Kevin", "Gonzales", 29, "Av. Juan Pablo II", "Masculino");


        PilaClientes pila = new PilaClientes();
        pila.adicionar(cliente1);
        pila.adicionar(cliente2);
        pila.adicionar(cliente3);
        pila.adicionar(cliente4);
        pila.adicionar(cliente5);

//        pila.mostrar();

//        mayoresCiertaEdad(pila, 25);

//        kEsimoPosicion(pila, 2);
//        pila.mostrar();
//
//        asignaDireccion(pila, "Calle 7");
//        pila.mostrar();


        reordenaPila(pila);
        pila.mostrar();

    }
    public static void mayoresCiertaEdad(PilaClientes pila, int edad){
        PilaClientes aux = new PilaClientes();

        Clientes itemCliente = null;
        int cont = 0;

        while (!pila.esVacio()){
            itemCliente = pila.eliminar();

            if(itemCliente.getEdad() > edad){
                cont++;
            }

            aux.adicionar(itemCliente);
        }
        pila.vaciar(aux);
        System.out.println("Existen "+cont+" clientes con edad mayor a "+edad);
    }
    public static void kEsimoPosicion(PilaClientes pila, int posicion){
        PilaClientes aux = new PilaClientes();
        Clientes itemCliente = null;
        Clientes saveCl = null;

        while (!pila.esVacio()){
            itemCliente = pila.eliminar();
            if(pila.nroElem()+1 == posicion){
                saveCl = itemCliente;
            }else {
                aux.adicionar(itemCliente);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(saveCl);
    }
    public static void asignaDireccion(PilaClientes pila, String nuevaDireccion){
        PilaClientes aux = new PilaClientes();

        Clientes itemCliente = null;
        while (!pila.esVacio()){
            itemCliente = pila.eliminar();

            if(itemCliente.getGenero().equals("Femenino")){
                itemCliente.setDireccion(nuevaDireccion);
                aux.adicionar(itemCliente);
            }
            else {
                aux.adicionar(itemCliente);
            }
        }
        pila.vaciar(aux);

    }
    public static void reordenaPila(PilaClientes pila){
        PilaClientes auxGenMas = new PilaClientes();
        PilaClientes auxGenFem = new PilaClientes();

        Clientes item = null;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getGenero().equals("Masculino")){
                auxGenMas.adicionar(item);

            }else{
                auxGenFem.adicionar(item);
            }
        }
        pila.vaciar(auxGenMas);
        pila.vaciar(auxGenFem);
    }
}
