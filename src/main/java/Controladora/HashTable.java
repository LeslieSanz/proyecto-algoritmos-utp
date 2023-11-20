package Controladora;

import java.util.HashMap;

public class HashTable {
    private HashMap<String, String> hashtable;

    public HashTable() {
        hashtable = new HashMap<>();
    }

    public void insertarLibro(String ISBN, String titulo) {
        hashtable.put(ISBN, titulo);
    }

    public String recuperarTitulo(String ISBN) {
        return hashtable.get(ISBN);
    }

    public HashMap<String, String> obtenerTodos() {
        return hashtable;
    }
}
