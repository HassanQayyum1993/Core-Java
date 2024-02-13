package Quiz;

public class Main {
    public static void main(String []args)
    {
        QuizService quizService = new QuizService(); 
        quizService.playQuiz();
        quizService.printScore();
    }
}