package Controladora;

import Clases.cLibro;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class HashTable {
    private Hashtable<Integer, cLibro> hashtable;
    private int tamaño;
    private int contadorElementos;

    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        this.contadorElementos = 0;
        hashtable = new Hashtable<>();
    }

    public void insertarLibro(int ISBN, cLibro libro) {
        if (contadorElementos < tamaño) {
            hashtable.put(ISBN, libro);
            contadorElementos++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede insertar más elementos. Tamaño máximo alcanzado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public cLibro recuperarLibro(int ISBN) {
        return hashtable.get(ISBN);
    }

    public Hashtable<Integer, cLibro> obtenerTodos() {
        return hashtable;
    }
}


