package codilityTest;

import java.util.*;

public class BalancedStringSolution {

    public static void main(String[] args) {
        String input = "[(])";
        char[] in = input.toCharArray();
        check(in);
    }


    public static void check(char[] ch) {
        Stack<Character> st = new Stack<>();
        char cc;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
                st.push(ch[i]);
            }
            if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
                cc = ch[i];
                if (!st.empty()) {
                    ccsdas(cc, st);
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is not balanced");
        }
    }

    public static void ccsdas(char ch, Stack<Character> s) {
        switch (ch) {
            case '}':
                if (s.peek().equals('{')) {
                    s.pop();
                }
                break;
            case ']':
                if (s.peek().equals('[')) {
                    s.pop();
                }
                break;
            case ')':
                if (s.peek().equals('(')) {
                    s.pop();
                }
                break;
        }
    }
}

