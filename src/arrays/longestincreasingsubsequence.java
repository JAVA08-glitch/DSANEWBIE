package arrays;

public class longestincreasingsubsequence {
    static int longest(int[] arr){
        int start=0,end=arr.length-1,kstart=1,kend=1;
        while(start<=end){
            if(arr[start]<arr[start+1]){
                kstart++;
            }if(arr[end]>arr[end-1]){
                kend++;
            }start++;end--;

        }
        if(kstart!=kend){
            return (kstart>kend)? kstart: kend;
        }else if(kstart==(arr.length)/2+2){
            return arr.length;
        }
        else if(kstart==(arr.length)/2+1){
            return arr.length;
        }else{
            return kstart;
        }
    }
    public static void main(String[] args) {
           int[] arr={1,1,1,1,1};
        System.out.println(longest(arr));
    }
}
