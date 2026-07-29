import java.util.Scanner;

public class MaximumIncrease {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentLength = 1;
        int maximumLength = 1;

        // Process the array
        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maximumLength = Math.max(maximumLength, currentLength);
        }

        System.out.println(maximumLength);
    }
}
