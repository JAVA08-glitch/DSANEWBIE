package Slidingwindow;
import java.sql.SQLOutput;
import java.util.*;
public class longsswithoutrepchar {
    static int give(String s){
        int i=0,j=0,maxLength=0;
        HashMap<Character,Integer> ht=new HashMap<>();
        while(j<s.length()){
            if(!ht.containsKey(s.charAt(j))){
                int length=j-i+1;
                maxLength=Math.max(length,maxLength);

            }
            ht.put(s.charAt(j),ht.getOrDefault(s.charAt(j),0)+1);
       while(ht.get(s.charAt(j))>1){
            if(ht.get(s.charAt(i))==1)ht.remove(s.charAt(i));
            else{
                ht.put(s.charAt(i),ht.getOrDefault(s.charAt(i),0)-1);
            }

            i++;
        }j++;
        }return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(give(s));

    }
}
