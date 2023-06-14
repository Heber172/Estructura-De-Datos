package Procesual_H4_COLAS;

import ColaDeCliente_H4.Cliente;

public class Main_Colas_Clientes {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("David", "Mendoza", 25,"Bolivia", "Masculino", "Silver");
        Clientes clientes2 = new Clientes("Camila", "Apaza", 30,"Peru", "Femenino", "Gold");
        Clientes cliente3 = new Clientes("Carlos", "Mamani", 65,"Bolivia", "Masculino", "Gold");
        Clientes clientes4= new Clientes("Saul", "Quispe", 75,"Bolivia", "Masculino", "Gold");
        Clientes cliente5 = new Clientes("Fernan", "Flores", 25, "Chile", "Masculino", "Premium");


        ColaClientes cola = new ColaClientes();
        cola.adicionar(cliente1);
        cola.adicionar(clientes2);
        cola.adicionar(cliente3);
        cola.adicionar(clientes4);
        cola.adicionar(cliente5);


        Clientes clienteB = new Clientes("Bernardo", "Mendoza", 25,"Bolivia", "Masculino", "Silver");
        Clientes clientes2B = new Clientes("Daniela", "Apaza", 30,"Peru", "Femenino", "Gold");
        Clientes cliente3B = new Clientes("Saul", "Mamani", 65,"Bolivia", "Masculino", "Gold");
        Clientes clientes4B= new Clientes("German", "Quispe", 75,"Bolivia", "Masculino", "Gold");
        Clientes cliente5B = new Clientes("Frank", "Flores", 25, "Chile", "Masculino", "Premium");

        ColaClientes colaB = new ColaClientes();
        colaB.adicionar(clienteB);
        colaB.adicionar(clientes2B);
        colaB.adicionar(cliente3B);
        colaB.adicionar(clientes4B);
        colaB.adicionar(cliente5B);

//        colaB.mostrar();

//        cambiarTipoCLiente(cola, "Bolivia", "Gold");
//        moverCliente60anios(cola, 60);
        moverCliente(cola, colaB,"Saul");
//        cola.mostrar();
    }
    public static void cambiarTipoCLiente(ColaClientes cola, String pais, String tipo){
//        ColaClientes aux = new ColaClientes();
        Clientes item = null;
        int nroItem = cola.nroElementos();

        for(int i = 1; i <= nroItem; i++){
            item = cola.eliminar();

            if(item.getTipo().equals(tipo) && item.getPais().equals(pais)){
                item.setTipo("VIP");
            }

            cola.adicionar(item);

        }


//        while(!cola.esVacia()){
//            item = cola.eliminar();
//
//            if(item.getPais().equals(pais) && item.getTipo().equals(tipo)){
//                item.setTipo("VIP");
//            }
//            aux.adicionar(item);
//        }
//        cola.vaciar(aux);
        cola.mostrar();
    }
    public static void moverCliente60anios(ColaClientes cola, int edad){
        ColaClientes aux = new ColaClientes();
        ColaClientes clienteEdad = new ColaClientes();

        Clientes item = null;

        while(!cola.esVacia()){
            item = cola.eliminar();

            if(item.getEdad() > edad){
                clienteEdad.adicionar(item);
            }
            else{
                aux.adicionar(item);

            }
        }
        cola.vaciar(clienteEdad);
        cola.vaciar(aux);

        cola.mostrar();
    }
    public static void moverCliente(ColaClientes colaA,ColaClientes colaB ,String nombre){
//        ColaClientes auxA = new ColaClientes();
        ColaClientes auxB = new ColaClientes();
        ColaClientes nombreCliente = new ColaClientes();
        int nroElemA = colaA.nroElementos();
        int nroElemB = colaB.nroElementos();

        Clientes itemA = null, itemB = null;

       for(int i = 1; i<=nroElemA; i++){
           itemA = colaA.eliminar();
           if(itemA.getNombre().equals(nombre)){
               nombreCliente.adicionar(itemA);
           }else {
               colaA.adicionar(itemA);
           }
       }

        for(int J = 1; J<=nroElemB; J++){
            itemB = colaB.eliminar();
            if(itemB.getNombre().equals(nombre)){
                nombreCliente.adicionar(itemB);
            }else {
                auxB.adicionar(itemB);
            }
        }

        colaB.vaciar(nombreCliente);
        colaB.vaciar(auxB);
        System.out.println("COLA DE CLIENTES A");
        colaA.mostrar();
        System.out.println();
        System.out.println("COLA DE CLIENTES B");

        colaB.mostrar();

    }
}
