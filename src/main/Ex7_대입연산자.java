// 대입 연산자

package main;

public class Ex7_대입연산자 {

	public static void main(String[] args) {

		int x = 10;  // 오른쪽의 값을 왼쪽변수에 대입
		
		x += 10;  // x = x + 10
		System.out.println(x);  //20
		
		x -= 5;   // x = x - 5
		System.out.println(x);  //15
		
		x *= 10;  // x = x * 10
		System.out.println(x);  //150
		
		x /= 10;  // x = x / 10
		System.out.println(x);  //15
		
		x %= 10;  // x = x % 10
		System.out.println(x);  //5
	}

}
