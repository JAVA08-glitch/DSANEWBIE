package recursion;
import java.util.*;
public class stringPermutation {
    static List<String> permute(StringBuilder ip){
        List<String> pile=new ArrayList<>();
        permutation(pile,new StringBuilder(),ip);
        return pile;
    }
   static  void permutation(List<String>pile,StringBuilder op,StringBuilder ip){
        for(int i=0;i<ip.length()-1;i++){
            permutation(pile,op.append(ip.charAt(i)),ip.substring(0,i)+ip.substring(i+1,ip.length()));
        }
    }
    public static void main(String[] args) {

    }
}
