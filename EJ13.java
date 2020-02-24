*// 13.En un taller de cotxes, cada volta que un treballador acaba una feina,
    //inserix en l’ordinador el seu nom, la data (dia, mes i any) i 
    //quantes hores i minuts ha estat treballant. 
    //a)Definix  la  classe Feinaamb  les  variables: nom,  dia,mes,  any,  hores, minuts.
    //b)El programa serà un bucle amb un menú:1.Afegir feina2.Llistar feines d’un treballador3.Eixir
    //1. Demanar dades d’una feina i afegir-la en un vector de feines.2. Demanar el nom del treballador.
    //Es mostrarà per pantalla una líniaper cada  feina  seua  (amb  les  dades corresponents)i,  a  la  dreta, 
    //l’import  a cobrar  corresponent,  a  40  €  l’hora.Al  final  del  llistat,  es  posarà  la quantitat d’hores 
    //i minuts totals, així com l’import total del treballador.
    
package javaapplication80;

import java.util.Scanner;

/**
 *
 * @author 1erDAM
 */
public class JavaApplication80 {
    
    public static Scanner teclat = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int opcio;
            Feina feines[] = new Feina[100];        
            do {            
            System.out.println("1. Afegir feina");
            System.out.println("2. Llistar feines d'un treballador");
            System.out.println("3. Borrar feines d'un treballador");
            System.out.println("4. Incrementar 1 hora a les feines d'un treballador");
            System.out.println("0. Eixir");
            System.out.println("Opció:");
            opcio = teclat.nextInt();
            teclat.nextLine(); // buidar buffer
            switch (opcio) {
                case 0:
                    break; // eixir
                case 1:
                    afegirFeina(feines);
                    break;
                case 2:
                    llistarFeinesTreballador(feines);
                    break;
                case 3:
                    borrarFeinesTreballador(feines);
                    break;
                case 4:
                    incrementarHoraFeinesTreballador(feines);
                    break;
                default:
                    System.out.println("Opció incorrecta"); 
            }
            } while (opcio != 0);
    }
    
    
    private static void afegirFeina(Feina[] feines){
            //BUSCAR UNA POSICIO LLIURE DEL VECTOR FEINES
            int pos= 0;
            for (int i = 0; i < feines.length; i++) {
                if(feines[i]== null)break;
            }


            if (pos==feines.length){
                System.out.println("No caben més feines.");
            }
            else{
                feines[pos]=new Feina();
                System.out.println("Nom treballador:");
                feines[pos].nom = teclat.nextLine();
            }
        }

    private static void llistarFeinesTreballador(Feina[] feines){
        // Buscar una posició lliure del vector de feinies:
             int pos;
             for (pos = 0; pos < feines.length; pos++) {
                 if (feines[pos] == null) {
                     break;
                 }
             }        if (pos == feines.length) {
                 System.out.println("No caben més feines");
             } else {
                 // Reservem memòria en eixa posició per a una nova feina
                 feines[pos] = new Feina();            // Omplim eixa nova feina
                 System.out.println("Nom treballador: ");
                 feines[pos].nom = teclat.nextLine();
                 System.out.println("Dia:");
                 feines[pos].dia = teclat.nextInt();
                 System.out.println("Mes:");
                 feines[pos].mes = teclat.nextInt();
                 System.out.println("Any:");
                 feines[pos].any = teclat.nextInt();
                 System.out.println("Hora:");
                 feines[pos].hores = teclat.nextInt();
                 System.out.println("Minuts:");
                 feines[pos].minuts = teclat.nextInt();
        }        teclat.nextLine(); // buidar buffer
    }
    
    private static void borrarFeinesTreballador(Feina[] feines) {
        System.out.println("Nom del treballador: ");
        String nomBuscar = teclat.nextLine();
        for (int i = 0; i < feines.length; i++) {
            try {
                if (feines[i].nom.equals(nomBuscar)) {
                    feines[i] = null;
                }
            } catch (NullPointerException e) {
                // Ací no cal indicar res
            }
        }
    }    
    
    private static void incrementarHoraFeinesTreballador(Feina[] feines) {
        System.out.println("Nom del treballador: ");
        String nomBuscar = teclat.nextLine();
        for (int i = 0; i < feines.length; i++) {
            try {
                if (feines[i].nom.equals(nomBuscar)) {
                    feines[i].hores++;
                }
            } catch (NullPointerException e) {
                // Ací no cal indicar res
            }
        }    }
}



