package programmers.level01;

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
//�ڵ��׽�Ʈ ����
//��������
//���ܿ��� ����

public class No_68_��� {
    public static void main(String[] args) {
        System.out.println(new No_68_���().solution(10,3,2));
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++){
            int cnt=0;
            for(int j=1; j*j<=i; j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }

            if(cnt>limit) answer+=power;
            else{
                answer+=cnt;
            }
        }
        return answer;
    }
}
