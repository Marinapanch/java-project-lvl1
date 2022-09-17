package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.makeGreeting;
import static hexlet.code.Cli.makeGreetingWithName;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);
        var cl = new Cli();

        int index = sc.nextInt();
        switch (index) {
            case 1 :
                makeGreeting();
                break;
            case 2 :
                var name = makeGreetingWithName();
                Games game = new Games();
                game.even(name);
                break;
            case 0 :
                break;
            default : break;
        }

    }

}
