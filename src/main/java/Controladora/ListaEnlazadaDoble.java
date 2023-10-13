/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

import Clases.cLibro;

/**
 *
 * @author yosse
 */
public class ListaEnlazadaDoble {
        private cLibro inicio, nuevo, p, q;
    

    
   public void Insertar(int ISBN) {
    nuevo = new cLibro(ISBN);
    
    if (inicio == null || ISBN < inicio.getISBN()) { //aqui se fija si la lista esta vacia (para que se agregue de frente) o en el caso que si haya el nuevo isbn con el que ya habia
        nuevo.setSgte(inicio); //el nuevo libro apunta al siguiente que seria inicio
        if (inicio != null) { //Si inicio no es nulo
            inicio.setAnte(nuevo); //Entonces inicio apunta al nuevo, se cumple lista doblemente enlazada
        }
        inicio = nuevo; //se actualiza inicio para que apunte al nuevo libro, que ahora es el nuevo primer libro de la lista.
    } else {
        p = inicio;
        while (p.getSgte() != null && ISBN > p.getSgte().getISBN()) {
            p = p.getSgte();
        }
        nuevo.setSgte(p.getSgte());
        nuevo.setAnte(p);
        if (p.getSgte() != null) {
            p.getSgte().setAnte(nuevo);
        }
        p.setSgte(nuevo);
    }
    
}
   
   public String RecorreListaDobleEnlazada(){
      String cadena="";
      p =inicio;
      q=inicio;
      while(p != null){
          cadena = cadena +p.getISBN()+ " ";
          q=p;
          p = p.getSgte();
      } 
      
      return cadena;
    }
   
    
    public String EvidenciarListaDobleEnlazada(){
      String cadena="";
      p =inicio;
      q=inicio;
      while(p != null){
          cadena = cadena +p.getISBN()+ " ";
          q=p;
          p = p.getSgte();
      } 
      q = q.getAnte();
      while(q != null){
          cadena = cadena +q.getISBN()+ " ";   
          q = q.getAnte();
      }  
      return cadena;
    }

    //eliminar nodoxInicio
    public void eliminaNodoxInicio(){
        if(inicio != null){
            inicio=inicio.getSgte();
        if (inicio != null) {
            inicio.setAnte(null);
        }
    }
    }
    
    
    //eliminar nodo por final
    
    public void eliminaNodoxFinal(){
        if(inicio!= null){
            if(inicio.getSgte()== null)
                inicio= null;
            else{
                p=inicio; q=inicio;
                while(p.getSgte()!= null){
                    q = p;
                    p = p.getSgte();
                }
                q.setSgte(null);
            }
        }
    }

    

    //eliminar entre nodos
        
     public void eliminarEntreNodos(int ISBN) {
    // Verifica si la lista está vacía
    if (inicio == null) {
        // La lista está vacía, no se puede eliminar nada
        return;
    }

    // Inicializa un puntero p para recorrer la lista
    p = inicio;
    // Busca el nodo con el ISBN especificado
    while (p != null && p.getISBN() != ISBN) {
        p = p.getSgte();
    }

    // Verifica si el nodo con el ISBN se encontró en la lista
    if (p == null) {
        // El nodo con el ISBN especificado no se encontró en la lista
        return;
    }

    // Verifica si el nodo a eliminar tiene un nodo anterior
    if (p.getAnte() != null) {
        // Si tiene un nodo anterior, actualiza su enlace "siguiente"
        p.getAnte().setSgte(p.getSgte());
    } else {
        // Si el nodo a eliminar es el primer nodo, actualiza el puntero "inicio"
        inicio = p.getSgte();
    }

    // Verifica si el nodo a eliminar tiene un nodo siguiente
    if (p.getSgte() != null) {
        // Si tiene un nodo siguiente, actualiza su enlace "anterior"
        p.getSgte().setAnte(p.getAnte());
    }
}

    
     
    public void eliminarGeneral(int isbn) {
    nuevo = new cLibro(isbn);
    
    // Caso 1: Si el ISBN a eliminar está al principio
    if (inicio != null && isbn == inicio.getISBN()) {
        eliminaNodoxInicio();
    }
    // Caso 2: Si el ISBN a eliminar está al final
    else if (inicio != null && isbn == obtenerISBNUltimoNodo()) {
        eliminaNodoxFinal();
    }
    // Caso 3: Si el ISBN a eliminar está en el medio
    else {
        eliminarEntreNodos(isbn);
    }
}

// Método para obtener el ISBN del último nodo
private int obtenerISBNUltimoNodo() {
    if (inicio != null) {
        p = inicio;
        while (p.getSgte() != null) {
            p = p.getSgte();
        }
        return p.getISBN();
    }
    return -1; // Retorna un valor especial si la lista está vacía
}

}
