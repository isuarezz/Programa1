package añobisiesto;

import java.util.Scanner;

public class AñoBisiesto {

        public static void main(String[] args) {
        //DECLARACIÓN VARIABLES
        Scanner consola = new Scanner(System.in);
        int dia;
        int mes;
        int any;
       
        // SOLICITUD DE DATOS POR CONSOLA
        System.out.println("Ingrese el día:");
        dia = consola.nextInt();
        System.out.println("Ingrese el mes (en número):");
        mes = consola.nextInt();
        System.out.println("Ingrese el año:");
        any = consola.nextInt();
        
        //VALIDACIÓN DE LA FECHA
        boolean fechaValida = true;
        
        if (any<1900 || any>2023); {
            System.out.println("El año es incorrecto");
            fechaValida = false;
        }
        if  ((mes<1 || mes>12) || (dia<1 || dia>31)); {
            System.out.println("La fecha es incorrecta");
            fechaValida = false;
        }
        if ((mes == 2) && (dia<1 || dia>29)); {
            System.out.println("La fecha es incorrecta");
            fechaValida = false;
        }
        if ((mes == 4 || mes == 6 || mes == 9) && (dia>1 || dia<30)) ; {
            System.out.println("La fecha es incorrecta");
            fechaValida = false;
        }
        if ((mes == 1 || mes == 3 || mes == 5 || mes = 7 || mes = 8 || mes == 10 || mes == 12) && (dia>1 || dia<31)); {
            System.out.println("La fecha es incorrecta");
            fechaValida = false;
        }
        
        // PROCESANDO -AÑO BISIESTO-
        if (fechaValida) {
            
            boolean esBisiesto = ((any % 4 == 0 && any % 100 !=0) || (any % 100 == 0 && any % 400 == 0)); 
            if (esBisiesto && mes == 2 && dia == 29) {
                   System.out.println("El dia " + dia + " del mes " + mes + " del año " + any + " es año bisiesto");
        }
        else {
        System.out.println("El dia " + dia + " del mes " + mes + " del año " + any + " no pertenece a un año bisiesto");
        }     
    
}
}
