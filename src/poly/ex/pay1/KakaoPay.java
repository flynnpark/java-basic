package poly.ex.pay1;

public class KakaoPay implements PayOption {
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원을 결제합니다.");
        return true;
    }
}
