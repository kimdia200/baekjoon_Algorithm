package programmers.level02;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12953
//코딩테스트 연습 연습문제 N개의 최소공배수
public class No_48 {
    public static void main(String[] args) {
        System.out.println(new No_48().solution(new int[]{2,6,8,14}));
    }

    public int solution(int[] arr) {
        Arrays.sort(arr);

        int max = arr[arr.length-1];
        outter:
        for(int i=max; ;){
            for(int j=0; j<arr.length; j++){
                if(i%arr[j]!=0){
                    i+=arr[arr.length-1];
                    continue outter;
                }
            }
            max=i;
            break;
        }

        return max;
    }
}
