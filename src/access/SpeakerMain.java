package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeDown();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;
        speaker.showVolume();
    }
}

/*
 * 접근 제어자의 종류
 * - private: 모든 외부 호출을 막는다.
 * - default(package-private): 같은 패키지 안에서 호출은 허용한다.
 * - protected: 같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
 * - public: 모든 외보 호출을 허용한다.
 *
 * package-private
 * 접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 default 접근 제어자가 적용된다.
 * default라는 용어는 해당 접근 제어자가 기본값으로 사용되기 때문에 붙여진 이름이지만, 실제로는
 * package-private가 더 정확한 표현이다. 왜냐하면 해당 접근 제어자를 사용하는 멤버는 동일한 패키지
 * 내의 다른 클래스에서만 접근이 가능하기 때문이다. 참고로 두 용어를 함께 사용한다.
 *
 * 접근 제어자의 핵심은 속성과 기능을 외부러부터 숨기는 것이다.
 * - private은 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
 * - default는 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
 * - protected는 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
 * - public은 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
 */
