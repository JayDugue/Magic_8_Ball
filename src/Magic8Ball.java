import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //code goes in here
        Scanner keyboard;
        int testing;
        String question;


        keyboard = new Scanner(System.in);
        System.out.println("What's your question");
        question = keyboard.nextLine();
        System.out.println("Give me a number between 1 and 100");
        testing = keyboard.nextInt();
        if ((0 <= testing) && (testing <= 10)) {
            System.out.println("outlook doesn't look good");
        }
        if ((11 <= testing) && (testing <= 20)) {
            System.out.println("Without a doubt");
        }
        if ((21 <= testing) && (testing <= 30)) {
            System.out.println("Definitely");
        }
        if ((31 <= testing) && (testing <= 40)) {
            System.out.println("Never");
        }
        if ((41 <= testing) && (testing <= 50)) {
            System.out.println("Most likely");
        }
        if ((51 <= testing) && (testing <= 60)) {
            System.out.println("All signs point to No");
        }
        if ((61 <= testing) && (testing <= 70)) {
            System.out.println("Not going to happen");
        }
        if ((71 <= testing) && (testing <= 80)) {
            System.out.println("It is certain");
        }
        if ((81 <= testing) && (testing <= 90)) {
            System.out.println("You may not rely on it");
        }
        if ((91 <= testing) && (testing <= 100)) {
            System.out.println("Your future ahead looks great");
        }


    }
}
