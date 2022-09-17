package Beans;

public class Herramientas {

    private int id;
    private String nombre;
    private String tipo;
    private int cantidad;
    private boolean novedad;

    public Herramientas(int id, String nombre, String tipo, int cantidad, boolean novedad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Herramientas{" + "id=" + id + ", nombre =" + nombre + ", tipo=" + tipo + ",  cantidad =" + cantidad + ", novedad=" + novedad + '}';
    }
}
