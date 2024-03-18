package final1;
/*
이렇게 숫자로 작성할 경우 다른 개발자가 봤을 때 숫자의 의도를 파악하기 힘듬
상수를 사용하면 한눈에 어떤 것을 의미하는지 알 수 있음.
 */
public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount){
        System.out.println("참여자 수 :" + currentUserCount);
        if (currentUserCount > 1000){
            System.out.println("대기자로 등록");
        }
        else {
            System.out.println("게임에 참여합니다");
        }
    }
}
