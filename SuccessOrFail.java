/*2021041025 강희주
 * if문 사용하기
 */
import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("점수를 입력하시오:");
		int score=scanner.nextInt();
		if(score>=80)
			System.out.println("축하합니다!합격입니다.");
		
		scanner.close();

	}

}
