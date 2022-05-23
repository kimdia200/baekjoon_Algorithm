package inflearn.step09;

import java.util.Arrays;
import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        int[] arr = new int[72];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++ ){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j=start; j<end; j++){
                arr[j]++;
            }
        }
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
