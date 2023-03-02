
import ejercicio.Math_utils;
import ejercicio.Student;

public class Main {

    public static void main(String[] args)
    {

//        Ejercicios eje1 = new Ejercicios();
//        eje1.mostrarMensaje();
//        eje1.numerosNaturales();
//        eje1.numerosPares();
//        eje1.numerosNaturalesWhile();


//        Math_utils mu = new Math_utils("GOOAPP", "2.9v", 2012);
//        mu.printApp();
//        mu.numerosNaturales(16);
//        mu.numerosPares(26);
//        mu.getExtensionFromCI("45123659LP");

        Student st = new Student("Pepito", "Pep", 25);

        //mostrar fulllname
        String nom = st.getFullName();
        System.out.println("Nombre: "+ nom);

        //cambiar fullname
        st.setFullname("Pepito1");
        String nom_cambiado = st.getFullName();
        System.out.println("Nombre cambiado: "+ nom_cambiado);


        //mostrar lastname
        String ap = st.getLastname();
        System.out.println("Apellido: "+ ap);

        //cambiar lastname
        st.setLastName("Pep1");
        String ap_cam = st.getLastname();
        System.out.println("Apellido cambiado: "+ ap_cam);



        //mostrar age
        int anio = st.getAge();
        System.out.println("Año: "+ anio);

        //cammbiar age
        st.setAge(30);
        int age_cam = st.getAge();
        System.out.println("Año cambiado: "+ age_cam);

    }

}