package LeetCode;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagram(strs);
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