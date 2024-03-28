package org.experis.snack2;

import java.util.Arrays;
import java.util.Random;

public class RndFullName {
    public static void main(String[] args) {
        // Inizializzo la variabile del generatore casuale
        Random rndGenerator = new Random();

        // Inizializzo gli array di nomi e cognomi
        String[] names = {"Lae'zel", "Will", "Gale", "Shadowheart", "Astarion", "Halsin", "Volo"};
        String[] surnames = {"Smith", "Wheat", "Hoggins", "Brown", "Miller", "Diskin", "Hope"};

        // Inizializzo l'array di invitati
        String[] guests = new String[7];

        // Sostituisco gli elementi "vuoti" dell'array di invitati con una combinazione casuale di nomi e cognomi
        for (int i = 0; i < guests.length; i++) {
            guests[i] = names[rndGenerator.nextInt(names.length)] + " " + surnames[rndGenerator.nextInt(surnames.length)];
        }

        // Stampo l'array degli invitati
        System.out.println("La lista degli invitati è: " + Arrays.toString(guests));
    }
}
