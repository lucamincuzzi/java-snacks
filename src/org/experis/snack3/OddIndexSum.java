package org.experis.snack3;

public class OddIndexSum {
    public static void main(String[] args) {
        // Inizializzo l'array di interi
        int[] integerNums = {1, 3, 7, 16, 14, 35, 4, 21};

        // Inizializzo la somma
        int sum = 0;

        // Sommo i numeri in posizione dispari
        for (int i = 1; i < integerNums.length; i = i + 2) {
            sum += integerNums[i];
        }

        // Stampo il risultato della somma
        System.out.println("La somma dei numeri nell'array in posizione dispari è di: " + sum);
    }
}
