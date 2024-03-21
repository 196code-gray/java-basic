package extends1.access.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super();
        System.out.println("ClassB 생성자a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자a=" + a + " b=" + b);
    }
}
