/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladora;

/**
 *
 * @author esther
 */
public class pilaLetrasTitulos {
    private String pila1[], pila2[], pila3[];
    private int tope1, tope2, tope3;
    private int tamaño1, tamaño2, tamaño3, j;
    
    public pilaLetrasTitulos(String letras){
       tamaño1=hallarTamañoPilas1(letras);
       tamaño2=hallarTamañoPilas2(letras);
       tamaño3=hallarTamañoPilas3(letras);
       
        pila1 = new String[tamaño1];
        pila2 = new String[tamaño2];
        pila3 = new String[tamaño3];
        
        tope1 = -1;
        tope2 = -1;
        tope3 = -1;
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
    
    public int hallarTamañoPilas1(String letras){
//        String letras = colaLetras.muestraElementos();
        String[] letrasT= letras.split("");
        int tamañocola = letrasT.length;
        
        for (j = 0; j < tamañocola; j++) {
            if ("AEIOUaeiou".contains(letrasT[j]))
                tamaño1++;
        }
        return tamaño1;
    }
    
    public int hallarTamañoPilas2(String letras){
//        String letras = colaLetras.muestraElementos();
        String[] letrasT= letras.split("");
        int tamañocola = letrasT.length;
        
        for (j = 0; j < tamañocola; j++) {
            if ("BCDFGHJKLMNÑOPQRSTUWXYZbcdfghjklmnñpqrstvwxyz".contains(letrasT[j]))
                tamaño2++;
        }
        return tamaño2;
    }
    
    public int hallarTamañoPilas3(String letras){
//        String letras = colaLetras.muestraElementos();
        String[] letrasT= letras.split("");
        int tamañocola = letrasT.length;
        
        for (j = 0; j < tamañocola; j++) {
            if (".,':;¿?¡!1234567890".contains(letrasT[j]))
                tamaño3++;
        }
        return tamaño3;
    }
    
    
    public void seleccionarLetrasEnPilas(String letras){
//        String letras = colaLetras.muestraElementos();
        String[] letrasT= letras.split("");
        int tamañocola = letrasT.length;
        
        for (j=0;j < tamañocola; j++) {
            if("AEIOUaeiou".contains(letrasT[j]) && tope1<tamaño1-1){
                    tope1++;
                    pila1[tope1]=letrasT[j];
            }else
                if("BCDFGHJKLMNÑOPQRSTUWXYZbcdfghjklmnñpqrstvwxyz".contains(letrasT[j]) && tope2<tamaño2-1){
                    tope2++;
                    pila2[tope2]=letrasT[j];
                }else
                    if(".,':;¿?¡!1234567890".contains(letrasT[j]) && tope3<tamaño3-1){
                        tope3++;
                        pila3[tope3]=letrasT[j];
                    }
        }
    }
    
    public String acceso1(){
        String letra = null;
        if(tope1>-1){
            letra=pila1[tope1];
        }return letra;
    }
    
    public String acceso2(){
        String letra = null;
        if(tope2>-1){
            letra=pila2[tope2];
        }return letra;
    }
    
    public String acceso3(){
        String letra = null;
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
