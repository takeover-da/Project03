// 비교 연산자

package main;

public class Ex5_비교연산자 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		
		boolean result1 = (x > y);
		System.out.println("x가 y보다 큰가요? " + result1);			// false
		
		boolean result2 = (x >= y);
		System.out.println("x가 y보다 크거나 같은가요? " + result2); 	// false
		
		boolean result3 = (x < y);
		System.out.println("x가 y보다 작은가요? " + result3);		// true
		
		boolean result4 = (x <= y);
		System.out.println("x가 y보다 작거나 같은가요? " + result4);	// true
		
		boolean result5 = (x == y);
		System.out.println("x가 y보다 같은가요? " + result5);		// false
		
		boolean result6 = (x != y);
		System.out.println("x가 y보다 다른가요? " + result6);		// true
		
		System.out.println();
		
	}

}
