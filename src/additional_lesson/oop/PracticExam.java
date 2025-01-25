package additional_lesson.oop;

import java.util.Random;

public class PracticExam implements ExamService{
    @Override
    public int exam(int totalBal) {
        Random random = new Random();
        int randomNum = random.nextInt(5,totalBal);
        return randomNum;
    }
}
