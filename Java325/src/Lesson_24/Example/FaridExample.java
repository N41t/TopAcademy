package Lesson_24.Example;


import java.util.Scanner;

class Question{
    private String question;
    private   String[] answers;
    private int correctAnswer;
    private boolean isOpenQuestion;
    private String OpenQuestionAnswer;


    public Question() {
    }

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        if (correctAnswer>=0 && correctAnswer<answers.length)
            this.correctAnswer = correctAnswer;
    }


    public void printQuestion(){
        System.out.println(this.question);
        for (int i = 0; i < this.answers.length; i++) {
            System.out.println((i + 1) + ") " + this.answers[i]);
        }
    }

    public boolean toCheck(int index) throws Exception {
        if (index>=0 && index<answers.length)
            return this.correctAnswer == (index-1);
        else if(index==-1)
            throw  new Exception(" Index ne mojet bit otricatelnim");
        else
            throw  new Exception("Error Index");
    }

    public boolean toCheck(String answer)  {
        return OpenQuestionAnswer.equalsIgnoreCase(answer);
        //"da Da
    }

    public boolean toCheckQuestionIsOpen()  {
        return isOpenQuestion;
        //"da Da
    }

}


class Millioner{
    Question[] arr;
    boolean isFifty;
    boolean isCall;
    boolean isHall;

    {
        isFifty = isCall = isHall = true;
    }

    public Millioner(Question[] arr) {
        this.arr = arr;
    }


    public Millioner() {
    }

    public Question[] getArr() {
        return arr;
    }

    public void setArr(Question[] arr) {
        this.arr = arr;
    }

    public boolean isFifty() {
        return isFifty;
    }

    public void setFifty(boolean fifty) {
        isFifty = fifty;
    }

    public boolean isCall() {
        return isCall;
    }

    public void setCall(boolean call) {
        isCall = call;
    }

    public boolean isHall() {
        return isHall;
    }

    public void setHall(boolean hall) {
        isHall = hall;
    }

    public void printAllQuestions(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ") "  );
            arr[i].printQuestion();
            System.out.println();
        }
    }

    public int countQuestion(){
        return arr.length;
    }


    public void printQuestion(int index){
        arr[index].printQuestion();
    }
}


public class FaridExample {
    public static   void main(String[] args) {

        Question[] questions = new Question[]{
                new Question(
                        "Skolko budet 2 + 2 ?",
                        new String[]{"9","b","4","3"},
                        2        ),
                new Question(
                        "Skolko budet 2 + 18 ?",
                        new String[]{"10","20","4","3","4","3","4","3","4","3","4","3"},
                        1        ),new Question(
                "Skolko budet 12 - 2 ?",
                new String[]{"10","20"},
                0        )
        };



        Millioner millioner = new Millioner(questions);


//        millioner.printAllQuestions();


        for (int i = 0; i < millioner.countQuestion(); i++) {
            System.out.print((i+1)+") " );
            millioner.printQuestion(i);
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();

            System.out.println("Otvet polzovatelya\n\n");
        }
    }
}
