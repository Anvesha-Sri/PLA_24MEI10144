import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        if (!sc.hasNext()) return;
        String input = sc.next();
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            // If the character is not already in the result, append it
            if (result.indexOf(String.valueOf(current)) == -1) {
                result.append(current);
                count++;
            }
        
        }
        if (count % 2 == 1)
        {
            System.out.println("IGNORE HIM!");
            
        }
        else {
            System.out.println("CHAT WITH HER!");
        }

        
    }
}
