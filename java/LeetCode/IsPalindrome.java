package LeetCode;

import java.util.ArrayList;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("0P"));
    }
    private static boolean solution(String s) {
        String lcs = s.toLowerCase();
        //         l                 r
        // a m an, a plan, a canal: Pana ma
        //  l             r
        // [r,a,c,e,a,c,a,r]
        //      i
        // race a car
        ArrayList<Character> chs = new ArrayList<>();
        for(char c : lcs.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                chs.add(c);
            }
        }
        if(chs.size() == 1) {
            return true;
        }
        int l = 0;
        int r = chs.size() - 1;
        while(l < r) {
            if(chs.get(l) != chs.get(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
