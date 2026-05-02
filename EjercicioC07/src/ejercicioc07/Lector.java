/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc07;

/**
 *
 * @author Usuario
 */
public class Lector {
    private String nombre;
    private Libro libroPrestado;
    
    //----------------------------------------------
    //Constructor

    public Lector(String nombre) {
        this.nombre = nombre;
    }
    //----------------------------------------------
    //setters

    private void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
    
    
    //----------------------------------------------
    //metodos
    
    public void tomarPrestado(Libro libro){
        if(libro.isDisponible()){
            this.libroPrestado = libro;
        }
        libro.prestar(); //cambia su disponibilidad
    }
    
    public void devolverLibro(){
        libroPrestado.devolver();
        setLibroPrestado(null);
    }

    public void mostrarInformacion() {
        String cadena = "";
        if(this.libroPrestado == null){
            cadena = "No tiene un libro Seleccionado";
        }else{
            cadena = libroPrestado.getTitulo();
        }
        
        System.out.println("*".repeat(12) + "INFORMACION DEL LECTOR" + "*".repeat(12));
        System.out.println("Nombre del Lector: " + this.nombre);
        System.out.println("Libro del Lector: " + cadena);
    }
    
    
    
    
    
    
    
}
