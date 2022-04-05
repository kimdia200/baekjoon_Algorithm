
package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class _04_Least_Recently_Used {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){

			//���ڿ� �Է¹���
			String[] read = br.readLine().split(" ");
			int s = Integer.parseInt(read[0]);
			int n = Integer.parseInt(read[1]);
			
			//�ʱⰪ 0 ����
			Queue<String> q = new LinkedList<>();
			for(int i=0; i<s; i++){
				q.add("0");
			}

			//LRU
			read = br.readLine().split(" ");
			for (String str : read){
				if(q.contains(str)){
					q.remove(str);
				}else{
					q.poll();
				}
				q.add(str);
			}

			//���
			List<String> list = new ArrayList<>(q);
			for(int i=list.size()-1; i>=0; i--){
				System.out.print(list.get(i));
				if(i!=0) System.out.print(" ");
			}

		}catch (Exception e){
			System.out.println("�����߻�");
		}
	}
}
