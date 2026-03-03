package String;

import java.util.*;
import java.util.Scanner;

public class countVowels {
    static int count(String t){
        char[] p=t.toLowerCase().toCharArray();
        int count=0;
        for(int i=0;i<p.length;i++){
            if(p[i]=='a' || p[i]=='i' || p[i]=='o' || p[i]=='e' || p[i]=='u')count++;
            }return count;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        System.out.println(count(t));
    }
    }

