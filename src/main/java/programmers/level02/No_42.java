package programmers.level02;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941
//최솟값 만들기
public class No_42 {
    public static void main(String[] args) {
        int[] a = {1,4,2};
        int[] b = {5,4,4};
        System.out.println(new No_42().solution(a,b));
    }
    public int solution(int []A, int []B) {

        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i=0; i<A.length; i++){
            sum+=(A[i]*B[B.length-i-1]);
        }
        return sum;
    }
}
