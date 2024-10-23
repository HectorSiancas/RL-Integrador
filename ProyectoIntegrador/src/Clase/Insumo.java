
package Clase;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Insumo {
private String nombre;
    private double cantidad;
    private String fechavencimiento;
    private FechaVencimiento fvo;


    public Insumo(String nombre, double cantidad, FechaVencimiento fvo, double precio, String Categoria, String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fvo = fvo;
        this.precio = precio;
        this.Categoria = Categoria;
        this.codigo = codigo;
    }

    
    public FechaVencimiento getFvo() {
        return fvo;
    }

    public void setFvo(FechaVencimiento fvo) {
        this.fvo = fvo;
    }

    public SimpleDateFormat getDia() {
        return dia;
    }

    public void setDia(SimpleDateFormat dia) {
        this.dia = dia;
    }

    public SimpleDateFormat getMes() {
        return mes;
    }

    public void setMes(SimpleDateFormat mes) {
        this.mes = mes;
    }

    public SimpleDateFormat getAño() {
        return año;
    }

    public void setAño(SimpleDateFormat año) {
        this.año = año;
    }

    public Date getPartesFechaDia() {
        return partesFechaDia;
    }

    public void setPartesFechaDia(Date partesFechaDia) {
        this.partesFechaDia = partesFechaDia;
    }

    public Date getPartesFechaMes() {
        return partesFechaMes;
    }

    public void setPartesFechaMes(Date partesFechaMes) {
        this.partesFechaMes = partesFechaMes;
    }
    private double precio;
    private String Categoria;
  private String codigo;
    private Date fecha2;
    private SimpleDateFormat FormatoFV = new SimpleDateFormat("dd/MM/yyyy");
     private SimpleDateFormat dia = new SimpleDateFormat("dd");
        private SimpleDateFormat mes = new SimpleDateFormat("mm");
        private SimpleDateFormat año = new SimpleDateFormat("yyyy");
        Date partesFechaDia = fvo.getDia();
        Date partesFechaMes = fvo.getMes();
        Date partesFechaAño= fvo.getAño();
        
        
        
    public SimpleDateFormat getFormatoFV() {
        return FormatoFV;
    }

    public void setFormatoFV(SimpleDateFormat FormatoFV) {
        this.FormatoFV = FormatoFV;
    }
    
    
    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    
    public Insumo(String nombre, double cantidad, double precio, String Categoria, String codigo, Date fecha2) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.Categoria = Categoria;
        this.codigo = codigo;
        this.fecha2 = fecha2;
    }
    
    /*
           // Ejemplo de fecha actual
        Date fecha = new Date();
        
        // Formatear la fecha en el formato deseado (día/mes/año)
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = formatoFecha.format(fecha);
        
        // Separar la cadena de fecha en día, mes y año usando split
        String[] partesFecha = fechaString.split("/");

        // Extraer cada parte
        String dia = partesFecha[0];   // Día
        String mes = partesFecha[1];   // Mes
        String anio = partesFecha[2];  // Año

        // Mostrar resultados
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);
    
    */
    
    
    
    

    public Insumo(String nombre, double cantidad, String fechavencimiento, double precio, String Categoria, String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
        this.Categoria = Categoria;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
  
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    
    
    public Insumo(String nombre, int cantidad, String fechavencimiento, double precio, String Categoria) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
        this.Categoria = Categoria;
    }
    
    
    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public Insumo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Insumo(){
    
    }
    
    
    /*
       // Formato para fecha y hora
    private SimpleDateFormat FormatoFV = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
    
     private SimpleDateFormat FormatoFV = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat FormatoMinSeg = new SimpleDateFormat("mm:ss"); // Formato solo para minutos y segundos
    
        // Método para obtener solo minutos y segundos
    public String getMinutosYSegundos() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos solo los minutos y segundos en el formato mm:ss
        String minSeg = FormatoMinSeg.format(fechaActual);

        // Devolvemos los minutos y segundos formateados
        return minSeg; // Formato: mm:ss
    }
    
    
      // Métodos getter y setter omitidos por brevedad

    // Método para concatenar fecha y hora
    public String getFechaYHoraCompleta() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos la fecha y la hora por separado
        String fecha = FormatoFV.format(fechaActual);
        String hora = FormatoHora.format(fechaActual);

        // Concatenamos fecha y hora
        return fecha + " " + hora; // Formato: dd/MM/yyyy HH:mm:ss
    }
    
    // Método para obtener solo horas, minutos y segundos
    public String getHoraCompleta() {
        Date fechaActual = new Date(); // Obtenemos la hora actual

        // Formateamos la hora en el formato HH:mm:ss
        String hora = FormatoHora.format(fechaActual);

        // Devolvemos la hora formateada
        return hora; // Formato: HH:mm:ss
    }

      // Métodos getter y setter omitidos por brevedad

    // Método para obtener solo minutos y segundos
    public String getMinutosYSegundos() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos solo los minutos y segundos en el formato mm:ss
        String minSeg = FormatoMinSeg.format(fechaActual);

        // Devolvemos los minutos y segundos formateados
        return minSeg; // Formato: mm:ss
    }
    */
    
}
