/**
 * Created by philhannant on 18/01/2016.
 */
class Storage<T> {
    T x;
    public void setValue(T value) {
        x = value;
    }
    public T getValue() {
        return x;
    }
}
