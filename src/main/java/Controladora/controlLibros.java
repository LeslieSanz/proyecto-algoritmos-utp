package Controladora;
import Clases.cLibro;
import javax.swing.JOptionPane;

public class controlLibros {
    public cLibro oLibros[];
    private int ind;

    public controlLibros(int n) {
        oLibros= new cLibro[n];
        ind=-1;
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
    //Empezar por indice 1, porque el primer elemento se asume ordenado. No hay uno anterior para comparar
    for(int i=1;i<=indMax;i++){
        //Recorrer el subarreglo ordenado y comparar con elemento a insertar
        //j es para explorar el subarreglo que va desde a[n-1] hasta a[0], de atras hacia adelante
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
