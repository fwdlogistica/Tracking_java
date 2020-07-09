/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking.webservice.request;

import com.google.gson.Gson;
import fwdlogistica.com.tracking.models.EventoGPS;

/**
 *
 * @author Hugo Viza
 */
public class RequestEvento {
    public String strToken = "";
    public EventoGPS eventos[] = new EventoGPS[1];
    
    public RequestEvento(String strToken, EventoGPS eventos[])
    {
        this.strToken = strToken;
        this.eventos = eventos;
    }
    
    public RequestEvento()
    {
        
    }
    
    public String getJSON()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
