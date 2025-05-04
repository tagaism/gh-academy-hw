package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        // implementation with hashmap
        // HashMap<Character, Integer> seen = new HashMap<>();
        // for(char ch : str.toCharArray()) {
        //     if(seen.containsKey(ch)) {
        //         seen.put(ch, seen.get(ch) + 1);
        //     } else {
        //         seen.put(ch, 1);
        //     }
        // }

        // for(int i = 0; i < str.length(); i++) {
        //     char c = str.charAt(i);
        //     if(seen.get(c) == 1) {
        //         return i;
        //     }
        // }
        // implementation with array
        int[] freqArr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            freqArr[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < str.length(); i++) {
            if(freqArr[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
