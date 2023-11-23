/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

import Clases.cLibro;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esther
 */
public class Hash {
     private cLibro arreglo[];
     private int m;
     
    public Hash(int n){
        arreglo=new cLibro[n];
        m=arreglo.length;
    }
    
    public void plegamiento(cLibro libro,  JTable tabla){
        int valor = libro.getISBN(); 
        int indice,n1,n2;
        n1=valor/1000;
        n2 = valor%1000;  
        indice = (n1+n2) % m;
        if(arreglo[indice] != null && arreglo[indice].getISBN() != valor){
            indice=colisionVisitaLineal(indice);
        }
        arreglo[indice] = libro;
        actualizarTabla(tabla);
    }
    
    public int colisionVisitaLineal(int indice){
        int j=0, contador=0;
        
        while(arreglo[(indice+j)%m]!=null){
            j++;
            contador++;
            if(contador>m){
                return -1;
            }
        }
        return (indice+j)% m;
    }
    
    
    public int buscarClave(int valor) {
        int indice, n1, n2, contador=0;
        n1 = valor / 1000;
        n2 = valor % 1000;
        indice = (n1 + n2) % m;
        
        if (arreglo[indice] != null && arreglo[indice].getISBN() == valor) {
            return indice; // Si el valor está en el índice calculado, retorna el índice
        } else {
            int j = 0; 
                while(arreglo[(indice+j)%m]==null || arreglo[(indice + j) % m].getISBN() != valor){
                    j++;
                    contador++;
                       if(contador>m){
                           return -1;
                       }
                }
                return (indice+j)%m; 
        }
    }
    
    public cLibro[] obtenerArreglo() {
    return arreglo;
    }
    
    public boolean hayEspacioDisponible() {
    for (cLibro libro : arreglo) {
        if (libro == null) {
            return true; // Encuentra al menos una posición vacía
        }
    }
    return false; // No hay posiciones vacías, el arreglo está lleno
    }
    
    public void actualizarTabla(JTable tabla) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    
    for (int i = 0; i < m; i++) {
        if (arreglo[i] != null) {
            Object[] rowData = {
                i, // Índice
                arreglo[i].getISBN(),
                arreglo[i].getTitulo(),
                arreglo[i].getAutor(),
                arreglo[i].getGenero(),
                arreglo[i].getEditorial(),
                arreglo[i].getIdioma(),
                arreglo[i].getAñoPub()
            };
            int rowIndex = -1; // Variable para guardar el índice de la fila
            for (int j = 0; j < modelo.getRowCount(); j++) {
                if ((int) modelo.getValueAt(j, 0) == i) {
                    rowIndex = j; // Guarda el índice de la fila que coincide con el índice actual
                    break;
                }
            }
            if (rowIndex != -1) {
                for (int col = 1; col < modelo.getColumnCount(); col++) {
                    modelo.setValueAt(rowData[col], rowIndex, col);
                }
            }
        }
    }
}

    public void limpiarTabla(DefaultTableModel modelo) {
        int indMaxFilas = modelo.getRowCount()-1;
        for (int i = indMaxFilas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public String toString(){
        return Arrays.toString(arreglo);
    }
    
}
    

