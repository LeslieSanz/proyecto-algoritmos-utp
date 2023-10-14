/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class pilaLetrasTitulos {
    private int pila1[], pila2[], pila3[];
    private int tope1, tope2, tope3;//el ultimo elemnto de la pila 
    private int tamaño1, tamaño2, tamaño3;//tamaño del arreglo que empieza en 0
    private colaLetrasTitulo cola[];
    
    public pilaLetrasTitulos(int m,int p, int q){
        pila1=new int[m];
        pila2=new int[p];
        pila3=new int[q];
        tope1=-1; tope2=-1; tope3=-1;
        tamaño1=m; tamaño2=p; tamaño3=q;
    }
    
    public int getTope1(){
        return tope1;
    }
    
    public int getTope2(){
        return tope2;
    }
    
    public int getTope3(){
        return tope3;
    }
    
    public void seleccionarLetrasEnPilas(){
        
    }
    
    
    
    
}
