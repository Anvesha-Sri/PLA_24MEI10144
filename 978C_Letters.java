import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        long[] pref = new long[n];
        pref[0] = a[0];
        for (int i = 1; i < n; i++) pref[i] = pref[i - 1] + a[i];
        while (m-- > 0) {
            long b = sc.nextLong();
            int idx = Arrays.binarySearch(pref, b);
            if (idx < 0) idx = -idx - 1;
            long room = (idx == 0) ? b : b - pref[idx - 1];
            System.out.println((idx + 1) + " " + room);
        }
    }
}
