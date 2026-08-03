/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_con_dos_variables;

import java.util.Scanner;

/**
 *
 * @author manue
 * 1. Cálculo con dos variables Escribir un programa que solicite
 * al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del
* rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en
* pantalla.
 */
public class Calculo_con_dos_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Variable = new Scanner(System.in);
        
        double base =0;
        double altura =0;
        double area =0;
        double perimetro = 0;
        
        System.out.println("========================================");
        
            System.out.println("\nIngresa la base del rectangulo en (m)");
            base = Variable.nextInt();
        System.out.println("========================================");
            
            System.out.println("\nIngresa la altura del rectangulo en (m)");
            altura = Variable.nextDouble();
        System.out.println("========================================");

                area = base * altura;
                perimetro = 2* base + 2 * altura;
              System.out.printf("\n El area es de :%.0fm",area);
              System.out.println("");
        System.out.println("========================================");

//              System.out.printf("\n El perimetro es de :%.0fm",perimetro);
              System.out.println("");        
        System.out.println("========================================");

    }//fin del main
    
}//fin de class
