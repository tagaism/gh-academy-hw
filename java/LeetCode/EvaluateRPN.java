package LeetCode;
import Stack.Stack;

public class EvaluateRPN {

    public static void main(String[] args) {

    }
    public static int solution(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        //.                  j
        //["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        //  
        //[10  6 9 3]
        int f;
        int s;
        for(String op : tokens) {
            switch(op) {
                case "+":
                    f = st.pop();
                    s = st.pop();
                    st.push(f + s);
                    break;
                case "-":
                    f = st.pop();
                    s = st.pop();
                    st.push(s - f);
                    break;
                case "*":
                    f = st.pop();
                    s = st.pop();
                    st.push(f * s);
                    break;
                case "/":
                    f = st.pop();
                    s = st.pop();
                    st.push(s / f);
                    break;
                default:
                    st.push(Integer.parseInt(op));
                    break;
            }
        }
        return st.pop();
    }
}