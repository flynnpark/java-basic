package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args){
        MusicPlayerData data = new MusicPlayerData();

        data.isPlaying = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data.volume++;
        System.out.println("볼륨을 1 증가시킵니다. 현재 볼륨: " + data.volume);

        data.volume++;
        System.out.println("볼륨을 1 증가시킵니다. 현재 볼륨: " + data.volume);

        data.volume--;
        System.out.println("볼륨을 1 감소시킵니다. 현재 볼륨: " + data.volume);

        System.out.println("음악 플레이어 상태를 출력합니다.");
        if (data.isPlaying) {
            System.out.println("현재 음악이 재생 중입니다.");
        } else {
            System.out.println("현재 음악이 재생 중이 아닙니다.");
        }

        data.isPlaying = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
