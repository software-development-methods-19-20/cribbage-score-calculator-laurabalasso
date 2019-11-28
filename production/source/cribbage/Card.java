package cribbage;

public class Card {

    private String rank;
    private Suite suite;


    public Card(String r , Suite s){
        rank = r;
        suite = s;
    }

    public String rank() {
        return rank;
    }

    public Suite suite() {
        return suite;
    }
}
