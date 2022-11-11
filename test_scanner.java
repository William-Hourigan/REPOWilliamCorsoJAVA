//test_scanner 11-11-22

import java.util.Scanner;       //  Importo la funzionalità scanner dalla libreria di java util

class test_scanner {
    public static void main(String[] args) {
        Scanner myScannerString = new Scanner(System.in);                       //  Andiamo a creare un nuovo scanner per le string (una volta messo un tipo nello scanner quello scanner puo avere solo quel tipo)
        System.out.println("\n\n\n\nMetti il tuo nickname");                 //  Chiedo il nickname dell'utente

        String NomeTUO = myScannerString.nextLine();                            //  Read user input
        System.out.println("Il tuo nickname è: " + NomeTUO);                    //  Output user input
        
        //  -----------------------------------SOPRA E SOTTO FANNO 2 COSE DIVERSE -----------------------------------------------------------

        Scanner myScannerInt = new Scanner(System.in);                          //  creo uno scanner per interi dato che l'ultimo scanner è bloccato in int
        System.out.println("\n\nMetti la tua età");                      //  Chiedo il l'età dell'utente

        int numero = myScannerInt.nextInt();                                    //  Read user input
        System.out.println("la tua età è: " + numero);                          //  Output user input
    }
    //  Termine metodo main della classe test_scanner
}
//  Termine della classe test_scanner