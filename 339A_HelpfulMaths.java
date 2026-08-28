import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = new char[s.length()];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c != '+') {
                arr[count++] = c;
            }
        }

        Arrays.sort(arr, 0, count);

        for (int i = 0; i < count; i++) {
            if (i > 0) {
                System.out.print("+");
            }

            System.out.print(arr[i]);
        }
    }
}
