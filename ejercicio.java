package Condicionales;
import java.util.Scanner;
public class Ejercicio1 {
    
/*Ejercicio planteado:
        Calcular el número de pulsaciones que debe tener una persona por cada 10 segundos de
        ejercicio aeróbico; la fórmula que se aplica cuando el sexo es femenino es: num.
        pulsaciones = (220 – edad) / 10 y si el sexo es masculino la fórmula es: num. Pulsaciones =
        (210 – edad) / 10
*/
    public static void main(String[]args){
        //Todo code application logic here
        Scanner input = new Scanner(System.in);
        String nombre, sexo;
        int edad, num, num_pulsaciones;
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.print("Sexo(M,F): ");
        sexo = input.nextLine().toUpperCase();
        
        if(sexo.equals("F")){
            num_pulsaciones = (220 - edad) / 10;
            System.out.println("Número de pulsaciones: "+num_pulsaciones);
        }
        else if(sexo.equals("M")){
        num_pulsaciones = (220 - edad) / 10;
        System.out.println("Número de pulsaciones: "+num_pulsaciones);
        }
        else{
            System.out.println("Error, digite nuevamente el sexo");
        }
    }
    
}
