package baek_jun._7_String;

import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		Scanner sc = new Scanner(System.in);
		int count=0;
		String s = sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			if(s.contains(arr[i])){
				count++;
				s=s.replace(arr[i], "");
			}else if(s.length()!=0){
				s=s.replace(String.valueOf(s.charAt(0)), "");
				count++;
			}
		}
		System.out.println(count);
	}
}
