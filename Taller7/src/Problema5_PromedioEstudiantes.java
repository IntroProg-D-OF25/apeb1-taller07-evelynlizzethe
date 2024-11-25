/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno 
 * de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte

Estudiante 1 10     Aprobado
Estudiante 2 6.9    Reprobado
Estudiante 3 7      Aprobado
Estudiante 4 5      Reprobado
* Atención; con base al valor del promedio, usted debe asignar en cada
* registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_PromedioEstudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEstudiante, estado; 
        double promedio, contador = 1; 
        while (contador <= 4){
            System.out.print("Dame nombre y promedio: ");
            nombreEstudiante = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio >= 7) ? "Aprobado" : "Reprobado" ;
            System.out.println("Nombre\tPromedio\tEstado");
            System.out.println(nombreEstudiante + "\t" + promedio + "\t\t" + estado);
            contador++;
            
        }
    }
}
