
package Clase;

public class Cliente extends Persona{
    private String CodigoCliente;
    private String NombreCliente;
    private String ApellidosCliente;
    private int EdadCliente;
    private String sexoCliente;
    private int Celular;
    private boolean Discapacitado;
    private String DetalleDiscapacidad;
    
    public Cliente(){
    
    }

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidosCliente() {
        return ApellidosCliente;
    }

    public void setApellidosCliente(String ApellidosCliente) {
        this.ApellidosCliente = ApellidosCliente;
    }

    public int getEdadCliente() {
        return EdadCliente;
    }

    public void setEdadCliente(int EdadCliente) {
        this.EdadCliente = EdadCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public boolean isDiscapacitado() {
        return Discapacitado;
    }

    public void setDiscapacitado(boolean Discapacitado) {
        this.Discapacitado = Discapacitado;
    }

    public String getDetalleDiscapacidad() {
        return DetalleDiscapacidad;
    }

    public void setDetalleDiscapacidad(String DetalleDiscapacidad) {
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, String NombreCliente, String ApellidosCliente, int EdadCliente, String sexoCliente, int Celular, boolean Discapacitado, String DetalleDiscapacidad) {
        this.CodigoCliente = CodigoCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidosCliente = ApellidosCliente;
        this.EdadCliente = EdadCliente;
        this.sexoCliente = sexoCliente;
        this.Celular = Celular;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }
    
    
    
    
    
    
    
    
}
