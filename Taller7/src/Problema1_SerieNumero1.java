
import java.util.Scanner;

public class Problema1_SerieNumero1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, contador = 1;
        System.out.print("Dame el Limite: ");
        limite = tcl.nextInt();
        while (contador <= limite){
            System.out.print(contador + "/" + (contador + 9) + ", ");
            contador++;
        }
        System.out.println("");
    }
}
