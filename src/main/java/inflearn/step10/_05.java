package inflearn.step10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * dy[i] = i원을 만드는데 드는 최소 동전의 갯수
 */
public class _05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coin = new int[n];
        for(int i=0; i<n; i++){
            coin[i]=  sc.nextInt();
        }

        int target = sc.nextInt();
        int[] dp = new int[target+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<coin.length; i++){
            for(int j=coin[i]; j<dp.length; j++) {
                dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
            }
        }

        System.out.println(dp[target]);
    }
}