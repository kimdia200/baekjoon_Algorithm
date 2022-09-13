package programmers.level02;

//https://school.programmers.co.kr/learn/courses/30/lessons/12924
//숫자의표현
public class No_44 {
    public static void main(String[] args) {
        System.out.println(new No_44().solution(15));
    }

    static int answer;
    static int sum;
    public int solution(int n) {
        init();
        for(int i=1; i<=n; i++){
            dfs(n,i);
        }
        return answer;
    }

    public void init(){
        answer=0;
        sum=0;
    }
    public void dfs(int target, int now){
        if(sum > target){
            return;
        }
        if(sum == target){
            answer++;
            return;
        }
        sum+=now;
        dfs(target, now+1);
        sum-=now;
    }
}
