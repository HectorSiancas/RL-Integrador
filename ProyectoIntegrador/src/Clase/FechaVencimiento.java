
package Clase;

import java.util.Date;


public class FechaVencimiento {
 
    private      Date  dia;   // Día
    private   Date mes; // Mes
    private Date año;  // Año
    
    
    public FechaVencimiento(){
    
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public FechaVencimiento(Date dia, Date mes, Date año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    
    
    
    
    
    
    
    }

    

