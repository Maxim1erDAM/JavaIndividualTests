/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminesfinal;

import java.util.*;

/**
 *
 * @author m4xt3d
 */
public class BuscaMinesFinal {

    private static final String TAPAT = "X";
    private static final String BANDERETA = "P";
    private static final String RES = "_";
    private static final String SEPARADOR = "|";
    private static final boolean BOMBA = true;

    private static boolean SIONO;

    private static String[][] Tablero;
    private static boolean[][] TableroMinas;
    private static String[][] TableroDescubierto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(BuscaMinesFinal.minar());
    }

    //Demana quantitat de mines i les posa aleatoriament    
    //- Inicialitza matrius - Demana la quantitat de mines i les posa aleatòriament 
    public static int minar() {

        int minas;
        int qminas;
        int files;
        int columnes;
        int posfila;
        int poscolumna;
        int azar1;
        int azar2;

        do {
            System.out.println("¿Cuantas minas desea poner?");
            Scanner teclat = new Scanner(System.in);
            minas = teclat.nextInt();

            System.out.println("¿Cuántas files vols?");
            files = teclat.nextInt();

            System.out.println("¿Cuántas columnes vols?");
            columnes = teclat.nextInt();

            if (minas > files * columnes) {
                System.out.println("Usted ha ingresado mas minas que celdas"
                        + " en el tablero, ingrese menos minas");
            } else {
            }
        } while (minas > files * columnes);

        //Initcialitze matrius
        String[][] Tablero = new String[10][10];
        boolean[][] TableroMinas = new boolean[10][10];
        String[][] TableroDescubierto = new String[10][10];

        //Les guarde amb contingut buit
        for (int f = 0; f < files; f++) {
            for (int c = 0; c < columnes; c++) {
                Tablero[f][c] = RES;
                TableroMinas[f][c] = false;
                TableroDescubierto[f][c] = RES;

            }
        }
        //Declare variables per a els valors random
        qminas = 0;
        azar1 = (int) (Math.random() * 10);
        azar2 = (int) (Math.random() * 10);
        for (int i = 0; i <= minas; i++) {
            TableroMinas[azar1][azar2] = BOMBA;	// Guarda valor
            qminas = i;
        }
        //Retorna cantitat de mines
        return qminas;
    }

    public static boolean minat(int f, int c) {

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (TableroMinas[i][j] = BOMBA) {
                    TableroMinas[i][j] = BOMBA;
                    System.out.println("MINA!!.");
                    return true;
                } else {
                    System.out.println("No sa trobat ninguna mina.");
                    return false;
                }
            }
        }
        return false;
    }
    
    public static boolean incorrecte( int f, int c){
     
            if (100 <= f * c) {
                System.out.println("Usted ha ingresado una posicion"
                        + " incorrecta en el tablero, ingrese menos filas o columnas.");
                return true;
            } else {
                System.out.println("Usted ha ingresado una posicion"
                        + " correcta en el tablero.");
                return false;
            }

    }
    
}
