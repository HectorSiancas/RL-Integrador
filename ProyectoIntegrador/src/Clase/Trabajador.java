
package Clase;


public class Trabajador {

    private String nombre;
    private String apellido;
    private String cargo;
    private String dni;
    private String fechaNacimiento;
    
    
    public Trabajador(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Trabajador(String nombre, String apellido, String cargo, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    
    
    
    
    
    
    

}
