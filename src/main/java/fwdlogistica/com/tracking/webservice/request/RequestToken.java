/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking.webservice.request;

import com.google.gson.Gson;

/**
 *
 * @author Hugo Viza
 */
public class RequestToken {
    public String strUsuario = "";
    public String strPassword = "";
    
    public RequestToken(String strUsuario, String strPassword)
    {
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
    }
    
    public RequestToken()
    {
        
    }
    
    public String getJSON()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
