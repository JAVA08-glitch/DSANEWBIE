package arrays;

public class rightrotation {
    static int[] rightrotate(int[] arr,int k){
        int j=0,n=arr.length;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];

        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] ans=rightrotate(a,3);
        for(int value:ans){
            System.out.print(value+" ");
        }

    }
}
