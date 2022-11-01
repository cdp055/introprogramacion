import java.util.Scanner;

/**
 * programa para determinarar si una personan es mayor o menor de edad
 */
public class Decision {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR SI UNA PERSONA ES MAYOR DE EDAD");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        if (edad>= 18 ){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eeres menor de edad");
            System.out.println("Te falta madurar");
            System.out.println("Prohibido el inbgreso");
            System.out.println("anda a dormir");

        }
    }
}
