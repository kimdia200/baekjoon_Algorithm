package skillCheck.level01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class No_02 {
	public static void main(String[] args) {
		System.out.println(new No_02().solution(5, 24));
	}
	public String solution(int a, int b) {
        Calendar cal = new GregorianCalendar(2016,a-1,b);
        int i = cal.get(Calendar.DAY_OF_WEEK);
        String[] arr= {"","SUN","MON","TUE","WED","THU","FRI","SAT"};
        return arr[i];
    }
}
