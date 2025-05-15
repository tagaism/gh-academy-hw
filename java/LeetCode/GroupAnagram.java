package LeetCode;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagram(strs);
    }

    public static String[][] groupAnagram(String[] arr) {
        for(String str : arr) {
            for(String)
        }
        return new String[][]{};
    }

    public static boolean isAnagram(String st1, String st2) {
        int[] freq = new int[26];
        for(char ch : st1.toCharArray()) {
            if(freq[ch - 'a'] != 0) {
                freq[ch - 'a']++;
            } else {
                freq[ch - 'a'] = 1;
            }
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