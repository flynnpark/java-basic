package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args){
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isPlaying = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isPlaying = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨을 1 증가시킵니다. 현재 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨을 1 감소시킵니다. 현재 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태를 출력합니다.");
        if (data.isPlaying) {
            System.out.println("현재 음악이 재생 중입니다.");
        } else {
            System.out.println("현재 음악이 재생 중이 아닙니다.");
        }
    }
}
