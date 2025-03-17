package org.example.difficultQuestions;

import java.util.LinkedList;
import java.util.TreeMap;

public class BiggestPalindromeString {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//     Input: Given string :"forgeeksskeegfor",
// Output: "geeksskeeg"

// Input: Given string :"Geeks",
// Output: "ee"
        possiblesub("forgeeksskeegfo");
    }

    public static void possiblesub(String input) {
        try {
            LinkedList<String> possiblity = new LinkedList<>();
            for (int i = 0; i <= input.length(); i++) {
                for (int j = i + 1; j <= input.length(); j++) {
                    possiblity.add(input.substring(i, j));
                }
            }
            TreeMap<Integer, String> ans = new TreeMap<>();

            for (String strings : possiblity) {
                if (reverse(strings)) {
                    ans.put(strings.length(), strings);
                }
            }
            System.out.println("final outcome " + ans.descendingMap());

        } catch (Exception e) {
            System.out.println("The failure reason" + e);
        }
    }

    public static boolean reverse(String in) {
        LinkedList<Character> ch = new LinkedList<>();
        int count = 0;
        for (int i = (in.length() - 1); i >= 0; i--) {
            ch.add(in.charAt(i));
        }

        LinkedList<Character> reverse = new LinkedList<>();
        for (int a = 0; a < in.length(); a++) {
            reverse.add(in.charAt(a));
            if (in.charAt(a) == ch.get(a)) {
            } else {
                count = 1;
                break;
            }
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}

