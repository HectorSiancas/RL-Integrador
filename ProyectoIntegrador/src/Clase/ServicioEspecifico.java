
package Clase;

import java.util.ArrayList;


public class ServicioEspecifico{
    private String Nombre;
    private String tipoServicio;
    private Double precio;
    
    private ArrayList<Insumo_Usado> insumo_usado;

    public ArrayList<Insumo_Usado> getInsumo_usado()
    {
        return insumo_usado;
    }

    public void setInsumo_usado(ArrayList<Insumo_Usado> insumo_usado)
    {
        this.insumo_usado = insumo_usado;
    }

    public ServicioEspecifico(String Nombre, String tipoServicio, Double precio, ArrayList<Insumo_Usado> insumo_usado)
    {
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
        this.insumo_usado = insumo_usado;
    }
    
    
    
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
        
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
    }
    
    
    
    
}


