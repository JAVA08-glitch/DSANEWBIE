package recursion;
import java.util.*;

public class generateBalancedParanthesis {
    static void generate(StringBuilder sb,int open,int close){
        if(open==0 && close==0){
            System.out.print(sb+" ");
            return;
        }else if(open==0 && close !=0){
            sb.append(")");
            generate(sb,open,close-1);
            sb.deleteCharAt(sb.length()-1);
        }else if(open==close){
            sb.append("(");
            generate(sb,open-1,close);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append("(");
            generate(sb,open-1,close);
            sb.deleteCharAt(sb.length()-1);
            sb.append(")");
            generate(sb,open,close-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(new StringBuilder(), n, n);
    }
}
