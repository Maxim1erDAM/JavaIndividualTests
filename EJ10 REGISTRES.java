package javaapplication61;

/*EJ10.Una biblioteca vol emmagatzemar informació de cada llibre que té: codi de
referència (alfanumèric), autors (màxim, 3), títol, editorial i any. Implementa
l’estructura necessària per a guardar 100 llibres. Reserva memòria per a
cadascun d’eixos llibres. Després dóna d’alta un llibre qualsevol.*/

public class JavaApplication61 {



    public static void main(String[] args) {
        Llibre llibres[] = new Llibre[100];
        for (int i = 0; i < llibres.length ; i++) {
            llibres[i] = new Llibre();
            }
        }
    }

    class Autors {

        String nom;
    }
    class Llibre {
        String codiRef;
        String titol;
        String editorial;
        String any;
        Autors autors[] = new Autors[3];
        public Llibre() {
            
        }
    }
