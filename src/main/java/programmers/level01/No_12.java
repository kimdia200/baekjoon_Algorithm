package programmers.level01;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 * 
 * 연습문제 - 2016년
 *
 */
public class No_12 {
	public static void main(String[] args) {
		No_12 n = new No_12();

		System.out.println(n.solution(5,24));
	}

	public String solution(int a, int b) {
		//Calendar에서 month는 0~11 (1월~12월)
		Calendar cal = new GregorianCalendar(2016, a-1, b);
		
		//Calendar에서 DAY_OF_WEEK는 1~7(일~토)
		String[] arr = {"","SUN","MON","TUE","WED","THU","FRI","SAT"};
		return arr[cal.get(Calendar.DAY_OF_WEEK)];
	}
}
