package cribbage;

import cribbage.Card;
import cribbage.Suite;

import java.util.*;

public class CardParser {

    private static HashMap<String, String> getCharacterMap(){
        HashMap<String, String> charMap = new HashMap<String, String>();
        charMap.put("A", "Ace");
        charMap.put("2", "2");
        charMap.put("3", "3");
        charMap.put("4", "4");
        charMap.put("5", "5");
        charMap.put("6", "6");
        charMap.put("7", "7");
        charMap.put("8", "8");
        charMap.put("9", "9");
        charMap.put("0", "10");
        charMap.put("J", "Jack");
        charMap.put("Q", "Queen");
        charMap.put("K", "King");
        return charMap;

    }

    private static HashMap<String, Suite> getSuiteMap() {
        HashMap<String, Suite> suiteMap = new HashMap<String, Suite>();
        suiteMap.put("H", Suite.HEART);
        suiteMap.put("S", Suite.SPADE);
        suiteMap.put("C", Suite.CLUB);
        suiteMap.put("D", Suite.DIAMOND);
        return suiteMap;
    }

    public static Card parseCard(String cardAsText) {

        HashMap<String , String > charMap = getCharacterMap();
        HashMap<String, Suite> suiteMap = getSuiteMap();

        String c = charMap.get(String.valueOf(cardAsText.charAt(0))) ;
        Suite s = suiteMap.get(String.valueOf(cardAsText.charAt(1)));

        return new Card(c, s);
    }


}
