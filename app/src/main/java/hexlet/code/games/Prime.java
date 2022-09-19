package hexlet.code.games;

public final class Prime {
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void generateQA() {
        
        final var decRandom = 100;
        var seq = "";

        //define number
        int number = (int) Math.floor(Math.random() * decRandom);

        this.question =  String.valueOf(number);

        var i = 2;
        var isPrime = true;

        while ((i < number) && isPrime) {
            isPrime = (number % i != 0);
            i++;
        }

        if (isPrime) {
            this.answer = "yes";
        } else {
            this.answer = "no";
        }


    }

}
