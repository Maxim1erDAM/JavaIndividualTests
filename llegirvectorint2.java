/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author 1erDAM
 */
public class JavaApplication43 {
    
    public static int llegirInt(){
       Scanner teclat = new Scanner(System.in);
       return teclat.nextInt();
    }
    
    
    public static void llegirVectorInt(int v[]){
        Scanner teclat = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Dis-me el valor per a la posició "+i+": ");
            v[i] = teclat.nextInt();            
        }        
    }
    

   public static void main(String[] args) {        
       int vectoret[]= new int[10];
       llegirVectorInt(vectoret);
       System.out.println("Disme la dimenió del vector:");

       Scanner teclat = new Scanner(System.in);


   }



}
