package Lesson_12;

public class CW_12 {

    public static void method() {
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a+b));
    }

    public static int methodReturn() {
        int a = 10;
        int b = 5;
        int sum = a + b;
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        method();
        int result = methodReturn();
        System.out.println(result); // или System.out.println(methodReturn());

        System.out.println(sum(10,20));

        printArr(new int[] {1,2,3,4,5,6,7});
        System.out.println();
        printArr2(new int[] {1,2,3,4,5,6,7});
        System.out.println();


        int[] arr = new int[]{1,20,3,4,5};
        int resultMax = searcMax(arr);
        System.out.println("Max: " + resultMax);
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static void printArr2(int ...nums) { //тоже самое что и массив. Говорит о том, что мы можем предоставить ии массив или ничего не отправить
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int searcMax(int ...nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return max;

    }

}
