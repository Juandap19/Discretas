package generics;

public interface IConjunto<T> {
    public String getNombre();

    public int cardinalidad();

    public Conjunto<T> union(Conjunto<T> conjunto, Conjunto<T> conjunto2);
    public Conjunto<T> interseccion(Conjunto<T> conjunto);
    public Conjunto<T> diferencia(Conjunto<T> conjunto);
    public Conjunto<T> diferenciaSimentrica(Conjunto<T> conjunto);
    public void agregarElemento(T value);
}
