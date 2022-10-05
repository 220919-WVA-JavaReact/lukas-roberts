package com.revature.collection_exercises;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> pokemon = new LinkedList<>();
        pokemon.add("Pikachu");
        pokemon.add("Charmander");
        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        pokemon.addLast("Eevee");
        System.out.println(pokemon);

        // 2. Write a Java program to iterate through all elements in a linked list.
        for (String bub : pokemon) {
            System.out.println(bub);
        }

        // 3. Write a Java program to iterate a linked list in reverse order
        Iterator x = pokemon.descendingIterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }

        // 4.  Write a Java program to insert the specified element at the front of a linked list
        pokemon.addFirst("Sylveon");
        System.out.println(pokemon.getFirst());

        // 5. Write a Java program to insert some elements at the specified position into a linked list.
        pokemon.add(3, "Jinx");
        System.out.println(pokemon);

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        String first = pokemon.getFirst();
        String last = pokemon.getLast();
        System.out.println("The first pokemon in our LinkedList is " + first + ", and the last pokemon in our LinkedList is " + last);

        // 7. Write a Java program to check if a particular element exists in a linked list.
        boolean containsCharmander = pokemon.contains("Charmander");
        System.out.println("Does pokemon contain Charmander? " + containsCharmander);

        // 8. Write a Java program to convert a linked list to array list.
        String[] pokeArray = pokemon.toArray(new String[pokemon.size()]);
        for (String bub : pokeArray) {
            System.out.println(bub);
        }
    }
}
