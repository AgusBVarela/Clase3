package TTPrecedable;

public interface Precedable<T> {
    public int precedeA(T t);

    //boolean precedeA(Precedable<T> tPrecedable);

    @Override
    String toString();
}
