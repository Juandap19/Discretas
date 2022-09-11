package generics;

public class Node<T> implements INode<T>{
    //--------------------------------------------- Elements
    private T value;
    private Node<T> next;

    //--------------------------------------------- Methods
    @Override
    public Node<T> nextNode() {
        return next;
    }

    @Override
    public void setNext(Node<T> node) {
        this.next = node;
    }

    @Override
    public Node<T> getNext() {
        return next;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void SetValue(T value) {
        this.value = value;
    }

    //--------------------------------------------- Contructor
    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }
}
