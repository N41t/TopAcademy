package Lesson_17;

//EXCEPTIONS
public class CW_17 {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[100]); //ArrayIndexOfBoundException
//        System.out.println(10/0); //ArithmeticException
//        IOException - файл который не существует
        String name = null;
//         name.toLowerCase(); // NullPointer exception


        System.out.println("Start");
        try { //записываем блок кода, который может выкинуть ошибку. Благодаря try/catch ошибки не будет и код выполнится весь

            System.out.println(10/0);

        }catch (Exception ex){
            System.out.println(ex.getMessage()); //сообщает об ошибке
            ex.printStackTrace(); // не путать с ошибкой, так как программа завершается с кодом 0. Вызывает всю цепочку событий до ошибки
        }
        System.out.println("End");
        System.out.println();

        //

        System.out.println(delenie(1, 1));

        //////////////////////////////////////
        System.out.println("start");
        try {
            System.out.println(charAt("afdsf", 5000));
        } catch (ArithmeticException ex) { //Нельзя в самый вверх ставить Exception -> иначе съест все остальные ошибки
            System.out.println("Delenie na 0 zapresweno");
        } catch (NullPointerException ex) {
            System.out.println("Vi obratillis k null");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Vi vishli za diapazon");
        }
        System.out.println("End");

        //////////////////////////////////////
        System.out.println("Start");
        try {
            System.out.println("try");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
            System.out.println(1);
        }
        System.out.println("End");


    }

    public static int charAt(String str, int index) throws Exception{ //просто проброс исключений
       char[] arr = str.toCharArray();
       for (int i = 0; i < arr.length; i++) {
           if (i == index) {
               return arr[i];
           }
       }

       throw new Exception("Index выходит за диапазон"); //нельзя выкинуть ошибку если в сигнатуре метода не указано, что он может выбросить Exception (либо обернуть метод в try-catch)
    }

    public static int delenie(int a, int b) throws Exception{
        if (b==0){
            throw new Exception("Delenie na 0 zapresheno");
        }

        return a/b;
    }

    //throw - выкинуть ошибку
    //try-catch - чтобы поймать ошибку (Если пометили try catch то пробрасывать дальше не нужно)
    //нужно писать разветвление экспешинов

}
