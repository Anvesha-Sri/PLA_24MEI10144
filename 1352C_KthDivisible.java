import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong();
            System.out.println(k + (k - 1) / (n - 1));
        }
    }
}
