package recursion;
import java.util.*;
public class printarray {
    static void printarr(int[] arr,int idx){
        if(idx==arr.length-1){
            System.out.print(arr[arr.length-1]);
            return;
        }else{
            System.out.print(arr[idx]);
            printarr(arr,idx+1);

        }
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int a=sc.nextInt();
         int[] arr=new int[a];
         for(int i=0; i<arr.length;i++){
             System.out.println("Enter"+i+"Element:");
              arr[i]=sc.nextInt();
         }
         printarr(arr,0);
    }
}
