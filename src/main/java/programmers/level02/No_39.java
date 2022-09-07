package programmers.level02;

//https://school.programmers.co.kr/learn/courses/30/lessons/12902
//3 x n ≈∏¿œ∏µ

import java.text.DecimalFormat;
import java.util.Scanner;

//6, 41
//8, 153
//10, 571
//12, 2131
//14, 7953
public class No_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new No_39().solution(sc.nextInt()));
    }

    public int solution(int n) {
        int remain = n%2*2;
        int num = n/2;
        long[] arr = new long[num+1];
        arr[0] = 1;
        arr[1] = 3;
        for(int i=2; i<arr.length; i++){
            arr[i] = (4L*arr[i-1] -arr[i-2])%1_000_000_007;
        }
        for(long i : arr){
            DecimalFormat df = new DecimalFormat("#,###");
            System.out.println(df.format(i));
        }
        return (int)arr[num]+remain;
    }
}
