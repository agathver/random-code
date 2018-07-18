import java.util.Stack;
import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 *
 */
public class BracketMatching
{
    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch(c) {
                case '(':
                    s.push(')');
                    break;
                case '{':
                    s.push('}');
                    break;
                case '[':
                    s.push(']');
                    break;
                case ')':
                case '}':
                case ']':
                    if(s.empty() || s.pop() != c) {
                        return false;
                    }
                    break;
            }
        }
        
        return s.empty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( isBalanced(expression) ? "YES" : "NO" );
        }
    }
}
