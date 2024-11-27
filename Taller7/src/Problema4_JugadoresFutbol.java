
import java.util.Scanner;

public class Problema4_JugadoresFutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad, contador = 0, sumaEdades = 0, numJugadores = 5;
        String nombreJugador, posicion, reporte = "Listado de Jugadores", respuesta;
        double promedioEdades = 0, promedioEstaturas = 0, estatura, sumaEstaturas = 0;
        boolean bandera = true;
        do {
            System.out.print("Ingrese el nombre del Jugador: ");
            nombreJugador = tcl.nextLine();
            System.out.print("Ingrese la posición en el campo: ");
            posicion = tcl.nextLine();
            System.out.print("Ingrese la edad del Jugador: ");
            edad = tcl.nextInt();
            System.out.print("Ingrese la estatura del Jugador: ");
            estatura = tcl.nextDouble();

            tcl.nextLine();
            sumaEdades += edad;
            sumaEstaturas += estatura;
            contador = contador + 1;

            System.out.printf(contador + ". " + nombreJugador + "\t-"
                    + posicion + "-\t" + "edad\t " + edad + "\testatura\t"
                    + estatura);

            System.out.println("\nIngrese (r) para terminar de ingresar datos");
            respuesta = tcl.nextLine();
            if (respuesta.equals("r")) {
                bandera = false;
            }
        } while (bandera);

        promedioEdades = sumaEdades / contador;
        promedioEstaturas = sumaEstaturas / contador;

        System.out.printf("\nPromedio de edades: %.1f\n", promedioEdades);
        System.out.printf("\nPromedio de estaturas: %.2f\n", promedioEstaturas);
    }
}

/***
 * Ingrese el nombre del Jugador: Alexander Dominguez
 * Ingrese la posici�n en el campo: Arquero
 * Ingrese la edad del Jugador: 32
 * Ingrese la estatura del Jugador: 1,92
 * 1. Alexander Dominguez	-Arquero-	edad	 32	estatura	1.92
 * Ingrese (r) para terminar de ingresar datos
 * 1
 * Ingrese el nombre del Jugador: Xavier Arreaga
 * Ingrese la posici�n en el campo: Defensa
 * Ingrese la edad del Jugador: 24
 * Ingrese la estatura del Jugador: 1,85
 * 2. Xavier Arreaga	-Defensa-	edad	 24	estatura	1.85
 * Ingrese (r) para terminar de ingresar datos
 * 1
 * Ingrese el nombre del Jugador: Moises Caicedo
 * Ingrese la posici�n en el campo: Mediocentro
 * Ingrese la edad del Jugador: 19
 * Ingrese la estatura del Jugador: 1,88
 * 3. Moises Caicedo	-Mediocentro-	edad	 19	estatura	1.88
 * Ingrese (r) para terminar de ingresar datos
 * 1
 * Ingrese el nombre del Jugador: Angel Mena 
 * Ingrese la posici�n en el campo: Delantero 
 * Ingrese la edad del Jugador: 32
 * Ingrese la estatura del Jugador: 1,75
 * 4. Angel Mena 	-Delantero -	edad	 32	estatura	1.75
 * Ingrese (r) para terminar de ingresar datos
 * 1
 * Ingrese el nombre del Jugador: Michael Estrada 
 * Ingrese la posici�n en el campo: Delantero 
 * Ingrese la edad del Jugador: 27
 * Ingrese la estatura del Jugador: 1,93
 * 5. Michael Estrada 	-Delantero -	edad	 27	estatura	1.93
 * Ingrese (r) para terminar de ingresar datos
 * r
 * Promedio de edades: 26,0
 * Promedio de estaturas: 1,87
 */