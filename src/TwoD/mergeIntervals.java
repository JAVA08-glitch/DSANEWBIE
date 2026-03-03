package TwoD;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class mergeIntervals {
    static int[][] mergeInter(int[][] arr){
        int row=arr.length;
        int n=arr[0].length;
        int[] flag=new int[row];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i][n-1]>=arr[i+1][n-2]){
                flag[i]=1;
                row--;
            }
        }
        int[][] ans=new int[row][n];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(flag[i]==1){
                ans[idx++]=merge(arr[i],arr[i+1]);
                i++;
            }else{
                ans[idx++]=arr[i];
            }
        }return ans;

    }
    static int[] merge(int[] a,int[] b){
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        for(int i=0;i<b.length;i++){
            min=Math.min(min,b[i]);
            max=Math.max(max,b[i]);
        }int[] ans={min,max};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int[][] ans=new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                ans[i][j]=sc.nextInt();
            }
        }
        for(int[] arr:mergeInter(ans)){
            for(int value:arr){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
