package com.brainacad.oop._2_13.enums.testenum2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Card card[] = new Card[52];
        int position = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[position] = new Card( Suit.values()[i], Rank.values()[j]);
                position ++;
            }
        }

        for (Card oneCard: card) {
            System.out.println(oneCard.toString());
        }
    }
}
