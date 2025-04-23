import java.util.Scanner;

public class CountTheNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n=1234
        System.out.println(countTheDigits(n)); // ouput=4


    }

    private static int countTheDigits(int n) {
        if(n==0) return 0;
        return countTheDigits(n/10)+1;
    }
}