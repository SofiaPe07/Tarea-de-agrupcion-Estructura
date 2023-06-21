/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.ups.edu.tarea.corchetes.estructura;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Sofi Peña
 */
public class TareaCorchetesEstructura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        Stack<Character> pila = new Stack<>();
        System.out.println("Ingrese una cadena con simbolos de agrupacion");
        String ejemplo = in.nextLine();
        
        // vrecorre el string
        for (int i = 0; i < ejemplo.length(); i++) {
            char j = ejemplo.charAt(i);
            //valida cuando la pila esta vacia y a;ade el caracter
            if (pila.isEmpty()) {
                pila.push(j);
//imprime la lista
                for (char character : pila) {
                    System.out.print(character);
                }
                //mira si son aperturas en la cadena
                System.out.println("");
            } else if (j == '(' || j == '[' || j == '{') {
                pila.push(j);
                for (char character : pila) {
                    System.out.print(character);
                }
                System.out.println("");
                //valida l de cierre en la cadena 
            } else if (j == ')' || j == ']' || j == '}') {
                //saca el ultimo de la fila y si es elimina el de apertura
                if (j == ')' && pila.get(pila.size() - 1) == '(') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");
                    //el cierre cone le corechet saca el ultimo
                } else if (j == ']' && pila.get(pila.size() - 1) == '[') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");
                } else if (j == '}' && pila.get(pila.size() - 1) == '{') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");

                    //cuanod esta el de cierre pero no esta unno de apertura
                } else {
                    pila.push(j);
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");
                }
            }
        }
    }
}