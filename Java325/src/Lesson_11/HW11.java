package Lesson_11;

public class HW11 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};
        int arr1[] = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};


        //1) Вывести кол-во четных
        System.out.println(even(arr));

        //2) Вывести кол-во нечетных
        System.out.println(odd(arr));

        //3) Вывести кол-во положительных чисел
        System.out.println(evenNums(arr));

        //4) Вывести кол-во отрицательных чисел
        System.out.println(oddNums(arr));

        //5)Вывести сумму всех чисел
        System.out.println(sumAllNums(arr));

        //6)Вывести сумму всех четных чисел
        System.out.println(sumAllEvenNums(arr));

        //7)Вывести сумму всех нечетных чисел
        System.out.println(sumAllOddNums(arr));

        //8)Вывести минимальное значение
        System.out.println(minValue(arr));

        //9)Вывести максимальное значение
        System.out.println(maxValue(arr));

        //10)Вывести индекс минимального значения
        System.out.println(minValueIndex(arr1));

        //11)Вывести индекс максимального значения
        System.out.println(maxValueIndex(arr1));

        //12)Вывести среднеарифметическое число
        System.out.println("Среднеарифметическое число: " + avg(arr));

        //13)Вывести кол-во дузначных чисел
        System.out.println(numOfTwo_digitNumbers(arr));

        //14)Вывести кол-во трехзначных чисел
        System.out.println(numOfThree_digitNumbers(arr));

        //15)Вывести кол-во однозначных чисел:
        System.out.println(numOfOne_digitNumbers(arr));

        //16)Вывести сумму всех однозначных четных чисел:
        System.out.println(sumOfOne_digitNumbers(arr));

        //17)Вывести сумму двухзначных четных чисел
        System.out.println(sumOfTwo_digitNumbers(arr));


    }

        public static String even(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
             return "Кол-во четных чисел: " + count;
        }

        public static String odd(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            }
            return "Кол-во нечетных чисел: " + count;
        }

        public static String evenNums(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    count++;
                }
            }
            return "Кол-во положительных чисел: " + count;
        }

        public static String oddNums(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    count++;
                }
            }
            return "Кол-во отрицательных чисел: " + count;
        }

        public static String sumAllNums(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                count = count + arr[i];
            }
            return "Сумма всех чисел: " + count;
        }

        public static String sumAllEvenNums(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count = count + arr[i];
                }
            }
            return "Сумма всех четных чисел: " + count;
        }

        public static String sumAllOddNums(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count = count + arr[i];
                }
            }
            return "Сумма всех четных чисел: " + count;
        }

        public static int[] sort(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int num = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = num;
                    }
                }
            }

            return arr;
        }

        public static String minValue(int[] arr) {
           sort(arr);
             return "Минимальное значение: " + arr[0];
        }

        public static String maxValue(int[] arr) {
            sort(arr);
            return "Максимальное значение: " + arr[arr.length - 1];
        }

        public static String minValueIndex(int[] arr1) {
            String answer = "";
            int[] arrCopy = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arrCopy[i] = arr1[i];
            }
            sort(arr1);


            for (int i = 0; i < arrCopy.length; i++) {
                if (arrCopy[i] == arr1[0]) {
                    answer = "Индекс минимального значения: " + i;
                }
            }
            return answer;
        }

    public static String maxValueIndex(int[] arr1) {
        String answer = "";
        int[] arrCopy = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrCopy[i] = arr1[i];
        }
        sort(arr1);


        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i] == arr1[arr1.length - 1]) {
                answer = "Индекс максимального значения: " + i;
            }
        }
        return answer;
    }

    public static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }

    public static String numOfTwo_digitNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10 && arr[i] < 100) || (arr[i] <= -10 && arr[i] > -100)) {
                count++;
            }
        }
        return "Кол-во двухзначных чисел: " + count;
    }

    public static String numOfThree_digitNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 100 && arr[i] < 1000) || (arr[i] <= -100 && arr[i] > -1000)) {
                count++;
            }
        }
        return "Кол-во трехзначных чисел: " + count;
    }

    public static String numOfOne_digitNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 0 && arr[i] < 10) || (arr[i] <= 0 && arr[i] > -10)) {
                count++;

            }
        }
        return "Кол-во однозначных чисел: " + count;
    }

    public static String sumOfOne_digitNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 0 && arr[i] < 10) || (arr[i] <= 0 && arr[i] > -10)) {
                if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
                }

            }
        }
        return "Сумма всех однозначных четных чисел: " + sum;
    }

    public static String sumOfTwo_digitNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10 && arr[i] < 100) || (arr[i] <= -10 && arr[i] > -100)) {
                if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
                }
            }
        }
        return "Сумма двухзначных чисел: " + sum;
    }











}
