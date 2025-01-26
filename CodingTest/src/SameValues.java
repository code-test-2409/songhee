import java.util.Scanner;
import java.util.Stack;

public class SameValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		int result = -1;
		
		// 스택에 값 저장
		for (int i = 0; i < N; i++) {
			stack.add(sc.nextInt());
		}
		
		if(isAllSama(stack)) {
			result = 0;
		} else {
			// 값 이동
			for (int i = 1; i <= N; i++) {
				stack.add(stack.get(k - 1));	// 얘가 k번째 인덱스 맞게 가져오는지 확인해야할듯
				stack.pop();
				
				if(isAllSama(stack)) {
					result = i;
					break;
				}
			}
		}
		

		
		System.out.println(result);
	}
	
	// 원소 값이 모두 같은지
	static boolean isAllSama(Stack<Integer> stack) {
		int num = stack.get(0);
		for (Integer i : stack) {
			if(num != i) {
				return false;
			}
		}
		return true;
	}
	
}
