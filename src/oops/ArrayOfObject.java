package oops;

import java.util.Scanner;
class A{
    float x;
    float y;

}
public class ArrayOfObject {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        A[] a=new A[size];
        for(int i=0; i<size; i++){
            a[i]=new A();
            a[i].x=sc.nextFloat();
            a[i].y=sc.nextFloat();
        }
    }
}
