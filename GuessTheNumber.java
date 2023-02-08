import java.util.*;


class GuessTheNumber {

  public static void main(String args[]) {
    final int MAX_POINTS = 100;
    final int DEDUCTION = 10;
    final int ATTEMPTS = 5;
    char ans = 'y';
    Scanner sc = new Scanner(System.in);

    try {
    
        do{
        
        int number, count = 0, guess;
        Random rand = new Random();
        number = rand.nextInt(100);
        
        int userPoints = 100;

        assert MAX_POINTS >=
        DEDUCTION *
        ATTEMPTS : "Points can become negative. Please reconfigure the game!";
        System.out.println("Welcome to Number Guessing Game!!");

        while (count < ATTEMPTS) {
        System.out.print("Enter a guess : ");
        guess = sc.nextInt();

        if (guess == number) {
            System.out.println("Congratulation!!You have guessed correctly\nYour score is : " + userPoints);
            System.out.println("Please do come again!!!");
            break;
        } else if (guess > number) {
            System.out.println("Your guess is too high!! Try Again");
        } else {
            System.out.println("Your guess is too low!! Try Again");
        }
        count++;
        userPoints = userPoints - DEDUCTION;
        }
        if(count == ATTEMPTS)
        {
            System.out.println("The actual number was : "+number);
            System.out.println("Better luck next time :)");
        }
            

        System.out.println("Do you wish to play again? (y/n)");
        ans = sc.next().charAt(0);

    }
    while(ans == 'y');
    } catch (InputMismatchException e) {
    System.out.println("Please remember to enter only integer values next time.");

}
catch(Exception e)
{
    System.out.println("Error"+e.getMessage());
}

finally{
    sc.close();
}

  }

}
  
