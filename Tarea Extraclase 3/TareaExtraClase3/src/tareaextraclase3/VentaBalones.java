package tareaextraclase3;

import java.util.Scanner;

public class VentaBalones {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, ingrese la cantidad de balones que desea comprar");
        
        double precio = 10;
        int balon = 0; 
        
        balon = entrada.nextInt();
        if (balon == 1){
            System.out.println("Usted va a comprar 1 balón\nCuyo precio es: "
                    +precio+" Dólares\nSe recibe un descuento del 50%\nEl total a pagar es: "+(precio/2));
        }else{
            if (balon == 2){
                System.out.println("Usted va a comprar " +balon+ " balones\nCuyo precio unitario es: "
                +precio+" Dólares\nSe recibe un descuento del 70%\nEl total a pagar es: "+(precio*balon*0.3));
            }else{
                if (balon >= 3){
                    System.out.println("Usted va a comprar " +balon+ " balones\nCuyo precio unitario es: "
                    +precio+" Dólares\nSe recibe un descuento del 80%\nEl total a pagar es: "+(precio*balon*0.2)); 
                }
            }
        }
    }
}
