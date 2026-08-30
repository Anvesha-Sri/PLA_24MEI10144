import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long s = sc.nextLong();

            long large = Math.min(a, s / n);

            long remaining = s - large * n;

            if (remaining <= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
