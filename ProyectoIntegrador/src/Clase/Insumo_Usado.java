
package Clase;


public class Insumo_Usado 
{
    public Insumo_Usado(){
    
    
    }
    private String insumo;
    private double cantidad_usada;

    public String getInsumo()
    {
        return insumo;
    }

    public void setInsumo(String insumo)
    {
        this.insumo = insumo;
    }

    public double getCantidad_usada()
    {
        return cantidad_usada;
    }

    public void setCantidad_usada(double cantidad_usada)
    {
        this.cantidad_usada = cantidad_usada;
    }

    public Insumo_Usado(String insumo, double cantidad_usada)
    {
        this.insumo = insumo;
        this.cantidad_usada = cantidad_usada;
    }
    
    
    
}
