/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc05;

/**
 *
 * @author Usuario
 */
public class Boligrafo {
    //--------------------------------------------------------
    //Atributos
    private short CANTIDAD_MAXIMA_TINTA;
    private String color;
    private short tinta;
    
    //--------------------------------------------------------
    //Constructor

    public Boligrafo(String color, short tinta) {
        this.color = color;
        this.tinta = tinta;
        this.CANTIDAD_MAXIMA_TINTA= 100;
    }
    
    //--------------------------------------------------------
    //getters
    public String getColor() {
        return color;
    }

    public short getTinta() {
        return tinta;
    }
    //--------------------------------------------------------
    //setters

    private void setTinta(short tinta) {
        if ( (tinta <= this.CANTIDAD_MAXIMA_TINTA) && (tinta >= 0) ){
            this.tinta = tinta;
        }
    }
    //--------------------------------------------------------
    //metodos
    public void recargar(){
        setTinta(this.CANTIDAD_MAXIMA_TINTA);
    }
    
    public String pintar(short gasto){
        
        //Si no hay tinta, devuelve una cadena vacia
        if(this.tinta == 0){
            return " ";
        }
        
        //Si hay tinta, entonces imprime dependiendo la cantidad de tinta y gasto
        String cadenaGasto;
        if(gasto >= tinta){
            cadenaGasto = "*".repeat(tinta);
            setTinta((short) 0);
        }else{
            cadenaGasto = "*".repeat(gasto);
            setTinta((short)(tinta - gasto));
        }
          
        return "Iniciando Gasto de Tinta" + "\n" +
        "Unidades Disponibles para gastar: " + this.tinta + "\n" +
        "Unidades a Gastar: " + gasto + "\n" +
        "Imprimiendo gasto: \n" + cadenaGasto;
        
    }   
    
}
