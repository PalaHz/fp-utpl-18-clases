
package tareaextraclase3;

import java.util.Scanner;

public class ConversiónTemperatura {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Bienvenido, ingrese el numero de la opción de conversión que desea realizar\n"
                + "De Celcius a Fahrenheit (Opción 1)\nDe Fahrenheit a Celcius (Opción 2)");
        int num = entrada.nextInt();
        
        if (num > 2 || num < 1){
            do{
            System.out.println("Por favor, ingrese una opción válida (1 o 2)");
            num = entrada.nextInt();
            }while (num > 2 || num < 1);
        }
        if (num ==1){
                System.out.println("Usted ha seleccionado la conversión de Celcius a Fahrenheit\n"
                        + "Ingrese los grados Celcius que desea transformar");
                double celcius = entrada.nextDouble();
                double fahren = (((9/5)*celcius)+32);
                /*Aquí parece haber un error con la fracción 9/5, no estoy seguro por qué pero cuando 
                realiza la operación no saca el resultado debido (1.8) sino una aproximación redondeada al 
                entero más cercano. Mil disculpas profesor, no supe encontrar la solución
                */
                System.out.println(+celcius+ " grados Celcius equivalen a "+fahren+" grados Fahrenheit.");
        }else{
                System.out.println("Usted ha seleccionado la conversión de Fahrenheit a Celcius\n"
                        + "Ingrese los grados Fahrenheit que desea transformar");
                double fahren = entrada.nextDouble();
                double celcius = ((fahren-32)*(5/9));
                System.out.println(+fahren+ " grados Fahrenheit equivalen a "+celcius+" grados Celcius.");
        }
    }
}  

