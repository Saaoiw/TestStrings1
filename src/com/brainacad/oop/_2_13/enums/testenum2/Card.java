package com.brainacad.oop._2_13.enums.testenum2;

/**
 * Created by KrevSaa on 14.10.2016.
 */
class Card{
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString(){
        return cardSuit + "_" + cardRank;
    }
}
