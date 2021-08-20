package com.company;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class StringWithSpace {
    public static void getreversed(String str) {
        LinkedList<Character> ch = new LinkedList<>();
        char s = ' ';
        String str1 = str.replace(" ", "");
        int i = str1.length() -1 ;

        for (int j = i; j >= 0; j--) {
            ch.add(str1.charAt(j));
            System.out.println(str.charAt(j));

            if (str.charAt(j) == s) {
                System.out.println("true");
                System.out.println(j);
                ch.add(j, s);
                System.out.println(ch);
            }
        }
String jj = ch.stream()              // Stream<Character>
        .map(String::valueOf)   // Stream<String>
        .collect(Collectors.joining());
        System.out.println(jj);
    }

    public static void main(String[] args){
        getreversed("I am shweta");
    }
}
