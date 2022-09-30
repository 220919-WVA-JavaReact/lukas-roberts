package com.revature.pokemon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Staryu");
        Pokemon p2 = new Pokemon("Ponyta");
        Pokemon p3 = new Pokemon("Charmander");
        Pokemon p4 = new Pokemon("Geodude");

        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);
        System.out.println(p3.name + " " + p3.attack + " " + p3.level + " " + p3.health);
        System.out.println(p4.name + " " + p4.attack + " " + p4.level + " " + p4.health);

        /*p1.battle(p2);
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);*/

        boolean running = true;
        Scanner input = new Scanner(System.in);

        Pokemon[] party = new Pokemon[6];
        party[0] = new Pokemon("Staryu");
        party[1] = new Pokemon("Ponyta");
        party[2] = new Pokemon("Charmander");
        int partySize = 3;

        String[] possibleEncounters = {"Shinx", "Sableye", "Bayleaf", "Lugia", "Pikachu", "Diglett"};
        Random random = new Random();

        while (running) {
            Pokemon wild = new Pokemon(possibleEncounters[random.nextInt(possibleEncounters.length)]);
            System.out.println("You've encountered a wild " + wild.name);
            System.out.println("Type 'run' to run, 'battle' to battle, 'party' to view your party, or 'catch' to catch the pokemon");
            String choice = input.nextLine();
            while (!choice.equals("run") && !choice.equals("battle") && !choice.equals("party") && !choice.equals("catch")) {
                System.out.println("Invalid input");
                System.out.println("Type 'run' to run, 'battle' to battle, 'party' to view your party, or 'catch' to catch the pokemon");
                choice = input.nextLine();
            }
            if (choice.equals("run")) {
                System.out.println("You ran from the battle!");
            } else if (choice.equals("battle")){
                p1.battle(wild);
            } else if (choice.equals("party")){
                for (int i = 0; i < party.length; i++) {
                    if (party[i] != null) {
                        System.out.println(party[i].name);
                    }
                }
            } else {
                if(partySize < 6) {
                    party[partySize] = wild;
                }
            }
            for (Pokemon pokemon : party) {
                if (pokemon != null) {
                    System.out.println(pokemon.name + pokemon.health);
                }
            }
            break;
        }
    }

}
