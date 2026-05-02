package ejercicioc03;

import java.util.ArrayList;
import java.util.Calendar;

/*[C.03] - ¿Vos cuántas primaveras tenés?
Crear una aplicación de consola que contenga la clase Persona.
Deberá tener los atributos:
● nombre
● fechaDeNacimiento
● dni
Deberá tener un constructor que inicialice todos los atributos.
Construir los siguientes métodos para la clase:
● setter y getter para cada uno de los atributos.
● calcularEdad será privado y retornará la edad de la persona calculada a partir de la fecha de
nacimiento.
● mostrar retornará una cadena de texto con todos los datos de la persona, incluyendo la edad actual.
● esMayorDeEdad si es mayor de edad devuelve el valor “Es mayor de edad", sino devuelve “es
menor”.
Instanciar 3 objetos de tipo Persona en el método main. Mostrar quiénes son mayores de edad y quiénes no.*/

public class Main {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        System.out.println("---------------------INICIANDO PROGRAMA--------------------");
        
        cal.set(2003, Calendar.NOVEMBER, 22);
        Persona persona1 = new Persona("lucas gerez", cal.getTime(), "67.767.676");
        
        cal.set(1995, Calendar.MAY, 18);
        Persona persona2 = new Persona("Carlos", cal.getTime(), "12345678");

        cal.set(2008, Calendar.DECEMBER, 15);
        Persona persona3 = new Persona("Ana", cal.getTime(), "87654321");
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        
        for (Persona p : personas){
            System.out.println(p.mostrar() + p.esMayorDeEdad());
             System.out.println("///////////////////////////////////////////////////////////////");
        }
        
    }
    
}
