/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

import java.util.Arrays;

/**
 *
 * @author esther
 */
public class Hash {
     private int arreglo[], m, r;
    private double A;
    
    public Hash(int n){
        arreglo=new int[n];
//        A=Math.random();
        m=arreglo.length;
        //r=(int)(Math.random()*(((m-1)-1)-1+1)+1);
        System.out.println(m);
    }
    
    public void plegamiento(int valor){
        int indice,n1,n2;
        n1=valor/100;
        n2 = valor%100;  
        indice = (n1+n2) % m;
        if(arreglo[indice]!=0){
            indice=colisionVisitaLineal(indice);}
        System.out.println(indice);
        arreglo[indice]=valor;
    }
    
    public int colisionVisitaLineal(int indice){
        int j=0;
        
        while(arreglo[(indice+j)%m]!=0){
            j++;
        }
        return (indice+j)% m;
    }
    
    public int buscarClave(int valor) {
        int indice, n1, n2, contador=0;
        n1 = valor / 100;
        n2 = valor % 100;
        indice = (n1 + n2) % m;
        
        if (arreglo[indice] == valor) {
            return indice; // Si el valor está en el índice calculado, retorna el índice
        } else {
            int j = 0; 
            while(arreglo[(indice+j)%m]!=valor){
            j++;
            contador++;
            if(contador>m)
                return -1;
            }
            return (indice+j)%m;
        }
    }
    
    public String toString(){
        return Arrays.toString(arreglo);
    }
    
}
