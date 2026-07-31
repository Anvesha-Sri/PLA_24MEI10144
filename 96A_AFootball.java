import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String input = sc.next();
        
        // Check if there are 7 consecutive 0s or 7 consecutive 1s
        if (input.contains("0000000") || input.contains("1111111")) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
