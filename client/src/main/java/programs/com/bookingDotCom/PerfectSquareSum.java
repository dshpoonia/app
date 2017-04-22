package programs.com.bookingDotCom;

/**
 * Created by deepak.poonia on 21-04-2017.
 */
public class PerfectSquareSum {

    public static void main(String[] args) {

        int n = 61;


        if (n <= 3) {
            System.out.println(n);
            return;
        }

        int sqrt = (int)Math.sqrt(n);
        if (sqrt*sqrt == n) {
            System.out.println(1);
            return;
        }


        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = i;

            for (int j = 1; j <= (int)Math.sqrt(i); j++) {
                int temp = j*j;
                if (temp > n) {
                    break;
                }
                dp[i] = Math.min(dp[i], 1+dp[i-temp]);
            }
        }
        System.err.println(dp[n]);

    }

}
