import java.util.Arrays;
import java.util.Scanner;

public class SWEA1945 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] prime = {2, 3, 5, 7, 11};
		int[] result = new int[5];
		
		for (int i = 0; i < prime.length; i++) {
			int cnt = 0;
			while(num % prime[i] == 0) {
				num /= prime[i];
				cnt++;
			}
			result[i] = cnt;
		}
		System.out.print(Arrays.toString(result));
	}
}
