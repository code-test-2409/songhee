import java.util.Scanner;

public class SWEA1986 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] resultArr = new int[11];
		int sum = 0;
		for (int i = 1; i < resultArr.length; i++) {
			if(i % 2 != 0) {
				sum += i;
			} else {
				sum -= i;
			}
			resultArr[i] = sum;
		}
		
		int N = sc.nextInt();
		System.out.println(resultArr[N]);
		
		
	}
}
