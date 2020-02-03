/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author 1erDAM
 */
public class JavaApplication40 {

    public static void mostrarVectorInt(int v[]) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println("");
    }

    public static void mostrarMatriuInt(int matriu[][]) {
        for (int f = 0; f < matriu.length; f++) {
            // FILA:
            // numerets de la fila
            for (int c = 0; c < matriu[0].length; c++) {
                System.out.print(matriu[f][c] + " ");
            }
            // intro:
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notes[] = new int[10];
        int edats[] = new int[50];
        notes[2] = 4;
        notes[3] = 7;
        mostrarVectorInt(notes);
        mostrarVectorInt(edats);
        int notesprg[][] = new int[3][20];
        notesprg[2][5] = 8;
        mostrarMatriuInt(notesprg);
    }
}

