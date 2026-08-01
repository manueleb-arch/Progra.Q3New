/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacion_de_sangre;

import java.util.Scanner;





/**
 *
 * @author manue
 */
public class Donacion_de_sangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        double pesol = 0;
        char comio = 0;
        int niveles = 0;
        String genero = "x";
        
        // Todo code application logic here
        //AND
        /*
                    Dinero          Tiempo          Resultado
                    Si(V)           Si(V)           Si puede Viajar (V)
                    Si (V)          No(V)           No se puede viajar (F)
                    No(V)           Si(V)           No se puede viajar (F)
                    No(V)           No(V)           No se puede viajar (F)
         */
        
        //OR || (O)
        
        /*
            Pasta           Hamburguesas        Resultado
            Si(V)           No(V)               Se puede comer(V)
            Si(V)           No(F)               Se puede comer(V)
            No(F)           Si(V)               Se puede comer(V)
            No(F)           No(F)               Neles, no se puede comer (F)
        */
        
        /*
            Estado de Animo         Resultado
            Si(V)                   No(F)
            No(F)                   Si(V)
       
        */
            System.out.println("Bienbenido al centro de salud de donacion de sangre");
            System.out.println("Porfavor, brindanos los siguientes datos para saber si  eres apto");
            System.out.print("\nIngresetu edad (18 - 65)");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingresa tu peso");
            pesol = entrada.nextInt();


                if(edad>=18 && edad<=65 && pesol>=110){
                    System.out.println("Si se puede donar"); 
                }//fin del if
                else{
                    System.out.println("No se puede donar");
                }//fin de else


                System.out.println("Ya comio");
                comio = entrada.nextLine().charAt(edad);

                    if(comio == 'S' || comio == 'N'){
                        System.out.println("Si se puede donar"); 

                    }//fin de if

                    else {
                        System.out.println("Necesita comer");
                    }//fin de else

                System.out.println("Cuales son sus niveles de hierro");
                niveles = entrada.nextInt();

                System.out.println("Cual es tu genero de sexo (M si eres hombre) - (F si eres Femenino)");
                genero = entrada.nextLine().toUpperCase();

                    if ((niveles >= 14 && genero.equals("M"))|| ((niveles >= 12 && genero.equals("F")))){
                        System.out.println("Si puedes donar sangre");
                    }//fin del if
                    else{
                        System.out.println("No se puede donar sangre");
                    }//find e else


    }//fin del main
    
}//fin de class
