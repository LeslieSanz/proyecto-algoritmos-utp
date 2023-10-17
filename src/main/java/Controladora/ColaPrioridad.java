
package Controladora;

import Clases.cLibro;
import javax.swing.table.DefaultTableModel;

public class ColaPrioridad {
    private cLibro oLibrosCola[];
    private int first, last, tamaño;
    
    
    public ColaPrioridad(int n){
        oLibrosCola =new cLibro[n];
        tamaño=n;
        colaVacia();
    }
    
    public void colaVacia(){
        first=-1; last = -1;
    }
    
    //Insertando segun exista prioridad
    public void insertaLibro(cLibro oLibro){
        int posicion=-1; //Para controlar los elementos con prioridades
        if(last < tamaño-1){//Si todavia hay espacio para insertar
            if(first==-1){//Si la cola esta vacia
                first++;
                last++;
                oLibrosCola[last]= oLibro;
            }else{ //Si hay mas de un elemento, evaluar si es un libro con prioridad
                if(oLibro.getPrioridad()>0){
                    //Encontrar indice donde se insertara el elemento
                    for(int i=first; i <= last;i++){
                        if(oLibrosCola[i].getPrioridad()>0){
                            posicion=i+1;
                        }
                    }
                    //Si todavia no hay elementos con prioridad
                    if (posicion == -1) {
                    posicion = 0;
                    }
                    //Desplazar elementos a la derecha para hacer espacio
                    for(int i=last; i >= posicion;i--){
                        oLibrosCola[i+1]=oLibrosCola[i];
                    }
                    
                    //Finalmente, insertar el elemento
                    last++; 
                    oLibrosCola[posicion]= oLibro;
                }else{ //Insertar por el final
                    last++; 
                    oLibrosCola[last]= oLibro;
                }
            }
        }
    }
    
    public void eliminaElemento(){
        cLibro oLibro;
        if(first>-1){
            oLibro=oLibrosCola[first];
            first++;
            if(first> last)
                colaVacia();
        }
    }
    
    public String acceso(){
        cLibro oLibro=null;
        if(first>-1){
            oLibro=oLibrosCola[first];
        }
        return oLibro.getTitulo();   
    }
    
    public boolean verificaCapacidad(){
        if(last<tamaño-1) //Si todavia hay espacio
            return true;
        else
            return false;
    }
    
    public String muestraLibros(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
               cadena+=oLibrosCola[i].getTitulo()+" ";
            }  
        }
       return cadena; 
    }
    
    public void mostrarTabla(DefaultTableModel modelo){ 
        if(first>-1){
            for(int i=first; i <= last;i++){
            Object[] data = {
                oLibrosCola[i].getISBN(), 
                oLibrosCola[i].getTitulo(),  
                oLibrosCola[i].getPrioridad(),
                };
            modelo.addRow(data);
            }    
        }  
    }
    
    public void limpiarTabla(DefaultTableModel modelo) {
        int indMaxFilas = modelo.getRowCount()-1;
        for (int i = indMaxFilas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
}
