import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12345;
        int result = 0;
        while (n > 0) {
           int rem = n%10;
           result = result *10 + rem;
           n= n/10;
        }
        System.out.println(result);
        sc.close();
    }
}
