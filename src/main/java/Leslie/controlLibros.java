/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leslie;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lesly
 */
public class controlLibros {
    private cLibro oLibros[];
    private int ind;

    public controlLibros(int n) {
        oLibros= new cLibro[n];
        ind=-1;
    }
    
    public void insertarLibro(cLibro libro){
        int indMax=oLibros.length-1;
        if (ind < indMax) {//si es menor siginifica que todavia ouede llenarse
            ind++;
            oLibros[ind] = libro; //que se almacene en el arreglo de objetos oLibros
        }
    }
    
    public String muestraLibro(){
        String cadena="";
        for (int i = 0; i <=ind; i++) {
            cadena+=oLibros[i].mostrar()+"\n"; //obteniendo cada uno de los objetios
        }
        return cadena;
    }
    
    public void muestraTablaLibros(DefaultTableModel modelo){
         for(int i=0; i<=ind; i++){
            Object[] data = {
                oLibros[i].getISBN(),
                oLibros[i].getTitulo(),
                oLibros[i].getAutor(),
                oLibros[i].getEditorial(),
                oLibros[i].getGenero(),
                oLibros[i].getAñoPub(),
                oLibros[i].getIdioma(),
                };
            modelo.addRow(data);
        }
    }
    
    public void ordInsercionParaString(){
    int indMax = oLibros.length-1; cLibro valor;
    //Empezar por indice 1, porque el primer elemento se asume ordenado. No hay uno anterior para comparar
    for(int i=1;i<=indMax;i++){
        //Recorrer el subarreglo ordenado y comparar con elemento a insertar
        //j es para explorar el subarreglo que va desde a[n-1] hasta a[0], de atras hacia adelante
        int j=i;
        while(j>0 && (oLibros[j].getAutor().compareTo(oLibros[j-1].getAutor())<0)){ //Si el que le sigue es menor que el anterior
            //Guardar el menor
            valor=oLibros[j];
            //Intercambiar lugares
            oLibros[j]=oLibros[j-1];
            oLibros[j-1]=valor; 
            j--;
            }
        }
    }
}
