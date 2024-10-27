
package Clase;
import java.util.Date;

public class Terapeuta extends Persona {
    
    private String[][] HorarioSemanalLaboral;
    

    public Terapeuta(){
    
    
    }

    public Terapeuta(String[][] HorarioSemanalLaboral)
    {
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String[][] HorarioSemanalLaboral, String nombre, String sexo, String fechaNacimiento, int DNI, int NumeroCelular)
    {
        super(nombre, sexo, fechaNacimiento, DNI, NumeroCelular);
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String[][] HorarioSemanalLaboral, String Nombre)
    {
        super(Nombre);
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String[][] HorarioSemanalLaboral, String sexo, String fehaNacimiento)
    {
        super(sexo, fehaNacimiento);
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String[][] HorarioSemanalLaboral, int DNI, int NumeroCelular)
    {
        super(DNI, NumeroCelular);
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }
    

    public String[][] getHorarioSemanalLaboral()
    {
        return HorarioSemanalLaboral;
    }

    public void setHorarioSemanalLaboral(String[][] HorarioSemanalLaboral)
    {
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }
    public void Atender_a_cliente(){
    
    }
    
}
