package hasing_techniques;

public class StringHashing {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("HashCode of '" + str + "': " + str.hashCode());

        String anotherStr = "World";
        System.out.println("HashCode of '" + anotherStr + "': " + anotherStr.hashCode());
    }
}
