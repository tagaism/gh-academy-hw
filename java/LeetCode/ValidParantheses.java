package LeetCode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(solution(str));
    }

    private static boolean solution(String str) {
        HashMap<Character, Character> paranthes = new HashMap<>();
        paranthes.put(')', '(');
        paranthes.put(']', '[');
        paranthes.put('}', '{');
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray()) {
            if(paranthes.containsValue(c)) {
                st.push(c);
            } else if(paranthes.containsKey(c)) {
                if(st.isEmpty() || paranthes.get(c) != st.pop()) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
