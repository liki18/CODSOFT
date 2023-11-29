import java.util.Scanner;
import java.util.Random;

public class Number_game {
	public static void main(String args[]) {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		int guess = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Guess the Number game!!");
		System.out.println("Guess the number between 1 to 100");
		while(true) {
			System.out.println("Enter your guess: ");
			int user = sc.nextInt();
			guess++;
			
			if(user<=100) {
				if(user==number) {
					System.out.println("Congratualtions!!You guessed the correct number");
					System.out.println("Total number of Guesses: "+guess);
					System.exit(0);
				}
				else if(user<number) {
					System.out.println("Too low!!, Try again");
				}
				else {
					System.out.println("Too High!!, Try again");
				}
			}
			 else{
				System.out.println("Dear user!! The generated number is in range from 1 to 100");
				}
			

		}
		
		
		
	}

}
