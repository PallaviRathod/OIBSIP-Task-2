import java.util.Random;
import javax.swing.JOptionPane;

public class Task2 {

  public static void main(String[] args) {
    Random random = new Random();
    int numberToGuess = random.nextInt(100) + 1;
    int maxAttempts = 7;
    int attempts = 0;
    int score = 100;
    boolean hasWon = false;

    // welcome to game
    JOptionPane.showMessageDialog(
      null,
      "Welcome to the Guessing Game!\n" + "-> In this game you have to guess a number between 1 and 100. \n-> You will have maximum 7 attempts to guess the number. \n-> The player's score is initially set to 100, and for each incorrect guess, 20 points are deducted.","Guessing Game.", JOptionPane.INFORMATION_MESSAGE);

    while (!hasWon && attempts < maxAttempts) {
      String input = JOptionPane.showInputDialog(null, "Enter your guess :", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
      int guess = Integer.parseInt(input);
      attempts++;

      if (guess < numberToGuess) {
        JOptionPane.showMessageDialog(null, "Too low! Enter higher number ! ", "Guessing Game", JOptionPane.WARNING_MESSAGE);
      } else if (guess > numberToGuess) {
        JOptionPane.showMessageDialog(null, "Too high! Enter lower number ! ", "Guessing Game", JOptionPane.WARNING_MESSAGE);
      } else {
        JOptionPane.showMessageDialog( null, "Congratulations! You guessed the number in " + attempts + " attempts.\nYour score is: " + score, "Guessing Game", JOptionPane.INFORMATION_MESSAGE);
        hasWon = true;
      }
      score -= 20;
    }

    if (!hasWon) {
      JOptionPane.showMessageDialog(null, "Oops! You've reached the maximum " + maxAttempts + " attempts " + ".\nThe number was : " + numberToGuess +"\nBetter luck next time!\nYour score is : 0", "Guessing Game", JOptionPane.WARNING_MESSAGE);
    }
  }
}
