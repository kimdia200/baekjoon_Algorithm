package programmers.level02;
//https://school.programmers.co.kr/learn/courses/30/lessons/12980
//�ڵ��׽�Ʈ ���� Summer/Winter Coding(~2018) ������ ���� �̵�
public class No_47 {
    public int solution(int n) {
        int ans = 1;
        while(n>1){
            if(n%2!=0){
                ans++;
            }
            n/=2;
        }
        return ans;
    }
}
