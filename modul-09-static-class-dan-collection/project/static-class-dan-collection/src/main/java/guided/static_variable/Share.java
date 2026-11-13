package guided.static_variable;

public class Share {
    private int privateInt;
    private static int staticInt;

    public Share(int pr, int si) {
        this.privateInt = pr;
        staticInt = si;
    }

    @Override
    public String toString() {
        return this.privateInt + " " + staticInt;
    }
}

