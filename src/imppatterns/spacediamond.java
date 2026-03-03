package imppatterns;
import java.util.Scanner;
public class spacediamond {
    static void printpyr(int rows){
        for(int i=0; i<rows;i++){
            if(i<=rows/2){
                for(int j=0; j<rows/2-i; j++){
                    System.out.print(" ");
                }for(int k=0; k<i+1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int l=0; l<i-rows/2; l++){
                    System.out.print(" ");
                }for(int m=0; m<rows-i; m++){
                    System.out.print("*");
                }

            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner bc= new Scanner(System.in);
        System.out.println("Enter rows(take it odd and above 5):");
        int rows=bc.nextInt();
        printpyr(rows);
    }
}
