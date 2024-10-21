
package Clase;

public class Persona {
    private String nombre;
    private String sexo;
    private String fechaNacimiento; 
    private int DNI;
    private int NumeroCelular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(int NumeroCelular) {
        this.NumeroCelular = NumeroCelular;
    }
    
   
    
    public Persona(){
    
    
    }

    public Persona(String nombre, String sexo, String fechaNacimiento, int DNI, int NumeroCelular) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.NumeroCelular = NumeroCelular;
    }
    
    public Persona(String Nombre){
        this.nombre= nombre;
    }
    public Persona(String sexo, String fehaNacimiento){
       this.sexo= sexo;
       this.fechaNacimiento= fechaNacimiento;
    }        
   public Persona(int DNI, int NumeroCelular){
       this.DNI= DNI;
       this.NumeroCelular= NumeroCelular;
   }
    
}
