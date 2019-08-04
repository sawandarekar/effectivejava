package chapter4;

public class ImmutableClassTest {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass();
        //immutableClass.s = "gone";
    }
}

final class ImmutableClass {

    private final String s = "goto";
}