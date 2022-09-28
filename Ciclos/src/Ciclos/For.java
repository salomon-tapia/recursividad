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

public class For {
    
    public static void main(String[] args) {
        int n, multi = 0, contador;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingresa el número que deseas multiplicar");
        n = entrada.nextInt(); 
        System.out.println("\n");
        
        //sintaxis del ciclofor
        
        for (int i = 1; i<=10; i++) {
            multi = n * i ;
            System.out.println(n+ " * "+ i +" = "+ multi);
           
        } 
    }
}
