package generics;

public interface INode<T> {
    public Node<T> nextNode();
    public void setNext(Node<T> node);
    public Node<T> getNext();
    public T getValue();
    public void SetValue(T value);
}
