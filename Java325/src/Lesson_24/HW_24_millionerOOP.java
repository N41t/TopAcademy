package Lesson_24;

//������� ����
//�������
//������ ����
//����������
//��� ������

//���������� �����, ��� �� ������� ��������� ������ � ���������� ���� ������ ���������, ��������� ������ ��� �����


//�������:
/*
1) ��� ������ ������ ����� �� ��������� ��������� ����� ��� ���������� ������ ����. ������ ��� � ���������� � �����, ���
�������� ������ ������������� ������ ��� ���� �� ��� ����� �������������� ��������� ���. �������� ����� ��������� ��������� ����� ��� �������� ����?
(����� ��������� ����� � �������� ���� ��������� ����� � �������)

2)
 */


/*
ToDO:
-�������� ������ ��� ��������(������ ��� ��� ������� ��� ��������� � ��������� ����� �� ������ ��������)
-�������� � menuSettings(������ ��� CRUD)
-!!!showAllQuestions - ����� � ���� ����� � ��������������, ��� �� ������� � ���� ������� ������� ������ ������� ������� � ������� ��� �� �����!!! +++
 */

import java.util.*;

public class HW_24_millionerOOP {
    public static ArrayList<Question> questions = new ArrayList<>(); //����� ���� ��� ��������
    int countArrQuestion = 5; //������� ��� ���������� ��������




    public static void main(String[] args) {

        //������� ����
        MainMenu menu = new MainMenu();
        menu.startGame();
        Question Questions = new Question(); //��� ���������� ������
        HW_24_millionerOOP.questions = Questions.defaultQuestions(); //����������� ���������� ���������� ArrayList
        menu.mainMenu();

        //�������� ��� ������������ ��������. ��� ������ �� ����� �������.



        //



    }
}

class MainMenu {
    //��� ����������� ���� ��� �������� ����
    Scanner scanner = new Scanner(System.in);


    //������ �������� ����
    public void startGame() {
        System.out.println("����������� ��� � ���� ��� ����� ����� �����������! " +
                "\n� ��� ����� 5 ��������. �� ������ ������ ����� �� ������ �������� 10.000. " +
                "\n��� ������ �� ��� 5 �������� �� �������� 50.000.\n");


    }

    public void mainMenu() {

        System.out.println("1 - ������ ���� \n2 - ���������\n3 - �����");

        while (true) {
            System.out.print("����: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("�� ������ ����\n");
                ArrayList<Integer> randomList = Game.randomQuestion(HW_24_millionerOOP.questions); //���� � ���������� ����������
                while (true) {


                    Game.questions(HW_24_millionerOOP.questions, randomList);


                    Game.answer(HW_24_millionerOOP.questions, randomList);
                }
                //break;
            } else if (enter == 2) {
                //����� ������ ����� ������ ��������(����������� ��� ������� ��������� ������ � ������ ��� �� ���)
                System.out.println("����� ��������");
                menuSettings();

                //����� ����� ������� ������ ��������
                break;
            } else if (enter == 3) {
                System.exit(1);
            }
            System.out.println("�� ����� �������� �����, ������� ������");
        }
    }

    public void menuSettings() {
        System.out.println("1 - ���������� ��� ������� \n2 - �������� ������ \n3 - ������� ������\n4 - ������������� ������\n5 - �������� � ������� ����");
        while (true) {
            System.out.print("����: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("�������� ��� �������!");
                //����� ���������� ��� default �������(���� ����������� ������� ������ ������ � ����� ����������, ����������� �������� ��� private)


                    showAllQuestions(HW_24_millionerOOP.questions);

                //break;
            } else if (enter == 2) {
                addQuestion(HW_24_millionerOOP.questions);

            } else if (enter == 3) {
                deleteQuestion(HW_24_millionerOOP.questions);
            } else if (enter == 4){
                updateQuestion(HW_24_millionerOOP.questions);
            } else if (enter == 5) {
                mainMenu();
                break;
            } else {
                System.out.println("�� ����� �������� �����, ������� ������");
            }


        }
    }

    //--------------------------------------------------------------------------------
    //������ CRUD
    //����� ��� ����������� ���� ��������
    public void showAllQuestions(ArrayList<Question> value) {
        for (int i = 0; i < value.size(); i++) {
            System.out.println(i+1 + ") " + value.get(i).getQuestion());
        }
    }


    //����� ��� ���������� �������
    public void addQuestion(ArrayList<Question> value) {

//        ���� ������� ������� ����� ������. ��������� ���, � ����� ��������� � ArrayList
        System.out.println("\n��� �������� ������� ���������� ������ ��� ������, ������� ����� \"_\" 4 �������� ������ � ����� ������� ����� �������� ����������\n"); //todo!!!�� ������ ������� �������� �� ����!
        Question newQuestion = new Question();
        System.out.print("������� ������������ �������: ");
        String questionText = scanner.next();
        newQuestion.setQuestion(questionText);

        //���� � ���������� 4 ��������
        //todo! ��������� �� ������. ����� ������ 4 �� ���������, ����� �� ��������� ������. �������� ����� �������� ���������, ������ ��� ������������ ����� �� �� ������
        //!!todo!!������ ������!!!
        //!!todo - �������� � ������������� ArrayList. ������ �� null, ��� ��� ���������
        for (int i = 0; i < 4; i++) {
            System.out.print("������� " + (i+1) + " ������� ������: ");
            String answerText = scanner.next();
            newQuestion.setAnswers((i+1) + ") " + answerText);
        }

        System.out.print("������� ����� ����������� �������� ������: ");
        int correctAnswerText = scanner.nextInt();
        newQuestion.setCorrectAnswer(correctAnswerText-1);

        value.add(newQuestion);

    }

    public void deleteQuestion(ArrayList<Question> value){
        System.out.print("������� ����� �������, ������� ������ �������: ");
        int deleteQuestion = scanner.nextInt();

        value.remove(deleteQuestion-1);

    }

    public void updateQuestion(ArrayList<Question> value) {
        System.out.print("������� ����� �������, ������� ������ �� ��������: ");
        int updateQuestion = scanner.nextInt();
        System.out.print("������� ������������ �������: ");
        String questionText = scanner.next();
        value.get(updateQuestion-1).setQuestion(questionText);

        for (int i = 0; i < 4; i++) {
            System.out.print("������� " + (i+1) + " ������� ������: ");
            String answerText = scanner.next();
            value.get(updateQuestion-1).setAnswers(answerText);
        }

        System.out.print("������� ����� ����������� �������� ������: ");
        int correctAnswerText = scanner.nextInt();
        value.get(updateQuestion-1).setCorrectAnswer(correctAnswerText);

    }

    //-------------------------------------------------------------------------------------



}

class Game {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList mass = new ArrayList(); //��������� �������� ������
    public static int count = 1;
    public static int cash = 0;

    public static int countForQuestions = 0;

    static int i = 0;


    public static ArrayList<Integer> randomQuestion(ArrayList<Question> value) {
        ArrayList<Integer> list = new ArrayList<>();
        {for (int i = 0; i < value.size(); i++) list.add(i);}
        Collections.shuffle(list);
        return list;
    }


    public static ArrayList<Integer> questions(ArrayList<Question> value, ArrayList<Integer> randomList) {

        //toDo: �������� ����� �������, ������ ��� ��������� ������ �������� ����� �������, �� ���� ������� ����, � ������� ������ ������� ���� �������� � ���������� �������

        //����� �������. ��������� ����� ArrayList ���������� �������, � ����������� �� ����� ������ �����. ����� ����� for �������� �� ��������

         //�������!
        System.out.println("������: " + value.get(randomList.get(i)).getQuestion());
        return randomList;




        //��� ������� ������� ������ �������� ������� ���������� �������, �������� �������. ��������� ����� if � ����� for
    }

    public static void answer(ArrayList<Question> value, ArrayList<Integer> randomList){

        for (int i = 0; i < value.get(i).getAnswers().size(); i++) {
            System.out.println(value.get(randomList.get(Game.i)).getAnswers().get(i));
        }

        i++;


        while (true) {
            System.out.println("\n����� ������� ������, ������ �� ��������������� �����������: \n1)50/50\n2)������ ����\n3)������ �����\n4)��� �������\n");
            System.out.print("�������� ���������: ");
            int answerPod = scanner.nextInt();

            if (answerPod < 1 || answerPod > 4) {
                while (answerPod < 1 || answerPod > 4) {
                    System.out.println("\n�� ����� �������� ��������. ������� �������� �� 1 �� 4\n");
                    System.out.print("�������� ���������: ");
                    answerPod = scanner.nextInt();
                }
            }

            if (mass.contains(answerPod)) {
                while (mass.contains(answerPod)) {
                    System.out.println("�� ��� ������������ ��� ���������");
                    System.out.print("�������� ���������: ");
                    answerPod = scanner.nextInt();
                }

            }


            if (answerPod == 1) {


                mass.add(answerPod);
                fiftyFifty(HW_24_millionerOOP.questions, randomList);


            } else if (answerPod == 2) {



                mass.add(answerPod);
                hallHelp(HW_24_millionerOOP.questions, randomList);
                break;

            } else if (answerPod == 3) {


                mass.add(answerPod);
                callFriend(HW_24_millionerOOP.questions, randomList);
                break;

            } else if (answerPod == 4) {
                break;
            }


        }



        //ToDo: ������ �������� � ������� ������!!!!!!
        while (true) {
            System.out.print("�������� �����: ");
            int answer = scanner.nextInt();

            if (answer < 1 || answer > 4) {
                System.out.println("\n�� ����� �������� ��������. ������� �������� �� 1 �� 4\n");
                break;
            } else {
                for (int i = countForQuestions; i < value.size(); i++) {
                    if ((answer-1) == value.get(randomList.get(i)).getCorrectAnswer() && i == (value.size()-1)) {
                        System.out.println("\n������ ����� �� " + (i+1) +" ������\n");
                        System.out.println("\n-----------------------------------------------------------------------------");
                        cash+=10000;
                        System.out.println("�����������! �� �������� ����� �� ��� �������! ��� ������� �������� "+cash+" ���. �� ����� ������!");
                        System.exit(1);
                    } else if ((answer-1) == value.get(randomList.get(i)).getCorrectAnswer()) {
                        System.out.println("\n������ ����� �� " + (i+1) +" ������");
                        System.out.println("-----------------------------------------------------------------------------\n");
                        cash+=10000;
                        break;
                    } else {
                        System.out.println("�� �������� �������. ��� ������� "+cash+" ���. �� ����� ������!");
                        System.exit(1);
                    }

                }
            }

            break;
        }

            countForQuestions++;

    }

    public static void fiftyFifty(ArrayList<Question> value, ArrayList<Integer> randomList) {
        Random random = new Random();

        int firstAnswer = random.nextInt(4);
        int correctAnsw = value.get(countForQuestions).getCorrectAnswer();

        System.out.println(value.get(randomList.get(countForQuestions)).getAnswers().get(correctAnsw - 1));
        while (true) {
            int secondAnswer = random.nextInt(4);
            if (firstAnswer != secondAnswer) {
                System.out.println(value.get(randomList.get(countForQuestions)).getAnswers().get(secondAnswer));
                break;
            }

        }

    }

    public static void callFriend(ArrayList<Question> value, ArrayList<Integer> randomList) {
        Random random = new Random();

        System.out.println("�������, ���������� ����� " + value.get(randomList.get(countForQuestions)).getAnswers().get(random.nextInt(4)));

    }

    public static void hallHelp(ArrayList<Question> value, ArrayList<Integer> randomList) {
        Random random = new Random();

        System.out.println(value.get(randomList.get(countForQuestions)).getAnswers().get(random.nextInt(4)));

    }



}






class Question {

    private String question;
    private ArrayList answers;
    private int correctAnswer;
    private boolean isCompletedQuestion;

    public Question(String question, ArrayList answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Question() {
        this.answers = new ArrayList<>();
    }


    //����� ��� �������� ��������� ��������(��� ������ ���� ������ ���� ������� 5 ��������)
    public ArrayList<Question> defaultQuestions() {
        ArrayList<Question> questionsList = new ArrayList<Question>(Arrays.asList(
                new Question(
                        "����� �������� ���������� �� ����� ����?",
                        new ArrayList(Arrays.asList(
                                "1)��� ���������", "2)��� ���������", "3)��� ���������", "4)��� �������"
                        )),
                        1
                ),
                new Question(
                        "����� ����� �������� ����������� ������� �������� ���� ������?",
                        new ArrayList(Arrays.asList(
                                "1)������� �����", "2)����� ������", "3)������ �������", "4)������ ��������"
                        )),
                        0
                ),
                new Question(
                        "��� �������� ������, ��������� ���� ���������� �����?",
                        new ArrayList(Arrays.asList(
                                "1)�����", "2)���", "3)��������", "4)����"
                        )),
                        2
                ),
                new Question(
                        "� ���� ������� ���������� �� ������� ��� � �����, �� ����������� � ������?",
                        new ArrayList(Arrays.asList(
                                "1)� �����", "2)� �����", "3)� ������", "4)� ����"
                        )),
                        2
                ),
                new Question(
                        "��� ���������� ��������� � ����� ������",
                        new ArrayList(Arrays.asList(
                                "1)��������� ��������", "2)������", "3)��������", "4)������"
                        )),
                        1
                )
        ));

        return questionsList;

    }



    //����� ��� �������� �������

    //�������� ������ ��������

    //����� ��� �������� �������

    //����� ��� �������������� �������


    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList getAnswers() {
        return this.answers;
    }

    public void setAnswers(String answers) {
        this.answers.add(answers);
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

}




