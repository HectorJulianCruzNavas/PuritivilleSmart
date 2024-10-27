
package sensoriot;

/**
 *
 * @author Julian2208
 */
public class IntelligentCityVision {
 

    public static void main(String[] args) {
        System.out.println("Iniciando el sistema Intelligent City Vision...");

        // Inicialización de sensores
        SensorIoT sensorTrafico = new SensorIoT("tráfico", "Centro");
        SensorIoT sensorEnergia = new SensorIoT("energía", "Zona Industrial");
        SensorIoT sensorAgua = new SensorIoT("agua", "Zona Residencial");
        SensorIoT sensorSeguridad = new SensorIoT("seguridad", "Zona Comercial");

        // Inicialización de la red
        RedComunicacion redComunicacion = new RedComunicacion("5G");

        // Inicialización del servidor
        ServidorCentral servidor = new ServidorCentral();

        // Transmisión y procesamiento de datos
        String datosTrafico = redComunicacion.transmitirDatos(sensorTrafico);
        String datosEnergia = redComunicacion.transmitirDatos(sensorEnergia);
        String datosAgua = redComunicacion.transmitirDatos(sensorAgua);
        String datosSeguridad = redComunicacion.transmitirDatos(sensorSeguridad);

        servidor.almacenarDatos(datosTrafico);
        servidor.almacenarDatos(datosEnergia);
        servidor.almacenarDatos(datosAgua);
        servidor.almacenarDatos(datosSeguridad);

        // Inicialización de módulos de predicción y monitoreo
        ModuloTrafficPrediction moduloTrafico = new ModuloTrafficPrediction();
        ModuloEnergyPrediction moduloEnergia = new ModuloEnergyPrediction();
        ModuloWaterPrediction moduloAgua = new ModuloWaterPrediction();
        ModuloSecurityMonitoring moduloSeguridad = new ModuloSecurityMonitoring();

        // Predicciones y monitoreo
        moduloTrafico.predecir(datosTrafico);
        moduloEnergia.predecir(datosEnergia);
        moduloAgua.predecir(datosAgua);
        moduloSeguridad.monitorear(datosSeguridad);
    }
}   
