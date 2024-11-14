import java.util.Scanner;

public class DoSummation {
	
	public static void main(String[] args) {
		int operand1, operand2, result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter an integer x1 : ");
		operand1 = sc.nextInt();
		
		System.out.printf("Enter an integer x2 : ");
		operand2 = sc.nextInt();
		
		/* for(int i=x1 ; i<=x2 ; i++) {
			result += i;
		} */
		
		Calculator cal = new Calculator();
		result = cal.countOddNumbersFrom(operand1,operand2);
		
		
		System.out.printf("Summation from %d to %d = %d %n",operand1 ,operand2 ,result);
		
	}

}
