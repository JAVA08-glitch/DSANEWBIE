package arrays;
import java.util.*;

public class findunion {
    static int[] unionarray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length, idxl = 0, idxr = 0, k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] ans = new int[n1 + n2];
        while (idxl < n1 && idxr < n2) {
            if (arr1[idxl] < arr2[idxr]) {
                ans[k++] = arr1[idxl++];
            } else if (arr2[idxr] < arr1[idxr]) {
                ans[k++] = arr2[idxr++];
            } else if (arr2[idxr] == arr1[idxl]) {

                ans[k++] = arr1[idxl++];
                idxr++;
            }


        }while(idxl<n1){
            ans[k++]=arr1[idxl++];

        }while(idxr<n2){
            ans[k++]=arr2[idxr++];

        }return ans;
    }

    public static void main(String[] args) {
        int[] left={3,2,1};int[] right={5,6,7};
        int[] ans=unionarray(left,right);
       for(int value: ans){
           System.out.print(value+" ");
       }
    }
}