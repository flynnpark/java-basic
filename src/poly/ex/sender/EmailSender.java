package poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일로 메시지를 보냅니다: " + message);
    }
}
