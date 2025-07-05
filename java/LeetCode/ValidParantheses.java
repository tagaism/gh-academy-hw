package LeetCode;

class ValidParantheses {
    public static void main(String[] args){
        System.out.println(solution("()"));
    }

    private static boolean solution(String str) {
        char[] stack = new char[str.length()];
        int i = -1;
        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack[++i] = ')';
            } else if(c == '{') {
                stack[++i] = '}';
            } else if(c == '[') {
                stack[++i] = ']';
            } else {
                if(i == -1 || stack[i--] != c) {
                    return false;
                } 
            }
        }
        return i == -1;
    }
}