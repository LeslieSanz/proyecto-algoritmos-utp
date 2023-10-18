
package RoundRobin;


public class Proceso {
    private String nombre;
    private int tiempo;
    private String estado;

    public Proceso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
