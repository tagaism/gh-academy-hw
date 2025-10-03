package LeetCode;
import Stack.Stack;

/**
 * Evaluates a Reverse Polish Notation (RPN) expression represented as an array of strings.
 *
 * <p>The input array contains a valid RPN expression consisting of integers and operators (+, -, *, /).
 * The function calculates the result of the expression, adhering to the following rules:
 *   - Valid operators are '+', '-', '*', and '/'.
 *   - Operands can be integers or other expressions.
 *   - Integer division truncates towards zero.
 *   - Division by zero is not permitted (assumed to be handled externally).
 *   - The input represents a valid RPN expression.
 *   - The result and intermediate calculations are within the range of a 32-bit integer.
 *
 * @param tokens An array of strings representing the RPN expression.
 * @return The integer value of the evaluated RPN expression.
 * @throws EmptyStackException if the stack is empty when trying to perform an operation.
 * @throws NumberFormatException if a token cannot be parsed into an integer.
 */
public class EvaluateRPN {
    // You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
    // Evaluate the expression. Return an integer that represents the value of the expression.
    // Note that:
    // The valid operators are '+', '-', '*', and '/'.
    // Each operand may be an integer or another expression.
    // The division between two integers always truncates toward zero.
    // There will not be any division by zero.
    // The input represents a valid arithmetic expression in a reverse polish notation.
    // The answer and all the intermediate calculations can be represented in a 32-bit integer.

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