package sorting;

public class insertionsort {
    static int[] insertion(int[] arr){
for(int i=0; i<arr.length-1;i++){
    for(int j=i+1;j>0;j--){
        if(arr[j]<arr[j-1]){
            int swap=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=swap;
        }
    }
        }return arr;
    }

    public static void main(String[] args) {
        int[] a={9,2,6,1,2};
        int[] ans=insertion(a);
        for(int value:ans){
            System.out.print(value);
        }
    }
}
