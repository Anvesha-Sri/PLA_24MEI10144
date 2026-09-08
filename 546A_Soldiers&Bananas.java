import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong(), n = sc.nextLong(), w = sc.nextLong();
        long cost = k * w * (w + 1) / 2;
        System.out.println(Math.max(0, cost - n));
    }
}
