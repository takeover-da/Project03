package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		char ch = (5 > 3) ? '오' : '삼';
		
		System.out.println(ch);
		
		// 다음 코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요
		int x = 10;
		int y = 20;
		
		int result = (x > 10) ? y+10 : y-10;  // x의 값이 10보다 크지 않기 때문에 두번째 결과 y-10이 대입되고
		
		System.out.println(result);  		  // (y 20-10=10) y값 10이 출력된다
		
	}

}
