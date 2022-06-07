package programmers.level02;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12900
// 2 * n ≈∏¿œ∏µ
public class No_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new No_38().solution(n));
    }



    private int solution(int n) {
        int[] arr = new int[n+1];
        for(int i=1; i<arr.length; i++){
            if(i==1){
                arr[i]=1;
            }else if(i==2){
                arr[i]=2;
            }else{
                arr[i] = (arr[i-2] + arr[i-1])%1000000007;
            }
        }

        return arr[n];
    }
}