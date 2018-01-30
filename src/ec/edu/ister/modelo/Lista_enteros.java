/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author Alfonso
 */
public class Lista_enteros {
    
    protected Nodo primero;

    public Lista_enteros() {
        primero=null;
    }
    public Lista_enteros insertarCabezaLista(int entrada){
        
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.enlace=primero;
        primero = nuevo;
        
        return this;
    }
    
    public void visualizar(){
        
        Nodo n;
        int k=0;
        n=primero;
        while(n != null){
            System.out.print(n.dato + "  ");
            n=n.enlace;
            k++;
            System.out.print((k%15 !=0 ? " " : "\n"));
        }   
    }
}
    

