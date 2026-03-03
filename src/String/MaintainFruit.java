package String;
import java.util.*;
public class MaintainFruit {
    static void maintain(String[] s){
        HashMap<String,Integer> ans=new HashMap<>();
        for(int i=0; i<s.length-1;i+=2){
            ans.put(s[i],ans.getOrDefault(s[i],0)+Integer.parseInt(s[i+1]));
        }
        for(String key: ans.keySet()){
         System.out.print(key+":"+ans.get(key)+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] temp=s.split("[: ]");
        maintain(temp);

    }
}
