/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

import Clases.cLibro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author yosse
 */
public class ListaEnlazadaDoble {
       private cLibro inicio, nuevo, p, q;
    
       public void cargarDatos() {
    Insertar(new cLibro("Cien años de soledad", 74728, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español"));
    Insertar(new cLibro("El Gran Gatsby", 73565, "F. Scott Fitzgerald", "Scribner", "Novela", 1925, "Inglés"));
    Insertar(new cLibro("1984", 24935, "George Orwell", "Signet Classic", "Ciencia ficción", 1949, "Inglés"));
    Insertar(new cLibro("El código Da Vinci", 74278, "Dan Brown", "Vintage Español", "Novela", 2003, "Español"));
    Insertar(new cLibro("Harry Potter y la piedra filosofal", 83621, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español"));
    Insertar(new cLibro("Matar un ruiseñor", 20084, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés"));
    Insertar(new cLibro("El Hobbit", 28227, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés"));
    Insertar(new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Romance", 1813, "Inglés"));
    Insertar(new cLibro("La sombra del viento", 88674, "Carlos Ruiz Zafón", "Penguin Books", "Histórico", 2001, "Español"));
    Insertar(new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción", 2008, "Español"));
    Insertar(new cLibro("El alquimista", 15007, "Paulo Coelho", "HarperOne", "Drama", 1988, "Inglés"));
    Insertar(new cLibro("Rayuela", 15229, "Julio Cortázar", "Cátedra", "Novela", 1963, "Español"));
    Insertar(new cLibro("It", 15229, "Stephen King", "Scribner", "Terror", 1986, "Español"));
    Insertar(new cLibro("El señor de los anillos: La comunidad del anillo", 66, "J.R.R. Tolkien", "Minotauro", "Fantasía", 1954, "Español"));
    Insertar(new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela", 1866, "Inglés"));
    Insertar(new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Infantil", 1943, "Inglés"));
    Insertar(new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Histórico", 1989, "Inglés"));
    Insertar(new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés"));
    Insertar(new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés"));
    Insertar(new cLibro("El exorcista", 42341, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés"));
}

//Metodo para ponerlo en una tabla
       
         public void mostrarTabla(DefaultTableModel modelo) {
        // Obtener una referencia al inicio de la lista enlazada
         p = inicio;

        // Limpiar el modelo antes de llenarlo
        modelo.setRowCount(0);

        // Llenar el DefaultTableModel con los datos de la lista enlazada
        while (p != null) {
            Object[] rowData = {
                p.getISBN(),
                p.getTitulo(),
                p.getAutor(),
                p.getGenero(),
                p.getEditorial(),
                p.getIdioma(),
                p.getAñoPub()
            };
            modelo.addRow(rowData);
            p = p.getSgte();
        }
    }

 
    //los valores del isbn del indice que se agreguen a la lista enlazada mi amiga es una chuchas
   public void Insertar(cLibro libro) {//insertar ordenadamente de menor a mayor
    nuevo = libro;
    
    if (inicio == null || libro.getISBN() < inicio.getISBN()) { //aqui se fija si la lista esta vacia (para que se agregue de frente) o en el caso que si haya el nuevo isbn con el que ya habia

        nuevo.setSgte(inicio); //el nuevo libro apunta al siguiente que seria inicio
        if (inicio != null) { //Si inicio no es nulo
            inicio.setAnte(nuevo); //Entonces inicio apunta al nuevo, se cumple lista doblemente enlazada
        }
        inicio = nuevo; //se actualiza inicio para que apunte al nuevo libro, que ahora es el nuevo primer libro de la lista.
    } else { //Sino :D osea si la lista no esta vacia y el nuevo isbn es mayor al isbn del iniicio
        p = inicio; //p es una variable que se utiliza para recorrer la lista, entonces cuando igual me refiero a que p se inicializa con "inicio"
        while (p.getSgte() != null && libro.getISBN() > p.getSgte().getISBN()) { //p empieza a movrese en la lista
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
          cadena = cadena +p.getISBN()+" "+ p.getTitulo()+" "+p.getAutor()+" "+p.getGenero()+" "+p.getEditorial()+" "+p.getIdioma()+" "+p.getAñoPub()+"\n"; // Agrega el ISBN del nodo actual a la cadena
          q=p;//q ahora sigue al nodo actuar 
          p = p.getSgte();//y p avanza al siguiente nodo
      } 
      
      return cadena;
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
      return cadena+"\n"; // Devuelve la cadena que contiene los elementos de la lista en orden inverso
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