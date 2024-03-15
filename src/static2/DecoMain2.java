package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        // static 메서드로 만든 후 따로 객체 생성 x
        String deco = DecoUtil2.deco(s);

        System.out.println("before: "  + s);
        System.out.println("after: "  + deco);
    }
}