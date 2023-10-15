
package Controladora;

import Clases.cLibro;

public class Cola {
    private cLibro oLibrosCola[];
    private int first, last, tamaño;
    
    
    public Cola(int n){
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
            //Preguntarse si es un libro con prioridad
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
                last++; 
                //Finalmente, insertar el elemento
                oLibrosCola[posicion]= oLibro;
            }else{ //Insertar por el final
                last++; 
                oLibrosCola[last]= oLibro;
                if(first==-1) //Si la cola estaba vacia
                    first++;
            }  
        }
    }
    
    public void eliminaElemento(){
        cLibro oLibro;
        if(first>-1){
            oLibro=oLibrosCola[first];
            System.out.println(oLibro.getTitulo());
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
    public String muestraLibros(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
               cadena+=oLibrosCola[i].getTitulo()+" ";
            }  
        }
       return cadena; 
    }  
}
