package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.Cli.makeGreetingWithName;

public class Engine {
    public static void engineGame(int index) {
        String name = makeGreetingWithName();

        final var countRight = 3;

        final var indexEven = 2;
        final var indexCalc = 3;
        final var indexGCD = 4;
        final var indexProgression = 5;
        final var indexPrime = 6;

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
                case indexGCD:
                    GCD gameGCD = new GCD();
                    gameGCD.generateQA();
                    question = gameGCD.getQuestion();
                    rightAnswer = gameGCD.getAnswer();
                    System.out.println("Find the greatest common divisor of given numbers.");
                    break;
                case indexProgression:
                    Progression gameProgression = new Progression();
                    gameProgression.generateQA();
                    question = gameProgression.getQuestion();
                    rightAnswer = gameProgression.getAnswer();
                    System.out.println("What number is missing in the progression?");
                    break;
                case indexPrime:
                    Prime gamePrime = new Prime();
                    gamePrime.generateQA();
                    question = gamePrime.getQuestion();
                    rightAnswer = gamePrime.getAnswer();
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    break;
                default: break;
            }

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

