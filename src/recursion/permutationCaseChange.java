package recursion;

public class permutationCaseChange {
    static void caseChange(StringBuilder s, int index) {
        if (index == s.length()) {
            System.out.print(s + " ");
            return;
        }


        s.setCharAt(index, Character.toLowerCase(s.charAt(index)));
        caseChange(s, index + 1);


        s.setCharAt(index, Character.toUpperCase(s.charAt(index)));
        caseChange(s, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        caseChange(sb, 0);
    }
}
