package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players.");
        int numberOfPlayers = scanner.nextInt();
        scanner.close();

        if (numberOfPlayers < 1) {
            System.out.println("Incorrect number of players.");
            return;
        }

        List<String> deck = createDeck();
        shuffleDeck(deck);

        for (int player = 0; player < numberOfPlayers; player++) {
            System.out.println("Player " + (player + 1) + ":");
            List<String> playerHand = dealHand(deck);
            printHand(playerHand);
            System.out.println();
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    private static List<String> dealHand(List<String> deck) {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (!deck.isEmpty()) {
                hand.add(deck.remove(0));
            }
        }
        return hand;
    }

    private static void printHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}
