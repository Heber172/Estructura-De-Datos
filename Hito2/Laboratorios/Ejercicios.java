package ejercicio;

public class Ejercicios
{
    private int i;
    private int limite;

    public Ejercicios()
    {
        this.i = 1;
        this.limite = 10;
    }

    public void mostrarMensaje()
    {
        System.out.println("Hola mundo");
        System.out.println("");
    }
    public void numerosNaturales()
    {
        System.out.println("Numeros Naturales");
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Numero: "+ i);
        }
        System.out.println("");
    }
    public void numerosPares()
    {
        System.out.println("Numeros Pares");
        for(int i = 1; i<=10; i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i+ ", ");
            }
        }
        System.out.println("");
    }
    public void numerosNaturalesWhile()
    {

        System.out.println("Numeros Naturales WHILE");
        int n = 1;
        while(n <= 5)
        {
            System.out.print(n + ", ");
            n++;
        }
    }
}
