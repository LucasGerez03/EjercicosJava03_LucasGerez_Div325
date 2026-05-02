package ejercicioc04;

import java.util.ArrayList;

/**
Crear una aplicación de consola que contenga la clase del siguiente diagrama:

*La clase Estudiante tendrá: 
* Tendrá un bloque estático que inicializará el atributo estático random.
● Tendrá un constructor de instancia que inicializará los atributos nombre, apellido y legajo.
● El método setter setNotaPrimerParcial permitirá cambiar el valor del atributo notaPrimerParcial.
● El método setter setNotaSegundoParcial permitirá cambiar el valor del atributo notaSegundoParcial.
● El método privado calcularPromedio retornará el promedio de las dos notas.
● El método calcularNotaFinal deberá retornar la nota del final con un número aleatorio entre L y 10
incluidos siempre y cuando las notas del primer y segundo parcial sean mayores o iguales a 4, caso
contrario la inicializará con el valor -1.
● El método mostrar deberá armar una cadena de texto con todos los datos de los alumnos:
○ Nombre, apellido y legajo.
○ Nota del primer y segundo parcial.
○ Promedio.
○ Nota final. Se mostrará sólo si el valor es distinto de -1, caso contrario se mostrará la leyenda
"Alumno desaprobado".
En el método main:
1. Crear tres instancias de la clase Estudiante (tres objetos).
2. Cargar las notas del primer y segundo parcial a todos los alumnos. Dos deberán estar aprobados y
uno desaprobado.
3. Mostrar los datos de todos los alumnos.
Nota: Para darle un valor aleatorio a la nota final utilice el método de instancia nextInt de la clase Random.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------Sistema de Notas 1er y 2do Parcial--------------------");
        
        //Instancio los 3 estudiantes
        Estudiante estudiante1 = new Estudiante("Gerez", "118463", "Lucas");
        Estudiante estudiante2 = new Estudiante("Messi", "222222", "Lionel");
        Estudiante estudiante3 = new Estudiante("Torrente", "333333", "Gonzalito");
        
        //-----------------------------------------------------
        //Cargo las notas de cada estudiante
        //Estudiante1
        estudiante1.setNotaPrimerParcial(10);
        estudiante1.setNotaSegundoParcial(9);
        
        //Estudiante2
        estudiante2.setNotaPrimerParcial(4);
        estudiante2.setNotaSegundoParcial(4);
        
        
        //Estudiante3
        estudiante3.setNotaSegundoParcial(5);
        
        //-----------------------------------------------------
        //Instancio y Declaro la lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        
        //-----------------------------------------------------
        //Recorro la lista de estudiantes
        for (Estudiante e : estudiantes){
            System.out.println(e.mostrar());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        
    }
    
}
