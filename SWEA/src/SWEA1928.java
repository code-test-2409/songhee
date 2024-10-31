import java.util.Scanner;

public class SWEA1928 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int index = 0;
		int[] buffer = new int[4];
		
		StringBuilder result = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {	// 대문자
				buffer[index] = c - 'A';
			} else if(c >= 'a' && c <= 'z') {	// 소문자
				buffer[index] = c - 'a' + 26;
			} else {	// 숫자
				buffer[index] = c - '0' + 52;
			}	
			// TODO: 나머지 기호 처리 해줘야 할지도??
			
			index++;
			
			if(index == 4) {
				// 이진수 문자열로 변환
				StringBuilder binaryStr = new StringBuilder();
				for(int i : buffer) {
					binaryStr.append(String.format("%6s", Integer.toBinaryString(i)).replace(" ", "0"));
				}
				
				// 결과 char 배열로 변환
				char[] binaryArr = binaryStr.toString().toCharArray();
				char[] temp = new char[Byte.SIZE];
				for (int i = 0; i < binaryArr.length; i++) {
					temp[i % Byte.SIZE] = binaryArr[i];
					if((i + 1) % Byte.SIZE == 0) {
						result.append((char)Integer.parseInt(String.valueOf(temp), 2));
					}
				}
				
				index = 0;
			}
		}
		
		System.out.println(result);
	}
}
