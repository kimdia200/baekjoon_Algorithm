package inflearn.step10;

import java.util.Arrays;
import java.util.Scanner;
//dy 배열에 해당 arr[i]로 끝나는 갯수의 최댓값을 구해서 저장해놓고 하나씩 차근차근 나아간다.
public class _03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dy = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i==0); dy[i]=1;
            int max = 1;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i]){
                    max = Math.max(max, dy[j]+1);
                }
            }
            dy[i] = max;
        }
        System.out.println(Arrays.stream(dy).max().getAsInt());
    }
}