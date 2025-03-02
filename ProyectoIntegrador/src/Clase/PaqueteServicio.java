
package Clase;

import java.util.ArrayList;

public class PaqueteServicio {
    private String codigoPaquete;
    private int cantidadServicios;
    private Cliente cliente;       
    private ArrayList<ServicioSolicitado> servicios;
    
    public PaqueteServicio(){
    
    }

    
    public PaqueteServicio(String codigoPaquete, int cantidadServicios, Cliente cliente, ArrayList<ServicioSolicitado> servicios) {
        this.codigoPaquete = codigoPaquete;
        this.cantidadServicios = cantidadServicios;
        this.cliente = cliente;
        this.servicios = servicios;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ServicioSolicitado> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<ServicioSolicitado> servicios) {
        this.servicios = servicios;
    }
    
    
    
}
