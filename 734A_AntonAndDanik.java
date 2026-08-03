import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next();

        int anton = 0;
        int danik = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            if (ch == 'A') {
                anton++;
            } else {
                danik++;
            }
        }

        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
