package poly.ex.sender;

public class FacebookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북으로 메시지를 보냅니다: " + message);
    }
}
