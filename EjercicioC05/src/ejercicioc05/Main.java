package ejercicioc05;
/*En un proyecto de biblioteca de clases, crear la clase Boligrafo a partir del siguiente diagrama:
● La cantidad máxima de tinta para todos los bolígrafos será de 100. Generar una constante
CANTIDAD_MAXIMA_TINTA en Boligrafo donde se guardará dicho valor.
● Generar los métodos getter getColor y getTinta para los correspondientes atributos (sólo retornarán
el valor de los mismos).
● Generar un método setter privado setTinta que valide el nivel de tinta y, si es válido, modifique el
valor del atributo tinta.
○ El argumento de tipo short contendrá la cantidad de tinta a agregar o quitar. Podrá ser
positivo (cargar tinta) o negativo (gastar tinta).
○ Se deberá validar que el nivel de tinta resultante sea mayor o igual a cero y menor o igual a
CANTIDAD_MAXIMA_TINTA. Si no es válido, no se deberá modificar el atributo ni realizar
ninguna acción.
● El método recargar colocará la tinta en su nivel máximo. Reutilizar código.
● El método pintar restará la tinta gastada (reutilizar código). El parámetro gasto representará la
cantidad de unidades de tinta a utilizar y utilizará tanta tinta como tenga disponible sin quedar en
negativo. El método retornará cómo resultado una cadena con tantos * como unidades de tinta haya
gastado, por ejemplo:
○ Si no había nada de tinta retornará una cadena de texto vacía.
○ Si el nivel de tinta era 10 y la cantidad a gastar 2, entonces retornará **.
○ Si el nivel de tinta era 3 y la cantidad a gastar 10, entonces retornará ***.
1. Agregar el .jar en un nuevo proyecto de consola.
2. En el método main, crear un bolígrafo de tinta azul y una cantidad inicial de tinta de 100 unidades y
otro de tinta roja y 50 unidades de tinta.
3. Utilizar todos los métodos y mostrar los resultados por consola.
4. Al utilizar el método pintar, si corresponde, se deberá dibujar por pantalla con el color de dicho
bolígrafo.
*/

public class Main {

    public static void main(String[] args) {
        
        //------------------------------------------------------------------------
        //Instancindo boligrafos
        Boligrafo boligrafoAzul = new Boligrafo("Azul", (short) 100);
        Boligrafo boligrafoRojo = new Boligrafo("Rojo", (short) 50);
        
        //------------------------------------------------------------------------
        System.out.println("-------------------------INICIANDO PROGRAMA DE BOLIGRAFOS-------------------------");
        //Pintar, gastando las unidades de tinta disponibles
        System.out.println(boligrafoAzul.pintar((short) 10));
        System.out.println("-".repeat(15));
        
        System.out.println(boligrafoRojo.pintar((short) 55));
        System.out.println("-".repeat(15));
        
        //------------------------------------------------------------------------
        //Recargar la tinta al maximo (100)
        System.out.println("Recargando tinta...");
        boligrafoAzul.recargar();
        boligrafoRojo.recargar();
        
        //------------------------------------------------------------------------
        //Verificar niveles de tinta y el color del boligrafo
        System.out.println("Tinta del boligrafo 1: " + boligrafoAzul.getTinta() + "\nColor: " + boligrafoAzul.getColor());
        System.out.println("-".repeat(15));
        System.out.println("Tinta del boligrafo 2: " + boligrafoRojo.getTinta() + "\nColor: " + boligrafoRojo.getColor());
        
        
        //------------------------------------------------------------------------
        //Verificar niveles de tinta y el color del boligrafo
        
    }
    
}
