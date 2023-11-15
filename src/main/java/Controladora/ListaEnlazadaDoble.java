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
//    Insertar(new cLibro("Matar un ruiseñor", 20084, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés"));
//    Insertar(new cLibro("El Hobbit", 28227, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés"));
//    Insertar(new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Romance", 1813, "Inglés"));
//    Insertar(new cLibro("La sombra del viento", 88674, "Carlos Ruiz Zafón", "Penguin Books", "Histórico", 2001, "Español"));
//    Insertar(new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción", 2008, "Español"));
//    Insertar(new cLibro("El alquimista", 15007, "Paulo Coelho", "HarperOne", "Drama", 1988, "Inglés"));
//    Insertar(new cLibro("Rayuela", 15229, "Julio Cortázar", "Cátedra", "Novela", 1963, "Español"));
//    Insertar(new cLibro("It", 15229, "Stephen King", "Scribner", "Terror", 1986, "Español"));
//    Insertar(new cLibro("El señor de los anillos: La comunidad del anillo", 66, "J.R.R. Tolkien", "Minotauro", "Fantasía", 1954, "Español"));
//    Insertar(new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela", 1866, "Inglés"));
//    Insertar(new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Infantil", 1943, "Inglés"));
//    Insertar(new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Histórico", 1989, "Inglés"));
//    Insertar(new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés"));
//    Insertar(new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés"));
//    Insertar(new cLibro("El exorcista", 42341, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés"));
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



     public void eliminar(int ISBN) {
    //Primero verifica si la lista esta vacia
    if (inicio == null) { // Si la lista está vacía, no se puede eliminar nada
        return;
    }
    p = inicio;    // Aqui inicializoun puntero p para recorrer la lista
    while (p != null && p.getISBN() != ISBN) {  // Se busca el nodo con el ISBN especificado
        p = p.getSgte(); //recorre el bucle
    }
    if (p == null) {// Verifica si el nodo con el ISBN se encontró en la lista
        return; // El nodo con el ISBN especificado no se encontró en la lista
    }

    if (p.getAnte() != null) {//si el nodo que se va a eliminar tiene un nodo anterior 
        p.getAnte().setSgte(p.getSgte());   // Entonces actualiza su enlace al siguiente
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
     
     
     //Muestra lista enlazada con recursividad

}
