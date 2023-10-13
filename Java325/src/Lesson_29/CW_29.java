package Lesson_29;

//Generic (дл€ гибкости кода)

//ToDo: —качать видео и еще раз посмотреть момент про Predicate. —качать код ‘арида с гита

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//boxing и unboxing - сама€ ужасна€ вещь котора€ может быть, т.к. бьет по производительности
public class CW_29 {




    public static void main(String[] args) {
        System.out.println("Sum : " + Math.sum(10, 20));

        Math.print1(100);
        //Math.print(100.4); -> уже будет ошибка. Ќужен Generic


        Math.print(100);
        Math.print(100.4);

        Math.sum1(1d, 1.2f);
        System.out.println("Sum : " + Math.sum1(1d, 1.2f));

        System.out.println();
        MyArray<Double> arr = new MyArray<>();
        arr.add(10.2);
        arr.add(10.6);
        arr.print();
        System.out.println();
        MyArray<Float> arrF = new MyArray<>();
        arrF.add(12f);
        arrF.add(15f);
        arrF.print();


        //Ќеправильный пример использовани€ Generic
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);

//    public static int sumAll(List<Integer> arr, Predicate<Integer> predicate) {
//
//    }


        //Comparable
        Comparable comparable = new Comparable() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        };

        System.out.println();
        System.out.println(comparable.compare("A", "B")); //ѕоследовательность не нарушено - возвращ. 1


        Comparable comparable2 = (n1, n2) -> n2.compareTo(n1); //„тобы не создавать анонимный класс.
        // »ли можно создать метод, который будет принимать л€мбду и массив к примеру и в зависимости от л€мбды выполн€ть логику

        System.out.println(comparable.compare("bba", "bab")); //последовательность нарушена - возвращает -1

    }


}

class Math{
    public static int sum(int a, int b){ //нет гибкости, если помен€ем тип переменной придетс€ создавать новый метод
        return a+b;
    }

//    public static void print(int result) {
//        System.out.println("Result = " + result);
//    }

    //¬се это можно заменить одним методом. Ќо здесь будет boxing и unboxing, что будет тратить много ресурсов (передача информации из stack в heap и обратно)
    public static  void print1(Object result) {
        System.out.println("Result = " + result);
    }

    //Generic решают проблему с boxing и unboxing. Generic говорит какой тип отправишь таким € и стану. <T> - означает template(шаблон)
    //»зменилось
    public static <T> void print(T result) {
        System.out.println("Result = " + result);
    }

    public static <T extends Number> int sum1(T a, T b){ //нет гибкости, если помен€ем тип переменной придетс€ создавать новый метод. “акже если пишем extends, то класс должен наследоватьс€
        return a.intValue() + b.intValue();
    }


    @Override
    public String toString() {
        return "Math{}";
    }
}

class MyArray <T>{
    T[] arr;
    int size;
    int index;

    {
        arr = (T[]) new Object[10]; //ѕривидение типа, потому что он не знает сколько выдел€ть пам€ти под переданный тип
        index = 0;
    }

    public void add(T a){
        arr[index++] = a;
    }

    public void print(){
        for (int i = 0; i < index; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

//создание predicate интерфейса



//создание интерфейса который будет сравнивать длину строк
interface Comparable {
    int compare(String a, String b);
}




