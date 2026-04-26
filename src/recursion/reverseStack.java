package recursion;

import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    static void reverse(Stack<Integer> st){
     if(st.isEmpty())return;
     int temp=st.peek();
     st.pop();
     reverse(st);
     insertAtBottom(st,temp);
    }
    static void insertAtBottom(Stack<Integer>st,int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int top=st.peek();
        st.pop();
        insertAtBottom(st,temp);
        st.push(top);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}
