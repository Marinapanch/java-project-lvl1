package hexlet.code.games;

public final class Even {

    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }


    public void generateQA() {
        var num = 0;
        final var decRandom = 100;

        num = (int) Math.round(Math.random() * decRandom);
        this.question = String.valueOf(num);

        if ((num % 2) == 0) {
            this.answer = "yes";
        } else {
            this.answer = "no";
        }
    }


}


