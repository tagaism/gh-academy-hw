package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        System.out.println(isAnagaram(a, b) ? "Anagram" : "Not anagram");
    }

    private static boolean isAnagaram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        String la = a.toLowerCase();
        String lb = b.toLowerCase();
        int[] freq = new int[26];
        for(char c : la.toCharArray()) {
            freq[c - 'a']++;
        }
        for(char c : lb.toCharArray()) {
            freq[c - 'a']--;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}