
package org.proydesa.clases;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodoLectura extends Thread {
    
    // CAMPOS
    
    private List<Camiones> camion;
    private List<Transportes> transportes;
    private int opcion;
    private String rutaC, rutaT;
    
    public String getRutaC() {
        return rutaC;
    }

    public void setRutaC(String rutaC) {
        this.rutaC = rutaC;
    }

    public String getRutaT() {
        return rutaT;
    }

    // METODOS
    public void setRutaT(String rutaT) {    
        this.rutaT = rutaT;
    }

    public List<Camiones> getCamion() {
        return camion;
    }

    public void setCamion(List<Camiones> camion) {
        this.camion = camion;
    }

    public List<Transportes> getTransportes() {
        return transportes;
    }

    public void setTransportes(List<Transportes> transportes) {
        this.transportes = transportes;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void lecturaCamionesDat (String direccion){
    
        // Achivo .dat para camiones
    
        try {
        FileInputStream fi = new FileInputStream (direccion);
        ObjectInputStream oi = new ObjectInputStream (fi);
        
        List<Camiones> lista = (List<Camiones>) oi.readObject();
        lista.forEach(System.out::println);
        
        oi.close();
        fi.close();
            
        } catch (IOException e) {
            System.out.println("Error de lectura");
            e.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
                System.out.println("Error de tipo clase");
                ex.printStackTrace(System.out);
            }
    } // Fin metodo lcturaCamionesDat
    
// METODO PARA CARGAR RUTAS
    
    public void cargarCamion(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        String retorno = sn.nextLine();
        this.rutaC = retorno;
    }

    public void lecturaTransportesTxt (String direccion){
        
              try {
            FileReader lector = new FileReader(direccion);
            BufferedReader bf = new BufferedReader(lector);
            
            String linea =bf.readLine();
            
            while(linea != null){
                System.out.println(linea);
                linea = bf.readLine();
            }
            bf.close();
            lector.close();
        } catch (IOException ex) {
            System.out.println("Error de lectura");
            ex.printStackTrace(System.out);
        }
    } // Fin metodo lecturaTransportesTxt 
    
    
    // METODO PARA CARGAR RUTAS
    
    public void cargarTransporte(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        String retorno = sn.nextLine();
        this.rutaT = retorno;
    }
    
    // METODO OVERRIDE RUN()
    
    @Override
    public void run(){
        
        switch(this.opcion){
            case 3:
                lecturaCamionesDat(rutaC);
                //System.out.println("Se escribieron los datos de los Camioneros");
                break;
            case 4:
                lecturaTransportesTxt(rutaT);
                //System.out.println("Se escribieron los registros de las cargas de los Transportes");
                break;
            default:
                System.out.println("Se ingreso una opcion erronea !");                
        }
    } // Fin run


    
} // Fin clase MetodoLectura
