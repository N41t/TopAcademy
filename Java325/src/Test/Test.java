package Test;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //MyClass mcls = new MyClass(a, b);
        MyClass myClass = new MyClass();

        System.out.println(myClass.fieldNonStatic);

//        MyClassTwo myClassTwo = new MyClassTwo();
//        System.out.println(myClassTwo.getNewField());
//
//
//        MyClassTwo myClassTwo1 = new MyClassTwo();
//        System.out.println(myClassTwo1.getNewField());

        MyClassTwo myClassTwo = new MyClassTwo();
        String v1 = myClassTwo.newField = "1";
        System.out.println(myClassTwo.newField);

        MyClassTwo myClassTwo1 = new MyClassTwo();
        String v2 = myClassTwo1.newField = "2";
        System.out.println(myClassTwo1.newField);


        System.out.println(myClassTwo == myClassTwo1);

        //РАЗОБРАТЬСЯ КАК РАБОТАЕТ слово STATIC в JAVA

    }
}

class MyClass {

    public static String fieldStatic = "i'm static field";

    public String fieldNonStatic = "i'm not static field";

    MyClass(int first, int second) {
        System.out.println("Привет мир сейчас мы посчитаем сумму");
        System.out.println("Сумма равна: " + first+second);
    }

    MyClass() {
        System.out.println("Это дефолтный конструктор");
    }



}
