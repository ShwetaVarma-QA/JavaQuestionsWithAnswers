package org.example.difficultQuestions;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ReverseTheString {
    public static void getreversed(String str) {
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        char space = ' ';
        String str1 = str.replace(" ", "");
        int lengthWithoutSpaces = str1.length()-1;

       for (int j = lengthWithoutSpaces; j >= 0; j--) {
            characterLinkedList.add(str1.charAt(j));
        }

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == space) {
                characterLinkedList.add(j, space);
            }
        }

        String result = characterLinkedList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Answer is  :" +result);
    }

    public static void main(String[] args) {

        getreversed("My name is shweta");
        getreversed("Iamshw eta");
        getreversed("Mfgfhfgh afgdgd");
        getreversed("M abvnb dfsnbfsn");
        getreversed("Miss shweta");
        getreversed("a b c d e");
        getreversed("i hj");
    }
}
