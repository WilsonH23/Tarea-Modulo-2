package com.mycompany.tareamodulo2.wilsonhernandez;

public class TareaModulo2WilsonHernandez {

//Metodo 1: Retorno de un Mensaje Fijo
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2025";
    }
    
//Metodo 2: Evaluacion de edad y Retorno de un mensaje
    public String evaluarEdad(int edad) {
        return edad>= 21 ? "Mayor de Edad" : "Menor de Edad";
    }
    
//Metodo 3: Multiplicacipn de dos numeros
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
 //Metodo 4: Retorno de una lista de numeros de 1 hasta x
    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i=0; i < x; i++){
            lista[i] = i+1;
        }
        return lista;
    }
    
    
    public static void main(String[] args) {
        TareaModulo2WilsonHernandez recursos= new TareaModulo2WilsonHernandez();
        
        
        
     System.out.println(recursos.obtenerMensaje());
      
     System.out.println(recursos.evaluarEdad(20));
     
     System.out.println("Multiplicacion: " + recursos.multiplicar(4, 2));
     
     int[] lista= recursos.generarLista(10);
     System.out.print("Lista generada: ");
     for (int num: lista) {
         System.out.print(num + " ");
     }
    }
}
