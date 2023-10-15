/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladora;

import Clases.cLibro;

public class mainCola {

    
    public static void main(String[] args) {
        int n=5;
        Cola oLibrosCola=new Cola(n);
        
        cLibro libro1 = new cLibro("Hamlet", 0);
        cLibro libro2 = new cLibro("La odisea", 1);
        cLibro libro3 = new cLibro("Romeo", 0);
        cLibro libro4 = new cLibro("La iliada", 1);
        cLibro libro5 = new cLibro("La peste", 0);
        
        oLibrosCola.insertaLibro(libro1);
        oLibrosCola.insertaLibro(libro2);
        oLibrosCola.insertaLibro(libro3);
        oLibrosCola.insertaLibro(libro4);
        oLibrosCola.insertaLibro(libro5);
        
        
        
        System.out.println(oLibrosCola.muestraLibros());
        oLibrosCola.eliminaElemento();
        System.out.println(oLibrosCola.muestraLibros());
        
        //Devuelve el indice del elemento con mayor prioridad
        
        
    }
    
}
