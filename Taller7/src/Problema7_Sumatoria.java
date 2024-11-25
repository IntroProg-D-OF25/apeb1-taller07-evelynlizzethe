import java.util.Scanner;
/** *
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */

public class Problema7_Sumatoria {

    public static void main(String[] args) {
        
        int contador = 1, limite;
        
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt(); 
        
        while (contador <= limite) {
            if (contador % 2 == 1){
                System.out.print("-(1/"+contador+")");
        }else {
                System.out.print("+(1/"+contador+")");
        }
        contador++;  
        }
        System.out.println("");
    }
}

/***
 * Dame el limite: 10
 * -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
