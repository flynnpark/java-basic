package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void turnOn() {
        isOn = true;
        System.out.println("음악 플레이어를 켭니다.");
    }

    void turnOff() {
        isOn = false;
        System.out.println("음악 플레이어를 끕니다.");
    }

    void volumeUp() {
        volume += 1;
        System.out.println("볼륨을 올립니다. 현재 볼륨: " + volume);
    }

    void volumeDown() {
        volume -= 1;
        System.out.println("볼륨을 내립니다. 현재 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어의 전원: " + (isOn ? "켜짐" : "꺼짐"));
        System.out.println("음악 플레이어의 볼륨: " + volume);
    }
}
