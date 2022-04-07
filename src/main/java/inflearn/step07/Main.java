package inflearn.step07;

import java.util.*;

public class Main {
    public static Set<Integer> set = new HashSet<>();
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            recur(arr, 0, 0, i);
        }
        System.out.println(cnt==set.size() ? "NO" : "YES");
    }

    private static void recur(int[] arr, int start, int sum, int depth) {
        if(depth==0){
            set.add(sum);
            cnt++;
            System.out.println(cnt + " " + set.size()+" " + sum);
        }
        for(int i=start; i<arr.length; i++){
            recur(arr, i+1, sum+arr[i], depth-1);
        }
    }
}
