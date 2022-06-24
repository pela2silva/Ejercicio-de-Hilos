
package org.proydesa.test;

import java.util.ArrayList;
import java.util.List;
import org.proydesa.clases.Camiones;
import org.proydesa.clases.MetodoEscritura;
import static org.proydesa.clases.MetodoEscritura.cargarOpcion;
import org.proydesa.clases.MetodoLectura;
import org.proydesa.clases.Transportes;


public class testEjecuciones {
    
    public static void main(String[] args) {
        
        List<Transportes> trasportes=new ArrayList<>();
        
        trasportes.add(new Transportes("Gaseosas","Pepsi","A787SFD"));
        trasportes.add(new Transportes("Bebidas","Branca","B89SDDS7"));
        trasportes.add(new Transportes("Snacks","Lays","C7G7SF5"));
        trasportes.add(new Transportes("Cigarrillos","Masamin","G7G7HFD"));
        trasportes.add(new Transportes("Papel Higienico","Campanita","ABCDE789"));
        trasportes.add(new Transportes("Fideos","Matarazzo","ZZZ2590"));
        
        List<Camiones> camiones=new ArrayList<>();
        
        camiones.add(new Camiones("AFS76A","Marcos",1));
        camiones.add(new Camiones("BFSF6A","Martin",2));
        camiones.add(new Camiones("CFS76G","Matias",3));
        camiones.add(new Camiones("PFB76A","Mariano",4));
        camiones.add(new Camiones("A4564G","Marcelo",5));
        camiones.add(new Camiones("XXX5028","ALE",6));
        camiones.add(new Camiones("yyyy4252","CORINA",7));
     
        MetodoEscritura hiloUno = new MetodoEscritura();
        MetodoEscritura hiloDos = new MetodoEscritura();
        MetodoLectura hiloTres = new MetodoLectura();
        MetodoLectura hiloCuatro = new MetodoLectura();

        System.out.println("  ## TABLERO ##");
        System.out.println("1 - Carga Camiones");
        System.out.println("2 - Carga Transportes");
        System.out.println("3 - Lectura de Camiones");
        System.out.println("4 - Lectura de Transportes");
        System.out.println("");
        int opcion = cargarOpcion("INGRESE UNA OPCION: ");
         
        switch (opcion){
            case 1:
                hiloUno.setOpcion(opcion);
                hiloUno.cargarCamion("Ingrese el nombre del archivo de Camiones: " + "\n");
                System.out.println("------------------------");
                hiloUno.setCamion(camiones);
                hiloUno.run();
                break;
            case 2:
                hiloDos.setOpcion(opcion);
                hiloDos.cargarTransporte("Ingrese el nombre del archivo de Transportes: " + "\n");
                System.out.println("------------------------");
                hiloDos.setTransportes(trasportes);
                hiloDos.run();
                break;
            case 3:
                hiloTres.setOpcion(opcion);
                hiloTres.cargarCamion("Ingrese el nombre del archivo de Camiones a leer: " + "\n");
                System.out.println("------------------------");
                hiloTres.getCamion();
                hiloTres.run();
                break;
            case 4:
                hiloCuatro.setOpcion(opcion);
                hiloCuatro.cargarTransporte("Ingrese el nombre del archivo de Transportes a leer: ");
                System.out.println("------------------------");
                hiloCuatro.getTransportes();
                hiloCuatro.run();
                break;
                default: System.out.println("La opcion ingresada es incorrecta");
        } // Fin del swuich
    } // Fin de la main
} // Fin de la clase
