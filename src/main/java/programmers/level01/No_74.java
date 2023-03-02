package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
//코딩테스트 연습
//연습문제
//카드 뭉치
public class No_74 {
    public static void main(String[] args) {
        System.out.println(new No_74().solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1=0;
        int idx2=0;
        int idx3=0;

        while(idx3<goal.length){
            if(idx1<cards1.length && cards1[idx1].equals(goal[idx3])){
                idx1++;
                idx3++;
            }else if(idx2<cards2.length && cards2[idx2].equals(goal[idx3])){
                idx2++;
                idx3++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
