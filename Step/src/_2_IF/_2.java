package _2_IF;
/**
 * 문제 : 
 * 시험 점수를 입력받아 
 * 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 출력 : 
 * 시험 성적을 출력한다.
 */
import java.util.Scanner;

public class _2 {
public static void main(String[] args) {
		
		int temp;
		Scanner sc = new Scanner(System.in);
		
		//시험점수는 0~100점이므로 입력받는 정수에 대한 오류검사는 하지않음
		System.out.print("시험 점수를 입력하세요 : ");
		temp = sc.nextInt();
	
		if(temp>=90)
			System.out.println("A");
		else if(temp>=80)
			System.out.println("B");
		else if(temp>=70)
			System.out.println("C");
		else if(temp>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}

}
