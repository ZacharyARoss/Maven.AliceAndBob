import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        String nameAlice = "Alice";
        String nameBob = "Bob";


        System.out.println("Good Day. What is your name?");

        String userAnswer = in.nextLine();

        if(userAnswer.equals(nameAlice)) {
            System.out.println("Hello Alice!");
        } else if(userAnswer.equals(nameBob)) {
            System.out.println("Hello Bob!");
        } else {
            System.out.println("I'm sorry, I do not know you.");
        }

    }
}
