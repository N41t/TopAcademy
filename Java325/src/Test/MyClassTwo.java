package Test;

import java.util.Objects;

public class MyClassTwo {
    public static String newField = "New field outside";


    public String getNewField() {
        return newField;
    }

//    public void printField() {
//        newField = "New variable field";
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClassTwo that = (MyClassTwo) o;
        return Objects.equals(newField, that.newField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newField);
    }
}
