package LeetCode;

import java.util.Scanner;

public class GroupAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String[] strs = new String[l];

        for(int i = 0; i < l; i++) {
            strs[i] = sc.nextLine();
        }
        sc.close();
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> arr = new ArrayList<String>();
        for(String s : strs) {
            arr.add(s);
        }
        while(arr.size() > 0) {
            for(int i = 0; i < arr.size() - 1; i++) {
                if(isAnagram(arr[i], arr[i + 1])) {
                    
                }
            }
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()) {
            if(map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for(char c : s2.toCharArray()) {
            if(map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        for(char c : map1.keySet()) {
            if(map1.get(c) != map2.get(c)) {
                return false;
            }
        }

        return true;
    }


}