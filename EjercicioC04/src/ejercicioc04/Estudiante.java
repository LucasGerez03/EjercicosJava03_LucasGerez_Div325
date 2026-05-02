package ejercicioc04;

import java.util.Random;

public class Estudiante {
    //----------------------------------------------------
    //Atributos
    private String apellido;
    private String legajo;
    private String nombre;
    private int notaPrimerParcial;
    private  int notaSegundoParcial;
    private static Random random;
    //----------------------------------------------------
    //Bloque estatico
    static{
        random = new Random();
    }
    
    //----------------------------------------------------
    //Constructor
    public Estudiante(String apellido, String legajo, String nombre) {
        this.apellido = apellido;
        this.legajo = legajo;
        this.nombre = nombre;
    }
    //----------------------------------------------------
    //Setters
    public void setNotaPrimerParcial(int notaPrimerParcial) {
        this.notaPrimerParcial = notaPrimerParcial;
    }

    public void setNotaSegundoParcial(int notaSegundoParcial) {
        this.notaSegundoParcial = notaSegundoParcial;
    }
    
    //----------------------------------------------------
    //Metodos
    private float calcularPromedio(){
        return (this.notaPrimerParcial + this.notaSegundoParcial) / 2f;
    }
    
    public double calcularNotaFinal(){ //DUDA porque es publico y no privado?(asi lo aclara en el ejercicio) 
        if (notaPrimerParcial >= 4 && notaSegundoParcial >= 4 ){ //si no se usa en el main ni se instancia
            return random.nextInt(7) + 4;
        }else{
            return -1;
        }
    }
    
    public String mostrar(){      
        double notaFinal = calcularNotaFinal(); //calculo la nota y si el alumno aprobó o no
        String notaFinalString = (notaFinal != -1) ? String.valueOf(notaFinal) : "Alumno desaprobado"; //ternario para descartar que este desaprobado
        
        return  "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Legajo: " + this.legajo + "\n" +
                "Nota de Primer Parcial: " + this.notaPrimerParcial + "\n" +
                "Nota de Segundo Parcial: " + this.notaSegundoParcial + "\n" +
                "Promedio: " + calcularPromedio() + "\n" +
                "Nota final:" + notaFinalString;
    }
    
    
}
