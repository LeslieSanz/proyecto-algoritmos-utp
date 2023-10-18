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
    
    public int hallarTamañoCola(String titulo){
        String[] letrasT= titulo.split("");
        tamañoTitulo = letrasT.length;
        int esp=0;
        tamaño=0;
        
        for (j=0;j < tamañoTitulo && last < tamañoTitulo - 1; j++) {
            if(letrasT[j].equals(" ")){
                esp=esp+1;
            }
        }
        tamaño=tamañoTitulo-esp;
        return tamaño;
    }
    
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
    
    public String muestraElementos(){
        String cadena="";
        if(first>-1){
            for(int i=first; i <= last;i++){
                cadena+=cola[i]+" ";
            }
        }
        return cadena;
    }
    
    public int hallarTamañoPilas1(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño1=0;
        
        for (j = 0; j < tamañocola; j++) {
            if ("AEIOUaeiouÁÉÍÓÚáéíóú".contains(letrasT[j]))
                tamaño1++;
        }
        System.out.println(tamaño1);
        return tamaño1;
    }
    
    public int hallarTamañoPilas2(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño2=0;
        
        for (j = 0; j < tamañocola; j++) {
            if ("BCDFGHJKLMNÑOPQRSTUWXYZbcdfghjklmnñpqrstvwxyz".contains(letrasT[j]))
                tamaño2++;
        }
         System.out.println(tamaño2);
        return tamaño2;
    }
    
    public int hallarTamañoPilas3(String letrasTitulo){
        String[] letrasT= letrasTitulo.split("");
        int tamañocola = letrasT.length;
        tamaño3=0;
        
        for (j = 0; j < tamañocola; j++) {
            if (".,':;¿?¡!1234567890".contains(letrasT[j]))
                tamaño3++;
        }
         System.out.println(tamaño3);
        return tamaño3;
    }

    
    public void seleccionarLetrasEnPilas(String letrasTitulo){
        
        if (first>-1) {
            if("AEIOUaeiouÁÉÍÓÚáéíóú".contains(cola[first]) && tope1<tamaño1-1){
                    tope1++;
                    pila1[tope1]=cola[first];
                    first++;
            }else
                if("BCDFGHJKLMNÑOPQRSTUWXYZbcdfghjklmnñpqrstvwxyz".contains(cola[first]) && tope2<tamaño2-1){
                    tope2++;
                    pila2[tope2]=cola[first];
                    first++;
                }else
                    if(".,':;¿?¡!1234567890".contains(cola[first]) && tope3<tamaño3-1){
                        tope3++;
                        pila3[tope3]=cola[first];
                    first++;
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
    
    public String muestraValoresPila1(){
        String cadena="";
        for(int i=0; i<=tope1; i++){
            cadena+=pila1[i]+" ";
        }return cadena;
    }
    
    public String muestraValoresPila2(){
        String cadena="";
        for(int i=0; i<=tope2; i++){
            cadena+=pila2[i]+" ";
        }return cadena;
    }
    
    public String muestraValoresPila3(){
        String cadena="";
        for(int i=0; i<=tope3; i++){
            cadena+=pila3[i]+" ";
        }return cadena;
    } 
    
    
}
