package tareaextraclase3;

import java.util.Scanner;

public class ValoresXY {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el valor para X");
        int valx = entrada.nextInt();
        if (valx < 0){
            int valy = (3*valx+10);
            System.out.println("X<0,Y=3*X+10, por lo que el valor de Y es "+valy);
        }else{
            if(valx > 0){
                int valy  = (valx*2+6);
                System.out.println("X>0,Y=X*2+6, por lo que el valor de Y es "+valy);
            }else{
                int valy = 1;
                System.out.println("X=0, por lo que el valor de Y es "+valy);
            }
        }
    }
}
