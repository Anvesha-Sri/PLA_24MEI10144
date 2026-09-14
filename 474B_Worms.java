import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] pref = new int[n];
        pref[0] = a[0];
        for (int i = 1; i < n; i++) pref[i] = pref[i - 1] + a[i];
        int m = sc.nextInt();
        while (m-- > 0) {
            int q = sc.nextInt();
            int idx = Arrays.binarySearch(pref, q);
            if (idx < 0) idx = -idx - 1;
            System.out.println(idx + 1);
        }
    }
}
