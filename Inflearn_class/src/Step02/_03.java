package Step02;

import java.util.Scanner;

//가위바위보
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[] a = new int[cnt];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] b = new int[cnt];
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<cnt; i++) {
			if(a[i] == b[i]) { 
				System.out.println("D");
				continue;
			}
			
			if((a[i]==1 && b[i]==3) || (a[i]==2 && b[i]==1) || (a[i]==3 && b[i]==2)) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}
	}
}
