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
    public static int[] creaILligVectorInt(int n){
        //Creem un vector d'enters
        int vec[]= new int[n];
        //Creem un vector d'enters
        llegirVectorInt(vec);
        //Retornarlo
        return vec;
    }

   public static void main(String[] args) {        
       int notes[]=new int[10];
       System.out.println("Dimensió del vector:");
       int dimensio= llegirInt();
       
       notes= creaILligVectorInt(dimensio);
   }



}
