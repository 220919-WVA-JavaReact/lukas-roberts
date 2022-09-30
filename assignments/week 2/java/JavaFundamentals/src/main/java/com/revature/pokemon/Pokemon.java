package com.revature.pokemon;

import java.util.Random;

public class Pokemon {
    String name;
    int level;
    int health;
    int attack;
    boolean fainted;

    public Pokemon(String name) {
        this.name = name;
        Random random = new Random();
        this.level = random.nextInt(100) + 1;
        this.health = random.nextInt(361) + 40;
        this.attack = random.nextInt(60) + 20;
        this.fainted = false;
    }

    public Pokemon battle(Pokemon opponent) {
        while (this.fainted == false && opponent.fainted == false) {
            opponent.health -= this.attack;
            if (opponent.health < 1) {
                opponent.health = 0;
                System.out.println(opponent.name + " has fainted.");
                System.out.println("Congratulations! You have won the battle!");
                opponent.fainted = true;
                break;
            }
            this.health -= opponent.attack;
            if (this.health < 1) {
                this.health = 0;
                System.out.println("Your " + this.name + " has fainted.");
                System.out.println("You have lost the battle. Better luck next time.");
                this.fainted = true;
                break;
            }
        }
        return opponent;
    }
}
