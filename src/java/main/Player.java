import java.util.HashMap;
import java.util.ArrayList;


public abstract class Player {

    private String name;
    private int pairs;
    private HashMap<Integer, ArrayList<Card>> hand;


    public Player(String name, Deck deck) {
        this.name = name;
        this.pairs = 0;

        for (int i = 0; i < 5; i++) {

            Card curCard = deck.getCard;
            hand.put(curCard.getValue, hand.getOrDefault(curCard.getValue, new ArrayList<Card>()).add(card));

            if (hand.get(curCard.getValue).length() == 4) {

                hand.remove(curCard.getValue());
                pair = pairs + 1;

            }
        }
    }

    public ArrayList<Card> checkForCard(Card card) {

        if (hand.get(curCard.getValue) != null) {

            ArrayList<Card> output = hand.get(card.getValue);
            hand.remove(card.getValue);
            return output;

        } else {

            return null;

        }
    }

    public void updateHand() {

        int num;

        if (hand.length() == 0) {

            num = (deck.size() < 5) ? deck.size() : 5;

            for (int i = 0; i < num; i++) {

                Card curCard = deck.getCard;
                hand.put(curCard.getValue(), hand.getOrDefault(curCard.getValue, new ArrayList<Card>()).add(card));

                if (hand.get(curCard.getValue).length() == 4) {

                    hand.remove(curCard.getValue());
                    pair = pairs + 1;

                }
            }
        }
    }

    public int getHandSize() {

        return hand.length();

    }

    public int getPairs() {

        return pairs;

    }

    public abstract void displayCards();

    public abstract void takeTurn();





}