package Controladora;

import Clases.cLibro;
import javax.swing.table.DefaultTableModel;

public class cABB {
    private cLibro raiz,nuevo,p;

    public cABB() {
        raiz = null;
    }
    
    public cLibro getRaiz() {
        return raiz;
    }
    
    public void cargarDatos(){
        ingresaLibro(new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela", 1866, "Inglés"));
        ingresaLibro(new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Infantil", 1943, "Inglés"));
        ingresaLibro(new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Histórico", 1989, "Inglés"));
        ingresaLibro(new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés"));
        ingresaLibro(new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Romance", 1813, "Inglés"));
        ingresaLibro(new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción", 2008, "Español"));
//        ingresaLibro(new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés"));
//        ingresaLibro(new cLibro("El exorcista", 42341, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés"));
//        ingresaLibro(new cLibro("Don Quijote de la Mancha", 12345, "Miguel de Cervantes Saavedra", "Editorial", "Novela", 1605, "Español"));
//        ingresaLibro(new cLibro("Mujer en punto de exasperación", 67890, "Autor Anónimo", "Editorial XYZ", "Novela", 2022, "Español"));
//        ingresaLibro(new cLibro("¡Aventuras en la selva!", 54321, "Autor Aventurero", "Editorial Aventuras", "Aventura", 2020, "Español"));
//        ingresaLibro(new cLibro("Cien años de soledad", 74728, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español"));
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
    
    public String ingresaValorBusq(int ISBN, DefaultTableModel modelo) {
        cLibro libro = busquedaDirecta(raiz, ISBN);

        if (libro != null) {
            mostrarResultadoTabla(libro,modelo);
            return "Se encontró el libro \n" + libro.getTitulo();
        } else {
            return "Libro NO encontrado";
        }  
    }
    

    public cLibro busquedaDirecta(cLibro p,int ISBN){
        cLibro libro ;
        if(p != null){
            if(ISBN < p.getISBN()){
                libro = busquedaDirecta(p.getIzq(), ISBN);
            }else{
                if(ISBN > p.getISBN()){
                 libro = busquedaDirecta(p.getDer(),ISBN);
                }else{
                    libro = p;
                }
            }
        }else{
            libro = null;
        }
        return libro;
    }
    
    //Para mostrar resultado de la busqueda de un libro
    public void mostrarResultadoTabla(cLibro libro,DefaultTableModel modelo) {
        Object[] rowData = {
                libro.getISBN(),
                libro.getTitulo(),
                libro.getAutor(),
                libro.getGenero(),
                libro.getEditorial(),
                libro.getIdioma(),
                libro.getAñoPub()
            };
            modelo.addRow(rowData);
    }
    
    
    public void mostrarTabla(DefaultTableModel modelo, int tipo) {
        p=raiz;
        switch(tipo){
            case 1: mostrarTablaPreOrden(modelo,p);
            break;
            case 2: mostrarTablaInOrden(modelo,p);
            break;
            case 3: mostrarTablaPosOrden(modelo,p);
            break;
        }
    }
    
    public void mostrarTablaPreOrden(DefaultTableModel modelo, cLibro p){
        if (p != null) {
//            System.out.println("Procesando nodo: " + p.getTitulo());

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
         
             mostrarTablaPreOrden(modelo, p.getIzq());
             mostrarTablaPreOrden(modelo, p.getDer());
        }
    }
    
    public void mostrarTablaInOrden(DefaultTableModel modelo, cLibro p){
        if (p != null) {
            mostrarTablaInOrden(modelo, p.getIzq());

//            System.out.println("Procesando nodo: " + p.getTitulo());
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
            
            mostrarTablaInOrden(modelo, p.getDer());
        }
    }
    
    public void mostrarTablaPosOrden(DefaultTableModel modelo, cLibro p){
        if (p != null) {
            mostrarTablaPosOrden(modelo, p.getIzq());
            mostrarTablaPosOrden(modelo, p.getDer());
            
//            System.out.println("Procesando nodo: " + p.getTitulo());
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
        }
    }
    
    
    //Metodo que muestra pero devuelve en cadena, no en tabla. Fue de prueba, no se usó en el form
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
            cadena = cadena + p.mostrarDatos()+ "\n";
            cadena = cadena + preOrden(p.getIzq());
            cadena = cadena + preOrden(p.getDer());
        }
        return cadena;
    }
    
    public String inOrden(cLibro  p){
        String cadena = "";
        if(p!=null){ 
            cadena = cadena + inOrden(p.getIzq());
            cadena = cadena + p.mostrarDatos()+ "\n";
            cadena = cadena + inOrden(p.getDer());
        }
        return cadena;
    }
    
    public String postOrden(cLibro  p){
        String cadena = "";
        if(p!=null){ 
            cadena = cadena + inOrden(p.getIzq());
            cadena = cadena + inOrden(p.getDer());
            cadena = cadena + p.mostrarDatos()+ "\n";
        }
        return cadena;
    }
    
    public boolean eliminaNodo(int dato){
        cLibro padre=raiz; p=raiz; boolean esHijoIzq=true;
        while(p.getISBN()!= dato){
            padre=p;
            if(dato<p.getISBN()){
                esHijoIzq = true;
                p=p.getIzq();
            }else{
                esHijoIzq = false;
                p=p.getDer();
            }
            if(p == null){
                return false;
            }    
        }
        // Caso 1: El nodo a eliminar es una hoja (no tiene hijos)
        if(p.getIzq() == null && p.getDer() == null){ 
            if(raiz == p){ 
                setRaiz(null);
            }else{
                if(esHijoIzq == true){
                    padre.setIzq(null);
                }else{
                    padre.setDer(null);
                }     
            }
        }else{ 
            // Caso 2: El nodo a eliminar tiene un solo hijo
            if(p.getDer()==null){ // Caso 2.1: Tiene solo un hijo izquierdo
                if(p == raiz){
                    setRaiz(p.getIzq());
                }else{
                    if(esHijoIzq == true){
                        padre.setIzq(p.getIzq());
                    }else{
                        padre.setDer(p.getIzq());
                    }
                }
            } else if(p.getIzq()==null){ // Caso 2.2: Tiene solo un hijo derecho
                if(p == raiz){
                    setRaiz(p.getDer());
                }else{
                    if(esHijoIzq == true){
                        padre.setIzq(p.getDer());
                    }else{
                        padre.setDer(p.getDer());
                    }
                }
            } else{
                // Caso 3: El nodo a eliminar tiene dos hijos
                cLibro q = buscaReemplazo(p);
                if(p == raiz){
                    setRaiz(q);
                }else{
                    //Si el nodo NO es la raiz y esta a la izquierda
                    if(esHijoIzq == true){
                        padre.setIzq(q);
                    }else{
                        //Si el nodo NO es la raiz y esta a la derecha
                        padre.setDer(q);
                    }
                }
            }
        }
        return true;
    }
    
    private cLibro buscaReemplazo(cLibro p){
        cLibro q = p.getIzq(), r=p; //Q apunta al reemplazo y R es su padre
//      Buscar el nodo mas a la DERECHA del SUB-ARBOL IZQUIERDO 
         while (q.getDer()!= null) {
            r=q; //r es el padre del reemplazo
            q = q.getDer(); //q es el reemplazo -.-
        }
         
        if(p != r){//Si el reemplazo NO es hijo directo del padre
            //Conectar al padre del reemplazo con el hijo izquierdo del reemplazo (porque se va a quedar huerfano)
            r.setDer(q.getIzq());
            //Conectar al reemplazo con la izquierda del nodo a eliminar
            q.setIzq(p.getIzq());
        }
        q.setDer(p.getDer()); //Conectar al reemplazo con la derecha del nodo a eliminar
        return q;
    }

    public void setRaiz(cLibro raiz) {
        this.raiz = raiz;
    }
}
