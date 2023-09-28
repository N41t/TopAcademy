package Lesson_24.Example;



import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {

        QuestionTest questionTest = new QuestionTest("Вопрос1", new String[]{"1", "2", "3"}, 3);
        System.out.println(questionTest.getQuestion());

    }
}

class QuestionTest{
    private String question;
    private String[] answers;
    private int correctAnswer;

    public QuestionTest(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public QuestionTest() {

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}

class MainMenu {

    //как из объекта в виде массива достать первый элемент массива и вывести его на экран
    public void showAllQuestions(Question[] value) {
        for (int i = 0; i < value.length; i++) {
//            String questionText = value[0];
//            System.out.println(Arrays.toString(value[0]));
        }
    }
}
