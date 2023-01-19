package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class No_63 {
    public static void main(String[] args) {
        System.out.println(new No_63().solution(new int[] {1,3,4,6}));
    }

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<food.length; i++){
            food[i]/=2;
            for(int j=0; j<food[i];j++) {
                sb.append(i);
            }
        }
        result.append(sb.toString());
        result.append("0");
        sb.reverse();
        result.append(sb.toString());

        return result.toString();
    }
}
