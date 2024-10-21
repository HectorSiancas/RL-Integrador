
package Clase;

public class ServicioSolicitado extends Servicio {
    private String Nombre;
    private String CodigoServicio;
    private double Precio;
    private String CodigoAmbiente;
    
    public ServicioSolicitado(){
    
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigoServicio() {
        return CodigoServicio;
    }

    public void setCodigoServicio(String CodigoServicio) {
        this.CodigoServicio = CodigoServicio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getCodigoAmbiente() {
        return CodigoAmbiente;
    }

    public void setCodigoAmbiente(String CodigoAmbiente) {
        this.CodigoAmbiente = CodigoAmbiente;
    }

    public ServicioSolicitado(String Nombre, String CodigoServicio, double Precio, String CodigoAmbiente) {
        this.Nombre = Nombre;
        this.CodigoServicio = CodigoServicio;
        this.Precio = Precio;
        this.CodigoAmbiente = CodigoAmbiente;
    }
    
    
            
    
    
    
    
    
}
