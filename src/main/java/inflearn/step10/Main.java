package inflearn.step10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] dy = new int[m+1];
        for(int i=0; i<arr.length; i++){
            int ps = arr[i][0];
            int pt = arr[i][1];
            for(int j=dy.length-1; j-pt>=0; j--){
                dy[j] = Math.max(dy[j-pt]+ps,dy[j]);
            }
            System.out.println(ps+" " + pt+" " +Arrays.toString(dy));
        }
        System.out.println(Arrays.stream(dy).max().getAsInt());
    }
}
