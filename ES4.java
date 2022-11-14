//  ES4 11/11/22 William H (es su IF e scanner)

import java.net.http.HttpRequest.BodyPublisher;
import java.util.Scanner;       //  Importo la funzionalità scanner dalla libreria di java util
import java.util.spi.TimeZoneNameProvider;

class ES4 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 13;
        int num3 = 13;


        //  PARAGONO num1 E num2
        if (num1==num2) {
            System.out.println("\n\nNumero 1 e numero 2 sono uguali");
        } //  chiudo IF


        //  PARAGONO num2 E num3
        if (num2==num3) {
            System.out.println("Numero 2 e numero 3 sono uguali");
        } //  chiudo IF


        //  PARAGONO num1 E num3
        if (num1==num3) {
            System.out.println("Numero 1 e numero 3 sono uguali");
        } //  chiudo IF



        //  serie di IF annidati
        if(num1!=num2)
        {
            if (num2==num3)
            {
                if (num1!=num3) 
                {
                    System.out.println("Victory");
                } //  chiudo if terzo
            } //  chiudo IF secondo
        } //  chiudo IF primo



        //  LEGGO INPUT DELL'UTENTE
        Scanner myScannerInt = new Scanner(System.in);                          //  creo uno scanner chiamato "myScannerInt" per leggere le int
        System.out.println("\nVuoi entrare nell'account 1, 2 o 3?");
        int numAcc = myScannerInt.nextInt();                                    //  uso lo scanner "myScannerInt" per leggere un int e lo metto nella variabile "numAcc"

        //  dico all'utente in che account sono entrati
        if (numAcc==1)
        {
            System.out.println("Sei entrato nell'account 1");
        }                                                                       //  chiudo IF
        else if (numAcc==2)
        {
            System.out.println("Sei entrato nell'account 2");
        }                                                                       //  chiudo IF ELSE primo
        else if (numAcc==3)
        {
            System.out.println("Sei entrato nell'account 3");
        }                                                                       //  chiudo IF ELSE secondo
        else System.out.println("Non sei inserito in un account valido");    //  chiudo ELSE


        //  faccio inserire all'utente i suoi dati
        Scanner myScannerString = new Scanner(System.in);                       //  creo uno scanner chiamato "myScannerString" per leggere le string
        System.out.println("\nInserisci il tuo nome");                       //  dico all'utente di inserire il nome
        String Nome = myScannerString.nextLine();                               //  leggo quello che scrive l'utente e lo metto nella stringa "Nome" che ho appena dichiarato
        System.out.println("Inserisci il tuo cognome");                      //  dico all'utente di inserire il cognome
        String Cognome = myScannerString.nextLine();                            //  leggo quello che scrive l'utente e lo metto nella stringa "Cognome" che ho appena dichiarato
        System.out.println("Inserisci la tua età");                          //  dico all'utente di inserire l'eta
        int eta = myScannerInt.nextInt();                                       //  leggo quello che scrive l'utente e lo metto nella stringa "eta" che ho appena dichiarato
    
        //stampo i dati dell'utente
        System.out.println("\nQuesto è il tuo profilo: ");
        System.out.println("Nome: " + Nome);
        System.out.println("Cognome: " + Cognome);
        System.out.println("età: " + eta);


    }
    //  termine metodo main nella classe ES4
}
//  termine classe ES4