
package MVC;

import Clase.Insumo;
import static Conexion.DataSource.DataSource;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Clase.Citas;


public class Modelo {
    public boolean AgregarInsumo(Insumo insumo){
     boolean flag= false ; 
     try{
      String Query= " INSERT INTO INVENTARIO values(?, ?, ?, ?, ?, ?)";
            PreparedStatement  stmt = DataSource().prepareStatement(Query);
            
            stmt.setString(1,insumo.getCodigo());
            stmt.setString(2, insumo.getNombre());
            stmt.setDouble(3, insumo.getCantidad());
            stmt.setString(4, insumo.getCategoria());
            stmt.setString(5, insumo.getFechavencimiento());
            stmt.setDouble(6, insumo.getPrecio());
            
            
            flag = stmt.execute();
      
      
      
     }  catch (SQLException ex) { 
           System.out.println(ex.getMessage());
 
        } 
        return flag;
       
        
        
 
    
   
    
    }
       
}
