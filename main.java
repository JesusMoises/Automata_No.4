/**
 * El lenguaje que contiene todas las cadenas que terminan con aa
 */
public class main{
    //declaración de cadena
    public static String cadena;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //establecemos el valor de la cadena a evaluar
        cadena = "bcaa";
         //creamos un objeto y mandamos cómo parámetro la cadena que será evaluada
        Automata4 miAut = new Automata4(cadena);
    }//fin del método main

}//fin de la clase main