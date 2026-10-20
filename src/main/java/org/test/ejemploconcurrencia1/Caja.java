package org.test.ejemploconcurrencia1;

public class Caja {
    private int cantidadVentas = 0; // clase inmutable.
    private int totalRecaudado = 0;

    public synchronized void registrarVentas(String vendedor, int monto) {

        cantidadVentas++;
        totalRecaudado += monto;

        System.out.println(vendedor + " Registro una venta de C$ " +
                monto + " | ventas acumuladas" + cantidadVentas +
                " | Total recaudado" + totalRecaudado);
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }
}
