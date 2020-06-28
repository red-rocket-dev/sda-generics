package pl.sda;

public class Node<E extends Car> {
    private Node<E> next;
    private E value;

    public Node() {
        //tak sie nie da:
        //value = new E();
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}
