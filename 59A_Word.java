import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

String input = sc.next();

int upper = 0;
int lower = 0;

for (int i = 0; i<input.length();i++) {

    char ch = input.charAt(i);

    if (Character.isUpperCase(ch))
        upper++;
    else
        lower++;
}

if (upper > lower)
    System.out.println(input.toUpperCase());
else
    System.out.println(input.toLowerCase());
    }
}
