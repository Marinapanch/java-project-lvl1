package hexlet.code.games;

import java.util.Objects;
import java.util.Scanner;

public final class Even {
    public String question;
    public String answer;


    public String generateQA() {
        var num = 0;
        var decRandom = 100;

        num = (int) Math.round(Math.random() * decRandom);
        this.question = String.valueOf(num);

        if ((num % 2) == 0) {
            this.answer = "yes";
        } else {
            this.answer = "no";
        }
        return this.question;
    }

    public boolean checkCorrectAnswer(String answer) {
        return (Objects.equals(this.answer, answer.toLowerCase()));
    }

}


