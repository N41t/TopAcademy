package Lesson_29.HW_29;

import java.util.List;

public class HW_29 {


    public static int sumAll(List<Integer> arr, MyFunctional predicate){
        int sum = 0;
        for (int num:arr) {
            if (predicate.test(num)) {
                sum+=num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Comparable comparable = new Comparable() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        };

        System.out.println(comparable.compare("bba", "bab"));

        Comparable comparable2 = (n1,n2) -> n2.compareTo(n1);
        System.out.println(comparable2.compare("bba", "bab"));
    }
}



interface Printable {

}

class Person implements Printable {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

class MyArray<T extends Person & Printable> {
    T[] arr;
    int size;
    int index;

    {
        arr = (T[]) new Object[10];
        index = 0;
    }

    public void add(T a){
        arr[index++] = a;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

class Math {

}

class Student extends Person{
    public Student(String name) {
        super(name);
    }
}

interface MyFunctional{
    boolean test(int num);
}

interface Comparable{
    int compare(String a, String b);
}


