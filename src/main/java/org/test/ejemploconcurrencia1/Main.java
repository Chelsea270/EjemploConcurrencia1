package org.test.ejemploconcurrencia1;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();

        /*
        * Runnable representa la tarea que ejecuta cada vendedor
        * */

        Runnable vendedor1 = () -> procesarVentas("Vendedor 1", caja);
        Runnable vendedor2 = () -> procesarVentas("Vendedor 2", caja);
        Runnable vendedor3 = () -> procesarVentas("Vendedor 3", caja);

        // Crear los 3 hilos para llevar a cabo las operaciones.
        Thread hilo1 = new Thread(vendedor1);
        Thread hilo2 = new Thread(vendedor2);
        Thread hilo3 = new Thread(vendedor3);

        System.out.println("---- Inicio de proceso de venta -----");

        /*
        * Hilo.start() inicia cada thread
        * los tres vendedores empieza a procesar sus ventas de manera concurrente
        * */

        // Ventas.
        hilo1.start();

        // Venta 2.
        hilo2.start();

        // Venta 3.
        hilo3.start();


    }
}
