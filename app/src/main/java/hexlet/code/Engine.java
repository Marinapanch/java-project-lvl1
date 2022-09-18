package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.Cli.makeGreetingWithName;

public class Engine {
    public static void engineGame(int index) {
        String name = makeGreetingWithName();
        var countRight = 3;
        var isCorrect = true;

        var i = 0;
        while (isCorrect && (i < 3)) {

            if (index == 2) {
                Even game = new Even();


                System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
                System.out.println("Question: " + game.generateQA());
                System.out.print("Answer: ");

                Scanner sc = new Scanner(System.in);
                String answer = sc.nextLine();
                if (game.checkCorrectAnswer(answer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer +
                            "' is wrong answer ;(. Correct answer was " +
                            "'" + game.answer + "'.\n" +
                            "Let's try again, " + //name +
                            "!");
                    isCorrect = false;
                }
            }

              if (index == 3) {
                Calc game = new Calc();

                Scanner sc = new Scanner(System.in);
                System.out.println("What is the result of the expression?");
                System.out.println("Question: " + game.generateQA());
                System.out.print("Answer: ");

                String answer = sc.nextLine();
                if (game.checkCorrectAnswer(answer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer +
                            "' is wrong answer ;(. Correct answer was " +
                            "'" + game.answer + "'.\n" +
                            "Let's try again, " + //name +
                            "!");
                    isCorrect = false;
                }

            }
            i++;
        }





        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }

  /*      switch (index) {
            case 2 :
              //  Even game = new Even();
              //  game.even(name);
                break;
            default : break;
        }
*/
    }
}
