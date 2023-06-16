package defensa_colas_hito4;


public class ColaDeClientes {
    private int ini;
    private int fin;
    private int max;
    private Cliente[] cliente;
    public ColaDeClientes(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.cliente = new Cliente[this.max+1];
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
    public void adicionar(Cliente nuevoCliente){
        if(esLlena()){
            System.out.println("Cola de libro llena");
        }
        else{
            fin = fin+1;
            cliente[fin]= nuevoCliente;
        }
    }
    public Cliente eliminar(){
        Cliente clienteEliminado = null;

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


    public void vaciar(ColaDeClientes cola){
        Cliente elemEliminado = null;
        while(!cola.esVacia()){
            elemEliminado = cola.eliminar();
            adicionar(elemEliminado);
        }
    }
    public void mostrar(){
        Cliente item=null;
        if(esVacia()){
            System.out.println("La cola de libro esta vacia, no hay ITEMS");
        }else
        {
            System.out.println("Mostrando los datos de la cola");
            ColaDeClientes aux = new ColaDeClientes();
            while(!esVacia()){
                item = eliminar();
                item.muestraCliente();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}
