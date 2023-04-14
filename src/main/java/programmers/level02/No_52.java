package programmers.level02;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12949
//코딩테스트 연습 연습문제 행렬의 곱셈
public class No_52 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        //3*2
        //2*2
        //==3*2
        System.out.println(Arrays.deepToString(new No_52().solution(arr1,arr2)));
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
