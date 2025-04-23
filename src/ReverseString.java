import java.sql.SQLOutput;

public class ReverseString {
    public static void main(String[] args) {
        String s="SantoshKumar";
        System.out.println(reverseString(s,"",s.length()-1));
    }

    private static String reverseString(String s, String r, int i) {
        if(i<0) return r;
        return reverseString(s,r+s.charAt(i),i-1);
    }
}
