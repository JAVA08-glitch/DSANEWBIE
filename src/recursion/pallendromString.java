package recursion;
import java.util.*;
public class pallendromString {
    static boolean pallcheck(String s,int idx,int n){

        if(idx>=n){//base case
            return true;
        }String dum=new String(s);
        if(dum.charAt(n) != s.charAt(idx)){//self work
            return false;
        }return pallcheck(s,idx+1,n-1);//recursion work


    }

    public static void main(String[] args) {
        String s="ctc";
        System.out.println(pallcheck(s,0,s.length()-1));
    }
}
