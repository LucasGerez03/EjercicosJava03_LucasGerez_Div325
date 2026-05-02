
package ejercicioc07;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    
    //--------------------------------------
    //Constructor
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    //--------------------------------------
    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    //--------------------------------------
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //--------------------------------------
    //metodos
    public void mostrarInformacion(){
        String cadena = "";
        if(this.disponible){
            cadena = "Se encuentra Disponible";
        }else{
            cadena = "NO se encuentra Disponible";
        }
        
        System.out.println("-".repeat(12) + "INFORMACION DEL LIBRO" + "-".repeat(12));
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponibilidad: " + cadena);
    }
    
    public void prestar(){
        setDisponible(false);
    }
    
    public void devolver(){
        setDisponible(true);
    }
    
}
