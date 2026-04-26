package sorting;

public class selectionsort {
    static int[] selection(int[] arr){
       for(int i=0; i<arr.length-1; i++){
           int small=arr[i],idx=-1;
           for(int j=i+1;j<arr.length;j++){
              if(small>arr[j]){
                  small=arr[j];
                  idx=j;
               }
           }if(idx>-1){
               int swap=arr[idx];
               arr[idx]=arr[i];
               arr[i]=swap;
           }
           
       }return arr;
    }

    public static void main(String[] args) {
       int[] a={9,3,5,4,1};
       int[] ans=selection(a);
       for(int value:ans){
           System.out.print(value);
       }
    }
}
