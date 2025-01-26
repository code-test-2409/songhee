import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 티셔츠 한 장과 펜 한 자루가 포함된 웰컴 키드
// 티셔츠 사이즈 6가지, 같은 사이즈 T장 묶음으로 주문 가능, 남아도 되지만 부족해서는 안 됨
// 펜은 한 종류, P자루씩 묶음 주문하거나 한 자루씩, 정확히 수만큼 준비되어야

public class BJ30802 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 참가자 수
		
		// 사이즈 별 참가자 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] cntOfSize = new int[6];
		for (int i = 0; i < cntOfSize.length; i++) {
			cntOfSize[i] = Integer.parseInt(st.nextToken());
		}
		
		// 최소 단위
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		// 2. 계산
		// 셔츠
		int shirtCnt = 0;
		for (int i : cntOfSize) {
			shirtCnt += i % T == 0? 0 : 1;
			shirtCnt += i / T;
		}
		
		// 연필
		int pencilCnt = N / P;
		int eachPencilCnt = N % P;
		
		// 3. 출력
		System.out.println(shirtCnt);
		System.out.printf("%d %d", pencilCnt, eachPencilCnt);
		
		
		
	}
}
