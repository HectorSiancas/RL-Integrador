
package MVC;
import Clase.Insumo;

public class Controlador {
    
    public boolean AgregarInsumo(Insumo insumo){
        Modelo modelo= new Modelo();
        return modelo.AgregarInsumo(insumo);
    }
    
    
}
