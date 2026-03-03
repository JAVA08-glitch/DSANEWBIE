package sorting;

public class insertionsort {
    static int[] insertion(int[] arr){
for(int i=0; i<arr.length-1;i++){
    int start=0,target=i+1, end=i;
    while(end>=start){
        if(arr[target]<arr[end]){
          arr[end]=arr[end]+arr[target];    //swap without third variable
          arr[target]=arr[end]-arr[target];
          arr[end]=arr[end]-arr[target];
        }end--;target--;
         }
            }return arr;
    }

    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        int[] ans=insertion(a);
        for(int value:ans){
            System.out.print(value);
        }
    }
}
