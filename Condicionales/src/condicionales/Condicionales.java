package condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner scan = new Scanner(System.in);
        double precio;
        double descuento = 0;
        double total;

        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Introduce el precio del articulo:");
        precio = scan.nextDouble();

        // PROCESANDO...
        if (precio > 100) {
            descuento = precio * 0.8;
        } 
        else if (precio == 100) {
            descuento = precio * 0.25;
        } else if(precio < 100) {
            descuento = precio *0.05;
        }       
        total = (precio-descuento);
        
        System.out.println("El precio del articulo es: " + precio +"€");
        System.out.println("El descuento aplicado es: " + descuento+"€");
        System.out.println("El precio final es: " + total+"€");
        
}
}
