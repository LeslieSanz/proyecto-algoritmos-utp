/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class colaLetrasTitulo {
    private String cola[];
    private int first, last, tamaño;
    
    public colaLetrasTitulo(int n) {
        cola=new String[n];
        tamaño=n;
        colaVacia();
    }
    
    public void colaVacia(){
        first=-1; last = -1;
    }
    
    
    public void insertaTituloEnCola(String titulo) {
        String[] letrasT= titulo.split("");
        tamaño = letrasT.length;
        int j;
        
        for (j=0;j < tamaño && last < tamaño - 1; j++) {
          if(!letrasT[j].equals(" ")){
          last++;
          cola[last] = letrasT[j];
          if (first == -1) {
            first = 0;
          }
          }
        }
        
        
    }
    
    public String muestraElementos(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
                cadena+=cola[i]+"";
            }
        }
        return cadena;
    }
        
        
        
        
        
        
        
        
        
        
        
}
