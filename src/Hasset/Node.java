package Hasset;

public class Node<T, Y> {
    private T key;
    private Y values;

    public Node(T key, Y values) {
        this.key = key;
        this.values = values;
    }

    public T getKey() {
        return key;
    }

    public Y getValue() {
        return values;
    }
}
