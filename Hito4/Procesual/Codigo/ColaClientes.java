package Procesual_H4_COLAS;



public class ColaClientes {
    private int ini;
    private int fin;
    private int max;
    private Clientes[] cliente;
    public ColaClientes(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.cliente = new Clientes[this.max+1];
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
    public void adicionar(Clientes nuevoCliente){
        if(esLlena()){
            System.out.println("Cola de libro llena");
        }
        else{
            fin = fin+1;
            cliente[fin]= nuevoCliente;
        }
    }
    public Clientes eliminar(){
        Clientes clienteEliminado = null;

        if(esVacia()){
            System.out.println("Cola VACIA");
        }else{
            ini = ini+1;
            clienteEliminado = cliente[ini];
            if(ini == fin){
                ini=0;
                fin=0;
            }
        }
        return clienteEliminado;
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


    public void vaciar(ColaClientes cola){
        Clientes elemEliminado = null;
        while(!cola.esVacia()){
            elemEliminado = cola.eliminar();
            adicionar(elemEliminado);
        }
    }
    public void mostrar(){
        Clientes item=null;
        if(esVacia()){
            System.out.println("La cola de libro esta vacia, no hay ITEMS");
        }else
        {
            System.out.println("Mostrando los datos de la cola");
            ColaClientes aux = new ColaClientes();
            while(!esVacia()){
                item = eliminar();
                item.muestraCliente();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}
