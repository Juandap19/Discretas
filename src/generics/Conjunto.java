package generics;

public class Conjunto<T> implements IConjunto<T> {
    //--------------------------------------------- Elements

    private String name;
    private Node<T> node;

    //--------------------------------------------- Contructor
    public Conjunto(){

    }

    public Conjunto(Node<T> node){
        this.node = node;
    }

    //--------------------------------------------- methods Interface
    @Override
    public String getNombre() {
        return null;
    }

    public Node<T> getNode(){
        return node;
    }

    @Override
    public int cardinalidad() {
        int total= 0;
        boolean flag = true;
        Node<T> current = this.node;

        while(flag){
            if(current == null){
                flag = false;
            }else{
                total++;
                current = current.getNext();
            }
        }
        return total;
    }

    @Override
    public Conjunto<T> union(Conjunto<T> conjunto,Conjunto<T> conjunto2) {
        Conjunto<T> result = new Conjunto();
        Node<T> current = this.node;
        while(current!=null){
            result.agregarElemento(union(conjunto, current.getValue()));
            current = current.getNext();
        }
        Node <T> current2 = conjunto.getNode();
        while (current2!=null){
            result.agregarElemento(union(conjunto2,current2.getValue()));
            current2=current2.getNext();
        }

        return result;
    }
    private T union(Conjunto<T> conjunto, T current){
        Node<T> theNode = conjunto.getNode();
        T a=null;
        while(theNode != null){
            if (current != theNode.getValue()) {
                a = current;
            }
            theNode = theNode.getNext();
        }
        return a;
    }

    @Override
    public Conjunto<T> interseccion(Conjunto<T> conjunto) {
        Conjunto<T> result = new Conjunto<>();
        Node<T> current = this.node;
        while(current != null){
            result.agregarElemento(interseccion(conjunto, current.getValue()));
            current = current.getNext();
        }

        return result;
    }

    private T interseccion(Conjunto<T> conjunto, T current) {
        Node<T> theNode = conjunto.getNode();
        while(theNode != null) {
            if (current == theNode.getValue()) {
                return current;
            }
            theNode = theNode.getNext();
        }
        return null;
    }

    public Conjunto<T> diferencia(Conjunto<T> conjunto) {
        Conjunto<T> result=new Conjunto<>();
        Node<T> current = this.node;
        while(current!=null){
            result.agregarElemento(diferencia(conjunto, current.getValue()));
            current = current.getNext();
        }

        return result;
    }
    private T diferencia(Conjunto<T> conjunto, T current){
        Node<T> theNode = conjunto.getNode();
        T a=null;
        while(theNode != null){
            if (current != theNode.getValue()) {
                a = current;
            }else{
                return null;
            }
            theNode = theNode.getNext();
        }
        return a;
    }

    public Conjunto<T> diferenciaSimentrica(Conjunto<T> conjunto) {
        Conjunto<T> result = new Conjunto<>();
        Node<T> current = this.node;
        while(current != null){
            result.agregarElemento(diferenciaSimetrica(conjunto, current.getValue()));
            current = current.getNext();
        }

        Node <T> current2 = conjunto.getNode();
        while (current2!=null){
            result.agregarElemento(diferenciaSimetrica(conjunto,current2.getValue()));
            current2=current2.getNext();
        }
        return result;
    }
    private T diferenciaSimetrica(Conjunto<T> conjunto,T current){
        Node<T> theNode = conjunto.getNode();
        T a=null;
        while(theNode != null){
            if (current != theNode.getValue()) {
                return current;
            }
            if(current==theNode.getValue())
                return null;
            theNode = theNode.getNext();

        }
        return null;
    }

    //----------------------------------------------- Para agregar un nuevo elemento al conjunto
    @Override
    public void agregarElemento(T value) {
        if(value != null) {
            agregarElemento(this.node, value);
        }
    }
    private void agregarElemento(Node<T> current, T value){
        if(this.node == null){
            this.node = new Node<>(value, null);
            return;
        }else if(current.getValue() == value){
            return;
        }else if(current.getNext() == null){
            current.setNext(new Node(value, null));
        }else {
            agregarElemento(current.getNext(), value);
        }
    }

    public String toString(){
        String s = "{";
        Node<T> current = this.node;
        while(current != null){
            s += current.getValue() + ",";
            current = current.getNext();
        }

        return s+"}";
    }

}