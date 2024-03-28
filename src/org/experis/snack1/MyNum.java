package org.experis.snack1;

import java.util.Scanner;

public class MyNum {
    public static void main(String[] args) {
        // Istanzio lo Scanner
        Scanner scan = new Scanner(System.in);

        // Inizializzo il numero dell'utente
        System.out.print("Inserisci un numero parti compreso tra 10 e 20 ");
        int userNumber = scan.nextInt();

        // Chiedo un numero in input all'utente fintanto che non mi venga dato un numero pari compreso tra 10 e 20
        while(userNumber < 10 || userNumber > 20 || userNumber % 2 != 0){
            System.out.println("Inserisci un numero parti compreso tra 10 e 20");
            userNumber = scan.nextInt();
        }

        // Stampo il risultato
        System.out.println("Il numero " + userNumber + " che hai inserito è valido, grazie!");

        // Chiudo lo Scanner
        scan.close();
    }
}
