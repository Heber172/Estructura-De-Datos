package ejercicio;

public class Math_utils
{
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP, String version, int year)
    {
        this.nameAPP = nameAPP;
        this.version = version;
        this.year = year;
    }
    public void printApp()
    {
        System.out.println(this.nameAPP + " - " + this.version + " - " + this.year);
        System.out.println();
    }
    public void numerosNaturales(int limite)
    {
        for(int i = 1; i<=limite; i++)
        {
            System.out.println( i);
        }
        System.out.println("");
    }
    public void numerosPares(int limite)
    {
        for(int i = 1; i<=limite; i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i+ ", ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
    public void getExtensionFromCI(String ci)
    {


    }
}
