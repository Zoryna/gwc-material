/*
This program allows users to play rock, paper, scissors
It also announces the winner and if there is a tie
Users can use upper or lowercase
*/
import java.util.Scanner;
public class RockPaperScissors
{
	public static void main (String [] args)
	{
		String userChoiceOne, userChoiceTwo;
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("First user: type r for rock, p for paper, or s for scissors.");
		userChoiceOne = keyboard.next().toLowerCase ();
		System.out.println ("Second user: type r for rock, p for paper, or s for scissors.");
		userChoiceTwo = keyboard.next().toLowerCase ();
		if ((userChoiceOne.equals ("r")) && (userChoiceTwo.equals ("p"))){ //check combinations with rock
			System.out.println ("User one wins. Rock beats paper.");
		}else if ((userChoiceOne.equals ("r")) && (userChoiceTwo.equals ("s"))){
			System.out.println ("User one wins. Rock beats scissors.");
		}else if ((userChoiceOne.equals ("p")) && (userChoiceTwo.equals ("r"))){ //check combinations with paper
			System.out.println ("User two wins. Rock beats paper.");
		}else if ((userChoiceOne.equals ("p")) && (userChoiceTwo.equals ("s"))){
			System.out.println ("User two wins. Scissors beats paper.");
		}else if ((userChoiceOne.equals ("s")) && (userChoiceTwo.equals ("r"))){ //check combinations with scissors
			System.out.println ("User two wins. Rock beats scissors.");
		}else if ((userChoiceOne.equals ("s")) && (userChoiceTwo.equals ("p"))){
			System.out.println ("User one wins. Scissors beats paper.");
		}else {
			System.out.println("Tie betweeen " + userChoiceOne + " and " + userChoiceTwo +". No winner"); //only option left is if they are equal
		}
	}
}
