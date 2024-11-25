
/** *
 * Una empresa de comercialización de computadoras realiza el proceso de venta
 * haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un
 * descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada
 * venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1,
 * compra computadora con precio $100
 */
import java.util.Scanner;

public class Problema6_Computadoras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double precioInicial, precioFinal;
        int tipoCliente, contador = 0;

        System.out.println("Registro de Ventas: ");

        while (contador < 7) {
            System.out.println("\nIngrese los datos para la venta #" + (contador + 1));

            System.out.print("Nombre del cliente: ");
            nombre = tcl.nextLine();

            System.out.print("Costo de la computadora: ");
            precioInicial = tcl.nextDouble();

            System.out.print("Tipo de cliente (1, 2, o cualquier otro numero): ");
            tipoCliente = tcl.nextInt();
            tcl.nextLine();

            if (tipoCliente == 1) {
                precioFinal = precioInicial * (1 - 0.10);
            } else if (tipoCliente == 2) {
                precioFinal = precioInicial * (1 - 0.20);
            } else {
                precioFinal = precioInicial;
            }
            System.out.printf("Cliente: %s, Tipo: %d, Compra computadora con "
                              + "precio original $%.2f y precio final $%.2f%n",
                              nombre, tipoCliente, precioInicial, precioFinal);
            contador++;
        }
    }
}

/***
 * Registro de Ventas: 
 * Ingrese los datos para la venta #1
 * Nombre del cliente: Maria
 * Costo de la computadora: 1300
 * Tipo de cliente (1, 2, o cualquier otro numero): 1
 * Cliente: Maria, Tipo: 1, Compra computadora con precio original $1300,00 
 * y precio final $1170,00
 */
