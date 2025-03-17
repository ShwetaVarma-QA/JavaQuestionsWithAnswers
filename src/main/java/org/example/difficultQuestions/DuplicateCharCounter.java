package org.example.difficultQuestions;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateCharCounter {

    /*Display the alphabet along with the number of times it is repeated in a String.
    Solving this question using Map
    * */

    public static void main(String[] args) {
        String str = "Shweta Varma";
        char[] carray = str.toCharArray();
        Map<Character, Integer> trmap = new TreeMap<>();
        for (Character c : carray) {
            if (trmap.containsKey(c)) {
                trmap.put(c, trmap.get(c) + 1);
            } else {
                trmap.put(c, 1);
            }
        }

        System.out.println("The number of times each alphabet is repeated is " + trmap);

    }
}
