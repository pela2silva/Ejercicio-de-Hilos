
package org.proydesa.clases;

import java.io.Serializable;
import java.util.Objects;


public class Camiones implements Serializable{
    
    // CAMPOS

    private String idChofer;
    private String nombre;
    private int nroCamion;
    
    // CONSTRUCTORES
    
    public Camiones(String idChofer, String nombre, int nroCamion) {
        this.idChofer = idChofer;
        this.nombre = nombre;
        this.nroCamion = nroCamion;
    }

    // METODOS

    public String getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(String idChofer) {
        this.idChofer = idChofer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCamion() {
        return nroCamion;
    }

    public void setNroCamion(int nroCamion) {
        this.nroCamion = nroCamion;
    }

    // HASHCODE

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idChofer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camiones other = (Camiones) obj;
        return Objects.equals(this.idChofer, other.idChofer);
    }

    // IMPRIME

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(idChofer);
        sb.append("|");
        sb.append(nombre);
        sb.append("|");
        sb.append(nroCamion);
        return sb.toString();
    }

    

    
    
    
    
    
}
