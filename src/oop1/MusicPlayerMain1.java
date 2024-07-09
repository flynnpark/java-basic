package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args){
        int volume = 0;
        boolean isPlaying = false;

        // 음악 플레이어 켜기
        isPlaying = true;
        System.out.println("음악 플레이어를 켭니다.");

        // 볼륨 증가
        volume++;
        System.out.println("볼륨을 1 증가시킵니다.");

        // 볼륨 증가
        volume++;
        System.out.println("볼륨을 1 증가시킵니다.");

        // 볼륨 감소
        volume--;
        System.out.println("볼륨을 1 감소시킵니다.");

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태");
        if (isPlaying) {
            System.out.println("현재 음악이 재생 중입니다.");
        } else {
            System.out.println("현재 음악이 재생 중이 아닙니다.");
        }

        // 음악 플레이어 끄기
        isPlaying = false;
        System.out.println("음악 플레이어를 끕니다.");
    }
}
