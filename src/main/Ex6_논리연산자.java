// 논리 연산자

package main;

public class Ex6_논리연산자 {

	public static void main(String[] args) {

		boolean result1 = (5 > 0) && (10 > 0); // true && true  => 둘 다 참일 경우 참!
		boolean result2 = (5 > 0) && (10 < 0); // true && false => 둘 중에 하나라도 거짓일 경우 거짓!
		
		boolean result3 = (5 > 0) || (10 > 0); // true || true  => 둘 다 참일 경우 참!
		boolean result4 = (5 > 0) || (10 < 0); // true || false => 둘 중에 하나라도 참일 경우 참!
		
		boolean result5 = !(5 > 0);			   // !(true)       => 결과가 반대로!
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
