/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yoss;

import javax.swing.JOptionPane;

/**
 *
 * @author yosse
 */
public class controlBiblioteca {
    private cBiblioteca cBiblio[];
    private int ind;

    public controlBiblioteca(int n) {
        cBiblio= new cBiblioteca[n];
        ind=-1;
    }
    
    public void insertarLibro(cBiblioteca libro){
        int indMax=cBiblio.length-1;
        if (ind < indMax) {//si es menor siginifica que todavia ouede llenarse
            ind++;
            cBiblio[ind] = libro; //que se almacene en oMascotas
        }
    }
    
    public String muestraLibro(){
        String cadena="";
        for (int i = 0; i <=ind; i++) {
            cadena+=cBiblio[i].mostrar()+"\n"; //obteniendo cada uno de los objetios
        }
        return cadena;
    }
    
    //buscar Valor numerico (EN ESTE CASO ES VALOR DESORDENADOS)
    
    public String busquedaNoOrdenada(int isbn){
        int indice=0;  //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && isbn!=cBiblio[indice].getISBN()) {
            indice++;
        }
        if (isbn==cBiblio[indice].getISBN()) 
            return cBiblio[indice].getISBN()+" "+cBiblio[indice].getTitulo()+" "+cBiblio[indice].getAutor();
        else return "No se encontró";
    }
    
    //buscar genero y año de publicacion (es en lista desordenada y el profe dijo que podiamos escoger los campos)
    // dos a la vez
    public String busquedaDosCampos(int año, String genero){
        int indice=0; String cadena=" ";
        while ((indice<ind && año!=cBiblio[indice].getAñoPub() && !genero.equals(cBiblio[indice].getGenero()))) {            
            cadena="No existe";
            indice++;
        }
        
        while (indice<=ind) {
           if (año==cBiblio[indice].getAñoPub() && genero.equals(cBiblio[indice].getGenero())){ 
            cadena= cadena + cBiblio[indice].getTitulo()+" "+cBiblio[indice].getTitulo()+" "+cBiblio[indice].getAutor()+"\n";
            ; }
           indice++;
        }

//        String cadena=" ";
//        for (int indice = 0; indice <= ind; indice++) {
//            if (año==cBiblio[indice].getAñoPub() && genero.equals(cBiblio[indice].getGenero())){ 
//            cadena= cadena + cBiblio[indice].getTitulo()+" "+cBiblio[indice].getTitulo()+" "+cBiblio[indice].getAutor()+"\n";
//            ; }
//        }
//
        return cadena;
    } 
        
    public String eliminarLibro(int isbn){
        String cad = null;
          int posicion = 0;
        for (int i = 0; i <=ind; i++) {
            if (isbn== cBiblio[i].getISBN()) {
               posicion=i;
            cad= "Se eliminó "+ cBiblio[posicion].getISBN()+" "+cBiblio[posicion].getTitulo();}
        }
         if (posicion>-1) {
//                cBiblio[posicion]=null;
//                JOptionPane.showMessageDialog(null, "Se elimino el alumno " + isbn);} 
         
        cBiblioteca[] temporal = new cBiblioteca[cBiblio.length - 1];
        int pos=0;
             for (int i = 0; i < ind; i++) {
                 if (i !=posicion) {
                     temporal[pos]=cBiblio[i];
                     pos++;
                 }
             }
         }
        return cad;
    }
  
    //en proceso todavia :,O
    public String busquedaOrdenada(String idioma){
        int indice=0; //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && !idioma.equals(cBiblio[indice].getIdioma())) {
            ind++;
        }
        if (idioma.equals(cBiblio[indice].getIdioma())) 
            return cBiblio[indice].getIdioma();
        else return "";
    }
    
    public String eliminarParteDos(int isbn) {
    String cad = null, cad2 = null;
    int posicion = -1; // Inicializa la posición con un valor que indique que no se encontró el ISBN.


    for (int i = 0; i <= ind; i++) {
        if (isbn == cBiblio[i].getISBN()) {
            posicion = i;
            cad = "Se eliminó " + cBiblio[posicion].getISBN() + " " + cBiblio[posicion].getTitulo();
            break; // Sale del bucle una vez que se encuentra el libro.
        }
    }

    if (posicion > -1) {
        // Elimina el elemento en la posición 'posicion' y desplaza los elementos restantes hacia la izquierda.
        for (int i = posicion; i < ind; i++) {
            cBiblio[i] = cBiblio[i + 1];
        }
        cBiblio[ind] = null; // Coloca 'null' en la última posición para eliminar la referencia al último elemento.
        ind--; // Reduce el valor de 'ind' para reflejar la eliminación.

        // Ahora, el libro se ha eliminado del arreglo original 'cBiblio'.
    
    System.out.println("Arreglo actualizado:");
        for (int i = 0; i <= ind; i++) {
            cad2= cBiblio[i].getISBN() + " " + cBiblio[i].getTitulo()+ " " + cBiblio[i].getAutor()+ " " + cBiblio[i].getEditorial();
        }
    }
    
    return cad+"\n"+cad2;
}


}
