package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        for(Question question:gameQuestions) {
            showQuestion(question);
            checkAnswer(question);
        }
       }

       public void checkAnswer(Question question) {
           Scanner scan = new Scanner(System.in);
           Answer chosenAnswer;
           Answer correctAnswer;
           int option;
           do {
               option = scan.nextInt();
           } while (option>4 || option<1);
           correctAnswer = question.getCorrectAnswer();
           chosenAnswer = question.getAnswerList().get(option-1);
           if (chosenAnswer.equals(correctAnswer)) {
               System.out.println("FELICITARI, AI RASPUNS CORECT!");
           } else {
               System.out.println("AI PIERDUT!");
               System.exit(0);
           }
       }


    public void showQuestion(Question question) {
            System.out.println("Level: " + question.getDifficultyLevel());
            System.out.println(question.getQuestion());
            for (Answer answer : question.getAnswerList()) {
                System.out.println(answer.getAnswer());
            }

    }

    public void answerQuestion() {
        // get user input and check if correct
    }

    public void fiftyFifty() {
        //show the same question but with only two possible answers
    }
}
