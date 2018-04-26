package tareaextraclase3;

import java.util.Scanner;

public class ReporteDeEmpresa {
    public static void main (String[] args){
    
    Scanner entrada = new Scanner (System.in);
    
    int subt;
    int tipo;
    int celular;
    int precio = 300;
    String nombre;
    String apellido;
    
    
    System.out.println("Bienvenido a la tienda de celular, por favor ingrese un tipo de cliente(del 1 al 3)");
    
    tipo = entrada.nextInt();
    
    if (tipo < 1 || tipo > 3){
        do{
            System.out.println("Por favor, ingrese un número entero entre 1 y 3");
            tipo = entrada.nextInt();
        }while (tipo < 1 || tipo > 3);
    }
    
    entrada.nextLine();
    System.out.println("Ingrese su nombre:");
    nombre = entrada.nextLine();
    
    System.out.println("Ingrese su apellido:");
    apellido = entrada.nextLine();
    
    System.out.println("Ingrese cantidad de celulares a comprar");
    celular = entrada.nextInt();
    
    subt = (celular*precio);
    
    System.out.print("Nombre: " + nombre + apellido + "\nTipo de cliente: " + tipo + "\nCantidad de celulares: " + celular +
            "\nPrecio por celular: " +precio+ "\nSubtotal a pagar: " +subt+"\nDescuento: " +((tipo * 0.1)*(celular*precio))+
            "\nValor final a pagar: " +(subt*(1 - tipo*0.1))+"\n");
    
    }
}
