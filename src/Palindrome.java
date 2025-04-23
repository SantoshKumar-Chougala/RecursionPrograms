public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if(s.charAt(i)!=s.charAt(j)) return false;
        if(i<=j) return true;
        return isPalindrome(s,i+1,j-1);
    }
}
