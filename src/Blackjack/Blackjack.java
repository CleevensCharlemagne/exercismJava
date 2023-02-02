package Blackjack;

import java.util.HashMap;

public class Blackjack {

    // return the number corresponding to the selcted card
    public int parseCard(String card) {
        if(card.equals("ace")){
            return 11;
        } else if(card.equals("two")){
            return 2;
        } else if(card.equals("three")){
            return 3;
        } else if(card.equals("four")){
            return 4;
        } else if(card.equals("five")){
            return 5;
        } else if(card.equals("six")){
            return 6;
        } else if(card.equals("seven")){
            return 7;
        } else if(card.equals("eight")){
            return 8;
        } else if(card.equals("nine")){
            return 9;
        } else if(card.equals("ten")){
            return 10;
        } else if(card.equals("jack")){
            return 10;
        } else if(card.equals("queen")){
            return 10;
        } else if(card.equals("king")){
            return 10;
        }

        return 0;
    }

    public boolean isBlackjack(String card1, String card2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("jack", 10);
        map.put("queen", 10);
        map.put("king", 10);
        map.put("ace", 11);

        if (map.get(card1) + map.get(card2) == 21){
            return true;
        }
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
}}