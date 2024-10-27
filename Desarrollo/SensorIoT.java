
package sensoriot;

import java.util.Random;

/**
 *
 * @author Julian2208
 */
public class SensorIoT {

   private String tipo;
    private String ubicacion;
    private String estado;

    public SensorIoT(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = "Activo";
    }

    public String capturarDatos() {
        Random rand = new Random();
        switch (tipo) {
            case "tráfico":
                String[] condicionesTrafico = {"Despejado", "Moderado", "Congestionado"};
                return condicionesTrafico[rand.nextInt(condicionesTrafico.length)];
            case "energía":
                return String.format("%.2f MW", 500 + (rand.nextDouble() * 1000)); // Demanda en MW
            case "agua":
                return String.format("%.2f mil litros", 200 + (rand.nextDouble() * 600)); // Consumo en miles de litros
            case "seguridad":
                String[] eventosSeguridad = {"Normal", "Actividad sospechosa", "Alarma de seguridad"};
                return eventosSeguridad[rand.nextInt(eventosSeguridad.length)];
            default:
                return "Dato no disponible";
        }
    }
}

