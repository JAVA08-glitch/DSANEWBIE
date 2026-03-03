package Stack;

import java.util.*;

public class validbracket {
    static boolean valid(String s){
        int n=s.length();
        Stack<Character> check=new Stack<>();
        int i=0;
        while(i<n){
           if(s.charAt(i)==')'){
                if(check.peek()=='(')check.pop();
                else if(check.isEmpty()){
                    return false;
                }
            }else if(s.charAt(i)=='('){
               check.push('(');
           }i++;
        }if(check.isEmpty())return true;
           else{
               return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(valid(s));
    }
}
