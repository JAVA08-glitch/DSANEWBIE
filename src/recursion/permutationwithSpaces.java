package recursion;
import java.util.*;
public class permutationwithSpaces {
    static void permuteSpace(StringBuilder sb,int index,String s){
        if(index==0){
            sb.append(s.charAt(index));
            permuteSpace(sb,index+1,s);
            sb.deleteCharAt(sb.length()-1);
            return;
        }else if(index==s.length()){
            System.out.print(sb.toString()+" ");
            return;
        }else{
            sb.append("-");
            sb.append(s.charAt(index));
            permuteSpace(sb,index+1,s);
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.append(s.charAt(index));
            permuteSpace(sb,index+1,s);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ABC";
        StringBuilder sb=new StringBuilder();

        permuteSpace(sb,0,s);

    }
}
