import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
	public static void main(String[] args)
{

		Scanner sc = new Scanner(System.in);
		String play = "yes";
		int round = 0, TotalScore = 0, TotalTrails = 0;

		System.out.println();
		System.out.println("A number is choosen between 1 to 100. Guess the Number within 5 trails.");

		while(play.equals("yes")){
		++round;

		int guess, i, k = 5, trails = 0, score = 5;
		Random rand = new Random();
		int number = rand.nextInt(100);

		for(i = 0; i < k; i++)
		{
			System.out.println();
			System.out.println("Guess the number : ");
			guess = sc.nextInt();

			if(number == guess)
			{

				trails++;
				System.out.println("Congratulations! You have guessed the number");
				System.out.println();
				System.out.println("\nTrails : " + trails);
				System.out.println("Score : "+ score);
				TotalTrails += trails;
				TotalScore += score;
				System.out.println();
				System.out.println("Would you like yo play again? yes or no :");
				play = sc.next().toLowerCase();
				break;
			} 

			else if(number > guess && i!= k-1)
			{
					System.out.println("The number is greater than "+guess);
					trails++;
					score--;
			} 
			else 
			{
					System.out.println("The number is less than " + guess);
					trails++;
					score--;
			}
				
		}
			if(i == k)
			{

				System.out.println("You have completed all 5 trails");
				System.out.println("The number was " + number);
				TotalTrails += trails;
				TotalScore += score;
				System.out.println("\nTrails : " + trails);
				System.out.println("Score: " + score);
				System.out.println();
				System.out.println("Would you like yo play again? yes or no : ");
				play = sc.next().toLowerCase();
		     }
		}
		System.out.println("\nRounds : " + round);
		System.out.println("Total Trails : " + TotalTrails);
		System.out.println("Total Score : " + TotalScore);
  	}
}