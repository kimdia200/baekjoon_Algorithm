package baek_jun._8_Math1;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		
		int fixed_cost;
		int cost;
		int price;
		Scanner sc = new Scanner(System.in);
		System.out.print("고정비용 : ");
		fixed_cost=sc.nextInt();
		System.out.print("비용 : ");
		cost = sc.nextInt();
		System.out.print("가격 : ");
		price=sc.nextInt();
		
		int i=1;
		while(true) {
			if(price*i > fixed_cost+cost*i) {
				break;
			}
			i++;
		}
		System.out.println(i);
		
		
		
	}
}
