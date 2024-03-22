package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("child.value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> child");
        System.out.println("poly = " + poly.value);
        poly.method();  // 메서드 오버라이딩 가능
    }
    /*
    오버라이딩 메서드는 항상 우선권을 가진다.
    따라서 Parent에 method가 있어도 현 인스턴스에 하위 객체가 있고, 오버라이딩 된 메서드가 있는 경우
    오버라이딩 된 메서드가 더 우선권을 가지므로 child 메서드가 실행됨.
     */
}
