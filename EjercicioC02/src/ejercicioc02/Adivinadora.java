/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Adivinadora {
    //------------------------------------------------------
    //atributos
    int numeroSecreto;
    int intentos;
    int dificultad = 0;
    int limiteIntentos = 0;
    
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    
    //------------------------------------------------------
    //Constructor
    public Adivinadora(){
        
        this.numeroSecreto = random.nextInt(300) + 1;
        this.intentos= 0;
    }
    //------------------------------------------------------
    //metodo adivinar
    public void adivinar(int unNumero){
        intentos++;
        if (unNumero > numeroSecreto){
            System.out.println("El numero secreto es MENOR al Ingresado\n");
        }else if(unNumero < numeroSecreto){
            System.out.println("El numero secreto es MAYOR al Ingresado\n");
        }else{
            System.out.println("Adivinaste el numero!!! El numero es: " + unNumero);
            System.out.println("Intentos Realizados: " + intentos + "\n");
        }
    }
    //------------------------------------------------------
    //metodo elegir la dificultad
    public void elegirDificultad(){
        System.out.println("Elija su dificultad");
        System.out.println("1_Facil (intentos ilimitados)");
        System.out.println("2_Medio (50 intentos)");
        System.out.println("3_Dificil (10 intentos)");
        
        while ( true ) {
            
            while (!sc.hasNextInt()){
                System.err.println("ERROR!!!: Ingresar un numero entero Porfavor");
                sc.next();
            }
            dificultad = sc.nextInt();
            if((dificultad > 3) || (dificultad < 1)){
                System.err.println("Numero Ingresado INCORRECTO, selecione una opcion valida");
                System.err.println("////////////////////////[1,2,3]////////////////////////");
            }else{
                break;
            }
            
        }
        
        switch (dificultad) {
            case 1:
                this.limiteIntentos = -1;
                break;
            case 2:
                this.limiteIntentos = 50;
                break;

            case 3:
                this.limiteIntentos = 10;
                 break;
            default:
                throw new AssertionError();
        }
    }
    //------------------------------------------------------
    //getters
    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getLimiteIntentos() {
        return limiteIntentos;
    }
    //------------------------------------------------------
    
    
}
