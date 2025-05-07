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
    }
}
        if(a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for(char c : a.toLowerCase().toCharArray()) {
            if(mapA.containsKey(c)) {
                mapA.put(c, mapA.get(c)+1);
            } else {
                mapA.put(c, 1);
            }
        }
        for(char c : b.toLowerCase().toCharArray()) {
            if(mapB.containsKey(c)) {
                mapB.put(c, mapB.get(c)+1);
            } else {
                mapB.put(c, 1);
            }
        }

        for(char c : mapA.keySet()) {
            if(mapB.get(c) != mapA.get(c)) {
                return false;
            }
        }
        return true;
