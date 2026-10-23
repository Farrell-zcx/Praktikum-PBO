package guided.guided1;

public class Demo {
    public static void main(String[] args) {
        
        A superClass = new A();
        B subClass = new B();

        superClass.x = 3;
        superClass.y = 4;

        System.out.println("superclass: ");
        superClass.tampilXY();

        subClass.x = 1;
        subClass.y = 2;
        subClass.z = 5;

        System.out.println("subclass: ");
        subClass.tampilXYZ();
    }
}