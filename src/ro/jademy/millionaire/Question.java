package ro.jademy.millionaire;
import java.util.ArrayList;
import java.util.List;

public class Question {
    public static final int MAX_LEVEL = 15;
    private String question;
    private int difficultyLevel;
    private List<Answer> answerList = new ArrayList<>();

    public List<Answer> getAnswerList () {
        return this.answerList;
    }
    public void setAnswerList(java.util.List<Answer> answerList) {
        this.answerList = answerList;
    }
    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }
    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getCorrectAnswer () {
        for (Answer answer: answerList) {
            if (answer.isCorrect) {
                return answer;
            }
        }
        return null;
    }

}
