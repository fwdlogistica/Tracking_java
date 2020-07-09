/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking.webservice;

import fwdlogistica.com.tracking.models.EventoGPS;
import java.io.IOException;
import fwdlogistica.com.tracking.webservice.request.*;
import fwdlogistica.com.tracking.webservice.response.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author Hugo Viza
 */
public class API 
{
    private String strToken = "";
    private final String URL = "https://sru029yrw1.execute-api.us-east-2.amazonaws.com/produccion/proveedores/";
    
    
    public String getToken(String strUsuario, String strPassword)
    {
        RequestToken requestToken = new RequestToken(strUsuario, strPassword);
        HttpClient httpClient = HttpClientBuilder.create().build();

        try {

            HttpPost request = new HttpPost(URL + "token");
            StringEntity params =new StringEntity(requestToken.getJSON());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            String responseJson = org.apache.http.util.EntityUtils.toString(response.getEntity());
            System.out.println(responseJson);
            
            ResponseToken responseToken = new ResponseToken(responseJson);
            if(responseToken.error.isEmpty())
            {
                this.strToken = responseToken.strToken;
                return responseToken.strToken;
            }
            else
                System.out.println("error: getToken() => " + responseToken.error);
        }catch (IOException ex) {
            System.out.println("IOException: getToken() => " + ex.getMessage());
        } finally {
            
        }
        return "";
    }
    
    public void setEventos(EventoGPS eventos[])
    {
        RequestEvento requestEventos = new RequestEvento(this.strToken, eventos);
        
        HttpClient httpClient = HttpClientBuilder.create().build();

        try {
            /*COMENTAR esta línea para insertar en producción=>*/HttpPost request = new HttpPost(URL + "tracking/evento/prueba");
            //DESCOMENTAR ANTES DE PASARLO A PRODUCCION
            /*DESCOMENTAR esta línea para insertar en producción=>*/ //HttpPost request = new HttpPost(URL + "tracking/evento");
            StringEntity params =new StringEntity(requestEventos.getJSON());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            String responseJson = org.apache.http.util.EntityUtils.toString(response.getEntity());
            
            System.out.println(responseJson);
            ResponseEvento responseEventos = new ResponseEvento(responseJson);
            if(responseEventos.error.isEmpty())
            {
                //Alguna validación que se requiera
                //System.out.println("success eventos => " + responseEventos.success);
            }
            else
            {
                //Alguna validación que se requiera
                //System.out.println("error eventos => " + responseEventos.error);
            }
        }catch (IOException ex) {
            System.out.println("error: setEventos() => " + ex.getMessage());
        } finally {
            
        }
    }
}
