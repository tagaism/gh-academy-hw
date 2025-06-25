package LeetCode;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(bsRemover("sfas#asdf#########"));
        System.out.println(bsRemover("ab##").equals(bsRemover("c#d#")));
    }
    private static String bsRemover(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c != '#') {
                sb.append(c);
            } else {
                int idx = sb.length() - 1;
                if(idx > -1) {
                    sb.deleteCharAt(idx);
                }
            }
        }
        return sb.toString();
    }
}
