package test;
import java.util.*;

public class guess_random {
  public static void main(String[] args) {
    System.out.println("Guess a number between 1 to 10");
    int counter = 0;
    while (true) {
      int rand_num = generator();
      int input = input_dealing();
      System.out.println("What you geuss is " + input);
      System.out.println("It's wrong." + " The rand_num is " + rand_num);
      counter += 1;
      if (input == rand_num) {
        break;
      }
    }
    System.out.println("You are right! You've tried " + counter + " times");
  }

  public static int input_dealing() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    return input;
  }

  public static int generator() {
    int r = 0;
    r = (int) (Math.random() * 10) + 1;
    return r;
  }
}
