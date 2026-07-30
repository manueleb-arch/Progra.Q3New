/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion_de_vehiculo;

import java.util.Scanner;

/**
 *
 * @author manue
 * Objetivo
 * Estructura de seleccion
 * 1. Estructura o formato
 *  a. Palabras claves
 *  b. Bloques
 *  c. Terminaciones
 *  d. Condiciones
 *2. tios de Seleccion
 *   a. Simple
 *  b. Doble
 * 3. Condiciones
 *  a. Tipos de Condiciones
 *      i. > -> mayor
 *      ii < -> menor
 *      iii >= -> mayor o igual
 *      
 *  b. Tipos de Comparacion
 */
public class Seleccion_de_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un algoritmo que me permita determinar los siguientes elementos 
        de un vehiculo
            a. Si el tamanio del tanque de conbustible agarra mas de 30 litros (Datos Numericos)
                                                                                (Dato tipo caracter)
                                                                                (Dato cadena)
            b. El tipo de combustible si es o no Diesel (Dato tipo caracter)
            c. Si energeticamente eficiente y ecologica (Dato de cadena)
        
        */
        Scanner entrada = new Scanner(System.in);
        int cantidadl=0;
        char respuestotipo = '@';
        String respuestacadena = "John Doe" ;
        
        
        System.out.println("Me digieron que eres duenio de un vehiculo "+ "\"Verde\"");
        System.out.println("Tienees que echarle biodisel");
        System.out.println("Cuantos litros te agarra");
        cantidadl = entrada.nextInt();
        
        if(cantidadl>30){
            //Condicion Verdadera
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta?");
        }//fin del if
        
        entrada.nextLine();// Limpia el buffer
        System.out.println("Tu vehiculo es Diesel Verde? ( x = si, y = no)");
        respuestotipo = entrada.nextLine().charAt(0);
        System.out.printf("\n Respuesta Dada: %c",cantidadl );
        
        /*
         entrada.nextLine();// Limpia el buffer
        System.out.println("Tu vehiculo es Diesel Verde? ( x = si, y = no)");
        respuestotipo = entrada.nextLine().charAt(0);
        System.out.printf("\n Respuesta Dada: %c",cantidadl );
        */
        
        if(respuestotipo =='x'){//El if es la condicion que se establece como verdadera si es falso se va a buscar lo que contenga el else.
            System.out.println("Si el diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }//fin del if
        
        else//Es la condicion falsa / al no encontrar la condicion verdadera que se ha establecido en el if.
        {
            System.out.println("Uyyy...eres anticlimatico");
            System.out.println("Calentamiento Global!!!");
        }//fin del else
        
        System.out.println("");
        System.out.println("Tu carro es energeticamente eficiente");
        respuestacadena = entrada.nextLine();
        System.out.printf("Respuesta Ingresada: %s",respuestacadena);
        /*
        System.out.println("\nSeguro que es asi");
        respuestacadena = entrada.nextLine().toUpperCase();//toUpperCase es para mayuscucas ala hora de capturar datos
        System.out.printf("Respuesta Ingresada: %s",respuestacadena);
        
        System.out.println("\n100% Seguro?");
        respuestacadena = entrada.nextLine().toLowerCase();//toLowerCase es para las minusculas esta funcion las combierte.
        System.out.printf("Respuesta Ingresada: %s",respuestacadena);
        */
        
        if(respuestacadena.equals("si")){
            System.out.println("Exelente");
            System.out.println("Amigable con el ambiente");
        
    }//fin del if
        
        else{
            System.out.println("Uyy...busca que se puede hacer");
        }//fin del else
        
        
        
        
    }//fin del main
    
}//fin del class
