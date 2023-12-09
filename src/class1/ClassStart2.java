package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 17};
        int[] studentGrade = {90, 50};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrade[i]);
        }

        /*
        배열 사용의 한계
        데이터를 변경할 때 조심해야 됨.
        예 ) 학생 1의 데이터를 제거하는데 정확하게 1의 위치를 맞춰서 삭제해야 함.
         */
    }
}
