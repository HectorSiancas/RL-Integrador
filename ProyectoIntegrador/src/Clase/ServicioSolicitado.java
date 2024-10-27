
package Clase;

import java.util.ArrayList;

public class ServicioSolicitado {
    private String Nombre;
    private String tipoServicio;
    private String horaInicio;
    private String horaTermino;
    private String CodigoServicio;
    private double Precio;
    private AmbienteReservado ambiente;
    private Terapeuta terapeuta;

    public Terapeuta getTerapeuta()
    {
        return terapeuta;
    }

    public void setTerapeuta(Terapeuta terapeuta)
    {
        this.terapeuta = terapeuta;
    }

    public ServicioSolicitado(String Nombre, String tipoServicio, String horaInicio, String horaTermino, String CodigoServicio, double Precio, AmbienteReservado ambiente, Terapeuta terapeuta)
    {
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.CodigoServicio = CodigoServicio;
        this.Precio = Precio;
        this.ambiente = ambiente;
        this.terapeuta = terapeuta;
    }
    
    
    
    
    
    public ServicioSolicitado() {
    }

    public ServicioSolicitado(String Nombre, String tipoServicio, String horaInicio, String horaTermino, String CodigoServicio, double Precio, AmbienteReservado ambiente) {
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.CodigoServicio = CodigoServicio;
        this.Precio = Precio;
        this.ambiente = ambiente;
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

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
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

    public AmbienteReservado getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(AmbienteReservado ambiente) {
        this.ambiente = ambiente;
    }
    
    
  

            
    
    
    
    
    
}
