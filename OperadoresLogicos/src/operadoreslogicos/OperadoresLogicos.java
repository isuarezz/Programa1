package operadoreslogicos;

import java.util.Scanner;

public class OperadoresLogicos {

        public static void main(String[] args) {
        // DECLARACIÓN VARIABLES
        Scanner consola = new Scanner(System.in);
        int edad;
        
        // SOLICITUD DATOS POR CONSOLA
        System.out.println("¿Cual es la edad?");
        edad = consola.nextInt();
        
        // PROCESANDO...
        if (edad >= 0 && edad <= 120){
        System.out.println("La edad está en el rango");
        }
        else   {
            System.out.println("La edad no está en el rango");
        }
    }

}
