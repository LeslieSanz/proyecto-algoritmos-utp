/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rescursividad;

import Clases.cLibro;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yosse
 */
public class cRecursividad {
     private cLibro oLibros[];
    private int ind;

    public cRecursividad() {
        ind=24;
        oLibros = new cLibro[25];
    }
    
    public void cargarDatos(){
        oLibros[0] = new cLibro("Cien años de soledad", 74728, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español");
        oLibros[1] = new cLibro("El Gran Gatsby", 73565, "F. Scott Fitzgerald", "Scribner", "Novela", 1925, "Inglés");
        oLibros[2] = new cLibro("1984", 24935, "George Orwell", "Signet Classic", "Ciencia ficción", 1949, "Inglés");
        oLibros[3] = new cLibro("El código Da Vinci", 74278, "Dan Brown", "Vintage Español", "Novela", 2003, "Español");
        oLibros[4] = new cLibro("Harry Potter y la piedra filosofal", 83621, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español");
        oLibros[5] = new cLibro("Matar un ruiseñor", 20084, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés");
        oLibros[6] = new cLibro("El Hobbit", 28227, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés");
        oLibros[7] = new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Romance", 1813, "Inglés");
        oLibros[8] = new cLibro("La sombra del viento", 88674, "Carlos Ruiz Zafón", "Penguin Books", "Histórico", 2001, "Español");
        oLibros[9] = new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción", 2008, "Español");
        oLibros[10] = new cLibro("El alquimista", 15007, "Paulo Coelho", "HarperOne", "Drama", 1988, "Inglés");
        oLibros[11] = new cLibro("Rayuela", 15631, "Julio Cortázar", "Cátedra", "Novela", 1963, "Español");
        oLibros[12] = new cLibro("It", 15229, "Stephen King", "Scribner", "Terror", 1986, "Español");
        oLibros[13] = new cLibro("El señor de los anillos: La comunidad del anillo", 66, "J.R.R. Tolkien", "Minotauro", "Fantasía", 1954, "Español");
        oLibros[14] = new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela", 1866, "Inglés");
        oLibros[15] = new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Infantil", 1943, "Inglés");
        oLibros[16] = new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Histórico", 1989, "Inglés");
        oLibros[17] = new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés");
        oLibros[18] = new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés");
        oLibros[19] = new cLibro("El exorcista", 42341, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés");
        oLibros[20] = new cLibro("Don Quijote de la Mancha", 12345, "Miguel de Cervantes Saavedra", "Editorial", "Novela", 1605, "Español");
        oLibros[21] = new cLibro("Mujer en punto de exasperación", 67890, "Autor Anónimo", "Editorial XYZ", "Novela", 2022, "Español");
        oLibros[22] = new cLibro("¡Aventuras en la selva!", 54321, "Autor Aventurero", "Editorial Aventuras", "Aventura", 2020, "Español");
        oLibros[23] = new cLibro("Historias de amor y odio: ¿Quién ganará?", 98765, "Escritor Desconocido", "Editorial XYZ", "Drama", 2010, "Español");
        oLibros[24] = new cLibro("El misterioso caso del 'Objeto Perdido'", 11111, "Sherlock Holmes", "Editorial Detectives", "Misterio", 1890, "Inglés");

    }
    
    //1
    
  
  public void mostrarTablaRecursivo(DefaultTableModel modelo, int posicion) {
    if (posicion < oLibros.length && oLibros[posicion] != null) {
        Object[] data = {
            oLibros[posicion].getISBN(),
            oLibros[posicion].getTitulo(),
            oLibros[posicion].getAutor(),
            oLibros[posicion].getGenero(),
            oLibros[posicion].getEditorial(),
            oLibros[posicion].getIdioma(),
            oLibros[posicion].getAñoPub(),
        };
        modelo.addRow(data);
        mostrarTablaRecursivo(modelo, posicion + 1);
    } 
        }
  
  
  

    public void mostrarTablaR(DefaultTableModel modelo) {
    modelo.setRowCount(0);
    modelo.setColumnIdentifiers(new Object[]{"ISBN", "Titulo", "Autor", "Genero", "Editorial", "Idioma", "Año de Publicacion"});
    //Esto es 
    mostrarTablaRecursivo(modelo, 0);
    }
    
    public void mostrarTablaRecursivo2(DefaultTableModel modelo, int posicion) {
    if (posicion < oLibros.length && oLibros[posicion] != null) {
        Object[] data = {
            oLibros[posicion].getISBN(),
            oLibros[posicion].getGenero(),
            oLibros[posicion].getIdioma(),
        
        };
        modelo.addRow(data);
        mostrarTablaRecursivo2(modelo, posicion + 1);
    } 
        }
    
    public void mostrarTablaR2(DefaultTableModel modelo) {
    /// Limpia el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);
    modelo.setColumnIdentifiers(new Object[]{"ISBN", "Genero", "Idioma"});
    mostrarTablaRecursivo2(modelo, 0);
    }
    
    
   public  int suma(int indice) {
    if (indice < oLibros.length && oLibros[indice] != null) {
        return oLibros[indice].getAñoPub() +oLibros[indice].getISBN()+ suma(indice + 1);
    } else {
        return 0; // Si el objeto es null o el índice está fuera de los límites, retorna 0 para detener la suma.
    }
}

    public int calcularSuma() {
        return suma(0); // Inicia la recursión con el índice 0.
    }
    
    
    
    
    //2


        private cLibro[] buscarRecursivamente2(String genero, String idioma, int posicion, cLibro[] resultados, int index) {
        if (posicion < oLibros.length) {
            if (genero.equals(oLibros[posicion].getGenero()) && idioma.equals(oLibros[posicion].getIdioma())) {
                resultados[index] = oLibros[posicion];
                index++;
            }
            return buscarRecursivamente2(genero, idioma, posicion + 1, resultados, index);
        } else {
            return resultados;
        }
    }

        public void mostrarBR2(DefaultTableModel modelo, String genero, String idioma) {
        cLibro[] resultados = new cLibro[oLibros.length];
        // Inicia la búsqueda recursiva
        resultados = buscarRecursivamente2(genero, idioma, 0, resultados, 0);

        modelo.setRowCount(0);
        modelo.setColumnIdentifiers(new Object[]{"ISBN", "Genero", "Idioma"});

        // Muestra los resultados en la tabla
        for (cLibro libro : resultados) {
            if (libro != null) {
                Object[] data = {
                    libro.getISBN(),
                    libro.getGenero(),
                    libro.getIdioma(),
                };
                modelo.addRow(data);
            }
        }
    }
        
        
        public int suma2(String genero, String idioma, int indice) {
        cLibro[] resultados = new cLibro[oLibros.length];
        // Inicia la búsqueda recursiva
        resultados = buscarRecursivamente2(genero, idioma, 0, resultados, 0);

        if (indice < resultados.length && resultados[indice] != null) {
            return resultados[indice].getISBN()+ suma2(genero, idioma, indice + 1);
             
        } else {
            return 0; // Si el objeto es null o el índice está fuera de los límites, retorna 0 para detener la suma.
        }
    }

        public int calcularSuma2(String genero, String idioma) {
            return suma2(genero, idioma, 0); // Inicia la recursión con el índice 0.
        }



        //3
        
    public cLibro  BuscarRecursivamente(DefaultTableModel modelo, int isbn, int posicion) {
    if (posicion < oLibros.length) {
        if (isbn != oLibros[posicion].getISBN()) {
            return BuscarRecursivamente(modelo, isbn, posicion + 1);
        } else {
            return oLibros[posicion];
        }
    } else {
        return null;
    }
    
}
    
    public void mostrarBR(DefaultTableModel modelo, int isbn) {
        modelo.setRowCount(0);
        cLibro libroEncontrado = BuscarRecursivamente(modelo, isbn, 0);

        if (libroEncontrado != null) {
            Object[] data = {
                libroEncontrado.getISBN(),
                libroEncontrado.getTitulo(),
                libroEncontrado.getAutor(),
                libroEncontrado.getGenero(),
                libroEncontrado.getEditorial(),
                libroEncontrado.getIdioma(),
                libroEncontrado.getAñoPub(),
            };
            modelo.addRow(data);
        }
    }
    
    public int suma3(DefaultTableModel modelo, int isbn) {
        cLibro libroEncontrado = BuscarRecursivamente(modelo, isbn, 0);
        return libroEncontrado.getISBN()+libroEncontrado.getAñoPub();
    }

}
