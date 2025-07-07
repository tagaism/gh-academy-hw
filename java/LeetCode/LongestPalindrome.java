package LeetCode;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "csakfaasldklfjiuqpejvxasdlfsjpoqiewurqwoeaslkjzxcnbzxvzxcvnasdfkalskdhfeirqpwoeifaszxnvzxjchvalskjfhaskjdfhvnzxcmvnzxkjhfaskfdjhsdkcd";
        int count = 0;
        int anyOdd = 0;
        char[] arr = new char['z' - 'A' + 1];
        for(char ch : s.toCharArray()) {
            arr[ch - 'A']++;
        }
        for(int i : arr) {
            if(i % 2 == 0) {
                count += i;
            } else {
                count += i - 1;
                anyOdd += 1;
            }
        }
        if(anyOdd > 0) {
            count++;
        }
        System.out.println(count);
    }
}