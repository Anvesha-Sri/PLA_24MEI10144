import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int left = 0, currentSum = 0, maxBooks = 0;
      
        for (int R = 0; R < n; R++) {
            currentSum += a[R];

            while (currentSum > t) {
                currentSum -= a[L];
                L++;
            }
            

            maxBooks = Math.max(maxBooks, R - L + 1);
        }
        
        System.out.println(maxBooks);
    }
}
