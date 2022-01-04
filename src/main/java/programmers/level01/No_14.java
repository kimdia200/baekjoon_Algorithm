package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * 
 * 2021 īī�� ä�뿬���� ���Ͻ� - ���� ���ڿ��� ���ܾ�
 *
 */
public class No_14 {
	public static void main(String[] args) {
		System.out.println(new No_14().solution("one4seveneight"));
	}
	
	public int solution(String s) {

		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
