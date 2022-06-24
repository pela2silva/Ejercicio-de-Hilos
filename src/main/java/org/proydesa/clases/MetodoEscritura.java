
package org.proydesa.clases;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MetodoEscritura extends Thread {
    
    // CAMPOS
    
    private List<Camiones> camion;
    private List<Transportes> transportes;
    private int opcion;
    private String rutaC, rutaT;
    
    // METODOS

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

    public String getRutaC() {
        return rutaC;
    }

    public void setRutaC(String rutaC) {
        this.rutaC = rutaC;
    }

    public String getRutaT() {
        return rutaT;
    }

    public void setRutaT(String rutaT) {
        this.rutaT = rutaT;
    }

    public void escribirCamionesDat (){
    
        // Achivo .dat para camiones
        
        try {
            
            FileOutputStream fo = new FileOutputStream(this.rutaC);
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            oo.writeObject(this.camion);
           
            System.out.println("Se creo el archivo .dat");
            
            oo.close();
            fo.close();
        } catch (IOException e) {
            System.out.println("Error de escritura en al archivo .dat");
        e.printStackTrace(System.out);
        }
    } // Fin metodo escribirCamionesDat
    
    public void escribirTransportesTxt (){
        
        // Achivo .txt
        
        List<String> escritura = this.transportes.stream().map(x->x.toString()+"\n").collect(Collectors.toList());
        
        try {
        
            FileWriter fw = new FileWriter(this.rutaT, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (String e : escritura) {
                bw.write(e);
            }
            System.out.println("Se creo el archivo .txt");
            bw.close();
            fw.close();
    
        } catch (IOException e) {
            System.out.println("Error de escritura en el archivo .txt");
            e.printStackTrace(System.out);
        }
    } // Fin del metodo escribirTransporteTxt


    // METODO PARA CARGAR RUTAS
    
    public void cargarCamion(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        String retorno = sn.nextLine();
        this.rutaC = retorno;
    }
    
    public void cargarTransporte(String texto){
        Scanner sn = new Scanner(System.in);
        System.out.println(texto);
        String retorno = sn.nextLine();
        this.rutaT = retorno;
    }

    public static int cargarOpcion (String texto){
        Scanner sn = new Scanner (System.in);
        System.out.println(texto);
        int retorno = sn.nextInt();
        return retorno;
    }
    
    
    
    // METODO OVERRIDE RUN()
    
    @Override
    public void run(){
        
        switch(this.opcion){
            case 1:
                escribirCamionesDat();
                System.out.println("Se escribieron los datos de los Camioneros");
                break;
            case 2:
                escribirTransportesTxt();
                System.out.println("Se escribieron los registros de las cargas de los Transportes");
                break;
            default:
                System.out.println("Se ingreso una opcion erronea !");                
        }
    } // Fin run
    
    
    

} // Fin clase metodoEscritura
