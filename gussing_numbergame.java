import java.util.*;
public class gussing_numbergame {
    public static void main(String[] arga){
        int c=0;
    Random random= new Random();
    Scanner sc= new Scanner(System.in);
    int randomNumber = random.nextInt(100)+1;// select number randomly between 1-100
    while(true){
        c++;
    System.out.println("Enter your guess number: ");
    int player_Gussing=sc.nextInt();//player guess the number to win the game
    if(player_Gussing==randomNumber){//if guessing number is equal to random number then player win
        System.out.println("Correct! congratulations you win");
        break;
    }
    else if(randomNumber>player_Gussing){//if gussing number is lower print random no is higher.guessagain
        System.out.println("oops! Number is higher ... Guess the number again.");
    }
    else{
        System.out.println("oops! Number is lower ... Guess the number again.");
    }
}
System.out.println("Total number of trial to guess the number: " + c);

}
}
