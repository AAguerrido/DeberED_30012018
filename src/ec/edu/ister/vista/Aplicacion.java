
package ec.edu.ister.vista;
import ec.edu.ister.modelo.Lista_enteros;
import java.util.Random;

/**
 *
 * @author Alfonso
 */
public class Aplicacion {
     public static void main(String[] args) {
        Random r;
        int d;
        Lista_enteros lista;
        int k;
        
        r=new Random();
        lista = new Lista_enteros();
        k=Math.abs(r.nextInt()%55);
        
        
        for (; k >0; k--) {
            
            d=r.nextInt() %99;
            lista.insertarCabezaLista(d);
        }
        System.out.println("ELEMENTOS DE LA LISTA GENERADOS AL AZAR");
        lista.visualizar();
    }
    
}
