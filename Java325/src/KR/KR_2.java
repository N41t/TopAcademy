package KR;

public class KR_2 {
    public static void main(String[] args) {
        int[] arr = {22, 66, 33, 77, -5, 234, 12, 500, -99, -564}; //ищем 77
        int[] arr1 = {1,4,5,7,8,12,14,15,15,15,15,900};
        int[] arr2 = {-1,0,5,7,8,12,14,15,15,15,15,900};


        // Сортировка ->
        sortUp(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        //Сортировка <-
        sortDown(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        //Поиск элемента в массиве с начала. Сначала возвращает сам элемент, иначе -1
        System.out.println(searchNumLeftRight(arr, 77));

        //Поиск элемента в массиве с конца. Сначала возвращает сам элемент, иначе -1
        System.out.println(searchNumRightLeft(arr, 77));

        //Поиск элемента в массиве с начала. Возвращает индекс элемента, иначе -1
        System.out.println(searchIndexNumLeftRight(arr, 77));

        //Поиск элемента в массиве с конца. Возвращает индекс элемента, иначе -1
        System.out.println(searchIndexNumRightLeft(arr, 77));

        //Поиск элемента в массиве возвращает true если элемент есть и false, если элемнт отсутствует
        System.out.println(searchNumBoolean(arr, 77));

        //**Функция принимает два массива и возвращает новый массив, который объединяет 2 массива
        int[] arr3 = test(arr1, arr2);
        for(int i = 0; i < arr3.length-1; i++) {
            System.out.print(arr3[i] + ", ");
        }
    }




    public static int[] sortUp(int[] arr) {

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

    public static int[] sortDown(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        return arr;
    }

    public static int searchNumLeftRight(int[] arr, int num) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                answer =  arr[i];
                break;
            } else {
                answer = -1;
            }

        }
        return answer;
    }

    public static int searchNumRightLeft(int[] arr, int num) {
        int answer = 0;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == num) {
                answer =  arr[i];
                break;
            } else {
                answer = -1;
            }

        }
        return answer;
    }

    public static int searchIndexNumLeftRight(int[] arr, int num) {
        int answer = 0;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == num) {
                answer = i;
                break;
            } else {
                answer = -1;
            }

        }
        return answer;
    }

    public static int searchIndexNumRightLeft(int[] arr, int num) {
        int answer = 0;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == num) {
                answer = (arr.length -1) -i;
                break;
            } else {
                answer = -1;
            }

        }
        return answer;
    }

    public static boolean searchNumBoolean(int[] arr, int num) {
        boolean answer = false;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == num) {
                answer = true;
                break;
            } else {
                answer = false;
            }

        }
        return answer;
    }

    public static int[] test(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr1[i] < arr2[i] && arr1[i] < arr2[i+1]) {
                arr3[i] = arr1[i];
            } else if (arr1[i] < arr2[i] && arr1[i] > arr2[i+1]) {
                arr3[i] = arr2[i + 1];
            }else if (arr1[i] > arr2[i] && arr2[i] < arr1[i+1]) {
                arr3[i] = arr2[i];
            } else if (arr1[i] > arr2[i] && arr2[i] > arr1[i+1]) {
                arr3[i] = arr1[i+1];
            } else {
                arr3[i] = arr2[i];
            }
        }
        return arr3;
    }
}
