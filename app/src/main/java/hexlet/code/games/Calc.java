package hexlet.code.games;

import java.util.Objects;

import static java.lang.String.valueOf;

public final class Calc {

    public String question;
    public String answer;

    public static int calculate(int a, int b, char operation) {
        var res = 0;
        switch (operation) {
            case '+' :
                res = a + b;
                break;
            case '-' :
                res = a - b;
                break;
            case '*' :
                res = a * b;
                break;
            default : break;
        }
        return res;
    }

    public String generateQA() {
        var decRandom = 100;

        var a = (int) Math.round(Math.random() * decRandom);
        var b = (int) Math.round(Math.random() * decRandom);

        char [] operations = new char[]{'+' , '-' , '*'};
        String[] myString = new String[]{"раз", "два", "три", "четыре", "пять"};
        int n = (int)Math.floor(Math.random() * operations.length);
        var operation = operations[n];

        this.question = valueOf(a) + " "+ operation + " " + valueOf(b);
        this.answer = valueOf(calculate(a, b, operation));

        return this.question;
    }

    public boolean checkCorrectAnswer(String answer) {
        return (Objects.equals(this.answer, answer.toLowerCase()));
    }
}
