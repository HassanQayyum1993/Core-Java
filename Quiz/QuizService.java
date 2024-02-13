package Quiz;

import java.util.Scanner;

public class QuizService {
    
    private Question questions[] = new Question[5];
    private String[] responses = new String[5];

    public QuizService()
    {
        questions[0] = new Question(1, "Size of Byte?", "1 Byte", "2 Byte", "4 Byte", "8 Byte", "1");
        questions[1] = new Question(2, "Size of Short?", "1 Byte", "2 Byte", "4 Byte", "8 Byte", "2");
        questions[2] = new Question(3, "Size of Char?", "1 Byte", "2 Byte", "4 Byte", "8 Byte", "2");
        questions[3] = new Question(4, "Size of Long?", "1 Byte", "2 Byte", "4 Byte", "8 Byte", "4");
        questions[4] = new Question(5, "Size of Double?", "1 Byte", "2 Byte", "4 Byte", "8 Byte", "4");
    }

    public void displayQuestion()
    {
        for(Question question:questions)
        {
            System.out.println(question);
        }
    }

    public void playQuiz()
    {
        int i=0;

        System.out.println("Enter the correct option number.");

        for(Question question:questions)
        {
            System.out.println(question);
            Scanner sc = new Scanner(System.in);
            responses[i] = (sc.nextLine());
            i++;
        }

        System.out.println("Your given answers are?");
        for(String response : responses)
        {
           System.out.println(response);
        }
    }

    public void printScore()
    {
        int score = 0; 

        for(int i=0; i<questions.length; i++)
        {
            if(questions[i].getAnswer().equals(responses[i]))
            {
                score++;
            }
        }

        System.out.println("The score is: " + score + " out of " + questions.length);
    }
}
