package chapter02;

//1000이하의 소수를 열거 + 표현하는데 시행한 나눗셈 횟수
//소수를 구하는것은 최소한의 나눗셈 횟수로 확인함
public class PrintNumber1 {
	public static void main(String[] args) {
		int counter = 0;
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				//나눗셈 수행횟수
				counter++;
				//한번이라도 소수인걸 확인하면 그이후는 확인할 필요가 없음
				if(n%i == 0)
					break;
			}
			
			if(n == i)
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}
}
