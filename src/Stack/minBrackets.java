package Stack;
import java.util.*;
public class minBrackets {
    static int minBrack(String s){
        int n=s.length();
        Stack<Character> check=new Stack<>();
        int i=0;
        while(i<n){
            if(s.charAt(i)==')'){
                if(check.peek()=='(')check.pop();
                else if(check.isEmpty()){
                    check.add(')');
                }
            }else if(s.charAt(i)=='('){
                check.push('(');
            }i++;
        }if(check.isEmpty())return 0;
        else{
            return check.size();
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
        System.out.println(minBrack(s));
    }
}
