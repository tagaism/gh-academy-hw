package LeetCode;

import java.util.HashMap;

/**
 * The {@code FirstNonRepeatedChar} class provides a method to find the first non-repeated character in a given string.
 * <p>
 * The {@link #solution(String)} method returns the first character in the input string that does not repeat.
 * If all characters are repeated or the string is empty, it returns {@code null}.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 *     Character result = FirstNonRepeatedChar.solution("swiss"); // returns 'w'
 * </pre>
 * </p>
 */
public class FirstNonRepeatedChar {
    public static void main(String[] args) {

    }

    public static Character solution(String str) {
        HashMap<Character, Integer> map =  new HashMap<>();
        for(char c: str.toCharArray()) {
            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for(char c: str.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
