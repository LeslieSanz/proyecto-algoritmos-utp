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
        ingresaLibro(new cLibro("Cien años de soledad", 10, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español"));
        ingresaLibro(new cLibro("El Gran Gatsby", 15, "F. Scott Fitzgerald", "Scribner", "Novela", 1925, "Inglés"));
        ingresaLibro(new cLibro("1984", 8, "George Orwell", "Signet Classic", "Ciencia ficción", 1949, "Inglés"));
        ingresaLibro(new cLibro("El código Da Vinci", 12, "Dan Brown", "Vintage Español", "Novela", 2003, "Español"));
        ingresaLibro(new cLibro("Harry Potter y la piedra filosofal", 20, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español"));
        ingresaLibro(new cLibro("Matar un ruiseñor", 3, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés"));
        ingresaLibro(new cLibro("El Hobbit", 9, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés"));
        ingresaLibro(new cLibro("La ladrona de libros", 4, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés"));
        ingresaLibro(new cLibro("El exorcista", 14, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés"));
        ingresaLibro(new cLibro("La naranja mecánica", 13, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés")); 
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
        int n = 0; // Inicializamos el nivel
        cLibro libro = busquedaDirecta(raiz, ISBN, n);

        if (libro != null) {
            mostrarResultadoTabla(libro,modelo);
            return "Se encontró el libro \n" + libro.getTitulo();
        } else {
            return "Libro NO encontrado";
        }  
    }
    

    public cLibro busquedaDirecta(cLibro p,int ISBN, int n){
        cLibro libro ;
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
    
    //Metodo para ponerlo en una tabla, y mostrar en inOrden
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
                System.out.println("No se encontro el nodo");
                return false;
            }    
        }
        if(p.getIzq() == null && p.getDer() == null){ //Cuando es hoja, no tiene hijos
            if(raiz == p){ 
                setRaiz(null);
                System.out.println("Este es el caso en que era una hoja y era era la raiz");
            }else{
                if(esHijoIzq == true){
                    padre.setIzq(null);
                    System.out.println("Este es el caso en que era una hoja y era hijo Izquierdo");
                }else{
                    padre.setDer(null);
                    System.out.println("Este es el caso en que era una hoja y era hijo Derecho");
                }     
            }
        }else{ //Si tiene un solo hijo
            if(p.getDer()==null){ //Cuando tiene hijo izquierdo
                if(p == raiz){
                    setRaiz(p.getIzq());
                    System.out.println("Este es el caso en que era la RAIZ con un solo hijo IZQ");
                }else{
                    if(esHijoIzq == true){
                        padre.setIzq(p.getIzq());
                        System.out.println("Este es el caso en que el nodo a eliminar es hijo IZQUIERDO y tiene UN HIJO IZQ");
                    }else{
                        padre.setDer(p.getIzq());
                        System.out.println("Este es el caso en que el nodo a eliminar es hijo DERECHO y tiene UN HIJO IZQ");
                    }
                }
            } else if(p.getIzq()==null){ //Cuando tiene hijo derecho
                if(p == raiz){
                    setRaiz(p.getDer());
                    System.out.println("Este es el caso en que era la RAIZ con un solo hijo DER");
                }else{
                    if(esHijoIzq == true){
                        padre.setIzq(p.getDer());
                        System.out.println("Este es el caso en que el nodo a eliminar es hijo IZQUIERDO y tiene UN HIJO DER");
                    }else{
                        padre.setDer(p.getDer());
                        System.out.println("Este es el caso en que el nodo a eliminar es hijo DERECHO y tiene UN HIJO DER");
                    }
                }
            } else{
                cLibro q = buscaReemplazo(p);
                if(p == raiz){
                    setRaiz(q);
                }else{
                    //Si el nodo no es la raiz y esta a la izquierda
                    if(esHijoIzq == true){
                        padre.setIzq(q);
                    }else{
                        //Si el nodo no es la raiz y esta a la derecha
                        padre.setDer(q);
                    }
                }
            }
        }
        System.out.println("Nodo eliminado exitosamente");
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
    
//    public boolean eliminaNodo(int dato){
//        cLibro padre=raiz; p=raiz; boolean esHijoIzq=true;
//        while(p.getISBN()!= dato){
//            padre=p;
//            if(dato<p.getISBN()){
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
//                setRaiz(null);
//                System.out.println("Este es el caso en que era una hoja y era era la raiz");
//            }else{
//                if(esHijoIzq == true){
//                    padre.setIzq(null);
//                    System.out.println("Este es el caso en que era una hoja y era hijo Izquierdo");
//                }else{
//                    padre.setDer(null);
//                    System.out.println("Este es el caso en que era una hoja y era hijo Derecho");
//                }     
//            }
//        }else{ //Si tiene un solo hijo
//            if(p.getDer()==null){ //Cuando tiene hijo izquierdo
//                if(p == raiz){
//                    setRaiz(p.getIzq());
//                    System.out.println("Este es el caso en que era la RAIZ con un solo hijo IZQ");
//                }else{
//                    if(esHijoIzq == true){
//                        padre.setIzq(p.getIzq());
//                        System.out.println("Este es el caso en que el nodo a eliminar es hijo IZQUIERDO y tiene UN HIJO IZQ");
//                    }else{
//                        padre.setDer(p.getIzq());
//                        System.out.println("Este es el caso en que el nodo a eliminar es hijo DERECHO y tiene UN HIJO IZQ");
//                    }
//                }
//            }
//            if(p.getIzq()==null){ //Cuando tiene hijo derecho
//                if(p == raiz){
//                    setRaiz(p.getDer());
//                    System.out.println("Este es el caso en que era la RAIZ con un solo hijo DER");
//                }else{
//                    if(esHijoIzq == true){
//                        padre.setIzq(p.getDer());
//                        System.out.println("Este es el caso en que el nodo a eliminar es hijo IZQUIERDO y tiene UN HIJO DER");
//                    }else{
//                        padre.setDer(p.getDer());
//                        System.out.println("Este es el caso en que el nodo a eliminar es hijo DERECHO y tiene UN HIJO DER");
//                    }
//                }
//            }
//            if(p.getIzq() != null && p.getDer() != null){ //Cuando tiene DOS hijos
//                cLibro q=p.getIzq(),r=p; //Para rastrear la nodo padre del reemplazo
//
//                //Buscar el nodo mas a la DERECHA del sub-arbol IZQUIERDO (el inorden y pre orden empiezan asi)
//                 while (q.getDer()!= null) {
//                    r=q; //r es el padre del reemplazo
//                    q = q.getDer(); //q es el reemplazo -.-
//                }
//                 
//                if(p == raiz){ //Si el nodo a eliminar es raiz
//                    
//                    if(q.getIzq() == null){ //Si el reemplazo no tiene hijo izquierdo (derecho no tiene)
//                        r.setDer(null);
//                        q.setIzq(p.getIzq());
//                        q.setDer(p.getDer());
//                        setRaiz(q);
//                        System.out.println("Este es el caso en que el nodo a eliminar es LA RAIZ que tiene dos HIJOS (y su reemplazo es HOJA)");
//                    }else{
//                        r.setDer(q.getIzq());
//                        q.setIzq(null);
//                        q.setIzq(p.getIzq());
//                        q.setDer(p.getDer());
//                        setRaiz(q);
//                        System.out.println("Este es el caso en que el nodo a eliminar es LA RAIZ que tiene dos HIJOS (y su reemplazo tiene un hijo IZQ)");
//                    }
//                }else{
//                    if(esHijoIzq == true){
//                        if(q.getIzq() == null){
//                            if(p == r){                     
//                            q.setDer(p.getDer());
//                            padre.setIzq(q);
//                            System.out.println("Este es el caso en que el nodo a eliminar ES INTERMEDIO (ES IZQ) que tiene dos HIJOS y su reemplazo ES SU hijo directo");
//                            }else{
//                                r.setDer(null);
//                                q.setDer(p.getDer());
//                                q.setIzq(p.getIzq());
//                                padre.setIzq(q);
//                                System.out.println("Este es el caso en que el nodo a eliminar ES INTERMEDIO (ES IZQ) que tiene dos HIJOS y su reemplazo NO es su hijo directo");
//                            }
//                        }else{
//                            r.setDer(null);
//                            r.setIzq(q.getIzq());
//                            q.setDer(p.getDer());
//                            q.setIzq(p.getIzq());
//                            padre.setIzq(q);
//                            System.out.println("Este es el caso en que el nodo a eliminar ES INTERMEDIO (ES IZQ) que tiene dos HIJOS y su reemplazo NO es su hijo directo y este tenia un hijo izquierdo");
//                            
//                        }
//                    }else{
//                        if(q.getIzq() == null){ //Si el reemplazo es una hoja
//                            if(p == r){
//                            q.setDer(p.getDer());
//                            padre.setDer(q);
//                            System.out.println("Este es el caso en que el nodo a eliminar es INTERMEDIO (ES DER) y tiene dos HIJOS y su reemplazo ES su hijo directo");  
//                            }else{
//                                r.setDer(null);
//                                q.setDer(p.getDer());
//                                q.setIzq(p.getIzq());
//                                padre.setDer(q);
//                                System.out.println("Este es el caso en que el nodo a eliminar es INTERMEDIO (ES DER) y tiene dos HIJOS y su reemplazo NO ES su hijo directo");
//                            }
//                            
//                        }else{
//                            r.setDer(null);
//                            r.setIzq(q.getIzq());
//                            q.setDer(p.getDer());
//                            q.setIzq(p.getIzq());
//                            padre.setDer(q);
//                            System.out.println("Este es el caso en que el nodo a eliminar es INTERMEDIO (ES DER) y tiene dos HIJOS y su reemplazo NO ES su hijo directo y este tenia un hijo IZQ");
//                            
//                        }
//                    }
//                } //Falta considerar cuando el reemplazo tiene hijo izquierdo
//            }
//        } 
//        return false;
//    }

    public void setRaiz(cLibro raiz) {
        this.raiz = raiz;
    }
}
