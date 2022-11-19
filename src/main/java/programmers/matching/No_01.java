package programmers.matching;

import java.util.Arrays;

public class No_01 {
    public static void main(String[] args) {
        No_01 n = new No_01();
        int[] grade = {3,2,200,2,3,3};
        System.out.println(n.solution(grade));
    }

    public int solution(int[] grade) {
        //1 256 3
        int answer = 0;
        int[] temp = grade.clone();
        for(int i=temp.length-2; i>=0; i--){
            int front = temp[i];
            int back = temp[i+1];

            if(front>back){
                temp[i]=back;
                answer+= Math.abs(front-back);
            }
        }
        return answer;
    }
}
