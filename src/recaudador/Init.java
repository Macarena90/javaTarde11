package recaudador;

import java.util.Date;
import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;

public class Init {
    public static EvaluadorEmisionActa generarTodosLosServicios() {
        RepositorioDeTexto repoTexto = new RepositorioDeTexto("c:\\clase11");
        GrabadorDeTicket grabadorTicket = new GrabadorDeTicket(repoTexto);
        EvaluadorEmisionActa evaluador = new EvaluadorEmisionActa(grabadorTicket);
        
        return evaluador;
    }
    public static void main(String[] args) {
        sensorclima.Sensor sensorClima = new sensorclima.Sensor();
        sensorvelocidad.Sensor sensorVelocidad = 
                new sensorvelocidad.Sensor();
        
        DatosVehiculo datosvehiculo = null;
        EvaluadorEmisionActa evaluador = generarTodosLosServicios();
        for (;;) {
            datosvehiculo = sensorVelocidad.sensarVehiculo();
            System.out.println(datosvehiculo);
        
            evaluador.evaluar(TipoClima.NORMAL, new Date(2019,04,17), datosvehiculo);
        }
    }
}
