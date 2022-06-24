
package org.proydesa.clases;

import java.util.Objects;


public class Transportes {
    
    // CAMPOS

    private String contenido;
    private String proveedor;
    private String idChofer;
    
    // CONSTRUCTORES

    public Transportes(String contenido, String proveedor, String idChofer) {
        this.contenido = contenido;
        this.proveedor = proveedor;
        this.idChofer = idChofer;
    }

    // METODOS

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(String idChofer) {
        this.idChofer = idChofer;
    }

    // HASHCODE

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idChofer);
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
        final Transportes other = (Transportes) obj;
        return Objects.equals(this.idChofer, other.idChofer);
    }

    // IMPRIME

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(contenido);
        sb.append("|");
        sb.append(proveedor);
        sb.append("|");
        sb.append(idChofer);
        return sb.toString();
    }

    
    
    
    
}
