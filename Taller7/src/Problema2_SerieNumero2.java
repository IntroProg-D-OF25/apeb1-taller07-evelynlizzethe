/***
 * Realizar un programa Java que permita presentar en pantalla 
 * la siguiente secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 */
import java.util.Scanner;
public class Problema2_SerieNumero2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite = 0, contador1 = 5, contador2 = 0;
        System.out.print("Dame el Limite: ");
        limite = tcl.nextInt();
        while (contador1 <= (limite*5)){
            System.out.println(contador1 + "/" + (contador2+10) + ", ");
            contador1+=5;
            contador2+=2;
        }
        System.out.println("");
    }
}

/***
 * Dame el Limite: 7
 * 5/10, 
 * 10/12, 
 * 15/14, 
 * 20/16, 
 * 25/18, 
 * 30/20, 
 * 35/22, 
 */
