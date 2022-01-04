package programmers.level01;
/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 *
 * �ű� ���̵� ��õ
 */
public class No_08 {
	public static void main(String[] args) {
		No_08 n = new No_08();
		String new_id = "...!@BaT#*..y.abcdefgh.ijklm0-_";
		System.out.println(n.solution(new_id));
	}
	
	public String solution(String new_id) {
//        1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
//        2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        System.out.println(new_id);
//        3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
        while(new_id.contains("..")) {
        	new_id=new_id.replace("..", ".");
        }
        System.out.println(new_id);
//        4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        new_id = removeDot(new_id);
        System.out.println(new_id);
//        5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
        if(new_id.length()==0) {
        	new_id = "a";
        }
//        6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
        if(new_id.length()>=16) {
        	new_id=new_id.substring(0,15);
        }
//             ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
        new_id = removeDot(new_id);
        System.out.println(new_id);
        System.out.println(new_id.length());
//        7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
    	while(new_id.length()<3) {
    		new_id+=new_id.substring(new_id.length()-1);
    	}
        System.out.println(new_id);
        return new_id;
    }
	
	public String removeDot(String new_id) {
		char[] temp = new_id.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<temp.length; i++) {
        	if(i==0 || i==temp.length-1) {
        		if(temp[i]=='.') {
        			continue;
        		}
        	}
        	sb.append(temp[i]);
        }
        return sb.toString();
	}
}
