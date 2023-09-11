package Controladora;
import Clases.cLibro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class controlLibros {
    public cLibro oLibros[];
    private int ind;

    public controlLibros(int n) {
        oLibros= new cLibro[n];
        ind=19;
    }
    
    public void cargarDatos(){
        oLibros[0] = new cLibro("Cien años de soledad", 74728, "Gabriel García Márquez", "Vintage Español", "Realismo mágico", 1967, "Español");
        oLibros[1] = new cLibro("El Gran Gatsby", 73565, "F. Scott Fitzgerald", "Scribner", "Novela contemporánea", 1925, "Inglés");
        oLibros[2] = new cLibro("1984", 24935, "George Orwell", "Signet Classic", "Distopía", 1949, "Inglés");
        oLibros[3] = new cLibro("El código Da Vinci", 74278, "Dan Brown", "Vintage Español", "Thriller de conspiración", 2003, "Español");
        oLibros[4] = new cLibro("Harry Potter y la piedra filosofal", 83621, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español");
        oLibros[5] = new cLibro("Matar un ruiseñor", 20084, "Harper Lee", "Harper Perennial Modern Classics", "Novela clásica", 1960, "Inglés");
        oLibros[6] = new cLibro("El Hobbit", 28227, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía épica", 1937, "Inglés");
        oLibros[7] = new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Novela romántica", 1813, "Inglés");
        oLibros[8] = new cLibro("La sombra del viento", 88674, "Carlos Ruiz Zafón", "Penguin Books", "Novela histórica", 2001, "Español");
        oLibros[9] = new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción distópica", 2008, "Español");
        oLibros[10] = new cLibro("El alquimista", 15007, "Paulo Coelho", "HarperOne", "Ficción espiritual", 1988, "Inglés");
        oLibros[11] = new cLibro("Rayuela", 15229, "Julio Cortázar", "Cátedra", "Novela experimental", 1963, "Español");
        oLibros[12] = new cLibro("Los hombres me explican cosas", 40219, "Rebecca Solnit", "Haymarket Books", "Ensayo feminista", 2014, "Inglés");
        oLibros[13] = new cLibro("El señor de los anillos: La comunidad del anillo", 66, "J.R.R. Tolkien", "Minotauro", "Fantasía épica", 1954, "Español");
        oLibros[14] = new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela psicológica", 1866, "Inglés");
        oLibros[15] = new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Literatura infantil", 1943, "Inglés");
        oLibros[16] = new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Novela histórica", 1989, "Inglés");
        oLibros[17] = new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Distopía", 1962, "Inglés");
        oLibros[18] = new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama histórico", 2005, "Inglés");
        oLibros[19] = new cLibro("Los tres mosqueteros", 42341, "Alexandre Dumas", "Penguin Classics", "Aventura histórica", 1844, "Inglés");
    }
    
    public void insertarLibro(cLibro libro){
        int indMax=oLibros.length-1;
        if (ind < indMax) {//si es menor siginifica que todavia ouede llenarse
            ind++;
            oLibros[ind] = libro; //que se almacene en el arreglo de objetos oLibros
        }
    }
    
    public String eliminarLibro(int isbn){
        String cad = null;
          int posicion = 0;
        for (int i = 0; i <=ind; i++) {
            if (isbn== oLibros[i].getISBN()) {
               posicion=i;
            cad= "Se eliminó "+ oLibros[posicion].getISBN()+" "+oLibros[posicion].getTitulo();}
        }
         if (posicion>-1) {
                oLibros[posicion]=null;
                JOptionPane.showMessageDialog(null, "Se elimino el alumno " + isbn);} 

        return cad;
    }
    
    public String muestraLibro(){
        String cadena="";
        for (int i = 0; i <=ind; i++) {
            cadena+=oLibros[i].mostrar()+"\n"; //obteniendo cada uno de los objetios
        }
        return cadena;
    }
    
    public void mostrarTabla(DefaultTableModel modelo){       
        for(int i=0;  i <=ind; i++){
            Object[] data = {
                oLibros[i].getISBN(), 
                oLibros[i].getTitulo(), 
                oLibros[i].getAutor(), 
                oLibros[i].getGenero(), 
                oLibros[i].getEditorial(), 
                oLibros[i].getIdioma(), 
                oLibros[i].getAñoPub(), 
                };
            modelo.addRow(data);
        }
    }
    
    //ALGORITMOS DE ORDENAMIENTO
    
    //Ordenar por un atributo numerico (Luis Miguel)
    public void ordenarPorAtributoNumerico() {
    int n = oLibros.length;
    boolean ordenado = false;

    do {
        ordenado = true;
        for (int i = 0; i < n - 1; i++) {
            if (oLibros[i].getAñoPub() > oLibros[i + 1].getAñoPub()) {
                cLibro temp = oLibros[i];
                oLibros[i] = oLibros[i + 1];
                oLibros[i + 1] = temp;
                ordenado = false;
            }
        }
        n--;
    } while (!ordenado);
}
    
    //Ordenar por un atributo String (Leslie)
    public void ordInsercionParaString(){
    int indMax = oLibros.length-1; cLibro valor;
    /*El indice "i" indica la posicion del elemento que se va a insertar 
    Empezar por indice 1(segundo elemento), porque el primer elemento se asume ordenado. 
    No hay uno anterior para comparar*/
    for(int i=1;i<=indMax;i++){
        /*En este ciclo se recorre el subarreglo ordenado 
        y se compara el elemento a insertar con cada uno de ellos
        j es para explorar el subarreglo (de atras hacia adelante)*/
        int j=i;
        while(j>0 && (oLibros[j].getAutor().compareTo(oLibros[j-1].getAutor())<0)){ //Si el que le sigue es menor que el anterior
            //Guardar el menor
            valor=oLibros[j];
            //Intercambiar lugares
            oLibros[j]=oLibros[j-1];
            oLibros[j-1]=valor; 
            j--;
            }
        }
    }
    
    
    /*---------------------------------------------------------------------------------------------------------
    ALGORITMOS DE BUSQUEDA
    Buscar por un valor numerico (EN ESTE CASO ES VALOR DESORDENADOS)*/
    public String busquedaNoOrdenada(int isbn){
        int indice=0;  //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && isbn!=oLibros[indice].getISBN()) {
            indice++;
        }
        if (isbn==oLibros[indice].getISBN()) 
            return oLibros[indice].getISBN()+" "+oLibros[indice].getTitulo()+" "+oLibros[indice].getAutor();
        else return "No se encontró";
    }
    
    //Buscar genero y año de publicacion (es en lista desordenada y el profe dijo que podiamos escoger los campos)
    // dos a la vez
    public String busquedaDosCampos(int año, String genero){
        int indice=0; String cadena=" ";
        while ((indice<ind && año!=oLibros[indice].getAñoPub() && !genero.equals(oLibros[indice].getGenero()))) {            
            cadena="No existe";
            indice++;
        }
        
        while (indice<=ind) {
           if (año==oLibros[indice].getAñoPub() && genero.equals(oLibros[indice].getGenero())){ 
            cadena= cadena + oLibros[indice].getTitulo()+" "+oLibros[indice].getTitulo()+" "+oLibros[indice].getAutor()+"\n";
            ; }
           indice++;
        }

//        String cadena=" ";
//        for (int indice = 0; indice <= ind; indice++) {
//            if (año==cBiblio[indice].getAñoPub() && genero.equals(cBiblio[indice].getGenero())){ 
//            cadena= cadena + cBiblio[indice].getTitulo()+" "+cBiblio[indice].getTitulo()+" "+cBiblio[indice].getAutor()+"\n";
//            ; }
//        }
//
        return cadena;
    } 
    
    
    
    //ALGORITMO DE BUSQUEDA
    //muestre todos los valores que coincidan con una palabra especifica
    public String BNOxpalaEspecf(String pbuscar) { 
        pbuscar = pbuscar.toLowerCase();
        int indMayor = oLibros.length - 1;
        int[] indices = new int[oLibros.length];
        int n = 0;
       
        for (int ind = 0; ind <= indMayor; ind++) {
        String tituloLibro = oLibros[ind].getTitulo().toLowerCase();
        String[] letrasT= tituloLibro.split(""); //dividir el titulo en letras
        String[] letrasB= pbuscar.split(""); //dividir pbuscar en letras
        
        int iMayor = letrasT.length;
        int jMayor = letrasB.length;
        int i = 0, j = 0, Coincide = -1; // Inicializamos la variable de inicio de coincidencia
        
        while (i <iMayor && j<jMayor) {
            if (letrasT[i].equals(letrasB[j])) {
                if (Coincide == -1) {
                    Coincide = i; // Establecer el inicio de la coincidencia
                }
                i++;
                j++;
                System.err.println(Coincide);
            } else {
                //Si las letras no coinciden, reiniciamos la búsqueda
                Coincide = -1;
                i = i - j + 1;//Retroceder i al siguiente índice
                j = 0;//Reiniciar la búsqueda de pbuscar
            }
        }
        if (j == jMayor) {
            // Hemos encontrado una coincidencia completa
            indices[n] = ind;
            n++;
            // System.err.println(n);
        }
    }
   
        // Verificar si se encontraron coincidencias
        if (n > 0) {
            String resultado = "Busqueda de TITULOS que contenga la palabra '" +pbuscar + "':\n";
            for (int i = 0; i < n; i++) {
                int indice = indices[i];
                cLibro libro = oLibros[indice];
                resultado = resultado+libro.mostrar() + "\n";
            }
            return resultado;
        } else 
        return "No existe Titulos que contengan la palabra '" +pbuscar+ "'.";
    }
    
    public String busquedaOrdenada(String idioma){
        int indice=0; //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        String cadena=" ";
        while (indice<ind && !idioma.equals(oLibros[indice].getIdioma())) {
            cadena="No existe";
            ind++;
        }

        while (indice<=ind) {
           if (idioma.equals(oLibros[indice].getIdioma())){ 
            cadena= cadena + oLibros[indice].getTitulo()+" "+oLibros[indice].getTitulo()+" "+oLibros[indice].getAutor()+"\n";
            ; }
           indice++;
        }
        
//        if (idioma.equals(cBiblio[indice].getIdioma())) 
//            return cBiblio[indice].getIdioma();
//        else return "";

        return cadena;
    }
    
    
}
