
package ejercicioc07;

public class Main {

   
    public static void main(String[] args) {
        Libro libro1 = new Libro("EL OSITO TITO", "Tito el abuelito", true);
        Libro libro2 = new Libro("EL osoto toto, LA VENGANZA", "Tito el sobrinito", false);
        Libro libro3 = new Libro("EL Osito tito, la amenaza rebelde", "TITO EL ABUELITO", true);
        
        Lector lector1 = new Lector("Gonzalo Gonzales de Gonzobia");
        Lector lector2 = new Lector("Martin Martinez Martinera de Martinto");
        
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        
        lector1.mostrarInformacion();
        
        lector2.tomarPrestado(libro3);
        lector2.mostrarInformacion();
        
        libro3.mostrarInformacion();
        lector2.devolverLibro();
        libro3.mostrarInformacion();
    }
    
}
