package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public int currentLevel = 1;
    List<Question> questions = new ArrayList<>();

    public Game() {
        List<Answer> answer1 = new ArrayList<>();
        answer1.add(new Answer("A. Paris", true));
        answer1.add(new Answer("B. Bucharest", false));
        answer1.add(new Answer("C. Budapest", false));
        answer1.add(new Answer("D. Marseille", false));
        questions.add(new Question ("Capitala Frantei este:",1, answer1));

        List<Answer> answer2 = new ArrayList<>();
        answer2.add(new Answer("A. Africa", false));
        answer2.add(new Answer("B. Asia", true));
        answer2.add(new Answer("C. North America", false));
        answer2.add(new Answer("D. Antarctica", false));
        questions.add(new Question ("Cel mai mare continent este:",2, answer2));

        List<Answer> answer3 = new ArrayList<>();
        answer3.add(new Answer("A. 1899", false));
        answer3.add(new Answer("B. 1900", false));
        answer3.add(new Answer("C. 1918", true));
        answer3.add(new Answer("D. 1919", false));
        questions.add(new Question ("Marea Unire s-a realizat in:",3, answer3));

        List<Answer> answer4 = new ArrayList<>();
        answer3.add(new Answer("A. 1899", false));
        answer3.add(new Answer("B. 1900", false));
        answer3.add(new Answer("C. 1918", true));
        answer3.add(new Answer("D. 1919", false));
        questions.add(new Question ("Marea Unire s-a realizat in:",3, answer3));
    }

    public void start() {
        //initializam intrebarile si jocul



    }

    public void askQuestion() {
        //show question on screen

    }
    public void showQuestion() {
        System.out.println(questions.get(0).getQuestion());
        //System.out.println(questions.get(0).getAnswerList().get(0).getAnswer());
        for(int i=0; i<4; i++) {
            System.out.println(questions.get(0).getAnswerList().get(i).getAnswer());
        }
    }

    public void answerQuestion() {
        // get user input and check if correct
    }

    public void fiftyFifty() {
        //show the same question but with only two possible answers
    }
}
