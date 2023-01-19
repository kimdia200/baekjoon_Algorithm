package programmers.level01;

public class No_61 {
    public static void main(String[] args) {
        System.out.println(new No_61().solution(2,1,20));
    }

    public int solution(int req, int res, int bottle) {
        int answer = 0;

        while(bottle>=req){
            int newBottle = (bottle/req)*res;
            int remain = bottle%req;
            answer+=newBottle;
            bottle = remain+newBottle;
        }
        return answer;
    }
}
