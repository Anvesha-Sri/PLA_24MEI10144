import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(prices);
        
        int q = Integer.parseInt(br.readLine());
        
        while (q-- > 0) {
            int money = Integer.parseInt(br.readLine());
            out.println(upperBound(prices, money));
        }
        
        out.flush();
    }

    // Returns count of elements ≤ money
    static int upperBound(int[] arr, int money) {
        int left = 0, right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= money) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
