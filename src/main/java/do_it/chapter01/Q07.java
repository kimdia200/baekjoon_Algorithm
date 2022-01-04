package do_it.chapter01;

//P.30
public class Q07 {
	public static void main(String[] args) {
		int n=7;
		int sum=0;
		
		for(int i=1; i<=7; i++) {
			sum+=i;
			if(i!=n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
		}
		System.out.print(" = "+sum);
	}
}
