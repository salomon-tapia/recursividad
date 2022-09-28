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

//Programa que imprime n numeros de forma ascendente 

public class While {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int i =1;
        int contador;
        
        System.out.println("Ingresa la cantidad de números que quieres imprimir");
        contador = teclado.nextInt();
    
    //sintaxis del ciclo while
        
    while (i <= contador) {
            System.out.println(i);
            i++;
    }
    } 
}
