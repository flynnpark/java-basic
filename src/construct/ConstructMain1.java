package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("Member 1", 18, 90);
        MemberConstruct member2 = new MemberConstruct("Member 2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(
                    "이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}

/*
 * 생성자 장점
 * 중복 호출 제거: 생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 메서드를 직접 한 번 더 호출해야 했다. 생성자 덕분에 객체를 생성하면서
 * 동시에 생성 직후에 필요한 작업을 한 번에 처리할 수 있게 되었다.
 *
 * 제약 - 생성자 호출 필수: 생성사 등장 전에는 실수로 메서드를 호출하지 않을 수 있다. 하지만 메서드를 호출하지 않아도 프로그램은 동작하고, 필요한
 * 데이터 없이 프로그램이 동작하게 된다. 생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 **직접 정의한 생성자를 반드시 호출**해야
 * 한다는 점이다.
 *
 * **생성자를 사용하면 필수값 입력을 보장할 수 있다.**
 *
 * 참고: 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
 */
