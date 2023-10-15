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
    private int first, last, tamaño, tamañoTitulo, j;
    
    public colaLetrasTitulo(String titulo) {
        tamaño= hallarTamañoCola(titulo);
        cola=new String[tamaño];
        colaVacia();
    }
    
    public void colaVacia(){
        first=-1; last = -1;
    }
    
    public int hallarTamañoCola(String titulo){
        String[] letrasT= titulo.split("");
        tamañoTitulo = letrasT.length;
        int esp=0;
        
        for (j=0;j < tamañoTitulo && last < tamañoTitulo - 1; j++) {
            if(letrasT[j].equals(" ")){
                esp=esp+1;
            }
        }
        tamaño=tamañoTitulo-esp;
//        System.out.println(tamaño);
        return tamaño;
    }
    
    
    public void insertaTituloEnCola(String titulo) {
        String[] letrasT= titulo.split("");
        tamañoTitulo = letrasT.length;
        
        for (j=0;j < tamañoTitulo && last < tamaño-1; j++) {
          if(!letrasT[j].equals(" ")){
          last++;
          cola[last] = letrasT[j];
//              System.out.println(last);
         // letra=letrasT[j];
          if (first == -1) {
            first = 0;
          }
          }
        }
    }
    
    public String acceso(){
        String letra = null;
        if(first>-1){
            letra=cola[first];
        }
        return letra;   
    }
    
    public String muestraElementos(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
                cadena+=cola[i]+" ";
            }
        }
        return cadena;
    }
    
    
    
    
}
