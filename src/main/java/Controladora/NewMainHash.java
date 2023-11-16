/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class NewMainHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash oHash;
        int n=10;
        oHash = new Hash(n);
        oHash.plegamiento(2471);System.out.println(oHash.toString());
        oHash.plegamiento(3890);System.out.println(oHash.toString());
        oHash.plegamiento(4341);System.out.println(oHash.toString());
         oHash.plegamiento(9754);System.out.println(oHash.toString());
        oHash.plegamiento(5368);System.out.println(oHash.toString());
        oHash.plegamiento(8645);System.out.println(oHash.toString());
        oHash.plegamiento(1942);System.out.println(oHash.toString());
        System.out.println(oHash.buscarClave(2942));
    }
    
}
