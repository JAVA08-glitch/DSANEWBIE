package recursion;

public class permuteLetterCasewithDigit {
    static void permute(StringBuilder sb, int index) {
        if (index == sb.length()) {
            System.out.print(sb + " ");
            return;
        }

        char ch = sb.charAt(index);

        if (Character.isDigit(ch)) {

            permute(sb, index + 1);
        } else {

            char original = ch;


            sb.setCharAt(index, Character.toUpperCase(original));
            permute(sb, index + 1);


            sb.setCharAt(index, Character.toLowerCase(original));
            permute(sb, index + 1);


            sb.setCharAt(index, original);
        }
    }

    public static void main(String[] args) {
        String s = "a1b2";
        permute(new StringBuilder(s), 0);
    }
}
