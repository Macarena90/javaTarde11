package recaudador;

import java.util.Date;
import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;
import sensorvelocidad.TipoVehiculo;

public class EvaluadorEmisionActa {
    private GrabadorDeTicket grabadorDeTicket;

    public EvaluadorEmisionActa(GrabadorDeTicket generadorDeTicket) {
        this.grabadorDeTicket = generadorDeTicket;
    }
            
    public void evaluar(TipoClima clima, Date fecha, DatosVehiculo datosVehiculo) {
        Ticket ticket = new Ticket(
                java.util.UUID.randomUUID().toString(),
                2000,
                datosVehiculo
        );
        grabadorDeTicket.grabar(ticket);
    }
}
