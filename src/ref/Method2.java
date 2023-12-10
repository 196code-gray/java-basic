package ref;

public class Method2 {
    public static void main(String[] args) {
        // Method1 리팩토링
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }
    // Student에 대한 인스턴스(객체)를 메서드를 통해 생성
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();    // 새로운 참조값 대입
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }
    // 중복으로 출력해주는 부분 메서드로 한번에
    static void printStudent (Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
