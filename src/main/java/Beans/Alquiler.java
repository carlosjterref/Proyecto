
package Beans;

import java.util.Date;


public class Alquiler {
     private int id;
    private String username;
    private Date fechaAlquiler;
    private boolean novedad;
    private String tipo;
    

    public Alquiler(int id, String username, Date fechaAlquiler, boolean novedad, String tipo) {
        this.id = id;
        this.username = username;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.tipo = tipo;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

   public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fechaAlquiler=" + fechaAlquiler + ", novedad=" + novedad + ", tipo=" + tipo + '}';
    }
    
}
