package recursion;
import java.util.*;
public class largestNumKSwaps {
    static String find(String num,int k){
        StringBuilder sb=new StringBuilder(num);
        String mx=new String(sb);
        return check(sb,0,k,mx);
    }
    static String check(StringBuilder num,int idx,int k,String max){
        if(k==0||idx==num.length()){
            String comp=num.toString();
            if(comp.compareTo(max)>0){
                max=comp;
            }
            return max;
        }

        for(int i=idx;i<num.length();i++){
            int ref=num.charAt(idx)-'0';
            int no=num.charAt(i)-'0';
            if(no>ref){

               char num1=num.charAt(i);
               char num2=num.charAt(idx);
               num.setCharAt(idx,num1);
               num.setCharAt(i,num2);
              max= check(num,idx+1,k-1,max);

                num.setCharAt(i,num1);
                num.setCharAt(idx,num2);

            }


        } max=check(num,idx+1,k,max);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s,4));
    }
}
