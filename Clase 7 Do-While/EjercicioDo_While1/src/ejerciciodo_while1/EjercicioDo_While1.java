package ejerciciodo_while1;
import java.util.Scanner;
public class EjercicioDo_While1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        boolean pregunta = true;
        int contador = 1;
        int contador2;
        int partidos;
        int pases;
        int s_pases=0;
        int s_goles2=0;
        int s_pases2=0;
        double p_pases;
        int goles;
        double p_goles;
        int s_goles=0;
        System.out.print("Bienvenido al sistema de reportes de jugadores\n");
        System.out.print("Ingrese el nombre del equipo: ");
        String equipo = entrada.nextLine();
        System.out.print("Ingrese la cantidad de partidos que se desean ingresar: ");
        partidos = entrada.nextInt();
        String cadenafinal = String.format("\n\nReporte de Jugadores del equipo \"%s\"\n\n",equipo);
        cadenafinal = String.format("%s%s\t%s\t\t%s\t%s\n",cadenafinal,"Nombre del jugador","Total de pases","Total goles"
                    ,"Nivel del jugador");
        entrada.nextLine();
        do{
            System.out.print("Ingrese el nombre del jugador "+contador+": ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese el apellido del jugador "+contador+": ");
            String apellido = entrada.nextLine();
            cadenafinal = String.format("%s\n%s %s\t",cadenafinal,nombre,apellido);
            
            for (contador2 = 1; contador2 <= partidos;contador2++){
                System.out.print("Ingrese la cantidad de pases en el partido "+contador2+": ");
                pases = entrada.nextInt();
                System.out.print("Ingrese la cantidad de goles en el partido "+contador2+": ");
                goles = entrada.nextInt();
                s_pases = pases + s_pases;
                s_goles = goles + s_goles;
                cadenafinal = String.format("%s\tP%d:%d\t\t\tP%d:%d\n\t\t",cadenafinal,contador2,pases,contador2,goles);
                entrada.nextLine();
            }
            cadenafinal = String.format("%s\n\t\t\tTotal: %d\t\tTotal: %d",cadenafinal,s_pases,s_goles);
            if (s_pases >= 100){
               cadenafinal = String.format("%s\tExcelente\n\n",cadenafinal);
            }else{
                if (s_pases <= 99 && s_pases >=80){
                    cadenafinal = String.format("%s\tMuy bueno\n\n",cadenafinal);
                }else{
                    if (s_pases <= 79 && s_pases >=60){
                        cadenafinal = String.format("%s\tBueno\n\n",cadenafinal);
                    }else{
                        if (s_pases <= 59 && s_pases >=0){
                            cadenafinal = String.format("%s\tRegular\n\n",cadenafinal);
                        }
                    }
                }
            }
            System.out.print("¿Desea ingresar mas jugadores?\n");
            String temporal = entrada.nextLine();
            temporal = temporal.toUpperCase();
            if (temporal.equals("NO")||temporal.equals("SALIR")){
                pregunta = false;
            }
            contador = contador +1;
            s_goles2=s_goles+s_goles2;
            s_pases2=s_pases+s_pases2;
            s_goles = 0;
            s_pases = 0;
        }while (pregunta);
        p_pases = s_pases2/(contador-1);
        p_goles = s_goles2/(contador-1);
        cadenafinal=String.format("%s\n%d Jugadores Analizados.\nPromedio de pases por equipo es: %.0f\n"
                + "Promedio de goles por equipo es: %.0f\n",cadenafinal,contador-1,p_pases,p_goles);
        System.out.print(cadenafinal);
    }
}
