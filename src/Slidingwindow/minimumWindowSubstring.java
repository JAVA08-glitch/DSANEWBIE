package Slidingwindow;
import java.util.*;
public class minimumWindowSubstring {
    static int minwindow(String s,String target){
        HashMap<Character,Integer> ht=new HashMap<>();
        for(int i=0;i<target.length();i++){
            ht.put(target.charAt(i),ht.getOrDefault(target.charAt(i),0)+1);

        }
        int i=0,j=0,count=ht.size();int min=0;
        while(j<s.length()){
            if(ht.containsKey(s.charAt(j))){
                char ch=s.charAt(j);
                ht.put(ch,ht.getOrDefault(ch,0)-1);
                if(ht.get(ch)==0)count--;
            }
            if(count==0){
                while(i<j){
                    int length=j-i+1;
                    min=Math.min(length,min);
                    char ch1=s.charAt(i);
                  if(ht.containsKey(ch1)){
                      
                      ht.put(ch1,ht.getOrDefault(ch1,0)+1);if(ht.get(ch1)>0)break;
                  }i++;
                }count=ht.size();
            }j++;
        }return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String target=sc.nextLine();
        System.out.println(minwindow(s,target));
    }
}
