/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controladora;

/**
 *
 * @author yosse
 */
public class MainLDE {

    public static void main(String[] args) {
        ListaEnlazadaDoble dobleE = new ListaEnlazadaDoble();
        int ISBN;
//        ISBN=10; dobleE.Insertar(ISBN);
//        ISBN=2; dobleE.Insertar(ISBN);
//        ISBN=4; dobleE.Insertar(ISBN);
//        ISBN=30; dobleE.Insertar(ISBN);
//        ISBN=15; dobleE.Insertar(ISBN);
//        
        System.out.println(dobleE.RecorreListaDobleEnlazada());
        System.out.println(dobleE.EvidenciarListaDobleEnlazada());

      //  dobleE.eliminaNodoxInicio();System.out.println(dobleE.EvidenciarListaDobleEnlazada());
        
      //  dobleE.eliminaNodoxFinal(); System.out.println(dobleE.EvidenciarListaDobleEnlazada());
        
       dobleE.eliminarEntreNodos(4); System.out.println(dobleE.EvidenciarListaDobleEnlazada());
    
       //dobleE.eliminarGeneral(4); System.out.println(dobleE.EvidenciarListaDobleEnlazada());
    
    
    
    }
}





