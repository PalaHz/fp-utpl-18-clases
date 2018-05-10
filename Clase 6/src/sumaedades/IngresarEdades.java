package contadorsuma;

import java.util.Scanner;

public class IngresarEdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int suma = 0;
        int contador = 1;
        int edad = 0;
        String cadenafinal = String.format("%s\t%s\n","Edad","Suma");
        while (contador <= 5){
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            suma = suma + edad;
            cadenafinal = String.format("%s%d\t%d\n",cadenafinal,edad,suma);
            contador = contador + 1;
        }
        System.out.printf("%s",cadenafinal);

    }
}
