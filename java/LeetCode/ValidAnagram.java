package LeetCode;
// import java.util.Arrays;
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(solution("angaklaram", "kqaramanga"));
    }
    private static boolean solution(String str1, String str2) {
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1, arr2);
        int[] freq = new int[26];
        for(int i = 0; i < str1.length(); i++) freq[str1.charAt(i) - 'a']++;
        for(int i = 0; i < str2.length(); i++) freq[str2.charAt(i) - 'a']--;
        for(int i = 0; i < freq.length; i++) if(freq[i] !=0) return false;
        return true;
    }
}
