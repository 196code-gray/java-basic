package extends1.access.super2;

public class Super2Main {
    /*
    C 생성자에 super로 B를 부름.
    B생성자에 A생성자 부름
    초기화는 최상위 부모부터 이루어짐.
     */
    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}