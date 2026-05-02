/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioC01;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    String titular;
    int cantidad;
    
    
    public Cuenta(String titular, int cantidad){
        this.titular= titular;
        this.cantidad= cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void mostrar(){
        System.out.println("///////////////////////////////////////\nTitular: " + titular + "\nCant. de Dinero: " + cantidad + "\n///////////////////////////////////////");
    }
    
    public void ingresar(int montoIngresar){
        if(montoIngresar <= 0){
            System.out.println("Monto Ingresado: Negativo o Cero");
            System.out.println("Ingrese un monto Superior o Igual a 1");
        }else{
            cantidad += montoIngresar;
        }
    }
    
    public void retirar(int montoRetirar){
        cantidad-= montoRetirar;
    }
    
}
