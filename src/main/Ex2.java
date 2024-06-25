// 증감 연산자

package main;

public class Ex2 {

	public static void main(String[] args) {

		// 증감 연산자가 변수의 뒤에 있을때
//		int x = 100;
//		int y = x++;
//		int z = x--;
//		
//		System.out.println(x);	//100
//		System.out.println(y);	//100
//		System.out.println(z);	//101
		
		// 증감 연산자가 변수의 앞에 있을때
		int x = 100;
		int y = ++x;
		int z = --x;
		
		System.out.println(x);	//100
		System.out.println(y);	//101
		System.out.println(z);	//100
		
	}

}
// 디버그모드시 단축키
// F6: 한 줄 실행
// F8: 다음 브레이크 포인트로 스킵