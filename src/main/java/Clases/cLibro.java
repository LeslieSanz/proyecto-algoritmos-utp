package Clases;

public class cLibro {
    private String titulo;
    private int ISBN;
    private String autor;
    private String editorial;
    private String genero;
    private int añoPub;
    private String idioma;

    //para la lista Doblemente Enlazada
    private cLibro sgte;
    private cLibro ante;

    //Para la cola con prioridad
    private int prioridad;
    
    //Para el arbol binario de busqueda
    private cLibro izq;
    private cLibro der;

    public cLibro(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public cLibro(String titulo, int ISBN, String autor, String editorial, String genero, int añoPub, String idioma) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.añoPub = añoPub;
        this.idioma = idioma;
        this.prioridad=0;
    }

    public cLibro( int ISBN, String titulo) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public cLibro(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoPub() {
        return añoPub;
    }

    public void setAñoPub(int añoPub) {
        this.añoPub = añoPub;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public String mostrarDatos(){
        return ISBN+" "+titulo+" "+autor+" "+editorial+" "+genero+" "+añoPub+" "+idioma;
    }

    
    
     //para la lista Doblemente Enlazada

    public cLibro getSgte() {
        return sgte;
    }

    public void setSgte(cLibro sgte) {
        this.sgte = sgte;
    }

    public cLibro getAnte() {
        return ante;
    }

    public void setAnte(cLibro ante) {
        this.ante = ante;
    }

    //Para la cola con prioridad
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    //Para el arbol binario de busqueda
    public cLibro getIzq() {
        return izq;
    }

    public void setIzq(cLibro izq) {
        this.izq = izq;
    }

    public cLibro getDer() {
        return der;
    }

    public void setDer(cLibro der) {
        this.der = der;
    }

}
