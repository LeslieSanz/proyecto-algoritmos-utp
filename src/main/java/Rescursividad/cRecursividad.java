/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rescursividad;

import Clases.cLibro;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yosse
 */
public class cRecursividad {
     private cLibro oLibros[];
       private int ind;


    public cRecursividad(int n) {
       oLibros= new cLibro[n];
        ind=-1;

    }

  public void insertarLibro(cLibro libro){
        int indMax=oLibros.length-1;
        if (ind < indMax) {//si es menor siginifica que todavia ouede llenarse
            ind++;
            oLibros[ind] = libro; //que se almacene en el arreglo de objetos oLibros
        }
    }


      public String mostrar(int posicion) {
        if (posicion == oLibros.length) {
            return "SE COMPLETÒ EL ARREGLO";
        } else {
            return oLibros[posicion].getISBN() + " " +oLibros[posicion].getTitulo() + " "+
                    oLibros[posicion].getAñoPub()+"\n"+mostrar(posicion + 1)+ " " ;
        }
    }

    public String  muestraF() {
        return mostrar(0); // Inicia la recursión desde la posición 0
    }
    
     private int suma(int indice) {
        if (indice == oLibros.length || indice < 0) {
            return 0; // Si el índice está fuera de los límites, retorna 0 para detener la suma.
        } else {
            return oLibros[indice].getAñoPub() + suma(indice + 1);
        }
    }

    public int calcularSuma() {
        return suma(0); // Inicia la recursión con el índice 0.
    }
    
    
    
}
