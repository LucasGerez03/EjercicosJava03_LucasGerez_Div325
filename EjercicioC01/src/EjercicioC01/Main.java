/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioC01;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta("Lucas Gerez", 912);
        
        cuenta.mostrar();
        cuenta.ingresar(100);
        cuenta.mostrar();
        cuenta.retirar(5234);
        cuenta.mostrar();
        cuenta.ingresar(-23);
        cuenta.retirar(0);
        cuenta.mostrar();
        
    }
}
