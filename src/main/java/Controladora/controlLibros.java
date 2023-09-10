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
    public int[] BNOxpalaEspecf(String valor) { 
        valor = valor.toLowerCase();
        int indMayor = oLibros.length - 1;
        int ind;
        int[] indices = new int[oLibros.length];
        int n = 0;
        
        for (ind = 0; ind <= indMayor; ind++) {
         if (oLibros[ind].getTitulo().toLowerCase().contains(valor)){    
            indices[n] = ind;
                n++;
             //System.out.println(ind);        
         }
        }
        
        // Verificar si se encontraron coincidencias
        if (n > 0){
        // Crear un nuevo arreglo
        int[] indvalido = new int[n];
        for (ind = 0; ind < n; ind++)
            indvalido[ind] = indices[ind];
        return indvalido;
        } 
        else 
        return new int[]{-1}; 
    }  
}
