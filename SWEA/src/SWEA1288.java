import java.util.Scanner;

public class SWEA1288 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = 0;
		boolean[] isChecked = new boolean[10];
		
	
		while(!allChecked(isChecked)) {
			k++;
			int temp = k * N;
			
			while(temp != 0) {
				isChecked[temp % 10] = true;
				temp /= 10;
			}
		}
		System.out.printf("%d\n", k * N);
		
	}
	
	static boolean allChecked(boolean[] isChecked) {
		for (boolean b : isChecked) {
			if(b == false) {
				return false;
			}
		}
		return true;
	}
}
