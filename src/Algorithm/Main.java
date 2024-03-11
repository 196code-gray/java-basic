package Algorithm;

public class Main {
    public static void main(String[] args) {
        ArrList<String> s = new ArrList<>();
        s.insertLast("apple");   s.print(); s.insertLast("orange"); s.print();
        s.insertLast("cherry");  s.print(); s.insertLast("pear"); s.print();
        s.insert("grape", 1); s.print(); s.insert("lemon", 4); s.print();
        s.insertLast("kiwi"); s.print();
        s.delete(4); s.print(); s.delete(0); s.print();
        s.delete(0); s.print(); s.delete(3); s.print();
        s.delete(0); s.print();

        System.out.println("1번째 항목은 " + s.peek(1)+ "이다");

        System.out.println("====================================================");

        SList<String> ss = new SList<>();
        ss.insertFront("orange"); ss.insertFront("apple");
        ss.insertAfter("cherry", ss.head.getNext());
        ss.insertFront("pear");

        ss.print();
        System.out.println(": ss의 길이 = " + ss.size());
    }
}
