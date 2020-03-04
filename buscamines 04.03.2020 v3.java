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
        int files;
        int columnes;
      
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
        String[][] Tablero = new String[files][columnes];
        boolean[][] TableroMinas = new boolean[files][columnes];
        String[][] TableroDescubierto = new String[files][columnes];

        //Les guarde amb contingut buit
        for (int f = 0; f < files; f++) {
            for (int c = 0; c < columnes; c++) {
                Tablero[f][c] = RES;
                TableroMinas[f][c] = false;
                TableroDescubierto[f][c] = RES;

            }
        }
        
        
        //Declare variables per a els valors random
        azar1 = (int) (Math.random() * files);
        azar2 = (int) (Math.random() * columnes);
    
        
        //Gusrde la mina que posteriorment imprimiré per pantalla amb 2 fors
        TableroMinas[azar1][azar2]= BOMBA;	// Guarda valor
          
        

        //Retorna cantitat de mines
        return minas;
    }
    //Si hi ha mina o no, si la posició també es incorrecta, retornará false.
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
    //Retorna Si la posició és correcta o no
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
    
    
    /*Quantitat de mines
adjacents d’eixa posició*/
    public static int qma( int f, int c){
            

    }
    
    /*Si la posició està
destapada o no.*/
    public static int destapat( int f, int c){
        return destapadaono;
        
    }
    /*Quantitat de cel·les
destapades que hi ha.*/ /*Serà invocada per a
comprovar si acabem el joc*/
    public static int qdestapats( ){
        return quantdestapats;
        
    }
    
    /*EntradaSi volem
    mostrar també
    les mines o no*/
    
    /*- Mostra el tauler, amb els
    números de files i
    columnes als 4 costats del
    tauler.
    - Consell per a representar
    cada cosa:
    Tapat à ‘X’
    Bandereta à ‘P’
    Res à ‘_’
    Separador à ‘|’*/
    public static int mostrarTauler(boolean m ){
        return quantdestapats;
        
    }
    
    //Si hem picat sobre mina o no,Si no hi ha mina es cridarà a la funció “destapar”
    public static int picar(int f, int c ){
        return quantdestapats;
        
    }
    
    
    /* Funció recursiva.
Casos base:
- Posició incorrecta
- Ja destapat
- Bandereta
- Té mines adjacents
Cas genèric:
- Posar la quantitat
d’adjacents en eixa
cel·la
- Destapar les 8
cel·les adjacents*/
    public static int destapar(int f, int c ){
        return quantdestapats;
        
    }
}
