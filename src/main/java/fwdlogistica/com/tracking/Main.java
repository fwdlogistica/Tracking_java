/*
 * Este proyecto tiene la finalidad de orientar y facilitar la integración GPS a los proveedores de Fwd Lógistica.
 * El proyecto es muy básico ya que solo te proporciona las conexiones a la API de Fwd Logística
 * Edita una copia de este proyecto a tu conveniencia para realizar una optima integración
 * SALUDOS Y BUENA SUERTE CON LA INTEGRACIÓN
 */
package fwdlogistica.com.tracking;

import fwdlogistica.com.tracking.models.EventoGPS;
import fwdlogistica.com.tracking.webservice.API;

/**
 *
 * @author Hugo Viza
 */
public class Main 
{
    public static void main(String[] args) 
    {
        API api = new API();
        
        System.out.println("Obteniendo token...");
        //Aqui puedes agregar tus claves de acceso
        api.getToken("prueba", "password");
        
        System.out.println("Enviando eventos...");
        EventoGPS eventos[] = aquiUnaFuncionQueObtengaLosEventosDesdeBaseDeDatos();
        //Para insertar a produccion es necesario descomentar una linea de codigo
        api.setEventos(eventos);
    }
    
    public static EventoGPS[] aquiUnaFuncionQueObtengaLosEventosDesdeBaseDeDatos()
    {
        //Te recomiendo que agregues esto en otra clase dentro de modelos
        int totalResultadosQuery = 5;
        EventoGPS arrayEventos[] = new EventoGPS[totalResultadosQuery];
        
        for (int i = 0; i < totalResultadosQuery; i++) 
        {
            //Datos unicamente de pruebas
            EventoGPS evento = new EventoGPS();
            evento.strCodigo = "0";
            evento.datFechaHora = "2020-07-08T16:05:34.000-05:00";
            evento.dblLatitud = 25.677725;
            evento.dblLongitud = -100.358730;
            evento.strNumeroPlaca = "FRY-62-22";
            evento.strNumeroServicio = "000"+(i+1)+"MX";
            /*OPCIONALES*/
            evento.strNumeroSerie = "";
            evento.dblVelocidad = 0.0;
            evento.dblAltitud = 0.0;
            evento.dblKilometraje = 0.0;
            evento.intNivelBateria = 0;
            evento.strOrientacion = "";
            evento.strDireccion = "";
            evento.bitEncendido = 0;
            /*OPCIONALES*/
            arrayEventos[i] = evento;
        }
        
        return arrayEventos;
    }
}
