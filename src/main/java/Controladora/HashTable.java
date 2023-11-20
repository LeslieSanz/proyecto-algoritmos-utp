package Controladora;

import Clases.cLibro;
import java.util.HashMap;

public class HashTable {

    private HashMap<Integer, cLibro> hashtable;

    public HashTable() {
        hashtable = new HashMap<>();
    }

    public void insertarObjeto(cLibro libro) {
        hashtable.put(libro.getISBN(), libro);
    }

    public cLibro recuperarObjeto(int ISBN) {
        return hashtable.get(ISBN);
    }

    public HashMap<Integer, cLibro> getHashtable() {
        return hashtable;
    }

    public void listarObjetos() {
        for (cLibro libro : hashtable.values()) {
            System.out.println(libro.mostrarDatos());
        }
    }
}
