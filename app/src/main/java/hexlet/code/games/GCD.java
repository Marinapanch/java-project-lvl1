package hexlet.code.games;

import static java.lang.String.valueOf;

public final class GCD {
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public void generateQA() {
        final var decRandom = 100;

        var a = (int) Math.round(Math.random() * decRandom);
        var b = (int) Math.round(Math.random() * decRandom);

        this.question = valueOf(a) + " " + valueOf(b);
        this.answer = valueOf(getGCD(a, b));

    }

}
