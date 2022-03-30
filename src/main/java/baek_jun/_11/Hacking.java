package baek_jun._11;
//https://www.acmicpc.net/problem/1325

import java.util.Arrays;
import java.util.Scanner;

public class Hacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i=0; i<m; i++){
            arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
