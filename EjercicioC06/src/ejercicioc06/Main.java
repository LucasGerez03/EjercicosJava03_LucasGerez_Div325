
package ejercicioc06;
/*
[C.0L] - Prueba de geometría
En un proyecto de biblioteca de clases, crear las clases modeladas en el siguiente diagrama:
Ambas clases deberán encontrarse dentro del paquete Geometria.
La clase Punto debe tener:
● Dos atributos privados con acceso de sólo lectura (sólo con getters), que serán las coordenadas del
punto.
● Un constructor que reciba los parámetros x e y.
La clase Rectangulo:
● Tiene los atributos de tipo Punto: vertice1, vertice2, vertice3 y vertice4 (que corresponden a los
cuatro vértices del rectángulo).
● La base de todos los rectángulos de esta clase será siempre horizontal. El constructor calculará los
vértices 2 y 4 del rectángulo a partir de los vértices 1 y 3. Utilizar el método abs de la clase Math que
retorna el valor absoluto de un número y será necesario para obtener la distancia entre puntos.
● Realizar los métodos getters para los atributos privados area y perimetro.
● El área (base * altura) y el perímetro(base + altura) / 2) se deberán calcular sólo una vez cuando se
llame por primera vez a su correspondiente método getter. En las siguientes invocaciones de dichos
métodos se deberá retornar siempre el valor calculado anteriormente.
1. Agregar el .jar en un nuevo proyecto de consola.
2. En la clase que contiene al método main, desarrollar un método de clase (estático) que muestre todos
los datos de una instancia de Rectangulo que reciba como parámetro.
3. En el método main probamos las funcionalidades de las clases Punto y Rectángulo.
1. Instanciar un nuevo Rectangulo.
2. Imprimir por pantalla los valores de área y perímetro.
*/
public class Main {

    public static void main(String[] args) {
        //---------------------------------------------------
        //instanciando variables
        Punto p1 = new Punto(7, 2);
        Punto p3 = new Punto(2, 7);
        Rectangulo miRect = new Rectangulo(p1, p3);
        
        
        //---------------------------------------------------
        //imprimir datos del rectangulo
        System.out.println("--- INICIANDO PROGRAMA ---");
        
        //primera vez
        mostrarDatosRectangulo(miRect);
        
        //segunda vez
        mostrarDatosRectangulo(miRect);
        
        
    }
    
    //metodo estatico
    public static void mostrarDatosRectangulo(Rectangulo r) {
        System.out.println("--- Datos del Rectangulo ---");
        System.out.println("area: " + r.getArea());
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("----------------------------");
    }
    
}

