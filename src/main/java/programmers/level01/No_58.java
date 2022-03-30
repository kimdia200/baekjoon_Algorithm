package programmers.level01;

// 코딩테스트 연습 - 월간 코드 챌린지 시즌3 - 없는 숫자 더하기
// https://programmers.co.kr/learn/courses/30/lessons/86051
public class No_58 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,0};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int result = 45;
        for (int i : arr){
            result-=i;
        }
        return result;
    }
}
