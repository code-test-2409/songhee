import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SameValuesWithQueue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		int result = -1;
		
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		if(isAllSame(list)) {
			result = 0;
		} else {
			for (int i = 1; i <= N; i++) {
				// 뒤에 값 추가
				list.add(list.get(k - 1));	
				
				// 앞 제거 후, 자리 옮기기
				moveForward(list, N);
				
				if(isAllSame(list)) {
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
	
	// 원소 값이 모두 같은지
	static boolean isAllSame(ArrayList<Integer> list) {
		int num = list.get(0);
		for (Integer i : list) {
			if(num != i) {
				return false;
			}
		}
		return true;
	}
	
	// 원소 값 앞으로 땡기기
	static void moveForward(ArrayList<Integer> list, int N) {
		for (int i = 0; i < N; i++) {
			list.add(i, list.get(i + 1));
		}
		list.remove(N);
	}

	
	
}
