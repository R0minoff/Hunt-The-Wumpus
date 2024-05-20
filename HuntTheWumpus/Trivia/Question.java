package HuntTheWumpus.Trivia;

public class Question {
    String question;
    int difficulty;
    int index;
    String answer;

    public Question(String question, int difficulty, int index, String answer){
        this.question = question;
        this.difficulty = difficulty;
        this.index = index;
        this.answer = answer;
    }
}
