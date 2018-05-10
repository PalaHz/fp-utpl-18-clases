package ejerciciofinal;

import java.util.Scanner;

public class EjercicioEnClase6 {
 
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        int contador = 1;
        double suma = 0;
        double promedio ;
        boolean pregunta = true;
        System.out.println("Ingrese las estaturas");
        String salidafinal = ("Edad Estudiante\n");
        while (pregunta){
            System.out.printf("Ingrese la estatura %d\n", contador);
            double valor = entrada.nextDouble();
            if (valor < 1.20){
            valor = 1.20;
        }
            suma = suma + valor;
            salidafinal = salidafinal + String.format("%.2f\n",valor); 
            contador = contador + 1;
            
            entrada.nextLine();
            System.out.println("¿Desea ingresar mas estaturas? No(Salir)");
            String temporal = entrada.nextLine();
            temporal = temporal.toUpperCase();
            if(temporal.equals("NO")){
                pregunta = false;
            }
        }
        contador = contador -1;
        promedio = suma/contador;
        System.out.printf("Reporte de Estaturas:\n\n%s\nPromedio de estaturas: %.2f\nReporte generado por Dep. Deportes\n"
                ,salidafinal,promedio);
        
    }
}