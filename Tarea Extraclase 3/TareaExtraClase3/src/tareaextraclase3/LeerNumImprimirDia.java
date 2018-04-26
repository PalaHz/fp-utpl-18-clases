package tareaextraclase3;

import java.util.Scanner;
//Autor: Andrés Palacios
public class LeerNumImprimirDia {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        //Declaracion de variables
        
        String dia = null;
        int numd;
        
        //Ingreso de datos
        
        System.out.println("INGRESE UN NÚMERO DEL 1 AL 7 PARA DETERMINAR EL DÍA DE LA SEMANA");
        numd = entrada.nextInt();
        
        switch(numd){
            case 1:
                dia = "Lunes";
                break;
            
            case 2:
                dia = "Martes";
                break;    
            
            case 3:
                dia = "Miercóles";
                break;
                
            case 4:
                dia =  "Jueves";
                break;
            
            case 5:
                dia =  "Viernes";
                break;
             
            case 6:
                dia =  "Sábado";
                break; 
            
            case 7:
                dia =  "Domingo";
                break;
                
            default:
                System.out.println("POR FAVOR, INGRESE UN NÚMERO ENTRE 1 Y 7 QUE SEA ENTERO"); 
            }
        if (numd > 0 && numd < 8){
            System.out.printf("USTED HA SELECCIONADO EL NUMERO %d ,CUYO DÍA ES %s \n", numd,dia.toUpperCase());
        }
    }
}
