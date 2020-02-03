/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author 1erDAM
 */
public class JavaApplication41 {

    public static void mostrarVectorInt(int v[]) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println("");
    }

    public static void copiarVector(int vori[], int vdes[]) {
        int qelemcopiar;
        if (vori.length < vdes.length) {
            qelemcopiar = vori.length;
        } else {
            qelemcopiar = vdes.length;
        }
        for (int i = 0; i < qelemcopiar; i++) {
            vdes[i] = vori[i];
        }
    }

    public static void main(String[] args) {
        int notes[] = {4, 5, 5, 6, 6, 6, 7, 7, 8};
        int notes2[] = new int[100];
        copiarVector(notes, notes2);
        mostrarVectorInt(notes2);
    }

}
