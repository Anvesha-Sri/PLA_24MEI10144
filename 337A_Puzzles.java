import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i + n <= m; i++) {

            int difference = a[i + n - 1] - a[i];

            answer = Math.min(answer, difference);
        }

        System.out.println(answer);
    }
}
