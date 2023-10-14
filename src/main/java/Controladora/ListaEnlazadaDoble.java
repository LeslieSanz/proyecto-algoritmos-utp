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
    

    
   public void Insertar(int ISBN) {//insertar ordenadamente de menor a mayor
    nuevo = new cLibro(ISBN);
    
    if (inicio == null || ISBN < inicio.getISBN()) { //aqui se fija si la lista esta vacia (para que se agregue de frente) o en el caso que si haya el nuevo isbn con el que ya habia
        nuevo.setSgte(inicio); //el nuevo libro apunta al siguiente que seria inicio
        if (inicio != null) { //Si inicio no es nulo
            inicio.setAnte(nuevo); //Entonces inicio apunta al nuevo, se cumple lista doblemente enlazada
        }
        inicio = nuevo; //se actualiza inicio para que apunte al nuevo libro, que ahora es el nuevo primer libro de la lista.
    } else { //Sino :D osea si la lista no esta vacia y el nuevo isbn es mayor al isbn del iniicio
        p = inicio; //p es una variable que se utiliza para recorrer la lista, entonces cuando igual me refiero a que p se inicializa con "inicio"
        while (p.getSgte() != null && ISBN > p.getSgte().getISBN()) { //p empieza a movrese en la lista
            //Ojo arriba -> puse comparar el isbn nuevo con el valor del isbn del siguiente nodo que apunta p
            p = p.getSgte(); // bueno aqui actualiza el p al siguiente y otra vez empieza el bucle
        }
        nuevo.setSgte(p.getSgte());  //nuevo apunta al mismo nodo siguiente que apuntaba p
        nuevo.setAnte(p); // aqui nuevo apunta a p osea el libro que estaba antes del nuevo libro
        if (p.getSgte() != null) { //ojo, si p apunta a un siguiente nodo
            p.getSgte().setAnte(nuevo); //entonces ese siguiente nodo apunta al nuevo con el enlace anterior 
        }
        p.setSgte(nuevo); //finalmente el p apunta al nuevo libro
    }
    
}
   
   public String RecorreListaDobleEnlazada(){
      String cadena="";
       //p y q se inicializan con inicio
      p =inicio;
      q=inicio;
      while(p != null){
          cadena = cadena +p.getISBN()+ " "; // Agrega el ISBN del nodo actual a la cadena
          q=p;//q ahora sigue al nodo actuar 
          p = p.getSgte();//y p avanza al siguiente nodo
      } 
      
      return cadena+"\n";
    }
   
    
    public String EvidenciarListaDobleEnlazada(){
      String cadena="";
      //p y q se inicializan con inicio
      p =inicio;
      q=inicio;
      while(p != null){
          cadena = cadena +p.getISBN()+ " "; // Agrega el ISBN del nodo actual a la cadena
          q=p;//q ahora sigue al nodo actuar 
          p = p.getSgte();//y p avanza al siguiente nodo
      } 
      q = q.getAnte(); // Ahora q se inicializa con el último nodo de la lista
      while(q != null){//Recorre la lista hacia atrás (en orden inverso) y agrega los elementos a la cadena
          cadena = cadena +q.getISBN()+ " ";    // Agrega el ISBN del nodo actual a la cadena
          q = q.getAnte(); // q retrocede al nodo anterior
      }  
      return cadena; // Devuelve la cadena que contiene los elementos de la lista en orden inverso
    }

    //eliminar nodoxInicio
    public void eliminaNodoxInicio(){
        //Primero verifica si la lista esta vacia
        if(inicio != null){
            inicio=inicio.getSgte();//si no esta vacio, inicio es remplazado por el isbn siguiente
        if (inicio != null) {// este if es para verificar si la nueva lista no esta vacia para que
            inicio.setAnte(null);//el nuevo nodo cabecera no apunta a ningun nodo que este en su anterior, osea se borra el ante 
            //lo que haria que el nuevo nodo cabecera solo apunte a un siguiente no a un anterior
        }
    }
    }
    
    
    //eliminar nodo por final
    
    public void eliminaNodoxFinal(){
        
        //Primero verifica si la lista esta vacia
        if(inicio!= null){//no esta vacia entonces
            if(inicio.getSgte()== null) //si el siguiente nodo de inicio es vacio, osea aqui ya trata de verificar si es el ultimo de la lista
                inicio= null;//entonces si es cierto elimina ese ultimo valor de la lista, osea elimina inicio
            else{//sino, osea si hay mas de un nodo en la lista entonces voy a crear dos referencia en este caso p y q que son inicializados con inicio
                p=inicio; q=inicio; 
                while(p.getSgte()!= null){//si el nodo siguiente de p existe entonces
                    q = p;//q ahora sigue a p, osea q apunta al nodo que p antes apuntaba 
                    p = p.getSgte(); //y p apunta al siguiente, hasta q el siguiente sea null
                    //todo para que al final q siempre sea el que apunte al nodo anterior q apuntaba b y b pueda apuntar a su siguiente
                }
                q.setSgte(null);//cuando se haya eliminado entonces como el ultimo nodo no existe el enlace q.sgte se va a eliminar poniendole su null
            }
        }
    }

    

    //eliminar entre nodos
    public void eliminarEntreNodos(int ISBN) {
         // Verificar si la lista está vacía o solo tiene un nodo entonces no se puede eliminar nada
    if (inicio == null || inicio.getSgte() == null) {
        return; 
    }

    p = inicio.getSgte(); // Aqui se inicializa en el segundo nodo de la lista
    while (p.getSgte() != null) {
    if (p.getISBN() == ISBN && p.getSgte() != null) {
        // Verificamos si el ISBN del libro actual es el que queremos eliminar y que no sea el último libro
        p.getSgte().setAnte(p.getAnte()); // Actualizamos el enlace "anterior" del siguiente nodo
        p.getAnte().setSgte(p.getSgte()); // Actualizamos el enlace "siguiente" del nodo anterior
        return; // Nodo eliminado
    }
    p = p.getSgte();
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
    if (inicio != null) {//si la lista no esta vacia
        p = inicio;//inicializamos p como inicio
        while (p.getSgte() != null) {//si el siguiente nodo existe
            p = p.getSgte();//entonces p se actualiza para q sea el siguiente hasta que sea igual a null el p.getSgte()
        }
        return p.getISBN(); //me retorna el valor del ISBN del nodo p
    }
    return -1; // -1 me indica que la lista esta vacia
}

}
