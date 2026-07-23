import java.util.Scanner;

public class PetyaStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();
        S1=S1.toUpperCase();
        S2=S2.toUpperCase();
        
        int result = S1.compareTo(S2);

        if(result < 0)
           System.out.println(-1);
        else if(result > 0)
           System.out.println(1);
        else
           System.out.println(0);

    }
}
