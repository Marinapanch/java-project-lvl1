package hexlet.code.games;

public final class Progression {
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void generateQA() {
        final var prCount = 10;
        final var decRandom = 10;
        var seq = "";

        //define difference
        int q = (int) Math.floor(Math.random() * decRandom);

        //define first element
        int a1 = (int) Math.floor(Math.random() * decRandom);

        int[] array = new int[prCount];
        array[0] = a1;
        for (var i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + q;
        }

        //calc position to pass
        int n = (int) Math.floor(Math.random() * array.length);

        //array to string
        for (var i = 0; i < array.length; i++) {
            if (i == n) {
                seq += "..";
            } else {
                seq += String.valueOf(array[i]);
            }
            seq += " ";
        }

        this.question = seq;
        this.answer = String.valueOf(array[n]);

    }


}
