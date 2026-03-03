package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeduplicatedelement {
    static int[] remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(st.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1])st.pop();
            }
        }int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.peek();
            st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int value:remove(arr)){
            System.out.print(value+" ");
        }

    }
}
