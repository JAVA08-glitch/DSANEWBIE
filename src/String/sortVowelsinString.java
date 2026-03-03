package String;
import java.util.*;
public class sortVowelsinString {
 static String  sortVowels(String t){
     char[] p=t.toCharArray();
     HashSet<Character> k=new HashSet<>();
     Collections.addAll(k,'a','e','i','o','u','A','E','I','O','U');
     int l=0,r=p.length-1;
     while(l<=r){
         if(k.contains(p[l]) && k.contains(p[r])){
             if(p[l]<p[r]){
                 l++;
             }else if(p[l]>p[r]){
                 char swap=p[r];
                 p[r]=p[l];
                 p[l]=swap;
                 l++;r--;
             }else{
                 l++;r--;
             }
         }else if(k.contains(p[l]) && !k.contains(p[r])){
             r--;
         }else if(!k.contains(p[l]) && k.contains(p[r])){
             l++;
         }else {
             l++;
             r--;
         }
 }
String ans=new String(p);
     return ans;

}
public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();

     System.out.println(sortVowels(s));

 }
}
