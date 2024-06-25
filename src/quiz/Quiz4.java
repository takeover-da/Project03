package quiz;

public class Quiz4 {

	public static void main(String[] args) {

		int matScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = matScore + engScore + korScore;
		System.out.println("총점은: " + totalScore + "점");
		
		double avgScore = totalScore / 3.0;
		System.out.println("평균은: " + avgScore + "점");
		
	}

}
