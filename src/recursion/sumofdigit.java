package recursion;
import java.util.*;
public class sumofdigit {

    static int sumdigit(int n){
        if(n/10==0){
            return n%10;
        }else{
            sumdigit(n/10);
            return n%10+sumdigit(n/10);
          
        }
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int digit=sc.nextInt();
        System.out.println( sumdigit(digit));
    }
}
