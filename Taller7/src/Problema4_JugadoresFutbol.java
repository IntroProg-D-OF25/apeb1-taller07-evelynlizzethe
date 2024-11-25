
import java.util.Scanner;

public class Problema4_JugadoresFutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad, contador = 0, sumaEdades = 0, numJugadores = 5;
        String nombreJugador, posicion, reporte = "Listado de Jugadores", respuesta;
        double promedioEdades = 0, promedioEstaturas = 0, estatura, sumaEstaturas = 0;
        boolean bandera = true;
        do {
            System.out.print("Ingrese el nombre, posición, edad y estatura "
                    + "de cada jugador: ");
            nombreJugador = tcl.nextLine();
            posicion = tcl.next();
            edad = tcl.nextInt();
            estatura = tcl.nextDouble();

            sumaEdades += edad;
            sumaEstaturas += estatura;
            contador++;
            
            System.out.printf("%s -%s-, edad %d, estatura %.2f\n",
                    nombreJugador, posicion, edad, estatura);
            System.out.println("Desea ingresar otro jugador? (s/n): ");
            respuesta = tcl.next();
            if (respuesta.equals("n")) {
                bandera = false;
            }
        } while (bandera);
        promedioEdades = sumaEdades / numJugadores;
        promedioEstaturas = sumaEstaturas / numJugadores;
        
        System.out.printf("Promedio de edades: %.1f\n", promedioEdades);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstaturas);

    }
}
