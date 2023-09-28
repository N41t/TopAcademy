package Lesson_11;

public class CW_11 {
    public static void main(String[] args) {
        //Назначение многомерного массива - для работы с таблицами, матрицами. Тетрис - 1 длина, 2 ширина, 3 цвет
        int[] arr = {1,2,3,4,5};
//        int[][] arr2 = new int[2][3]; //1-строка, 2-столбец
//        arr2[0] = new int[5];
//        arr2[1] = new int[3];
//        arr2[2] = new int[5];


        int[][] arr2 = {{10,22,300},{44,5,1},{7,8,9,9}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); //вывод каждого элемента каждого блока (главная диагональ)
        }

        //инициализация трехмерного массива
        int[][][] arr3 =
                {
                        {
                                {1,2,3,4},
                                {1,2,3,4}
                        }
                };
    }
}
