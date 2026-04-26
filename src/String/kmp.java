package String;
import java.util.*;
public class kmp {
    static String find(String s){
       int index=giveindex(s);
        if(index==0)return "Just a legend";
       String p=s.substring(0,index);
       int[] lps=buildLps(p);
       int j=0,i=0,count=0;
       while(i<s.length()){
           if(s.charAt(i)==p.charAt(j)){
               i++;j++;
               if(j==p.length()){
                   count++;
               }
               j=lps[j-1];

           }else if(j!=0){
               j=lps[j-1];
           }else{
               i++;
           }

       }if(count>=3)return p;
       else{
           return "Just a legend";
        }

    }
    static int giveindex(String p){
        int n=p.length();
        int[] lps=new int[n];
        int i=1,len=0;
        while(i<n){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else if(len!=0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                i++;
            }
        }return len;
    }
    static int[] buildLps(String p){
        int[] lps=new int[p.length()];
        int n=p.length();
        int i=1,len=0;
        while(i<n){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else if(len!=0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                i++;
            }
        }return lps;

    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String p=sc.nextLine();
      System.out.println(find(s));

    }
}
