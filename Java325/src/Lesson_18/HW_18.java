package Lesson_18;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//����������� ���� �������� ������
//1) ����� ������� - �������
//������������ X ������ ���� , ������������ Y ������ ����
//
//*2) ����� ������� - ����������
//������������ X ������ ���� , ��������� Y ������ ����
public class HW_18 {
    private static Scanner scanner = new Scanner(System.in);
    private static int crossOrZero; //0 - ����, 1 - �����

    private static int enter;
    private static int enter2;

    private static ArrayList mass = new ArrayList();//������ ����� ������� ��� ���� �������

    private static char[] arr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
//    private static String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};


    public static void main(String[] args) {

        startGame();
        printBoard(arr);

        while (true) {

            if (winCrossOrZero() == 1) {
                System.out.println("\n������ ���������");
                break;
            } else if (winCrossOrZero() == 0) {
                System.out.println("\n������ �������");
                break;
            } else if (winCrossOrZero() == 2) {
                System.out.println("\n�����");
                break;
            }

            hod1();

            if (winCrossOrZero() == 1) {
                System.out.println("\n������ ���������");
                break;
            } else if (winCrossOrZero() == 0) {
                System.out.println("\n������ �������");
                break;
            } else if (winCrossOrZero() == 2) {
                System.out.println("\n�����");
                break;
            }
            
            hod2();
        }

        System.out.println("����� ����!");


    }

    public static void printBoard(char[] arr) {


        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            System.out.print(" " + arr[i]);
            if (i == 2 || i == 5 || i == 8) System.out.print(" ");
            else System.out.print(" | ");

            if (j%3==0 && j<7) {
                System.out.println("\n-------------");
            }
        }
    }


    public static void hod1() {
        System.out.println("\n\n������ �����, ������� ����� �������: ");


        while (true) {
            enter = scanner.nextInt();

            while (true) {

                if(mass.contains(enter)) {
                    System.out.println("�� ����� �������, ������� ��� ������, ������� ������");
                } else {
                    break;
                }
                enter = scanner.nextInt();
            }

            if (enter > 0 && enter < 10 && crossOrZero == 1){
                arr[enter-1] = 'X';
                mass.add(enter);
                break;
            } else if (enter > 0 && enter < 10 && crossOrZero == 0) {
                arr[enter-1] = 'O';
                mass.add(enter);
                break;
            }
            System.out.println("�� ����� �������� �����, ������� ������");

        }

        printBoard(arr);
    }

    public static void hod2() {
        System.out.println("\n\n������ �����, ������� ����� �������: ");

        while (true) {
            enter2 = scanner.nextInt();

            while (true) {
                if(mass.contains(enter2)) {
                    System.out.println("�� ����� �������, ������� ��� ������, ������� ������");
                } else {
                    break;
                }
                enter2 = scanner.nextInt();
            }

            if (enter2 > 0 && enter2 < 10 && crossOrZero == 1){
                arr[enter2-1] = 'O';
                mass.add(enter2);
                break;
            } else if (enter2 > 0 && enter2 < 10 && crossOrZero == 0) {
                arr[enter2-1] = 'X';
                mass.add(enter2);
                break;
            }
            System.out.println("�� ����� �������� �����, ������� ������");


        }

        printBoard(arr);
    }

    public static void startGame() {
        //������ ����
        System.out.println("����� ���������� � ���� ��������-������!");
        System.out.println("������� ����: ������ ���������� ������ �������� ��� ������ � ������ ������������ ������.\n���� - 3 �������� ��� 3 ������ �� �����������, ��������� ��� ���������. � ���� ���������� - ��� � �������.");
        System.out.println("�������� �����: \n1) ������ ����\n2) ����� �� ����");
        System.out.print("����: ");

        while (true) {
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("�� ������ ����");
                break;
            } else if (enter == 2) {
                System.exit(1);
            }
            System.out.println("�� ����� �������� �����, ������� ������");
        }

        System.out.println("�������� ��� ����� ������� ������ �����: \n1)��������\n2)������");

        while(true) {
            int enter = scanner.nextInt();
            if (enter == 1) {
                //���������� ����� ���������
                crossOrZero = 1;
                System.out.println("������ ����� ������ ��������, ������ ����� ������ ������");
                break;
            } else if (enter == 2) {
                //���������� ����� �������
                crossOrZero = 0;
                System.out.println("������ ����� ������ ������, ������ ����� ������ ��������");
                break;
            }
            System.out.println("�� ����� �������� �����, ������� ������");
        }

        System.out.println("\n���� ��������!\n");

    }

    public static int winCrossOrZero() {

        if((arr[0] == 'X' && arr[4] == 'X' && arr[8] == 'X')
               || (arr[6] == 'X' && arr[4] == 'X' && arr[2] == 'X')
               || (arr[0] == 'X' && arr[3] == 'X' && arr[6] == 'X')
               || (arr[0] == 'X' && arr[1] == 'X' && arr[2] == 'X')
               || (arr[2] == 'X' && arr[5] == 'X' && arr[8] == 'X')
               || (arr[6] == 'X' && arr[7] == 'X' && arr[8] == 'X')
               || (arr[3] == 'X' && arr[4] == 'X' && arr[5] == 'X')
               || (arr[1] == 'X' && arr[4] == 'X' && arr[7] == 'X')){
            return 1; //������ ���������
            } else if ((arr[0] == 'O' && arr[4] == 'O' && arr[8] == 'O')
                || (arr[6] == 'O' && arr[4] == 'O' && arr[2] == 'O')
                || (arr[0] == 'O' && arr[3] == 'O' && arr[6] == 'O')
                || (arr[0] == 'O' && arr[1] == 'O' && arr[2] == 'O')
                || (arr[2] == 'O' && arr[5] == 'O' && arr[8] == 'O')
                || (arr[6] == 'O' && arr[7] == 'O' && arr[8] == 'O')
                || (arr[3] == 'O' && arr[4] == 'O' && arr[5] == 'O')
                || (arr[1] == 'O' && arr[4] == 'O' && arr[7] == 'O')){
            return 0; //������ �������
        } else if (mass.size() == 9){
            return 2;
        } else {
            return 3;
        }
    }




}
