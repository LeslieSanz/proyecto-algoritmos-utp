package Controladora;

import java.util.HashMap;
import Clases.cLibro;

public class HashTable {
    private HashMap<Integer, cLibro> hashtable;

    public HashTable(int n) {
        hashtable = new HashMap<>(n);
    }

    public void insertarLibro(int ISBN, cLibro libro) {
        hashtable.put(ISBN, libro);
    }

    public HashMap<Integer, cLibro> obtenerTodos() {
        return hashtable;
    }
    public cLibro recuperarLibro(int ISBN) {
    return hashtable.get(ISBN);

}


}
