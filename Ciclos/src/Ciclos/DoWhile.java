/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

/**
 *
 * @author SALOMÓN TAPIA
 */
import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int i = 1;
        int contador;
        
        System.out.println("Ingresa la cantidad que quieres imprimir");
        contador = teclado.nextInt();
        
        do {
            System.out.println(i);
            i++;
        } while (i<=contador);
        
    } 
}
