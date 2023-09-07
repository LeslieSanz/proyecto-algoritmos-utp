/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yoss;

/**
 *
 * @author yosse
 */
public class BusquedaDoble {
    private int arreglo[];
    public BusquedaDoble(int n) {
        arreglo= new int[n];
    }
    
    public int busqueda(String valor){
        int indMayor=arreglo.length-1, ind=0;  //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (ind<indMayor && arreglo.equals(valor)) {
            ind++;
        }
        if (arreglo.equals(valor)) 
            return ind;
        else return -1;
    }
}
