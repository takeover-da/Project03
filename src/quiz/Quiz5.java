package quiz;

public class Quiz5 {

	public static void main(String[] args) {

		int myAge = 33;
		
		boolean result1 = (myAge <= 40);
		System.out.println("40세 이하 인가요? " + result1);
		
		boolean result2 = (myAge == 40);
		System.out.println("40세인가요? " + result2);
		
		boolean result3 = (myAge != 40);
		System.out.println("40세가 아닌가요? " + result3);
		
	}

}
