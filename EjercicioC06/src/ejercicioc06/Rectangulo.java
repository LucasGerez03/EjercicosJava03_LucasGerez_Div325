/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc06;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private float area;
    private float perimetro;
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;
    
    //----------------------------------------------------------
    //Constructor

    public Rectangulo(Punto vertice2, Punto vertice4) {
        this.vertice2 = vertice2;
        this.vertice4 = vertice4;
    }
    
    //----------------------------------------------------------
    //getters

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    
}
