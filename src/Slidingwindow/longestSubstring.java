package Slidingwindow;
import java.util.*;

public class longestSubstring {
    static int longSublength(String s) {
        String t=s.toLowerCase();
        int i = 0, j = 0,maxLength=0;
        HashSet<Character> hs=new HashSet<>();
        while (j < t.length()) {
          if(hs.contains(t.charAt(j))){

              i=j;
              hs.clear();
          }else{
              hs.add(t.charAt(j));

              int length=j-i+1;
              j++;
              maxLength=Math.max(length,maxLength);
          }
        }return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longSublength(s));

    }
}
