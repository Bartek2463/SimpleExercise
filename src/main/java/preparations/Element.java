package preparations;

public class Element {
    private Element next;
    private final int value;


    public Element(Element next, int value) {
        this.next = next;
        this.value = value;
    }
    public Element getNext() {
        return next;
    }
    public void setNext(Element next) {
        this.next = next;
    }
    public int getValue() {
        return value;
    }
}

