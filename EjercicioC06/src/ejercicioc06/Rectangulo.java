
package ejercicioc06;

/**
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

    public Rectangulo(Punto vertice1, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice3 = vertice3;
        
        this.vertice2 = new Punto(vertice3.getX(), vertice1.getY());
        this.vertice4 = new Punto(vertice1.getX(), vertice3.getY());
    }
    
    //----------------------------------------------------------
    //getters

    public float getArea() {
        if (this.area == 0) {
            float base = Math.abs(vertice1.getX() - vertice3.getX());
            float altura = Math.abs(vertice1.getY() - vertice3.getY());
            this.area = base * altura;
            System.out.println("Calculando area por primera vez...");
        }
        return this.area;
    }

    public float getPerimetro() {
        if (this.perimetro == 0) {
            float base = Math.abs(vertice1.getX() - vertice3.getX());
            float altura = Math.abs(vertice1.getY() - vertice3.getY());
            this.perimetro = (base + altura) * 2;
            System.out.println("Calculando perimetro por primera vez...");
        }
        return this.perimetro;
    }
    
    
    
    
}
