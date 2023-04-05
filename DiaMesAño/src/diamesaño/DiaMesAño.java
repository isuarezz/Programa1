package diamesaño;

import java.util.Scanner;

public class DiaMesAño {


        //DECLARACIÓN VARIABLES
        Scanner consola = new Scanner(System.in);
        int dia;
        int mes;
        int any;
                
        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Ingrese el día");
        dia = consola.nextInt();
        System.out.println("Ingrese el mes (en número):");
        mes = consola.nextInt();
        System.out.println("Ingrese el año");
        any = consola.nextInt();        
        
        // PROCESANDO...
        if (dia>31 || mes>12) {
            System.out.println("El dia o mes introducido es incorrecto");
        }
        else if (mes<=3) {
            System.out.println("El dia " + dia + " del mes " + mes + " del año " + any + ". Pertence al primer trimestre");
        }
        else {
            System.out.println("No pertenece al primer trimestre");
        }
    }
