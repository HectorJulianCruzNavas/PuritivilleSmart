
package sensoriot;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Julian2208
 */
public class ServidorCentral {
    private List<String> datos;

    public ServidorCentral() {
        this.datos = new ArrayList<>();
    }

    public void almacenarDatos(String datos) {
        this.datos.add(datos);
    }

    public void procesarDatos(String datos) {
        System.out.println("Procesando datos: " + datos);
    }
}

