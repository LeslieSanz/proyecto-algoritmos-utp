package Controladora;
import Clases.cLibro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class controlLibros {
    private cLibro oLibros[];
    private int ind;

    public controlLibros(int n) {
        oLibros= new cLibro[n];
        ind=24;
    }
    
    public void cargarDatos(){
        oLibros[0] = new cLibro("Cien años de soledad", 74728, "Gabriel García Márquez", "Vintage Español", "Novela", 1967, "Español");
        oLibros[1] = new cLibro("El Gran Gatsby", 73565, "F. Scott Fitzgerald", "Scribner", "Novela", 1925, "Inglés");
        oLibros[2] = new cLibro("1984", 24935, "George Orwell", "Signet Classic", "Ciencia ficción", 1949, "Inglés");
        oLibros[3] = new cLibro("El código Da Vinci", 74278, "Dan Brown", "Vintage Español", "Novela", 2003, "Español");
        oLibros[4] = new cLibro("Harry Potter y la piedra filosofal", 83621, "J.K. Rowling", "Salamandra", "Fantasía", 1997, "Español");
        oLibros[5] = new cLibro("Matar un ruiseñor", 20084, "Harper Lee", "Harper Perennial Modern Classics", "Novela", 1960, "Inglés");
        oLibros[6] = new cLibro("El Hobbit", 28227, "J.R.R. Tolkien", "Houghton Mifflin Harcourt", "Fantasía", 1937, "Inglés");
        oLibros[7] = new cLibro("Orgullo y prejuicio", 90561, "Jane Austen", "CreateSpace Independent Publishing Platform", "Romance", 1813, "Inglés");
        oLibros[8] = new cLibro("La sombra del viento", 88674, "Carlos Ruiz Zafón", "Penguin Books", "Histórico", 2001, "Español");
        oLibros[9] = new cLibro("Los juegos del hambre", 84369, "Suzanne Collins", "Molino", "Ciencia ficción", 2008, "Español");
        oLibros[10] = new cLibro("El alquimista", 15007, "Paulo Coelho", "HarperOne", "Drama", 1988, "Inglés");
        oLibros[11] = new cLibro("Rayuela", 15229, "Julio Cortázar", "Cátedra", "Novela", 1963, "Español");
        oLibros[12] = new cLibro("It", 15229, "Stephen King", "Scribner", "Terror", 1986, "Español");
        oLibros[13] = new cLibro("El señor de los anillos: La comunidad del anillo", 66, "J.R.R. Tolkien", "Minotauro", "Fantasía", 1954, "Español");
        oLibros[14] = new cLibro("Crimen y castigo", 80599, "Fyodor Dostoevsky", "Oxford University Press", "Novela", 1866, "Inglés");
        oLibros[15] = new cLibro("El principito", 13925, "Antoine de Saint-Exupéry", "Harvest Books", "Infantil", 1943, "Inglés");
        oLibros[16] = new cLibro("Los pilares de la Tierra", 25245, "Ken Follett", "Signet", "Histórico", 1989, "Inglés");
        oLibros[17] = new cLibro("La naranja mecánica", 12836, "Anthony Burgess", "W. W. Norton & Company", "Ciencia ficción", 1962, "Inglés");
        oLibros[18] = new cLibro("La ladrona de libros", 75732, "Markus Zusak", "Vintage Books", "Drama", 2005, "Inglés");
        oLibros[19] = new cLibro("El exorcista", 42341, "William Peter Blatty", "Penguin Classics", "Terror", 1971, "Inglés");
        oLibros[20] = new cLibro("Don Quijote de la Mancha", 12345, "Miguel de Cervantes Saavedra", "Editorial", "Novela", 1605, "Español");
        oLibros[21] = new cLibro("Mujer en punto de exasperación", 67890, "Autor Anónimo", "Editorial XYZ", "Novela", 2022, "Español");
        oLibros[22] = new cLibro("¡Aventuras en la selva!", 54321, "Autor Aventurero", "Editorial Aventuras", "Aventura", 2020, "Español");
        oLibros[23] = new cLibro("Historias de amor y odio: ¿Quién ganará?", 98765, "Escritor Desconocido", "Editorial XYZ", "Drama", 2010, "Español");
        oLibros[24] = new cLibro("El misterioso caso del 'Objeto Perdido'", 11111, "Sherlock Holmes", "Editorial Detectives", "Misterio", 1890, "Inglés");

    }
    
    public void insertarLibro(cLibro libro){
        int indMax=oLibros.length-1;
        if (ind < indMax) {//si es menor siginifica que todavia ouede llenarse
            ind++;
            oLibros[ind] = libro; //que se almacene en el arreglo de objetos oLibros
        }
    }
    
    public String eliminarLibro(int isbn){
        String cad = "", cad2 = "";
    int posicion = -1; // Inicializa la posición con un valor que indique que no se encontró el ISBN.

    for (int i = 0; i <= ind; i++) {
        if (isbn == oLibros[i].getISBN()) {
            posicion = i;
            cad = "Se eliminó " + oLibros[posicion].getISBN() + " " + oLibros[posicion].getTitulo();
           ; // Sale del bucle una vez que se encuentra el libro.
        }
    }

    if (posicion > -1) {
        // Elimina el elemento en la posición 'posicion' y desplaza los elementos restantes hacia la izquierda.
        for (int i = posicion; i < ind; i++) {
            oLibros[i] = oLibros[i + 1];
        }
        oLibros[ind] = null; // Coloca 'null' en la última posición para eliminar la referencia al último elemento.
        ind--; // Reduce el valor de 'ind' para reflejar la eliminación.

        // Ahora, el libro se ha eliminado del arreglo original 'cBiblio'.
    
    System.out.println("Arreglo actualizado:");
        for (int i = 0; i <= ind; i++) {
            cad2= cad2 + oLibros[i].getISBN() + " " + oLibros[i].getTitulo()+ " " + oLibros[i].getAutor()+ " " + oLibros[i].getEditorial()+"\n";
        }
    }
    
    return cad+"\n"+cad2;
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
                oLibros[i].getPrioridad(),
                };
            modelo.addRow(data);
        }
    }
    
    public void limpiarTabla(DefaultTableModel modelo) {
        int indMaxFilas = modelo.getRowCount()-1;
        for (int i = indMaxFilas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    //ALGORITMOS DE ORDENAMIENTO
    
    //Ordenar por un atributo numerico (Luis Miguel)
    public void ordenarPorAtributoNumerico() {
    int izq = 0;
    int der = ind - 1;
    boolean ordenado = false;

    do {
        ordenado = true;

        // Mover de izquierda a derecha
        for (int i = izq; i <= der; i++) {
            if (oLibros[i].getAñoPub() > oLibros[i + 1].getAñoPub()) {
                cLibro temp = oLibros[i];
                oLibros[i] = oLibros[i + 1];
                oLibros[i + 1] = temp;
                ordenado = false;
            }
        }
        der--; // Reducir el rango de búsqueda a la izquierda

        // Si no se realizó ningún intercambio, el arreglo ya está ordenado
        if (ordenado) break;

        // Mover de derecha a izquierda
        for (int i = der; i > izq; i--) {
            if (oLibros[i].getAñoPub() < oLibros[i - 1].getAñoPub()) {
                cLibro temp = oLibros[i];
                oLibros[i] = oLibros[i - 1];
                oLibros[i - 1] = temp;
                ordenado = false;
            }
        }
        izq++; // Aumentar el rango de búsqueda a la derecha
    } while (!ordenado);
}
    
    //Ordenar por un atributo String (Leslie)
    public void ordInsercionParaString(){
    int indMax = ind-1; cLibro valor;
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
    
    // Método para ordenar por dos atributos (Esther)
    public void ordenarPorDosAtributos() {
        // Ordenar por Idioma en forma ascendente (Método de Burbuja)
    for (int i = 0; i < ind; i++) {
        for (int j = 0; j < ind - i; j++) {
            if (oLibros[j].getIdioma().compareTo(oLibros[j + 1].getIdioma()) > 0) {
                // Intercambiar los libros
                cLibro temp = oLibros[j];
                oLibros[j] = oLibros[j + 1];
                oLibros[j + 1] = temp;
            }
        }
    }

    // Ordenar por Editorial en forma descendente (Método de Selección)
    for (int i = 0; i < ind; i++) {
        int indiceMax = i;
        for (int j = i + 1; j < ind+1; j++) {
            if (oLibros[j].getEditorial().compareTo(oLibros[indiceMax].getEditorial()) > 0) {
                indiceMax = j;
            }
        }
        // Intercambiar los libros
        cLibro temp = oLibros[i];
        oLibros[i] = oLibros[indiceMax];
        oLibros[indiceMax] = temp;
       }
    }
    
    
    /*---------------------------------------------------------------------------------------------------------
    ALGORITMOS DE BUSQUEDA
    Buscar por un valor numerico (EN ESTE CASO ES VALOR DESORDENADOS) (Yosselin)*/ 
    public String busquedaNoOrdenadaISBN(int isbn){
        int indice=0;  //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && isbn!=oLibros[indice].getISBN()) {
            indice++;
        }
        if (isbn==oLibros[indice].getISBN()) 
            return oLibros[indice].getISBN()+" "+oLibros[indice].getTitulo()+" "+oLibros[indice].getAutor();
        else return "No se encontró";
    }
    
    public cLibro BuscarUno(int isbn){
        int indice=0;  //indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && isbn!=oLibros[indice].getISBN()) {
            indice++;
        }
        if (isbn==oLibros[indice].getISBN()) 
            return oLibros[indice];
        else return null;
    }
    
    //Buscar genero y año de publicacion (es en lista desordenada y el profe dijo que podiamos escoger los campos)
    // dos a la vez (Yosselin)
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
    
    //Muestre todos los valores que coincidan con una palabra especifica (Esther)
    public String BNOxpalaEspecf(String pbuscar) { 
        pbuscar = pbuscar.toLowerCase();
        int indMayor = ind;
        int[] indices = new int[oLibros.length];
        int n = 0;
       
        for (int ind = 0; ind <= indMayor; ind++) {
        String tituloLibro = oLibros[ind].getTitulo().toLowerCase();
            System.err.println(tituloLibro);
        String[] letrasT= tituloLibro.split(""); //dividir el titulo en letras
        String[] letrasB= pbuscar.split(""); //dividir pbuscar en letras
        
        int iMayor = letrasT.length;
        int jMayor = letrasB.length;
        int i = 0, j = 0; // Inicializamos la variable de inicio de coincidencia
        
        while (i <iMayor && j<jMayor) {
            if (letrasT[i].equals(letrasB[j])) {
                i++;
                j++;
            } else {
                //Si las letras no coinciden, reiniciamos la búsqueda
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
        int indice=0; String cadena = "";//indMayor es el ultimoindice del arreglo, el lenght recorre todos pero siempre es
        while (indice<ind && !idioma.equals(oLibros[indice].getIdioma())) {
            indice++;
        }
        while (indice<=ind) {
           if (idioma.equals(oLibros[indice].getIdioma())){ 
            cadena= cadena + oLibros[indice].getTitulo()+" "+oLibros[indice].getTitulo()+" "+oLibros[indice].getAutor()+"\n";
            ; }
           indice++;
        }
        return cadena;
    }    
}
