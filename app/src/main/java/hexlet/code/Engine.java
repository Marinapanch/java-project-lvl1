package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.Cli.makeGreetingWithName;

public class Engine {
    public static void engineGame(int index) {
        String name = makeGreetingWithName();

        final var countRight = 3;
        final var indexEven = 2;
        final var indexCalc = 3;

        var isCorrect = true;

        var question = "";
        var rightAnswer = "";

        var i = 0;
        while (isCorrect && (i < countRight)) {

            switch (index) {
                case indexEven:
                    Even game = new Even();
                    game.generateQA();
                    question = game.getQuestion();
                    rightAnswer = game.getAnswer();
                    System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
                    break;
                case indexCalc:
                    Calc gameC = new Calc();
                    gameC.generateQA();
                    question = gameC.getQuestion();
                    rightAnswer = gameC.getAnswer();
                    System.out.println("What is the result of the expression?");
                    break;
                default: break;
            }
     /*       if (index == 2) {
                Even game = new Even();
                game.generateQA();
                question = game.question;
                rightAnswer = game.answer;
                System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            }
            if (index == 3) {
                Calc game = new Calc();
                game.generateQA();
                question = game.question;
                rightAnswer = game.answer;
                System.out.println("What is the result of the expression?");
            } */

            System.out.println("Question: " + question);
            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (Objects.equals(rightAnswer, answer.toLowerCase())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                                + answer
                                + "' is wrong answer ;(. Correct answer was "
                                + "'" + rightAnswer
                                + "'.\n"
                                + "Let's try again, "
                                + name
                                + "!");
                isCorrect = false;
            }
            i++;
        }

        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }

    }


}

