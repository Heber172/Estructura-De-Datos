package EvaluacionProcesual;

public class Main_P {
    public static void main(String[] args) {

//        //// PROVINCIA
//        Provincia prov = new Provincia();
//        prov.setNombre("Pacajes");
//        prov.mostrarProvincia();
//



//        Departamento dep = new Departamento();
//
//        dep.setNombreDep("La Paz");
//
//        Provincia[] cantidad = new Provincia[2];
//        cantidad[0] = new Provincia();
//        cantidad[1] = new Provincia();
//
//        cantidad[0].setNombre("Pacajes");
//        cantidad[1].setNombre("Murillo");
//
//        dep.setNroProvincia(cantidad);
//        dep.mostrarDepartamento(0);
//
//
//









        /////PAIS
//
//        Pais pa = new Pais();
//        pa.setNombre("Bolivia");





        ///////Mostrar Pais con 3 departamentos y 2 provincias

        int cantPais = 1, cantDepa = 3, cantProv = 2, contador = 0;


        Pais pa = new Pais();
        Departamento dep = new Departamento();

        pa.setNombre("Bolivia");
        pa.setNroDepartamento(3);

        System.out.println("Pais: "+pa.getNombre());
        System.out.print("");
        System.out.println("Cantidad de Provincias: "+ pa.getNroDepartamento());
        System.out.println();


            for(int i = 0; i < cantDepa; i++) {

                switch (i) {

                    case 0:
                        pa.agregarDepartamento("La Paz");
                        dep.agregarProvincia("Pacajes");
                        dep.agregarProvincia("Murillo");

                        pa.muestraPais(i);
                        dep.mostrarDepartamento(contador);
                        System.out.println("");
                        break;
                    case 1:
                        pa.agregarDepartamento("Oruro");
                        dep.agregarProvincia("PROV_OR1");
                        dep.agregarProvincia("PROV_OR2");


                        pa.muestraPais(i);
                        dep.mostrarDepartamento(contador);
                        System.out.println();
                        break;
                    case 2:
                        pa.agregarDepartamento("Santa Cruz");
                        dep.agregarProvincia("PROV_SCZ1");
                        dep.agregarProvincia("PROV_SCZ2");


                        pa.muestraPais(i);
                        dep.mostrarDepartamento(contador);
                        System.out.println();
                        break;
                }
                contador = contador + cantProv;

            }






    }
}
