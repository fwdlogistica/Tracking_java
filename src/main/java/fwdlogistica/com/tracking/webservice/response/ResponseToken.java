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
public class ResponseToken {
    public String strToken = "";
    public String datVigencia = "";
    public String error = "";
    
    public ResponseToken()
    {
        
    }
    
    public ResponseToken(String json)
    {
        Gson gson = new Gson();

        ResponseToken responseToken = gson.fromJson(json, ResponseToken.class);
        this.datVigencia = responseToken.datVigencia;
        this.strToken = responseToken.strToken;
        this.error = responseToken.error;
    }
}
