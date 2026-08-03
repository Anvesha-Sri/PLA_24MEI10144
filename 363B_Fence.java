import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        // Read the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum of first window
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int minSum = currentSum;
        int answer = 0;

        // Slide the window
        for (int i = k; i < n; i++) {

            currentSum = currentSum - arr[i - k] + arr[i];

            if (currentSum < minSum) {
                minSum = currentSum;
                answer = i - k + 1;
            }
        }

        // Convert from 0-based to 1-based index
        System.out.println(answer + 1);

        sc.close();
    }
}
