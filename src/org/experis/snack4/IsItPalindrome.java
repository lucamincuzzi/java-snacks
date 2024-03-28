package org.experis.snack4;

import java.util.Arrays;
import java.util.Scanner;

public class IsItPalindrome {
    public static void main(String[] args) {
        // Inizializzo la variabile dello Scanner
        Scanner scan = new Scanner(System.in);

        // Inizializzo la stringa presa in input dall'utente
        System.out.print("Inserisci una parola: ");
        String userString = scan.nextLine().toLowerCase();

        // Creo l'array di caratteri dalla stringa in input
        char[] userStrArr = userString.toCharArray();

        // Creo la sua versione invertita
        char[] reverseStrArr = new char[userStrArr.length];

        int start = 0;
        int end = userStrArr.length - 1;

        while (start < userStrArr.length) {
            reverseStrArr[end] = userStrArr[start];

            start++;
            end--;
        }

        // Verifico se è palindroma
        boolean isPalindrome = true;

        for (int i = 0; i < userStrArr.length; i++) {
            if(userStrArr[i] != reverseStrArr[i]){
                isPalindrome = false;
                break;
            }
        }

        // Preparo il risultato in base all'esito del controllo
        String result = "La parola è palindroma";

        if(!isPalindrome){
            result = "La parola fornita non è palindroma";
        }

        // Stampo il risultato
        System.out.println(result);

        System.out.println("Parola originale: " + Arrays.toString(userStrArr));
        System.out.println("Parola invertita: " + Arrays.toString(reverseStrArr));
    }
}
