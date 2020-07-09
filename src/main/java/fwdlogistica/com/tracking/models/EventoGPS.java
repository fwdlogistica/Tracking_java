/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking.models;

/**
 *
 * @author Hugo Viza
 */
public class EventoGPS {
    public String strCodigo = "0";
    public String datFechaHora = "";
    public Double dblLatitud = 0.0;
    public Double dblLongitud = 0.0;
    public String strNumeroPlaca = "";
    public String strNumeroServicio = "";
    
    
    public String strNumeroSerie = "";
    public Double dblVelocidad = 0.0;
    public Double dblAltitud = 0.0;
    public Double dblKilometraje = 0.0;
    public Integer intNivelBateria = 0;
    public String strOrientacion = "";
    public String strDireccion = "";
    public Integer bitEncendido = 0;
    
    public EventoGPS()
    {
        
    }
}
