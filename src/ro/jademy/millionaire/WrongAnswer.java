package ro.jademy.millionaire;

public class WrongAnswer extends Answer {
    public WrongAnswer(String answer) {
        super(answer);
    }
    public boolean isCorrect() {
        return false;
    }
}
