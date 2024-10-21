
package Clase;
import java.util.Date;

public class Terapeuta extends Persona {
    private String NombreTerapeuta;
    private String ApellidosTerapeuta;
    private String SexoTerapeuta;
    private Date FechaNacimientoTerapeuta;
    private Object HorarioSemanalLaboral;
    
    public Terapeuta(){
    
    
    }

    public String getNombreTerapeuta() {
        return NombreTerapeuta;
    }

    public void setNombreTerapeuta(String NombreTerapeuta) {
        this.NombreTerapeuta = NombreTerapeuta;
    }

    public String getApellidosTerapeuta() {
        return ApellidosTerapeuta;
    }

    public void setApellidosTerapeuta(String ApellidosTerapeuta) {
        this.ApellidosTerapeuta = ApellidosTerapeuta;
    }

    public String getSexoTerapeuta() {
        return SexoTerapeuta;
    }

    public void setSexoTerapeuta(String SexoTerapeuta) {
        this.SexoTerapeuta = SexoTerapeuta;
    }

    public Date getFechaNacimientoTerapeuta() {
        return FechaNacimientoTerapeuta;
    }

    public void setFechaNacimientoTerapeuta(Date FechaNacimientoTerapeuta) {
        this.FechaNacimientoTerapeuta = FechaNacimientoTerapeuta;
    }

    public Object getHorarioSemanalLaboral() {
        return HorarioSemanalLaboral;
    }

    public void setHorarioSemanalLaboral(Object HorarioSemanalLaboral) {
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String NombreTerapeuta, String ApellidosTerapeuta, String SexoTerapeuta, Date FechaNacimientoTerapeuta, Object HorarioSemanalLaboral) {
        this.NombreTerapeuta = NombreTerapeuta;
        this.ApellidosTerapeuta = ApellidosTerapeuta;
        this.SexoTerapeuta = SexoTerapeuta;
        this.FechaNacimientoTerapeuta = FechaNacimientoTerapeuta;
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    
    
    
    
    
}
