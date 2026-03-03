//package sorting;
//
//public class mergesort {
//    static void mergesort(int[] arr, int l,int r){
//        if(l>=r){
//            return;
//        }
//        int mid=(l+r)/2;
//
//        mergesort(arr,l,mid);
//        mergesort(arr,mid+1,r);
//        merge(arr,l,mid,r);
//    }
//    static void merge(int[] arr, int l, int mid, int r){
//        int[] left_subarray=new int[mid-l+1];
//        int[] right_subarray=new int[mid+1-r];
//        for(int i=0; i<left_subarray.length;i++){
//            left_subarray[i]=arr[i];
//        }
//        for(int j=0; j<right_subarray.length; j++){
//           right_subarray[j]=arr[j];
//        }
//        int n1=left_subarray.length,n2=right_subarray.length,i=0,j=0,k=0;
//        while(i< n1 || j< n2){
//            if(left_subarray[i] <= right_subarray[j]){
//                arr[k++]=left_subarray[i++];
//
//            }else{
//                arr[k++]=right_subarray[j++];
//            }
//        }
//        while(i<n1){
//            arr[k++]=left_subarray[i++];
//        }while(j<n2){
//            arr[k++]=right_subarray[j++];
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//        int a =
//
//    }
//}
