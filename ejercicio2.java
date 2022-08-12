//package Condicionales;
import java.util.Scanner;

public class Ejercicio2 {
    /*
    Ejercicio planteado:
        Leer dos enteros A y B y calcular F de acuerdo a las siguientes reglas:
        a) F = 2 * A + B    Si A^2 – B^2 < 0
        b) F = A^2– 2 * B   Si A^2 – B^2 = 0
        c) F = A + B        Si A^2 – B^2 > 0
   */
    public static void main(String[]args){
        //Todo code application logic here
        Scanner input = new Scanner(System.in);
        int A, B, F ;
        System.out.println("A: ");
        A = Integer.parseInt(input.nextLine());
        System.out.println("B: ");
        B = Integer.parseInt(input.nextLine());
        if(Math.pow(A, 2) - Math.pow(B, 2) < 0){
            F = 2 * A + B;
        }
        else if(Math.pow(A,2)- Math.pow(B,2)==0){
            F = (int)Math.pow(A,2) - (2 *B);
        }
        else if(Math.pow(A,2)- Math.pow(B,2) > 0){
            F = A + B;    
        }
        System.out.println("Resultado: "+F);
  }
    
}
    
