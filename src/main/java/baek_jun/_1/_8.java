package baek_jun._1;

//√‚√≥ : https://www.acmicpc.net/problem/10998
import java.util.Scanner;

public class _8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		do{
			a=input.nextInt();
			b=input.nextInt();
		}while((0<a&&a<10&&0<b&&b<10)==false);
		System.out.println(a*b);
	}

}
