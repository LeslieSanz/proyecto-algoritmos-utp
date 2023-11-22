package Controladora;

import Clases.cLibro;

public class HashTable {
    private cLibro[] hashtable;
    private int tamaño;

    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        hashtable = new cLibro[tamaño];
    }

    public void insertarLibro(int ISBN, cLibro libro) {
        int indice = FuncionHash(ISBN);
        hashtable[indice] = libro;
    }

    public cLibro recuperarLibro(int ISBN) {
        int indice = FuncionHash(ISBN);
        return hashtable[indice];
    }

    public cLibro[] obtenerTodos() {
        return hashtable;
    }

    private int FuncionHash(int ISBN) {
        return ISBN % tamaño;
    }
}
