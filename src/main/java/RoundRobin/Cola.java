
package RoundRobin;

/**
 *
 * @author lesly
 */
public class Cola {
    private Nodo frente, p;
    private javax.swing.JTextArea TxtFinal;
    
    public Cola(javax.swing.JTextArea TxtFinal) {
        this.frente = null;        //Constructor
        this.TxtFinal = TxtFinal; // Asigna el JTextArea TxtFinal
    }

    public Cola() {
        this.frente = null;
    }


    public void encolar(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        if (frente == null) {
            frente = nuevoNodo;
        } else {
            p=frente;
            while(p.getSiguiente()!= null)
              p = p.getSiguiente();
            p.setSiguiente(nuevoNodo);
        }
    }

    public Proceso desencolar() {
        Proceso procesoDesencolado = frente.getProceso();
        if(frente!=null){
            frente=frente.getSiguiente();
        }
        return procesoDesencolado;
    }
    
    public void ejecutarRoundRobin(int quantum) {
    Nodo temp = frente;
    int tiempoTotal = 0;

    while (temp != null) {
        Proceso procesoActual = temp.getProceso();
        int tiempoEjecucion = Math.min(procesoActual.getTiempo(), quantum);
        procesoActual.setTiempo(procesoActual.getTiempo() - tiempoEjecucion);
        tiempoTotal += tiempoEjecucion;

        // Establecer el estado del proceso
        if (procesoActual.getTiempo() > 0) {
            procesoActual.setEstado("Pendiente");
        } else {
            procesoActual.setEstado("Terminado");
        }

        String resultado = "Ejecutando " + procesoActual.getNombre() + " por " + tiempoEjecucion + " unidades de tiempo. Tiempo total: "
                + tiempoTotal + " Falta: " + procesoActual.getTiempo() + " Estado : " + procesoActual.getEstado();

        // Agregar el resultado al JTextArea TxtFinal
        TxtFinal.append(resultado + "\n");

        // Verificar si el proceso aún tiene tiempo restante
        if (procesoActual.getTiempo() > 0) {
            
            // Desencolar y luego encolar nuevamente para reencolar el proceso              
            Proceso procesoReencolado = desencolar();
            encolar(procesoReencolado);
            
        } else {
            // El proceso ha terminado, simplemente desencolamos el nodo
            desencolar();
        }
        temp = frente;
    }
}










}
