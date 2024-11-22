import java.util.Scanner;

class Player4
{  
	int numGuess;
	public void guessNumber() {
		  Scanner Sc=new Scanner(System.in);
		  System.out.println("Hey player , Guess the number");
		   numGuess=Sc.nextInt();
		  
	  }
	
}

 class Guesser
{
	 int numGuess;
  public void guessNumber() {
	  Scanner Sc=new Scanner(System.in);
	  System.out.println("Hey Guesser , Guess the number");
	   numGuess=Sc.nextInt();

  }
}


 class Umpire
 {
	 Guesser guesser;
	int Player P1,P2,P3;
	public void getNumberFrpmGuesser()
	{
		guesser = new Guesser();
	       guesser.guessNumber();
	}
	public void collectFromplayer()
	{
	
	   P1=new Player();	
	   P2=new Player();
	   P3=new Player();
	   P1.guessNumber();
	   P2.guessNumber();
	  P3.guessNumber();
	}
	public void calcResult()
	{
		System.out.println(guesser.numGuess+" "+ P1.numGuess+" "+P2.numGuess+" "+P3.numGuess);
	if(guesser.numGuess== P1.numGuess)
	{
		if(guesser.numGuess== P2.numGuess && guesser.numGuess== P3.numGuess )
		System.out.println("All player are the winner");
		else if(guesser.numGuess== P2.numGuess)
		{
			System.out.println(" player 1 and 2 are the winner");	
		}
		else if(guesser.numGuess== P3.numGuess)
		{
			System.out.println(" player 1 and 3 are the winner");	
		} 
		else
		{
			System.out.println(" player 1 is the winner");	
		}
		
	}
	else if(guesser.numGuess== P2.numGuess)
	{
		if(guesser.numGuess== P3.numGuess)
		System.out.println("Player 2 and 3 are the winner");
		else
		{
			System.out.println("Player 2 is the winner");
		}
	}
	else if(guesser.numGuess== P3.numGuess)
	{
		System.out.println("Player 3 is the winner");
	}
	else
	{
		System.out.println("Lossers....");	
	}
	
	}
 }
// 5 objects-Umpire,Guesser ,p1,p2,p3

public class LaunchGame {

	public static void main(String[] args) {
	
		Umpire Umpire=new Umpire();
		Umpire.getNumberFrpmGuesser();
		Umpire.collectFromplayer();
		Umpire.calcResult();
		
		

	}

}
