package Controladora;

import Clases.cLibro;
import java.util.Hashtable;

public class HashTable {
    private Hashtable<Integer, cLibro> hashtable;

    public HashTable(int tamaño) {
        hashtable = new Hashtable<>();
    }

    public void insertarLibro(int ISBN, cLibro libro) {
        hashtable.put(ISBN, libro);
    }

    public cLibro recuperarLibro(int ISBN) {
        return hashtable.get(ISBN);
    }

    public Hashtable<Integer, cLibro> obtenerTodos() {
        return hashtable;
    }
}

