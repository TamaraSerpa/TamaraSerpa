/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamys
 */
import java.util.Random;

public class TareaImprimir implements Runnable
{
   private int[] arreglo; // tiempo de inactividad aleatorio para el subproceso
   private final String nombreTarea;    // nombre de la tarea
   private int numBusq;
   private int inicio, fin;

   public TareaImprimir(String nombre, int ini, int f, int busq, int []array)
   {	nombreTarea = nombre; // establece el nombre de la tarea
        inicio = ini;
        fin = f;
        numBusq = busq;
        arreglo = array;
   }

   public void run(){
   for (int i = inicio; i < fin; i++) {
        if (arreglo[i] == numBusq) {
                System.out.println("Número encontrado en la posición " + i + " por " + nombreTarea);
                // No detenemos la búsqueda para demostrar el trabajo paralelo y que varios hilos pueden encontrar el número.
            }
        }
    }
} 
