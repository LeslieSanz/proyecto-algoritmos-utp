/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class colapilaLetrasTitulo {
    private String cola[]; 
    private int first, last, tamaño, tamañoTitulo;
    
    private String pila1[], pila2[], pila3[];
    private int tope1, tope2, tope3;
    private int tamaño1, tamaño2, tamaño3;
    
    private int j;
    
    public colapilaLetrasTitulo(String letrasTitulo) {
        tamaño= hallarTamañoCola(letrasTitulo);
        cola=new String[tamaño];
        colaVacia();
        
        tamaño1=hallarTamañoPilas1(letrasTitulo);
        tamaño2=hallarTamañoPilas2(letrasTitulo);
        tamaño3=hallarTamañoPilas3(letrasTitulo);
       
        pila1 = new String[tamaño1];
        pila2 = new String[tamaño2];
        pila3 = new String[tamaño3];
        
        tope1 = -1;
        tope2 = -1;
        tope3 = -1;
    }
    
    // Inicializa la cola
    public void colaVacia(){
        first=-1; last = -1;
    }
    
    public int getTope1(){
        return tope1;
    }
    
    public int getTope2(){
        return tope2;
    }
    
    public int getTope3(){
        return tope3;
    }
    
    //METODO PARA CALCULAR EL TAMAÑO DE LA COLA SEGUN LA CANTIDAD DE LETRAS 
    //QUE TIENE EL TITULO SIN CONTAR LOS ESPACIOS
    public int hallarTamañoCola(String titulo){
        String[] letrasT= titulo.split(""); //se divide el titulo en letras
        tamañoTitulo = letrasT.length;
        int esp=0;
        tamaño=0;
        
        for (j=0;j < tamañoTitulo; j++) {
            if(letrasT[j].equals(" ")){
                esp=esp+1;
            }
        }
        tamaño=tamañoTitulo-esp; //tamaño de titulo menos la cant de espacios 
        return tamaño;
    }
    
    // Inserta letras del título en la cola
    public void insertaTituloEnCola(String titulo) { 
        String[] letrasT= titulo.split("");
        tamañoTitulo = letrasT.length;
        
        for (j=0;j < tamañoTitulo && last < tamaño-1; j++) {
          if(!letrasT[j].equals(" ")){
          last++;
          cola[last] = letrasT[j];

          if (first == -1) {
            first = 0;
          }
          }
        }
    }
    
    public String acceso(){
        String letra = "";
        if(first>-1){
            letra=cola[first];
        }
        return letra;   
    }
    
    //recorre el arreglo y lo muestra los elementos de la cola como cadena 
    public String muestraElementos(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
                cadena+=cola[i]+" ";
            }
        }
        return cadena;
    }
    
    //METODO PARA CALCULAR EL TAMAÑO DE LA PILA1 AUTOMATICAMENTE
    //SEGUN LA CANTIDAD DE VOCALES QUE SE ENCUENTREN EN LA CADENA DE LA COLA
    public int hallarTamañoPilas1(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño1=0;
        
        for (j = 0; j < tamañocola; j++) {
            if ("AEIOUaeiouÁÉÍÓÚáéíóú".contains(letrasT[j]))
                tamaño1++;
        }
        return tamaño1;
    }
    
    //METODO PARA CALCULAR EL TAMAÑO DE LA PILA2 AUTOMATICAMENTE
    //SEGUN LA CANTIDAD DE CONSONANTES QUE SE ENCUENTREN EN LA CADENA DE LA COLA
    public int hallarTamañoPilas2(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño2=0;
        
        for (j = 0; j < tamañocola; j++) {
            if ("BCDFGHJKLMNÑOPQRSTUVWXYZbcdfghjklmnñpqrstvwxyz".contains(letrasT[j]))
                tamaño2++;
        }
        return tamaño2;
    }
    
    //METODO PARA CALCULAR EL TAMAÑO DE LA PILA3 AUTOMATICAMENTE
    //SEGUN LA CANTIDAD DE OTROS ELEMENTOS DIFERENTES A VOCALES O CONSONANTES 
    //QUE SE ENCUENTREN EN LA CADENA DE LA COLA
    public int hallarTamañoPilas3(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño3=0;
        
        for (j = 0; j < tamañocola; j++) {
            if (".,':;¿?¡!1234567890".contains(letrasT[j]))
                tamaño3++;
        }
        return tamaño3;
    }

    //ESTE METODO HACE UNA SELECCION DE LAS LETRAS A LA PILA QUE CORRESPONDA 
    //RECORRIENDO LA COLA MEDIANTE EL FIRST. ADEMAS ELIMINA EL PRIMERO DE LA COLA 
    //CUANDO ESTA LETRA QUE SE ELIMINA SE INSERTA EN LA PILA QUE LE CORRESPONDE
    public void seleccionarLetrasEnPilas(String letrasTitulo){
        if (first>-1) {
            //COMPRUEBA SI LA LETRA ES UNA VOCAL
            if("AEIOUaeiouÁÉÍÓÚáéíóú".contains(cola[first]) && tope1<tamaño1-1){
                    tope1++; //APUNTA AL ULTIMO DE LA PILA1
                    pila1[tope1]=cola[first]; //INSERTA EN LA PILA1
                    first++; //ELIMINA DE LA COLA
            }else
                //COMPRUEBA SI LA LETRA ES UNA CONSONANTE
                if("BCDFGHJKLMNÑOPQRSTUVWXYZbcdfghjklmnñpqrstvwxyz".contains(cola[first]) && tope2<tamaño2-1){
                    tope2++; //APUNTA AL ULTIMO DE LA PILA2
                    pila2[tope2]=cola[first]; //INSERTA EN LA PILA2
                    first++; //ELIMINA DE LA COLA
                }else
                    //COMPRUEBA SI LA LETRA NO ES VOCAL NI CONSONANTE
                    if(".,':;¿?¡!1234567890".contains(cola[first]) && tope3<tamaño3-1){
                        tope3++; //APUNTA AL ULTIMO DE LA PILA3
                        pila3[tope3]=cola[first]; //INSERTA EN LA PILA3
                    first++;//ELIMINA DE LA COLA
                    }
        }if(first> last)
                    colaVacia(); 
    }
    
    public String acceso1(){
        String letra = "";
        if(tope1>-1){
            letra=pila1[tope1];
        }return letra;
    }
    
    public String acceso2(){
        String letra = "";
        if(tope2>-1){
            letra=pila2[tope2];
        }return letra;
    }
    
    public String acceso3(){
        String letra = "";
        if(tope3>-1){
            letra=pila3[tope3];
        }return letra;
    }
    
    //recorre el arreglo y muestra los elementos de la PILA1 como cadena 
    public String muestraValoresPila1(){
        String cadena="";
        for(int i=0; i<=tope1; i++){
            cadena+=pila1[i]+" ";
        }return cadena;
    }
    
    //recorre el arreglo y muestra los elementos de la PILA2 como cadena 
    public String muestraValoresPila2(){
        String cadena="";
        for(int i=0; i<=tope2; i++){
            cadena+=pila2[i]+" ";
        }return cadena;
    }
    
    //recorre el arreglo y muestra los elementos de la PILA3 como cadena 
    public String muestraValoresPila3(){
        String cadena="";
        for(int i=0; i<=tope3; i++){
            cadena+=pila3[i]+" ";
        }return cadena;
    } 
    
    
}
