
package Clase;

public class Ambiente {

    public Ambiente(){
        
        
    }
    private boolean Reservado;
    private String CodigodeAmbiente;
    private String tipodeAmbiente;
    private Object HorariodeReserva;

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean Reservado) {
        this.Reservado = Reservado;
    }

    public String getCodigodeAmbiente() {
        return CodigodeAmbiente;
    }

    public void setCodigodeAmbiente(String CodigodeAmbiente) {
        this.CodigodeAmbiente = CodigodeAmbiente;
    }

    public String getTipodeAmbiente() {
        return tipodeAmbiente;
    }

    public void setTipodeAmbiente(String tipodeAmbiente) {
        this.tipodeAmbiente = tipodeAmbiente;
    }

    public Object getHorariodeReserva() {
        return HorariodeReserva;
    }

    public void setHorariodeReserva(Object HorariodeReserva) {
        this.HorariodeReserva = HorariodeReserva;
    }

    public Ambiente(boolean Reservado, String CodigodeAmbiente, String tipodeAmbiente, Object HorariodeReserva) {
        this.Reservado = Reservado;
        this.CodigodeAmbiente = CodigodeAmbiente;
        this.tipodeAmbiente = tipodeAmbiente;
        this.HorariodeReserva = HorariodeReserva;
    }
    
    
}
