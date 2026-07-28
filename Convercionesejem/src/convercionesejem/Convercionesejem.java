/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convercionesejem;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Convercionesejem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

     /*
        Objetivo 
        1. Orden secuencial de las innstrucciones
        2. Capturar datos desde teclado
        3. Operaciones aritmeticas
        
        Desarrollar un algoritmo que permita convertir los siguientes elementos:
        1. Pulgadas a Centimetros
        2. Kilometros a Millas
        3. Grados farenheit a grados Celsius
        */
     
      double celcius = 0;
      double fareheit = 0;
      
      int pulgadas = 0;
      double resultadosMC = 0;
      
      double kilometros = 0;
      double millas = 0;
      
      pulgadas = 10; // Los datos van de der a IZQ -> =
      resultadosMC = pulgadas * 2.54;
      System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadosMC);
      
      pulgadas = 35;
      resultadosMC = pulgadas * 2.54;
      System.out.printf("\n %.2f cm es igual a %d pulgadas",resultadosMC,pulgadas);
        
      System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("\n %.2f km es igual a %.2f millas",kilometros, millas);
        
        System.out.println(" \n Ingrese los grados farenheit");
        fareheit = teclado.nextDouble();
        celcius = (fareheit - 32)*5/9;
        System.out.printf("\ngrados Celcius %.3f",celcius );
        
        
        
        
    }//fin del main
    
}//fin de class
