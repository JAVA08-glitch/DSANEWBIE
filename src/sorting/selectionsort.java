package sorting;

public class selectionsort {
    static int[] selection(int[] arr){
       for(int i=0; i<arr.length-1; i++){
           int small=arr[i],idx=0;boolean status=false;
           for(int j=i+1; j<arr.length;j++){
               if(small>arr[j]){
                      small=arr[j];
                      idx=j;
                      status=true;
               }
           }if(status!=false) {
               int swap = arr[i];
               arr[i] = arr[idx];
               arr[idx] = swap;
           }else{
               break;
           }
       }return arr;
    }

    public static void main(String[] args) {
       int[] a={5,4,3,2,1};
       int[] ans=selection(a);
       for(int value:ans){
           System.out.print(value);
       }
    }
}
