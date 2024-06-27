// 산술연산자의 연산과정 이해

package main;

public class Ex4_산술연산자의연산과정이해 {

	public static void main(String[] args) {

		// 수학점수와 영어점수의 총점 구하기
		int matScore = 93; //수학점수
		int engScore = 70;	//영어점수
		
		// 총점 계산
		int totalScore = matScore +engScore;
		System.out.println(totalScore);  // 163
		
		// 평균 점수 계산
		// 1. int형 변수에 결과를 저장하고 2로 나누기
		int avgScore1 = totalScore / 2;  // int/int
		System.out.println(avgScore1);	 // 81
		
		// 2. double형 변수에 결과 저장하고 2로 나누기
		double avgScore2 = totalScore / 2;  // int/int
		System.out.println(avgScore2);	 // 81.0
		
		// 3. double형 변수에 결과 저장하고 2.0로 나누기
		double avgScore3 = totalScore / 2.0;  // int/double
		System.out.println(avgScore3);	 // 81.5
		
	}

}
