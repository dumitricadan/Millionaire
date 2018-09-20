package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int MAX_LEVEL = 4;

    private int currentLevel = 1;
    private List<Question> gameQuestions = new ArrayList<>();

    public Game(List<Question> gameQuestions) {
        this.gameQuestions.addAll(gameQuestions);
    }

    public void start() {
        //initializam intrebarile si jocul
        for (int i = 0; i < gameQuestions.size(); i++) {

        }

    }

    public void askQuestion() {
        //show question on screen

    }

    public void showQuestion() {
        for (Question question : gameQuestions) {
            System.out.println("Level: " + question.getDifficultyLevel());
            System.out.println(question.getQuestion());
            for (Answer answer : question.getAnswerList()) {
                System.out.println(answer.getAnswer());
            }
        }
    }

    public void answerQuestion() {
        // get user input and check if correct
    }

    public void fiftyFifty() {
        //show the same question but with only two possible answers
    }
}
