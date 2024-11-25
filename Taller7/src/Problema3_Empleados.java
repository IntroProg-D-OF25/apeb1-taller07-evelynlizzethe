
import java.util.Scanner;
/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 
 * empleados. Por cada empleado se debe solicitar el nombre, numero de días 
 * trabajados y costo del día trabajo. Calcular el valor a cancelar por la
 * empresa para cada empleado. Presentar un reporte como el siguiente:

* Nombre 1	10	$2.5	$25
* Nombre 2	11	$2	$22
* Nombre 3	9	$3	$27
* Nombre 4	5	$4	$20
* Nombre 5	12	$2	$24
 * @author USUARIO
 */

public class Problema3_Empleados {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEmpleado;
        double diasTrabajados, costoDiaTrabajo, valorCancelar, contador = 1;
        while (contador <= 5) {
            System.out.print("Dame nombre del Empleado, Dias Trabajados "
                            + "y el costo del dia: ");
            nombreEmpleado = tcl.next();
            diasTrabajados = tcl.nextDouble();
            costoDiaTrabajo = tcl.nextDouble();
            
            valorCancelar = (diasTrabajados * costoDiaTrabajo); 
            System.out.println("\"Nombre Empleado\tDiasTrabajado\t\t"
                               + "CostoDiaTrabajo\tValor A pagar");
            System.out.println(nombreEmpleado + "\t\t\t" + diasTrabajados 
                    + "\t\t\t" + costoDiaTrabajo + "\t\t" + valorCancelar);
            contador++;
        }
        }

    }
/***
 * Dame nombre del Empleado, Dias Trabajados y el costo del dia: Juan 10 20
 * "Nombre Empleado	DiasTrabajado		CostoDiaTrabajo	Valor A pagar
 * Juan			10.0			20.0		200.0
 */
