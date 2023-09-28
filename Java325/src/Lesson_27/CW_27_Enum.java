package Lesson_27;

import javax.crypto.spec.PSource;

//“ема: Enum
//Enum - группа констант св€занна€ логической последовательностью
//«начени€ enum заменить нельз€!
//¬ enum по default значени€ начинаютс€ с нул€ (seasons.ordinal() - ordinal указывает пор€дковый номер enum)
//enum - отдельный тип данных. ќн не €вл€етс€ ни примитивом, ни ссылочным.
public class CW_27_Enum {
    public static void main(String[] args) {
        Seasons seasons = Seasons.LETO; //создание объекта
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

        //¬се значени€
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.println(Seasons.values()[i]);
        }

        //¬се значени€ (последовательность индексов)
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.println(Seasons.values()[i].ordinal());
        }

        System.out.println("\n");
        Game game = Game.UP;
        System.out.println(game);//будет печатать уже не название, а его значение


    }


}

enum Seasons{
    ZIMA,
    VESNA,
    LETO,
    OSEN
}

enum Game {
    //enum может иметь значение („ерез конструктор)
    UP("w"),
    DOWN("s"),
    LEFT("a"),
    RIGHT("d");

    //создаем конструктор
    private String symbol;

    Game(String symbol) {
        this.symbol = symbol;
    }
}
