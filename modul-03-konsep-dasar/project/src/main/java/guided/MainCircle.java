package guided;

public class MainCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 7.0;
        System.out.printf("Jari-jari        : %.1f%n", c.r);
        System.out.printf("Luas             : %.5f%n", c.area());
        System.out.printf("Keliling         : %.5f%n", c.circumference());
        System.out.printf("PI (class field) : %s%n", Circle.PI);
    }
}
