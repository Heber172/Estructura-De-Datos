package PilaDeClientes;

public class PilaClientes {
    private int max;     //cantidad maxima
    private int tope;    //elementos
    private Clientes[] cliente;

    public PilaClientes()
    {
        this.max=10;
        this.tope=0;
        this.cliente = new Clientes [this.max+1];
    }
    public boolean esVacio()
    {
        if(this.tope==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public boolean esLleno()
    {
        if(tope==max){
            return true;
        }else{
            return false;
        }

    }
    public int nroElem()
    {
        return this.tope;
    }
    public void adicionar(Clientes nuevoCliente)
    {
        if(esLleno()==true){
            System.out.println("PILA DE CLIENTES LLENA");
        }else{
            tope=tope+1;
            cliente[tope] = nuevoCliente;
        }
    }
    public Clientes eliminar()
    {
        Clientes clienteEliminado = null;

        if(!this.esVacio()){
            clienteEliminado = cliente[tope];
            tope=tope-1;
        }else{

            System.out.println("PILA DE CLIENTES VACIA");
        }
        return clienteEliminado;
    }

    public  void llenar(int nroItems)
    {
//        Scanner leer = new Scanner(System.in);
//        String nombre = "";
//
//        System.out.println("Llenando la Pila de Nombres (cadenas)");
//
//        for(int i =0 ; i < nroItems; i++){
//            System.out.print("Ingrese el nombre: "+ (i+1)+": ");
//            nombre = leer.nextLine();
//            adicionar(nombre);
//
//            System.out.println();
//        }
    }
    public void mostrar()
    {
        Clientes clienteMos = null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila De Clientes: ");
            PilaClientes aux=new PilaClientes();
            while(!esVacio()){
                clienteMos = eliminar();
                aux.adicionar(clienteMos);
                clienteMos.muestraCliente();
            }
            vaciar(aux);
        }


    }
    public void vaciar(PilaClientes pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
