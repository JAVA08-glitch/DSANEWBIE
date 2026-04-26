package recursion;

public class printSubset {
    static void subSet(int index, String output, StringBuilder sb) {
        if (index == output.length()) {
            System.out.print(sb.toString()+" ");
            return;
        }


        sb.append(output.charAt(index));
        subSet(index + 1, output, sb);
        sb.deleteCharAt(sb.length() - 1);


        subSet(index + 1, output, sb);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSet(0, str, new StringBuilder());
    }
}
