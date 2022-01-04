public class Box<T> {
    private T something;

    public void set(T object) {
        this.something = object;
    }

    public T get() {
        return something;
    }
}

public class PhoneBox<T extends Phone> extennds Box<T>{
    public void handsFreeCall(String numberString){
        object.call(numberString);
    }
}
