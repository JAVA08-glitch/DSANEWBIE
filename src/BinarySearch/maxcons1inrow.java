package BinarySearch;
import java.util.*;


public class maxcons1inrow {
static int maxRows(int[][] a){
    int left=0,right=a.length-1,ans=-1,n=a.length;
    while(left<n && right>=0){
        if(a[left][right]==1){
            ans=left;
            right--;
        }else if(a[left][right]==0){
            left++;
        }
    }return ans;


}
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[][] matrix=new int[size][size];
       for(int i=0;i<size;i++){
           for(int j=0;j<size;j++){
               matrix[i][j]=sc.nextInt();
           }
       }
       System.out.println(maxRows(matrix));
   }



}
