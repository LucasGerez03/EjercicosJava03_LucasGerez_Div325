
package ejercicioc03;

import java.util.Calendar;
import java.util.Date;


public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;
    private String dni;

    public Persona(String nombre, Date fechaDeNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }
    
    //------------------------------------------------------
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //------------------------------------------------------
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getDni() {
        return dni;
    }
    
    //------------------------------------------------------
    //Metodos
    //Uso calendar para no usar metodos "tachados" de Date como getYear() o getMonth(), para mayor eficiencia 
    private int calcularEdad(){
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(this.fechaDeNacimiento);
        
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }

        return edad;

    }

    public String mostrar() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", dni=" + dni + '}' + "\n";
    }
    
    public String esMayorDeEdad(){
        if(calcularEdad() >= 18){
            return "Es mayor de edad";
        }else{
            return "Es Menor de edad";
        }
    }
    
    
}
