/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloword;

/**
 *
 * @author manuel
 */
public class Helloword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sirve para comentar una sola linea
        /*
        Pleca asterisco -> Abrir bloque comentario
        Asterisco pleca -> Cerrar el bloque comentario
        
        Todo lo de enmedio...es un comentario
        */
        /* 
        1. Imprimir en pantalla
        a. Salidas formateadas
        b. Caracteres de Escape
        2. Captura de datos
        */
        
        System.out.println("Hola ..me llamo manuel");
        System.out.println("Este sera mi 1er");
        System.out.println("Programaaaaaa!!!!!!!");
        System.out.print("________________________________");
        System.out.println();
        
        System.out.print("Vamos de camino");
        System.out.print("la clase de");
        System.out.print("Progra");
        
        System.out.println("");
        
        
        System.out.printf("Tu apellido %s es", "Barahona");
        System.out.println("");
        
        System.out.printf("%S Tu apellido es","Barahona");
        System.out.println("");
        
        System.out.printf("Tu apellido%S es", "Barahona");
        System.out.println("");
        System.out.println("Hola \n este es \n un nuevo \n amanecer");
        System.out.print("--------------------------\n");
        
        System.out.println("Hola \t este es \t un nuevo \t amanecer");
       /*
        \n es para un salto de linea
        \t es para un tabulado en el parrafo
        */
        
       //Variable
       int edad; //Tipo entero
       double peso; //Tipo decimal
       char inicial; //Tipo Caracter -> letras, digitos, simbolo especiales
       String nombre; //Tipo cadena
       boolean estado; //Tipo estado-> true(verdadero) / False(falso)
       
       edad = 21; 
       peso = 60.5;
       inicial = 'M';
       nombre = "Manuel";
       
        System.out.printf("Tengo %d anios \n ", edad);
        System.out.printf("Mi peso edeal es %.2f \n", peso);
        System.out.printf("Dime %c por mi inicial \n", inicial);
        System.out.printf("%s es mi nombre \n", nombre);
       
       
       
    }//fin de main
    
}//Fin de class
