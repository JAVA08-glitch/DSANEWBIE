package arrays;
import java.util.*;

public class findunion {
    static int[] unionarray(int[] arr1, int[] arr2) {

        int m=arr1.length,n=arr2.length;
          int[] ans=new int[m+n];
          int i=0,j=0,k=0;
          while(i<m && j<n){
             if(arr1[i]<arr2[j]){
                 ans[k++]=arr1[i++];
             }else if(arr2[j]<arr1[i]){
                 ans[k++]=arr2[j++];

             }else if(arr1[i]==arr2[j]){
                 ans[k++]=arr1[i++];

             }
          }while(i<m){
              ans[k++]=arr1[i++];
        }while(j<n){
              ans[k++]=arr2[j++];
        }
          LinkedHashSet<Integer> hs=new LinkedHashSet<>();
          for(int val:ans){
              hs.add(val);
          }
          int[] finalans=new int[hs.size()];
          int p=0;
          for(Integer val:hs){
              finalans[p++]=val.intValue();
          }

return finalans;
    }

    public static void main(String[] args) {
        int[] left={3,2,1};int[] right={5,6,7};
        int[] ans=unionarray(left,right);
       for(int value: ans){
           System.out.print(value+" ");
       }
    }
}