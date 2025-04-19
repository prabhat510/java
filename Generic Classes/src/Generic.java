public class Generic<T1, T2> {

    T1 key;
    T2 value;
    public void put(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }
}

