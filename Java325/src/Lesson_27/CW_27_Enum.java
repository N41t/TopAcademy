package Lesson_27;

import javax.crypto.spec.PSource;

//����: Enum
//Enum - ������ �������� ��������� ���������� �������������������
//�������� enum �������� ������!
//� enum �� default �������� ���������� � ���� (seasons.ordinal() - ordinal ��������� ���������� ����� enum)
//enum - ��������� ��� ������. �� �� �������� �� ����������, �� ���������.
public class CW_27_Enum {
    public static void main(String[] args) {
        Seasons seasons = Seasons.LETO; //�������� �������
        System.out.println(seasons);

        switch (seasons)
        {
            case LETO:
                System.out.println("I I A");
                break;
            case OSEN:
                System.out.println("S O N");
                break;
            case ZIMA:
                System.out.println("D Y F");
                break;
            case VESNA:
                System.out.println("M A M");
                break;
        }

        //��� ��������
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.println(Seasons.values()[i]);
        }

        //��� �������� (������������������ ��������)
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.println(Seasons.values()[i].ordinal());
        }

        System.out.println("\n");
        Game game = Game.UP;
        System.out.println(game);//����� �������� ��� �� ��������, � ��� ��������


    }


}

enum Seasons{
    ZIMA,
    VESNA,
    LETO,
    OSEN
}

enum Game {
    //enum ����� ����� �������� (����� �����������)
    UP("w"),
    DOWN("s"),
    LEFT("a"),
    RIGHT("d");

    //������� �����������
    private String symbol;

    Game(String symbol) {
        this.symbol = symbol;
    }
}
