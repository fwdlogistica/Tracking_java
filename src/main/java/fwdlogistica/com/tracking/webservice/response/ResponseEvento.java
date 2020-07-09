/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking.webservice.response;

import com.google.gson.Gson;

/**
 *
 * @author Hugo Viza
 */
public class ResponseEvento {
    public String success = "";
    public String error = "";
    
    public ResponseEvento()
    {
        
    }
    
    public ResponseEvento(String json)
    {
        Gson gson = new Gson();

        ResponseEvento responseEventos = gson.fromJson(json, ResponseEvento.class);
        this.success = responseEventos.success;
        this.error = responseEventos.error;
    }
}
