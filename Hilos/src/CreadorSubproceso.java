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
import java.util.Scanner;

public class CreadorSubproceso
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el numero que desea buscar: ");     
      int busqueda = scanner.nextInt();
      int[] arreglo = new int[100];
      Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arreglo[i] = 1 + rand.nextInt(20);
        }
      
      Thread subproceso1 = new Thread(new TareaImprimir("tarea1", 1, 24, busqueda, arreglo));
      Thread subproceso2 = new Thread(new TareaImprimir("tarea2", 25, 49, busqueda, arreglo));
      Thread subproceso3 = new Thread(new TareaImprimir("tarea3", 50, 74, busqueda, arreglo));
      Thread subproceso4 = new Thread(new TareaImprimir("tarea4", 75, 99, busqueda, arreglo));
      
      System.out.println("Subprocesos creados, iniciando tareas.");

      // Inicia los subprocesos y los coloca en el estado "en ejecucion"
      subproceso1.start(); // invoca al metodo run de tarea1
      subproceso2.start(); // invoca al metodo run de tarea2
      subproceso3.start(); // invoca al metodo run de tarea3
      subproceso4.start();
	  	
      System.out.println("Tareas iniciadas, main termina.\n");
   } 
} 

