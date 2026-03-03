package Slidingwindow;
import java.util.*;
import java.lang.*;

public class longestsubstringwithkdistinctchar {
    static int substringkdistinct(String s,int target){
        int i=0,j=0,maxLength=0,k=target;
        HashMap<Character,Integer> ht=new  HashMap<>();
        while(j<s.length()){
            if(ht.size()<=k){
                ht.put(s.charAt(j),ht.getOrDefault(s.charAt(j),0)+1);
            }
            if(ht.size()==k){
                int length=j-i+1;
                maxLength=Math.max(length,maxLength);
            }while(ht.size()>k){

                ht.put(s.charAt(i),ht.get(s.charAt(i))-1);
                if(ht.get(s.charAt(i))==0)ht.remove(s.charAt(i));
                i++;
            }j++;
            }return maxLength;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(substringkdistinct(s,3));
    }
}
