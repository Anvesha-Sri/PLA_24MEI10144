import java.util.*;

public class Chocolates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t[] = new int [n];
        
        for (int i = 0; i<n;i++)
        {
            t[i]=sc.nextInt();
        }
        
        int Alice = 0;
        int Bob = 0;
        int At = 0;
        int Bt = 0;
        int L  = 0;
        int R = n-1;
        
        
        while (L <= R) {

            if(At <= Bt)
            {
              At = At + t[L];
              Alice++;
              L++;
            }

             else {
                Bt = Bt = t[R];
                Bob++;
                R--;
            }
        
        }
        System.out.println (Alice + " " +Bob);
        sc.close();

    }
}
