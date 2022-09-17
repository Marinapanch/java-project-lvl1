package hexlet.code;

import java.util.Locale;
import java.util.Scanner;

public class Games {

    public static void even(String name){
        var countRight = 0;
        var isCorrect = true;
        var num = 0;
        var isEvenBool = false;
        var isEvenString = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        while (isCorrect && countRight < 3) {
            num = (int) Math.round (Math.random() * 100);
            isEvenBool = (num % 2) == 0;
            if (isEvenBool) {
                    isEvenString = "yes";
                } else {
                    isEvenString = "no";
                }

            System.out.println("Question: " + num);
            System.out.print("Answer: ");
            String answer = sc.nextLine();
            if (isEvenString.equals(answer.toLowerCase())) {
                    System.out.println("Correct!");
                    countRight++;
                 } else {
                    System.out.println("'" + answer +
                                        "' is wrong answer ;(. Correct answer was " +
                                        "'" + isEvenString + "'.\n" +
                                        "Let's try again, " + name + "!");
                    isCorrect = false;
                }
            }
        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");

        }

    }
}
