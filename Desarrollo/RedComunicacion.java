
package sensoriot;

/**
 *
 * @author Julian2208
 */
public class RedComunicacion {
     private String tecnologia;
    private String anchoBanda;

    public RedComunicacion(String tecnologia) {
        this.tecnologia = tecnologia;
        this.anchoBanda = tecnologia.equals("5G") ? "Alta" : "Media";
    }

    public String transmitirDatos(SensorIoT sensor) {
        System.out.println("Transfiriendo datos desde el sensor " + sensor.capturarDatos());
        return sensor.capturarDatos();
    }
}

