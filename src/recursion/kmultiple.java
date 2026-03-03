package recursion;
import java.util.*;
public class kmultiple {
    static void multiple(int p,int k){
        if(k==1){
            System.out.print(p*k+" ");
            return;
        }else{
            multiple(p,k-1);
        }
        System.out.println(p*k+" ");
    }
    public static void main(String[] args) {

Scanner bc=new Scanner(System.in);
        System.out.println("Enter k value and also no of times multiple:");
        int p=bc.nextInt();
        int k=bc.nextInt();
        multiple(p,k);
    }
}
