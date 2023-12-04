public class SpecialInt {
    public final int value;
    public SpecialInt(final int value) {
        this.value = value;
    }

    public String doSomething() {
        return "Hello";
    }

    public SpecialInt returnSame() {
        return this;
    }

    public int getValue() {
        return value;
    }
}

        
