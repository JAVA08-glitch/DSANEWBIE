package recursion;

public class binaryStringNocons1 {
    static void make(StringBuilder sb, int N) {
        if (sb.length() == N) {
            System.out.print(sb + " ");
        }
       else if(sb.length()==0){
            sb.append('0');
            make(sb , N);
            sb.deleteCharAt(sb.length() - 1);
            sb.append('1');
            make(sb,  N);
            sb.deleteCharAt(sb.length() - 1);
        }else{
            if(sb.charAt(sb.length()-1)=='1'){

                sb.append('0');
                make(sb , N);
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append('1');
                make(sb, N);
                sb.deleteCharAt(sb.length() - 1);
                sb.append('0');
                make(sb, N);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int N = 3; // you can change this value
        make(new StringBuilder(),  N);
    }
}
