package Controladora;

import Clases.cLibro;

public class cABB {
    private cLibro raiz,nuevo,p;

    public cABB() {
        raiz = null;
    }
    
    public cLibro getRaiz() {
    return raiz;
    }
    
    public void cargarDatos(){
        ingresaLibro(new cLibro("Cien años de soledad", 10, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español"));
        ingresaLibro(new cLibro("El Gran Gatsby", 15, "F. Scott Fitzgerald", "Scribner", "Novela", 1925, "Inglés"));
        ingresaLibro(new cLibro("1984", 8, "George Orwell", "Signet Classic", "Ciencia ficción", 1949, "Inglés"));
        ingresaLibro(new cLibro("El código Da Vinci", 12, "Dan Brown", "Vintage Español", "Novela", 2003, "Español"));
        ingresaLibro(new cLibro("Harry Potter y la piedra filosofal", 20, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español"));
        ingresaLibro(new cLibro("Matar un ruiseñor", 3, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés"));
        ingresaLibro(new cLibro("El Hobbit", 9, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés"));
    }

    
    public void ingresaLibro(cLibro libro){
        nuevo = libro;
        if(raiz == null){
            raiz = nuevo;
        }else{
            p=raiz;
            insertaNodo(p,nuevo);

        }
    }
    
    public void insertaNodo(cLibro p, cLibro nuevo){
        if(p == null){
            p=nuevo;
        }else{
            if(nuevo.getISBN()>p.getISBN()){
                if(p.getDer()==null){
                    p.setDer(nuevo);
                }else{
                    insertaNodo(p.getDer(),nuevo);
                }
            }else{
                if(nuevo.getISBN()<p.getISBN()){
                    if(p.getIzq()==null){
                    p.setIzq(nuevo);
                    }else{
                        insertaNodo(p.getIzq(),nuevo);
                    }
                }else{
                    System.out.println("Ojo, libro repetido");
                }
                
            }
        }
    }
    
    public String ingresaValorBusq(int ISBN) {
        int n = 0; // Inicializamos el nivel
        cLibro libro = busquedaDirecta(raiz, ISBN, n);

        if (libro != null) {
            return "Libro: " + libro.getTitulo() + " encontrado en el árbol";
        } else {
            return "Libro con " + ISBN + " NO encontrado en el árbol";
        }
    }
    

    public cLibro busquedaDirecta(cLibro p,int ISBN, int n){
        cLibro libro = null;
        if(p != null){
            if(ISBN < p.getISBN()){
                libro = busquedaDirecta(p.getIzq(), ISBN,n+1);
            }else{
                if(ISBN > p.getISBN()){
                 libro = busquedaDirecta(p.getDer(),ISBN,n+1);
                }else{
                    System.out.println("Encontrado en el nivel "+n);
//                    System.out.println(p.getTitulo());
                    libro = p;
                }
            }
        }else{
            libro = null;
        }
        return libro;
    }
    
    public String muestraValores(int tipo){
        p=raiz; String cadena="";
        switch(tipo){
            case 1: cadena = preOrden(p);
            break;
            case 2: cadena = inOrden(p);
            break;
            case 3: cadena = postOrden(p); 
            break;
        }
        return cadena;
    }
    
    public String preOrden(cLibro p){
        String cadena = "";
        if(p!=null){ 
            cadena = cadena + p.getISBN()+ " ";
            cadena = cadena + preOrden(p.getIzq());
            cadena = cadena + preOrden(p.getDer());
        }
        return cadena;
    }
    
    public String inOrden(cLibro  p){
        String cadena = "";
        if(p!=null){ 
            cadena = cadena + inOrden(p.getIzq());
            cadena = cadena + p.getISBN()+ " ";
            cadena = cadena + inOrden(p.getDer());
        }
        return cadena;
    }
    
    public String postOrden(cLibro  p){
        String cadena = "";
        if(p!=null){ 
            cadena = cadena + inOrden(p.getIzq());
            cadena = cadena + inOrden(p.getDer());
            cadena = cadena + p.getISBN()+ " ";
        }
        return cadena;
    }
    
//    public boolean eliminaNodo(int dato){
//        cNodo padre=raiz; p=raiz; boolean esHijoIzq=true;
//        while(p.getNumero()!= dato){
//            padre=p;
//            if(dato<p.getNumero()){
//                esHijoIzq = true;
//                p=p.getIzq();
//            }else{
//                esHijoIzq = false;
//                p=p.getDer();
//            }
//            if(p == null)
//                return false;
//        }
//        if(p.getIzq() == null && p.getDer() == null){ //Cuando es hoja, no tiene hijos
//            if(raiz == p){ 
//                raiz = null;
//            }else{
//                if(esHijoIzq == true){
//                    padre.setIzq(null);
//                }else{
//                    padre.setDer(null);
//                }     
//            }
//        }else{ //Si tiene un solo hijo
//            if(p.getDer()==null){
//                if(p == raiz){
//                    raiz = p.getIzq();
//                }else{
//                    if(esHijoIzq == true){
//                        padre.setIzq(p.getIzq());
//                    }else{
//                        padre.setDer(p.getIzq());
//                    }
//                }
//            }
//            if(p.getIzq()==null){
//                if(p == raiz){
//                    raiz = p.getDer();
//                }else{
//                    if(esHijoIzq == true){
//                        padre.setIzq(p.getDer());
//                    }else{
//                        padre.setDer(p.getDer());
//                    }
//                }
//            } 
//        } //Falta para dos hijos
//        return false;
//    }
}
