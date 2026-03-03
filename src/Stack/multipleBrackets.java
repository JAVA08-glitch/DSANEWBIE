package Stack;
import java.util.*;
public class multipleBrackets {
    static boolean valid(String s) {
        int n = s.length();
        Stack<Character> check = new Stack<>();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ')') {
                if (check.peek() == '(') check.pop();
                else if (check.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == '}') {
                    if (check.peek() == '{') check.pop();
                    else if (check.isEmpty()) {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (check.peek() == '[') check.pop();
                    else if (check.isEmpty()) {
                        return false;
                    }
                }
            } else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                check.push(s.charAt(i));
            }
            i++;
        }
        if (check.isEmpty()) return true;
        else {
            return false;
        }
    }

            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String ans = sc.nextLine();
                System.out.println(valid(ans));

            }


}
