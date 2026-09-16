import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String recipe = sc.next();
        long nb = sc.nextLong();
        long ns = sc.nextLong();
        long nc = sc.nextLong();
        long pb = sc.nextLong();
        long ps = sc.nextLong();
        long pc = sc.nextLong();
        long r  = sc.nextLong();
        
        // Count ingredients needed for one hamburger
        long needB = 0, needS = 0, needC = 0;
        for (char c : recipe.toCharArray()) {
            if (c == 'B') needB++;
            else if (c == 'S') needS++;
            else needC++;
        }
        
        // Binary Search on the number of hamburgers
        long left = 0, right = r + 200;  // safe upper bound
        long ans = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (canMake(mid, needB, needS, needC, nb, ns, nc, pb, ps, pc, r)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(ans);
    }
    
    static boolean canMake(long x, long needB, long needS, long needC,
                           long nb, long ns, long nc,
                           long pb, long ps, long pc, long r) {
        
        long cost = 0;
        
        if (needB > 0) {
            long extra = Math.max(0, x * needB - nb);
            cost += extra * pb;
        }
        if (needS > 0) {
            long extra = Math.max(0, x * needS - ns);
            cost += extra * ps;
        }
        if (needC > 0) {
            long extra = Math.max(0, x * needC - nc);
            cost += extra * pc;
        }
        
        return cost <= r;
    }
}
