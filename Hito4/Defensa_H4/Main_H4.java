package defensa_colas_hito4;


import Procesual_H4_COLAS.ColaClientes;

public class Main_H4 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("David", "Mendoza", 25,"Bolivia", "Masculino", "Silver", 13409156);
        Cliente clientes2 = new Cliente("Camila", "Masnani", 30,"Peru", "Femenino", "Gold",45120036);
        Cliente cliente3 = new Cliente("Carlos", "Mamani", 65,"Bolivia", "Masculino", "Gold",124598363);
        Cliente clientes4= new Cliente("Saul", "Quispe", 75,"Bolivia", "Masculino", "Gold",123456879);
        Cliente cliente5 = new Cliente("Fernan", "Mamani", 25, "Chile", "Masculino", "Silver",15987400);

        ColaDeClientes cola = new ColaDeClientes();
        cola.adicionar(cliente1);
        cola.adicionar(clientes2);
        cola.adicionar(cliente3);
        cola.adicionar(clientes4);
        cola.adicionar(cliente5);


//        cola.mostrar();
//        convertirTipoDeClienteaVIP(cola, "Gold");
//        moverAlInicio(cola, 60);
        int[] id = new int[10];
        id[0]= 123456879;
        id[1]= 15987400;

        eliminarCliente(cola, id);

        cola.mostrar();
    }
    public static void convertirTipoDeClienteaVIP(ColaDeClientes cola, String tipoDeCliente){
        Cliente item = null;

        for(int i = 1; i <= cola.nroElementos(); i++){
            item = cola.eliminar();

            if(item.getTipo().equals(tipoDeCliente) && item.getApellido().endsWith("ni") && item.getApellido().startsWith("M")){
                item.setTipo("VIP");
            }

            cola.adicionar(item);
        }
        cola.mostrar();

    }
    public static void moverAlInicio(ColaDeClientes cola, int edad){
        ColaDeClientes Aux = new ColaDeClientes();
        int nroElementos = cola.nroElementos();
        Cliente item = null;

        for (int i = 0; i < nroElementos; i++){
             item = cola.eliminar();

            if (item.getEdad()>edad){
                cola.adicionar(item);
            }else {
                Aux.adicionar(item);
            }

        }
        cola.vaciar(Aux);

        cola.mostrar();
    }
    public static void eliminarCliente(ColaDeClientes cola, int[] idCliente ){
        ColaDeClientes aux = new ColaDeClientes();

        Cliente item = null;

        while(!cola.esVacia()){
            item = cola.eliminar();

            if(item.getId() != idCliente[0] && item.getId() !=  idCliente[1]){
                aux.adicionar(item);
            }
        }
        cola.vaciar(aux);
    }


}
