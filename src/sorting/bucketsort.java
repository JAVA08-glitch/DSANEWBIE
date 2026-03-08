package sorting;
import java.util.*;
public class bucketsort {
    static String bucket(String s){
        int maxfreq=Integer.MIN_VALUE;
        HashMap<Character,Integer>hp=new HashMap<>();
      for(char ch:s.toCharArray()){
          hp.put(ch,hp.getOrDefault(ch,0)+1);
      }
     for(char ch:s.toCharArray()){
         int val=hp.get(ch);
         if(maxfreq<val)maxfreq=val;
     }
     StringBuilder[] sb=new StringBuilder[maxfreq+1];
     for(int i=0;i<sb.length;i++){
         sb[i]=new StringBuilder();
     }
     for(Map.Entry<Character,Integer> loader:hp.entrySet()){
         char ch=loader.getKey();
         int freq= loader.getValue();
         for(int i=0;i<freq;i++){
             sb[freq].append(ch);
         }
     }StringBuilder collect=new StringBuilder();
     for(int i=maxfreq;i>0;i--){
         collect.append(sb[i]);
     }
     return collect.toString();




    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String t=sc.nextLine();
        System.out.println(bucket(t));
    }
}
