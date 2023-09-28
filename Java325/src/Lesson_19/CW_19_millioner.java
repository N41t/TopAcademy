package Lesson_19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//���� ��� ����� ����� ����������� �� ����� ������������:
//50/50
//
//������ �����
//
//������ ���� - ��������� �����
//
//�������� 5

//����� ���������� ���������������
public class CW_19_millioner {
    public static Scanner scanner = new Scanner(System.in);
    public static int count = 1;
    public static int cash = 0;

    private static ArrayList mass = new ArrayList(); //��������� �������� ������


    public static void main(String[] args) {

        startGame();

        while (true) {
            questions();

            answer();
        }


    }

    public static void startGame() {
        System.out.println("����������� ��� � ���� ��� ����� ����� �����������! " +
                "\n� ��� ����� 5 ��������. �� ������ ������ ����� �� ������ �������� 10.000. " +
                "\n��� ������ �� ��� 5 �������� �� �������� 50.000.\n");

        System.out.println("1 - ������ ���� \n2 - �����");


        while (true) {
            System.out.print("����: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.println("�� ������ ����");
                break;
            } else if (enter == 2) {
                System.exit(1);
            }
            System.out.println("�� ����� �������� �����, ������� ������");
        }

    }

    public static void questions() {

        switch (count) {
            case 1:
                System.out.println("����� �������� ���������� �� ����� ����?");
                break;
            case 2:
                System.out.println("����� ����� �������� ����������� ������� �������� ���� ������?");
                break;
            case 3:
                System.out.println("��� �������� ������, ��������� ���� ���������� �����?");
                break;
            case 4:
                System.out.println("� ���� ������� ���������� �� ������� ��� � �����, �� ����������� � ������?");
                break;
            case 5:
                System.out.println("��� ���������� ��������� � ����� ������");
                break;
        }
    }

    //�� ������ ��������� count ����� ������ �� ������
    public static void answer() {


        switch (count) {
            case 1:
                System.out.println("1)��� ���������\n2)��� ���������\n3)��� ���������\n4)��� �������");
                break;
            case 2:
                System.out.println("1)������� �����\n2)����� ������\n3)������ �������\n4)������ ��������");
                break;
            case 3:
                System.out.println("1)�����\n2)���\n3)��������\n4)����");
                break;
            case 4:
                System.out.println("1)� �����\n2)� �����\n3)� ������\n4)� ����");
                break;
            case 5:
                System.out.println("1)��������� ��������\n2)������\n3)��������\n4)������");
                break;
        }


        while (true) {
            System.out.println("\n����� ������� ������, ������ �� ��������������� �����������: \n1)50/50\n2)������ ����\n3)������ �����\n4)��� �������\n");
            System.out.print("�������� ���������: ");
            int answer = scanner.nextInt();

            if (answer < 1 || answer > 4) {
                while (answer < 1 || answer > 4) {
                    System.out.println("\n�� ����� �������� ��������. ������� �������� �� 1 �� 4\n");
                    System.out.print("�������� ���������: ");
                    answer = scanner.nextInt();
                }
            }

            if (mass.contains(answer)) {
                while (mass.contains(answer)) {
                    System.out.println("�� ��� ������������ ��� ���������");
                    System.out.print("�������� ���������: ");
                    answer = scanner.nextInt();
                }

            }


            if (answer == 1) {


                mass.add(answer);
                fiftyFifty();


            } else if (answer == 2) {



                mass.add(answer);
                hallHelp();
                break;

            } else if (answer == 3) {


                mass.add(answer);
                callFriend();
                break;

            } else if (answer == 4) {
                break;
            }


        }



        while (true) {

            System.out.print("�������� �����: ");
            int answer = scanner.nextInt();


            if (answer < 1 || answer > 4) {
                System.out.println("\n�� ����� �������� ��������. ������� �������� �� 1 �� 4\n");
                break;
            }

            if (count == 1 && answer == 2) {
                System.out.println("\n������ ����� �� 1 ������\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 2 && answer == 1) {
                System.out.println("\n������ ����� �� 2 ������\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 3 && answer == 3) {
                System.out.println("\n������ ����� �� 3 ������\n");
                System.out.println("\n-----------------------------------------------------------------------------");

                count++;
                cash+=10000;
                break;
            } else if (count == 4 && answer == 3) {
                System.out.println("\n������ ����� �� 4 ������\n");
                System.out.println("\n-----------------------------------------------------------------------------");
                count++;
                cash+=10000;
                break;
            } else if (count == 5 && answer == 2) {
                System.out.println("\n������ ����� �� 5 ������\n");
                cash+=10000;
                System.out.println("�����������! �� �������� ����� �� ��� �������! ��� ������� �������� "+cash+" ���. �� ����� ������!");
                System.exit(1);
            } else {
                System.out.println("�� �������� �������. ��� ������� "+cash+" ���. �� ����� ������!");
                System.exit(1);
            }
        }



    }

    public static void fiftyFifty() {

        switch (count) {
            case 1:
                System.out.println("2)��� ���������\n3)��� ���������");
                break;
            case 2:
                System.out.println("1)������� �����\n4)������ ��������");
                break;
            case 3:
                System.out.println("2)���\n3)��������\n");
                break;
            case 4:
                System.out.println("2)� �����\n3)� ������\n");
                break;
            case 5:
                System.out.println("1)��������� ��������\n2)������");
                break;
        }
    }

    public static void callFriend() {
        Random random = new Random();
        int helpAnswer = random.nextInt(4);
        System.out.println("�������, ���������� ����� " + helpAnswer);
    }

    public static void hallHelp() {
        Random random = new Random();
        int helpAnswer = random.nextInt(4);
        System.out.println("���������� ����� " + helpAnswer);

    }


}


