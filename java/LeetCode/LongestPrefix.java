package LeetCode;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = new String[]{"flower","flow","flight"};
        System.out.println(solution(arr));
    }

    private static String solution(String[] strs) {
        String pref = strs[0];
        for(int i = 0; i < strs.length; i++) {
            System.out.println(pref);
            while(strs[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length() - 1);
            }

        }
        return pref;
    }
}
