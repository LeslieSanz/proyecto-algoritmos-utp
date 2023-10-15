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
        int m=17, p=20, q=20;
        String titulo="cien años de soledad  mu.jer";
        colaLetrasTitulo oCola=new colaLetrasTitulo(titulo);
        
        
        oCola.insertaTituloEnCola(titulo);System.out.println(oCola.muestraElementos());
        String letras = oCola.muestraElementos();
        pilaLetrasTitulos oPila=new pilaLetrasTitulos(letras);
        oPila.seleccionarLetrasEnPilas(letras);
        System.out.println(oPila.muestraValoresPila1());
        System.out.println(oPila.muestraValoresPila2());
        System.out.println(oPila.muestraValoresPila3());
    }
    
}
