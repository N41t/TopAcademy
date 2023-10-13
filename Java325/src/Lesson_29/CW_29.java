package Lesson_29;

//Generic (��� �������� ����)

//ToDo: ������� ����� � ��� ��� ���������� ������ ��� Predicate. ������� ��� ������ � ����

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//boxing � unboxing - ����� ������� ���� ������� ����� ����, �.�. ���� �� ������������������
public class CW_29 {




    public static void main(String[] args) {
        System.out.println("Sum : " + Math.sum(10, 20));

        Math.print1(100);
        //Math.print(100.4); -> ��� ����� ������. ����� Generic


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


        //������������ ������ ������������� Generic
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
        System.out.println(comparable.compare("A", "B")); //������������������ �� �������� - �������. 1


        Comparable comparable2 = (n1, n2) -> n2.compareTo(n1); //����� �� ��������� ��������� �����.
        // ��� ����� ������� �����, ������� ����� ��������� ������ � ������ � ������� � � ����������� �� ������ ��������� ������

        System.out.println(comparable.compare("bba", "bab")); //������������������ �������� - ���������� -1

    }


}

class Math{
    public static int sum(int a, int b){ //��� ��������, ���� �������� ��� ���������� �������� ��������� ����� �����
        return a+b;
    }

//    public static void print(int result) {
//        System.out.println("Result = " + result);
//    }

    //��� ��� ����� �������� ����� �������. �� ����� ����� boxing � unboxing, ��� ����� ������� ����� �������� (�������� ���������� �� stack � heap � �������)
    public static  void print1(Object result) {
        System.out.println("Result = " + result);
    }

    //Generic ������ �������� � boxing � unboxing. Generic ������� ����� ��� ��������� ����� � � �����. <T> - �������� template(������)
    //����������
    public static <T> void print(T result) {
        System.out.println("Result = " + result);
    }

    public static <T extends Number> int sum1(T a, T b){ //��� ��������, ���� �������� ��� ���������� �������� ��������� ����� �����. ����� ���� ����� extends, �� ����� ������ �������������
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
        arr = (T[]) new Object[10]; //���������� ����, ������ ��� �� �� ����� ������� �������� ������ ��� ���������� ���
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

//�������� predicate ����������



//�������� ���������� ������� ����� ���������� ����� �����
interface Comparable {
    int compare(String a, String b);
}




