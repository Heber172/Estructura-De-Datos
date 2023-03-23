package Manejo_de_pilas;

public class Main1 {
    public static void main(String[] args) {
        String[] nombresEDD = new String[5];
        nombresEDD[0]="Ana";
        nombresEDD[1]="Juan";
        nombresEDD[2]="Pepito";
        nombresEDD[3]="Carla";
        nombresEDD[4]="Freddy";

        Nombres  edd = new Nombres("EDD", nombresEDD);

        //crear un metodo estatico que determine cuantas personas del paralelo EDD tienen el nombre Pepito
        int c = cuentaNombres(edd, "Pepito");

//        System.out.println("Cantidad: "+ c);
//
//         agregarNombre(edd, "Delia");
        agregarNombreFinal(edd, "JUan");
        edd.mostrar();

    }
    public static int cuentaNombres(Nombres edd, String nombreBuscar)
    {
        String[] nombre1 = edd.getNombres();
        int contador = 0;
        for (int i =0; i < nombre1.length; i++)
        {
            if(nombre1[i] == nombreBuscar)
            {
                contador++;
            }
        }
        return contador;
    }
    public static void agregarNombre(Nombres Edd, String nom)
    {
        String[] nombress = Edd.getNombres();
        String[] nuevo = new String[nombress.length +1];

        nuevo[0]=nom;
        for(int i = 0; i < nombress.length;i++)
        {
            nuevo[i+1]=nombress[i];

        }
        Edd.setNombres(nuevo);
    }
    public static void agregarNombreFinal(Nombres Edd, String nom)
    {
        String[] nombress = Edd.getNombres();
        String[] nuevo = new String[nombress.length +1];
//      nuevo[5]=nom;
        for(int i = 0; i < nombress.length;i++)
        {
            nuevo[i]=nombress[i];

        }
        nuevo[nombress.length ]= nom;
        Edd.setNombres(nuevo);
    }

}
