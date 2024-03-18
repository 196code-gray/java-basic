package final1;
/*
상수는 관례적으로 대문자를 사용
변수를 여러곳에서 공유해서 사용하는 경우 유용하게 사용할 수 있음.
 */
public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount){
        System.out.println("참여자 수 :" + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS){
            System.out.println("대기자로 등록");
        }
        else {
            System.out.println("게임에 참여합니다");
        }
    }
}
