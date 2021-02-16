package chapter02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//기존문제는 cardConvR클래스의 방법으로 쉽게 풀수있어서 Collection을 사용해봤음
public class Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int cd;
		int digit;
		int retry;
		List<Character> list=new ArrayList<>();
		do {
			System.out.println("10진수를 기수 변환 합니다.");
			
			do {
				System.out.print("변환하고자 하는 음이아닌 양의 정수 : ");
				num = sc.nextInt();
			}while(num<0);
			
			do {
				System.out.print("어떤 진수로 변환 할까요? (2~36) :  ");
				cd = sc.nextInt();
			}while(cd<0);
			
			digit = cardConv(num, cd, list);
			System.out.println(num+"은 "+cd+"진수로 변환시 "+digit+"자리 숫자 이며,");
			System.out.print(num+"은 "+cd+"진수로 변환시 ");
			for(char x : list){
				System.out.print(x);
			}
			System.out.println("입니다.");
			System.out.print("다시 할까요? (1=계속, 2=정지) : ");
			retry=sc.nextInt();
			
		}while(retry==1);
		
	}

	private static int cardConv(int num, int cd, List<Character> list) {
		//num=64, cd=2일때
		list.clear();
		String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			list.add(s.charAt(num%cd)); //64%2 [0], 32%2 [0], 16%2 [0], 8%2 [0], 4%2 [0], 2%2 [0], 1%2 [1]
			num/=cd; //32 16 8 4 2 1 0
		}while(num!=0);
		Collections.reverse(list);
		return list.size();
	}
}
