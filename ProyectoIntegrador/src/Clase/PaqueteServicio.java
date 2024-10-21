
package Clase;

import java.util.ArrayList;

public class PaqueteServicio {
    private String codigoPaquete;
    private int cantidadServicios;
    private Cliente cliente;       
    private ArrayList<Servicio> servicios;
    
    public PaqueteServicio(){
    
    }

    public PaqueteServicio(String codigoPaquete, int cantidadServicios, Cliente cliente, ArrayList<Servicio> servicios) {
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

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    
    
}
