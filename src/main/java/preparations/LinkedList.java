package preparations;

public class LinkedList {
    private Element first;
    public LinkedList(){
        Element element4 = new Element(null, 4);
        Element element3 = new Element(element4, 3);
        Element element2 = new Element(element3, 2);
        Element element1 = new Element(element2, 1);
        first = element1;
    }
    public void print(){
        Element element = first;
        while(element != null){
            System.out.println(element);
            element = element.getNext();
        }
    }
    public void revers(){
        Element previous = null;
        Element element = first;
        while(element != null){
            Element next = element.getNext();
            element.setNext(previous);
            previous = element;
            element = next;
        }
        first = previous;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.print();
        linkedList.revers();
        linkedList.print();
    }
}

