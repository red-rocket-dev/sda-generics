package pl.sda;

public class NodeInteger {
    private NodeInteger next;
    private Integer value;

    public NodeInteger getNext() {
        return next;
    }

    public void setNext(NodeInteger next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}
