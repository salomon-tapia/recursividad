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

public class tablamultiplicar {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int i =1;
        int contador;
        int conta;
        int a;
        
        System.out.println("Ingresa la tabla que deseas imprimir");
        contador = teclado.nextInt();
        System.out.println("Ingresa hasta que numero desea que se multiplique");
        a= teclado.nextInt();
        
    while (i <= a) {
        conta=contador*i;
        
            System.out.println(contador+"x"+i+"="+conta);
            i++;
        
        
    }
    }
    }


