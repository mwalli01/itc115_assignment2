package assignment2;

//This is a fibonacci sequencer

public class fibonacci {

	public static void main(String[] args) {
		//Run the sequencer with a user defined number of 12
		fibo(12);
	}
	
	public static void fibo(int userInputNumber) {
		//the integers are first defined
		int firstNumber = 0;
		int secondNumber = 1;
		int sumNumber;
		
		//A for loop checks against a user defined number in the functions parameters for
		//number of times to run the sequencer
		for(int fibonacciCount = 0; fibonacciCount<userInputNumber; fibonacciCount++) {
			
			//the current number in the series is displayed
			System.out.println(firstNumber);
			
			//integer to advance to is identified 
			sumNumber = firstNumber + secondNumber;
			
			//the current number in the series is advanced to its new position
			firstNumber = secondNumber;
			
			//the second number is advanced to its new position
			secondNumber = sumNumber;
			
		}
	}
}
