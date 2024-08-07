package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User user1 = new User();
        pack.b.User user2 = new pack.b.User();
    }
}

/*
 * 패키지 규칙
 *
 * - 패키지 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다. (필수)
 * - 패키지 이름은 모두 소문자를 사용한다. (관례)
 * - 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다. (관례)
 *   - 이 부분은 필수는 아니다. 하지만 수 많은 외부 라이브러리가 함께 사용되면 같은 패키지에 같은 클래스 이름이 존재할 수도 있다.
 *     이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
 *   - 내가 오픈소스 라이브러리를 만들어서 외부에 제공한다면 꼭 지키는 것이 좋다.
 *   - 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제가 되지 않는다.
 */
