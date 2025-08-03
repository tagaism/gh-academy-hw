package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        // groupAnagram(strs);
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> ans = new HashMap<>();

        // for (String s : strs) {
        //     int[] count = new int[26];

        //     // Count frequency of each letter in the string
        //     for (char c : s.toCharArray()) {
        //         count[c - 'a']++;
        //     }

        //     StringBuilder sb = new StringBuilder();
        //     for (int num : count) {
        //         sb.append(num).append("#");
        //     }
        //     String key = sb.toString();
        //     if (!ans.containsKey(key)) {
        //         ans.put(key, new ArrayList<>());
        //     }
        //     ans.get(key).add(s);
        // }

        // return new ArrayList<>(ans.values());        

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String canonical = new String(cs);
            if(map.containsKey(canonical)) {
                map.get(canonical).add(str);
            } else {
                ArrayList<String> newGr = new ArrayList<>();
                newGr.add(str);
                map.put(canonical, newGr);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String[][] groupAnagram(String[] arr) {
        int i = 1;
        for(String str : arr) {
            for(String str1 : arr) {
                if(!str.equals(str1)) {
                    System.out.printf("%2d :%s, %s, %b\n", i, str, str1, isAnagram(str1, str));
                    i++;
                }
            }
        }
        return new String[][]{};
    }

    public static boolean isAnagram(String st1, String st2) {
        int[] freq = new int[26];
        for(char ch : st1.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch : st2.toCharArray()) {
            freq[ch - 'a']--;
        }

        for(int i : freq) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }



}