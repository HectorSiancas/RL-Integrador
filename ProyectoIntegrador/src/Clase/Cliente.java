
package Clase;

public class Cliente extends Persona{
    private String CodigoCliente;
    private boolean Discapacitado;
    private String DetalleDiscapacidad;
    
    public Cliente(){
    
    }

    public String getCodigoCliente()
    {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente)
    {
        this.CodigoCliente = CodigoCliente;
    }

    public boolean isDiscapacitado()
    {
        return Discapacitado;
    }

    public void setDiscapacitado(boolean Discapacitado)
    {
        this.Discapacitado = Discapacitado;
    }

    public String getDetalleDiscapacidad()
    {
        return DetalleDiscapacidad;
    }

    public void setDetalleDiscapacidad(String DetalleDiscapacidad)
    {
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad, String nombre, String apellido1, String apellido2, String sexo, String fechaNacimiento, int DNI, int NumeroCelular)
    {
        super(nombre, apellido1, apellido2, sexo, fechaNacimiento, DNI, NumeroCelular);
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad)
    {
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad, String nombre, String sexo, String fechaNacimiento, int DNI, int NumeroCelular)
    {
        super(nombre, sexo, fechaNacimiento, DNI, NumeroCelular);
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad, String Nombre)
    {
        super(Nombre);
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad, String sexo, String fehaNacimiento)
    {
        super(sexo, fehaNacimiento);
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }

    public Cliente(String CodigoCliente, boolean Discapacitado, String DetalleDiscapacidad, int DNI, int NumeroCelular)
    {
        super(DNI, NumeroCelular);
        this.CodigoCliente = CodigoCliente;
        this.Discapacitado = Discapacitado;
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }
    

    

    
    
    
    
    
}
