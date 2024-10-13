import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                Random rand = new Random();
                boolean done = false;
                Scanner in = new Scanner(System.in);
                do {
                    System.out.println("Welcome to the Craps");
                    int die1 = rand.nextInt(6) + 1;
                    int die2 = rand.nextInt(6) + 1;
                    int sumOfDie = die1 + die2;


                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum of rolls: " + sumOfDie);

                    if (sumOfDie == 2 || sumOfDie == 3 || sumOfDie == 12) {
                        System.out.println("You have crapped out your sum was: " + sumOfDie);
                        System.out.println("Game over you have lost");
                        System.out.println("Would you like to play again: ");
                    } else if (sumOfDie == 7 || sumOfDie == 11) {
                        System.out.println("You won, you have done a natural your sum was: " + sumOfDie);
                    } else {
                        int point = sumOfDie;
                        System.out.println("The point is now: " + point);
                        do {
                            die1 = rand.nextInt(6) + 1;
                            System.out.println("Die 1: " + die1);
                            die2 = rand.nextInt(6) + 1;
                            System.out.println("Die2: " + die2);
                            sumOfDie = die1 + die2;
                            System.out.println("Sum of die is: " + sumOfDie);

                            if (sumOfDie == point) {
                                System.out.println("You have won you made point");
                                break;

                            } else if (sumOfDie == 7) {
                                System.out.println("Your sum was 7 you have lost");
                                break;
                            }

                        } while (sumOfDie != 7 && sumOfDie != point);

                    }
                    System.out.println("Would you like to play again: ");
                    if (in.nextLine().equalsIgnoreCase("No")) {
                        done = true;
                    }
                }while (!done);


                in.close();
                System.out.println("Thank you for playing");
            }
        }
