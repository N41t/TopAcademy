package Lesson_24;

//Главное меню
//Вопросы
//Помощь зала
//Статистика
//Имя игрока

//Реализация такая, что мы создаем экземпляр класса и отправляем туда нужные параметры, остальное делает сам класс


//Вопросы:
/*
1) Как вообще понять стоит ли создавать отдельный класс для реализации данной идеи. Потому что в миллионере я понял, что
создание класса целесообразно только для чего то что может использоваться несколько раз. Например зачем создавать отдельный класс для главного меню?
(Класс создается когда у сущности есть несколько полей и методов)

2)
 */


/*
ToDO:
-Доделать рандом для вопросов(каждый раз при запуске они выводилсь в рандомной форме из списка вопросов)
-Добавить в menuSettings(пункты дял CRUD)
-!!!showAllQuestions - зайти в этот метод и протестировать, как из объекта в виде массива достать первый элемент массива и вывести его на экран!!! +++
 */

import java.util.*;

public class HW_24_millionerOOP {
    public static ArrayList<Question> questions = new ArrayList<>(); //общее поле для вопросов
    int countArrQuestion = 5; //счетчик для добавления вопросов




    public static void main(String[] args) {

        //Главное меню
        MainMenu menu = new MainMenu();
        menu.startGame();
        Question Questions = new Question(); //для выполнения метода
        HW_24_millionerOOP.questions = Questions.defaultQuestions(); //присваиваем глобальной переменной ArrayList
        menu.mainMenu();

        //Подумать над архитектурой вопросов. Как вообще их лучше хранить.



        //



    }
}

class MainMenu {
    //Все необходимые поля для главного меню
    Scanner scanner = new Scanner(System.in);


    //Методы главного меню
    public void startGame() {
        System.out.println("Приветствую вас в игре Кто хочет стать миллионером! " +
                "\nУ вас будет 5 вопросов. За каждый верный ответ вы будете получать 10.000. " +
                "\nПри ответе на все 5 вопросов вы получите 50.000.\n");


    }

    public void mainMenu() {

        System.out.println("1 - Начать игру \n2 - Настройки\n3 - Выход");

        while (true) {
            System.out.print("Ввод: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("Вы начали игру\n");
                ArrayList<Integer> randomList = Game.randomQuestion(HW_24_millionerOOP.questions); //лист с рандомными значениями
                while (true) {


                    Game.questions(HW_24_millionerOOP.questions, randomList);


                    Game.answer(HW_24_millionerOOP.questions, randomList);
                }
                //break;
            } else if (enter == 2) {
                //Будет вызван метод класса вопросов(определится где создать экземпляр класса в методе или во вне)
                System.out.println("Вызов настроек");
                menuSettings();

                //Здесь будет вызвана логика настроек
                break;
            } else if (enter == 3) {
                System.exit(1);
            }
            System.out.println("Вы ввели неверное число, введите другое");
        }
    }

    public void menuSettings() {
        System.out.println("1 - Посмотреть все вопросы \n2 - Добавить вопрос \n3 - Удалить вопрос\n4 - Редактировать вопрос\n5 - Вернутся в главное меню");
        while (true) {
            System.out.print("Ввод: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("Показать все вопросы!");
                //Здесь отобразить все default вопросы(Если потребуется вынести пустой массив в общую переменную, постараться оставить его private)


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
                System.out.println("Вы ввели неверное число, введите другое");
            }


        }
    }

    //--------------------------------------------------------------------------------
    //Методы CRUD
    //метод для отображения всех вопросов
    public void showAllQuestions(ArrayList<Question> value) {
        for (int i = 0; i < value.size(); i++) {
            System.out.println(i+1 + ") " + value.get(i).getQuestion());
        }
    }


    //метод для добавления вопроса
    public void addQuestion(ArrayList<Question> value) {

//        Надо сначала создать новый объект. Заполнить его, а потом упаковать в ArrayList
        System.out.println("\nДля создания вопроса необходимо ввести сам вопрос, пробелы через \"_\" 4 варианта ответа и какой вариант будет являться правильным\n"); //todo!!!Не забыть сделать проверку на ввод!
        Question newQuestion = new Question();
        System.out.print("Введите наименование вопроса: ");
        String questionText = scanner.next();
        newQuestion.setQuestion(questionText);

        //Ввод и добавления 4 вопросов
        //todo! Проверить на ошибки. Чтобы больше 4 не вводилось, чтобы не вводилась ерунда. Добавить перед вопросом нумерацию, потому что пользователь может ее не ввести
        //!!todo!!НАЧАТЬ ОТСЮДА!!!
        //!!todo - Проблема в инициализации ArrayList. Сейчас он null, как это исправить
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите " + (i+1) + " вариант ответа: ");
            String answerText = scanner.next();
            newQuestion.setAnswers((i+1) + ") " + answerText);
        }

        System.out.print("Введите номер правильного варианта ответа: ");
        int correctAnswerText = scanner.nextInt();
        newQuestion.setCorrectAnswer(correctAnswerText-1);

        value.add(newQuestion);

    }

    public void deleteQuestion(ArrayList<Question> value){
        System.out.print("Введите номер вопроса, который хотите удалить: ");
        int deleteQuestion = scanner.nextInt();

        value.remove(deleteQuestion-1);

    }

    public void updateQuestion(ArrayList<Question> value) {
        System.out.print("Введите номер вопроса, который хотели бы изменить: ");
        int updateQuestion = scanner.nextInt();
        System.out.print("Введите наименование вопроса: ");
        String questionText = scanner.next();
        value.get(updateQuestion-1).setQuestion(questionText);

        for (int i = 0; i < 4; i++) {
            System.out.print("Введите " + (i+1) + " вариант ответа: ");
            String answerText = scanner.next();
            value.get(updateQuestion-1).setAnswers(answerText);
        }

        System.out.print("Введите номер правильного варианта ответа: ");
        int correctAnswerText = scanner.nextInt();
        value.get(updateQuestion-1).setCorrectAnswer(correctAnswerText);

    }

    //-------------------------------------------------------------------------------------



}

class Game {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList mass = new ArrayList(); //выбранные варианты помощи
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

        //toDo: Написать метод рандома, только для получения разных вопросов перед выводом, то есть создаем лист, в котором мешаем индексы всех вопросов и поочередно достаем

        //Метод рандома. Заполнить новый ArrayList рандомными числами, в зависимости от длины общего листа. Потом через for выводить по индексам

         //вынести!
        System.out.println("Вопрос: " + value.get(randomList.get(i)).getQuestion());
        return randomList;




        //Для каждого объекта просто сравнить сколько правильных ответов, добавляя счетчик. Сравнение через if в цикле for
    }

    public static void answer(ArrayList<Question> value, ArrayList<Integer> randomList){

        for (int i = 0; i < value.get(i).getAnswers().size(); i++) {
            System.out.println(value.get(randomList.get(Game.i)).getAnswers().get(i));
        }

        i++;


        while (true) {
            System.out.println("\nПеред выбором ответа, хотели бы воспользоваться подсказками: \n1)50/50\n2)Помощь зала\n3)Звонок другу\n4)Нет спасибо\n");
            System.out.print("Выберите подсказку: ");
            int answerPod = scanner.nextInt();

            if (answerPod < 1 || answerPod > 4) {
                while (answerPod < 1 || answerPod > 4) {
                    System.out.println("\nВы ввели неверное значение. Введите значение от 1 до 4\n");
                    System.out.print("Выберите подсказку: ");
                    answerPod = scanner.nextInt();
                }
            }

            if (mass.contains(answerPod)) {
                while (mass.contains(answerPod)) {
                    System.out.println("Вы уже использовали эту подсказку");
                    System.out.print("Выберите подсказку: ");
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



        //ToDo: решить проблему с выбором ответа!!!!!!
        while (true) {
            System.out.print("Выберите ответ: ");
            int answer = scanner.nextInt();

            if (answer < 1 || answer > 4) {
                System.out.println("\nВы ввели неверное значение. Введите значение от 1 до 4\n");
                break;
            } else {
                for (int i = countForQuestions; i < value.size(); i++) {
                    if ((answer-1) == value.get(randomList.get(i)).getCorrectAnswer() && i == (value.size()-1)) {
                        System.out.println("\nВерный ответ на " + (i+1) +" вопрос\n");
                        System.out.println("\n-----------------------------------------------------------------------------");
                        cash+=10000;
                        System.out.println("Поздравляем! Вы ответили верно на все вопросы! Ваш выигрыш составил "+cash+" руб. До новых встреч!");
                        System.exit(1);
                    } else if ((answer-1) == value.get(randomList.get(i)).getCorrectAnswer()) {
                        System.out.println("\nВерный ответ на " + (i+1) +" вопрос");
                        System.out.println("-----------------------------------------------------------------------------\n");
                        cash+=10000;
                        break;
                    } else {
                        System.out.println("Вы ответили неверно. Ваш выигрыш "+cash+" руб. До новых встреч!");
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

        System.out.println("Дружище, правильный ответ " + value.get(randomList.get(countForQuestions)).getAnswers().get(random.nextInt(4)));

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


    //Метод для создания дефолтных вопросов(Для начала игры должно быть минимум 5 вопросов)
    public ArrayList<Question> defaultQuestions() {
        ArrayList<Question> questionsList = new ArrayList<Question>(Arrays.asList(
                new Question(
                        "Какое растение существует на самом деле?",
                        new ArrayList(Arrays.asList(
                                "1)Лох чилийский", "2)Лох индийский", "3)Лох греческий", "4)Лох русский"
                        )),
                        1
                ),
                new Question(
                        "Какой город объявлен официальной родиной русского Деда Мороза?",
                        new ArrayList(Arrays.asList(
                                "1)Великий Устюг", "2)Малая Вишера", "3)Вышний Волочек", "4)Нижний Новгород"
                        )),
                        0
                ),
                new Question(
                        "Что проводит боксер, наносящий удар противнику снизу?",
                        new ArrayList(Arrays.asList(
                                "1)Свинг", "2)Хук", "3)Апперкот", "4)Джэб"
                        )),
                        2
                ),
                new Question(
                        "К кому первому обратились за помощью дед и бабка, не справившись с репкой?",
                        new ArrayList(Arrays.asList(
                                "1)К Жучке", "2)К дочке", "3)К внучке", "4)К залу"
                        )),
                        2
                ),
                new Question(
                        "Как называется ближайшая к Земле звезда",
                        new ArrayList(Arrays.asList(
                                "1)Проксиома Центавра", "2)Солнце", "3)Полярная", "4)Сириус"
                        )),
                        1
                )
        ));

        return questionsList;

    }



    //Метод для создания вопроса

    //Показать список вопросов

    //Метод для удаления вопроса

    //Метод для редактирования вопроса


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




