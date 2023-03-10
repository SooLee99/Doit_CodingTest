package chap03_DataStructure;

/* 001번 문제 : 입력한 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
 * 시간 제한 : 1초
 * 
 * 입력 : 1번째 줄(숫자의 개수)[1 ~ 100], 2번째 줄 (숫자n개가 공백 없이 주어진다.)	
 * 				=> n이 '100'이기 때문에 int형과 long형으로는 받을 수 없다.(문제를 보고 분석하는 능력이 필요함.)
 * 				=> 결론 : String으로 담고, 배열로 변환해야함.
 * 
 * 출력 : 입력으로 주어진 숫자 n개의 합을 출력한다.
 */

// (중요.) 아스키코드에서 같은 의미의 문자 '1'와 숫자 1의 코드 값의 차이는 "48"이다. 
// 여기서 알아야 하는 함수 : toCharArray()

/* <슈도코드>
 *  (1) 1번째 줄 - 숫자의 개수 입력받기.
 *  (2) 2번째 줄 - 숫자 n개를 공백 없이 입력받기.
 *  (3) 문자열 -> 문자배열로 형 변환하기.
 *  (4) 출력해야 할 변수(합계) 선언하기.
 *  (5) n개의 숫자 더하기.
 *  (6) 결과 출력하기
 */

import java.util.Scanner;

public class Q001_P11720 {
	public static void main(String[] args) {
		// (1) 1번째 줄 - 숫자의 개수 입력받기.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// (2) 2번째 줄 - 숫자 n개를 공백 없이 입력받기.
		String sNum = sc.next();
		sc.close();
		
		// (3) 문자열 -> 문자배열로 형 변환하기.
		char[] cNum = sNum.toCharArray();
		
		// (4) 출력해야 할 변수(합계) 선언하기.
		int sum = 0;
		
		// (5) n개의 숫자 더하기.
		for(int i = 0; i < n; i++) {
			sum += cNum[i] - '0';	// 문자 배열 -> 정수형으로 변환하는 방법.
		}
		
		// (6) 결과 출력하기
		System.out.print(sum);
	}
}
/*
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * import java.io.IOException;
 * 
 * public class Main {
 * 		public static void main(String[] args) throws IOException {		
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 			int n = Integer.parseInt(br.readLine());
 * 			String num = br.readLine();	
 * 			char[] cNum = num.toCharArray();
 * 			int sum = 0;
 * 
 * 			for(int i = 0; i < n; i++) 
 * 				sum += cNum[i] - '0';
 * 			
 * 			System.out.print(sum);
 * 		}
 * }
 * 
*/
