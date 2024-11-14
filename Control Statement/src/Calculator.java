import java.util.Scanner;

public class Calculator {
	
	public static int sumBetween2Integers(int x1, int x2){
		int result = 0;

		for(int i=x1 ; i<=x2 ; i++) {
			result += i;
		}
		return result ;
	}
	
    public static int countOddNumbersFrom(int x1, int x2){
    	int odd = 0;
    	for(int i=x1 ; i<=x2 ; i++) {
    		if(x1%2 == 1) {
    			odd ++;
    		}
    	}
		return odd;
    }
    
    public static int sumOfEvenNumbersBetween(int x1, int x2){
    	int sumOfEven = 0, i = x1+1;
    	
    	while(i<x2) {
    		if(x1%2 == 0) {
    			sumOfEven+=1;
    		}
    	}
		return sumOfEven;
    }
    
    public void printText() {
    	Scanner sc = new Scanner(System.in);
    	String sentence = sc.nextLine();
    	System.out.println(sentence);
    	
    }
    
    public void printTextNTimes() {
    	
    	Scanner scanner = new Scanner(System.in);
    	int lang = scanner.nextInt();
    	switch(lang){
    	case 1 : System.out.println("สวัสดี") ; break;
    	case 2 : System.out.println("Hello") ; break;
    	case 3 : System.out.println("Bonjour");
    	}

    	
    }
	
}