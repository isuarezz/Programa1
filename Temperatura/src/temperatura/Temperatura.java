package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner scan = new Scanner(System.in);
        int temperatura;

        // SOLICITUD DE DATOS DE ENTRADA
        System.out.println("Introduzca la temperatura actual:");
        temperatura = scan.nextInt();

        //PROCESANDO...
        if (temperatura > 25) {
            System.out.println("Vamos a la playa!");
        } else if (temperatura > 15 && temperatura < 25) {
            System.out.println("Vamos a la montaña!");
        } else if (temperatura > 5 && temperatura < 15) {
            System.out.println("Vamos a esquiar!");
        } else {
            System.out.println("A descansar!");
        }
    }
    
}
