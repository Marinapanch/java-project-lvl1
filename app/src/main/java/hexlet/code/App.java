package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.makeGreeting;

public class App {
    public static void main(String[] args) {

        final var indexGreet = 1;
        final var indexEven = 2;
        final var indexCalc = 3;
        final var indexExit = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);
        var cl = new Cli();

        int index = sc.nextInt();
        switch (index) {
            case indexGreet :
                makeGreeting();
                break;
            case indexEven :
            case indexCalc :
                hexlet.code.Engine.engineGame(index);
                break;
            case indexExit :
                break;
            default : break;
        }

    }

}
