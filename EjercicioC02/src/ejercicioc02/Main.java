
package ejercicioc02;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        //declaro y defino mis variables
        Scanner sc = new Scanner(System.in);
        Adivinadora adivinadora = new Adivinadora();
        int numero = 0;
        
        
        //Inicio del programa
        System.out.println("Adivine que numero se esconde del 1 al 300");
        adivinadora.elegirDificultad();
        
        //bucle del programa
        
        //CONDICION: mientras no acierte y le queden intentos, el programa va a seguir
        while( (adivinadora.getNumeroSecreto() != numero) && 
               (adivinadora.getLimiteIntentos() >= adivinadora.getIntentos() ||
               (adivinadora.getLimiteIntentos() == -1) )  ){
           
            System.out.println("Porfavor Ingrese un numero: ");
            
            //validacion de ingresar entero
            while(!sc.hasNextInt()){
            System.err.println("Error: Ingresar un numero entero");
            sc.next();
            }
            numero = sc.nextInt();
            adivinadora.adivinar(numero);
        }
        
    }
    
}
