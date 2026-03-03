package Slidingwindow;
import java.util.*;

public class fristNegativeInteger {
    static List<Integer> giveneg(int[] arr,int k) {
        int i = 0, j =0;
        List<Integer> list = new ArrayList<>();
        while (j <= arr.length - 1) {
            if (j - i + 1 == k) {
                int t = i;
                boolean found = false;
                while (t <= j) {
                    if (arr[t] < 0) {
                        list.add(arr[t]);
                       found=true;
                        break;
                    } else {
                        t++;
                    }
                }
                if (!found) list.add(0);
                i++;
                j++;

            } else {
                j++;
            }
        }return list;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]  ques=new int[size];
        for(int i=0;i<ques.length;i++){
            ques[i]=sc.nextInt();
        }int k=sc.nextInt();

            for(Integer value:giveneg(ques,k)){
                System.out.print(value+" ");
            }
        }
    }

