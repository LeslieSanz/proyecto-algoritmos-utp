/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=50;
        colaLetrasTitulo oCola=new colaLetrasTitulo(n);
        oCola.insertaTituloEnCola("cien años de soledad");System.out.println(oCola.muestraElementos());
        System.out.println(oCola.acceso());
//        oCola.insertaTituloEnCola(20);System.out.println(oCola.muestraElementos());
//        oCola.insertaElemento(30);System.out.println(oCola.muestraElementos());
//        oCola.insertaElemento(40);System.out.println(oCola.muestraElementos());
//        oCola.insertaElemento(50);System.out.println(oCola.muestraElementos());
//        oCola.eliminaElemento();System.out.println(oCola.muestraElementos());
//        oCola.acceso();System.out.println(oCola.muestraElementos());
//        oCola.eliminaElemento();System.out.println(oCola.muestraElementos());
    }
    
}
