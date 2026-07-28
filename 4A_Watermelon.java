import java.util.*;
public class Watermelon {
    public static void main (String arg[])
    {
        Scanner sc = new Scanner (System.in);
        int w = sc.nextInt();
        if (w % 2 == 0 && w > 2)
        {
            System.out.print("YES");
            
        }
        else {
            System.out.print("NO");
        }
    }
}
