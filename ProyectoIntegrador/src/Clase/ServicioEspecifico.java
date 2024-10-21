
package Clase;


public class ServicioEspecifico extends Servicio{
    private String Nombre;
    private String tipoServicio;
    private Double precio;
    
    public ServicioEspecifico(){
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ServicioEspecifico(String Nombre, String tipoServicio, Double precio) {
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
    }

    public ServicioEspecifico(String Nombre, String tipoServicio, Double precio, String Servicio) {
        super(Servicio);
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
    }
    
    
    
    
}


