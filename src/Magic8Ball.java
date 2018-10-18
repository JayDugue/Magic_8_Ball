import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        //code goes in here
        Scanner keyboard;

        String question;
        int pickedNumber;
        int userInput = 1;

        do {


            pickedNumber = (int) (Math.random() * 100);

            System.out.println(pickedNumber);
            keyboard = new Scanner(System.in);
            System.out.println("What's your question");
            question = keyboard.nextLine();
            int maxTries = 10;
            for (int tries = 0; tries <= maxTries; tries++) {
                if ((0 <= pickedNumber) && (pickedNumber <= 10)) {
                    System.out.println("Your future doesn't look bright");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((11 <= pickedNumber) && (pickedNumber <= 20)) {
                    System.out.println("Without a doubt");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((21 <= pickedNumber) && (pickedNumber <= 30)) {
                    System.out.println("Definitely");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((31 <= pickedNumber) && (pickedNumber <= 40)) {
                    System.out.println("Not likely");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((41 <= pickedNumber) && (pickedNumber <= 50)) {
                    System.out.println("No");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((51 <= pickedNumber) && (pickedNumber <= 60)) {
                    System.out.println("Yes");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((61 <= pickedNumber) && (pickedNumber <= 70)) {
                    System.out.println("Very likely");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((71 <= pickedNumber) && (pickedNumber <= 80)) {
                    System.out.println("Your future seems good");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((81 <= pickedNumber) && (pickedNumber <= 90)) {
                    System.out.println("Nope");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;
                }
                if ((91 <= pickedNumber) && (pickedNumber <= 100)) {
                    System.out.println("Sorry, but No");
                    System.out.println("Do u want to play again, 1 for yes, 2 for no?");
                    userInput = keyboard.nextInt();
                    break;

                }
            }


        }while (1 == userInput);
    }
}
