package arrays;
import java.util.*;
public class diamondasciipascalslogic {
    static void diamond(int n){
        int half=n/2+1;

        for(int i=1;i<=n;i++){
            if(i<=half){
                for(int j=1;j<half-i;j++ ){
                    System.out.print(" ");
                }
                for(int k=1; k<2*i-1;k++){
                    char a='A';int count=0;
                    if(k<=(2*i-1)/2+1){

                        System.out.print(a+count++);
                    }else{

                        System.out.print(a-(--count));
                    }
                }
                System.out.println();
            }else{
                for(int l=1;l<i-half;l++){
                    System.out.print(" ");
                }for(int m=1; m<2*(n-i)-1;m++){
                  char a='A';int count=0;
                    if(m<=(2*(n-1)-1)/2+1){

                        System.out.print(a+count++);
                    }else{

                        System.out.print(a-(--count));
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        diamond(a);
    }
}
