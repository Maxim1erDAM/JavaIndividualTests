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
    private static final String BOMBA = "*";

    private static boolean SIONO ;



    private static String[][] Tablero; 
    private static String[][] TableroMinas; 
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
        int azar1;
        int azar2;

        int midatauler=100;
        do{
            System.out.println("¿Cuantas minas desea poner?");
            Scanner teclat = new Scanner(System.in);
            minas = teclat.nextInt();
 
            System.out.println("¿Cuántas files vols?");
            files = teclat.nextInt();

            System.out.println("¿Cuántas columnes vols?");
            columnes = teclat.nextInt();



            if(minas > files*columnes){
                System.out.println("Usted ha ingresado mas minas que celdas"
            + " en el tablero, ingrese menos minas");
        }
        else{ }
        }while (minas > files*columnes);
        
        //Initcialitze matrius

        String [][] Tablero = new String[10][10];
        String [][] TableroMinas = new String[10][10];
        String [][] TableroDescubierto = new String[10][10];

        //Les guarde amb contingut buit
        for (int f = 0; f < files; f++) {
            for (int c = 0; c < columnes; c++) {
                Tablero[f][c] = RES;
                TableroMinas[f][c] = RES;
                TableroDescubierto[f][c] = RES;

            }
        }
        //Declare variables per a els valors random
        qminas=0;
        azar1 = (int) (Math.random() * 10);
        azar2 = (int) (Math.random() * 10);
        for (int i = 0; i <= minas; i++) {
            TableroMinas[azar1][azar2] = BOMBA;	// Guarda valor
            qminas=i;
        }
        //Retorna cantitat de mines
        return qminas;
    }  
 
    
}
