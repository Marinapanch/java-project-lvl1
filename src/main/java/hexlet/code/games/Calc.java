package hexlet.code.games;

import static java.lang.String.valueOf;

public final class Calc {


    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

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

    public void generateQA() {
        final var decRandom = 100;

        var a = (int) Math.round(Math.random() * decRandom);
        var b = (int) Math.round(Math.random() * decRandom);

        char[] operations = new char[]{'+', '-', '*'};
        int n = (int) Math.floor(Math.random() * operations.length);
        var operation = operations[n];

        this.question = valueOf(a) + " " + operation + " " + valueOf(b);
        this.answer = valueOf(calculate(a, b, operation));

    }


}
