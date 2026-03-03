package Slidingwindow;
import java.util.*;
public class countOccuranceofAnagraminString {
    static int countAnagrams(String s, String a){
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<a.length();i++){
            hs.put(a.charAt(i), hs.getOrDefault(a.charAt(i), 0)+1);
        }
        int i=0,j=0,count=0;
        while(j<s.length()){
            if(j-i+1==a.length()){
                HashMap<Character,Integer> check=new HashMap<>();
                int k=i;
                while(k<=j){
                    if(hs.containsValue(s.charAt(k)) && check.get(s.charAt(k))<hs.get(s.charAt(k))){
                     check.put(s.charAt(k),check.getOrDefault(s.charAt(k),0)+1);
                     if(check.get(s.charAt(k))==hs.get(s.charAt(k)))count++;
                     if(count==check.size())count++;


                    }else{
                        check.put(s.charAt(i),check.getOrDefault(s.charAt(i),0)-1);
                        i++;j++;
                    }
                }
            }
        }return count;
    }



    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String a=sc.nextLine();
       
    }
}
