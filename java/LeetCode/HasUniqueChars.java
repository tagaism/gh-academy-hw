package LeetCode;
import java.util.HashSet;

/**
 * Utility class for checking if a string has all unique characters.
 */
public class HasUniqueChars {

    /**
     * Checks if the given string contains only unique characters.
     *
     * @param str the input string to check
     * @return {@code true} if all characters in the string are unique, {@code false} otherwise
     */
    public static boolean solution(String str) {
        HashSet<Character> set = new HashSet<>();
        for(char c : str.toCharArray()) {
            if(set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return false;
    }
}
