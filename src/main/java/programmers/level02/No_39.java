package programmers.level02;

//https://school.programmers.co.kr/learn/courses/30/lessons/12902
//3 x n 타일링

import java.text.DecimalFormat;
import java.util.Scanner;

//6, 41
//8, 153
//10, 571
//12, 2131
//점화식을 찾아야함 f(x) = 4f(x-1) - f(x-2)
public class No_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new No_39().solution(sc.nextInt()));
    }

    public int solution(int n) {
        int mod = 1_000_000_007;
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[2] = 3;
        for(int i=4; i<arr.length; i+=2){
            //모듈러의 분배법칙활용
            arr[i] = ((4*arr[i-2]%mod)-(arr[i-4]%mod)+mod)%mod;
        }

        DecimalFormat df = new DecimalFormat("#,###");
        for(int i=0; i<arr.length; i++){
            System.out.println(i+" " + arr[i]);
        }
        return (int)arr[n];
    }
}
