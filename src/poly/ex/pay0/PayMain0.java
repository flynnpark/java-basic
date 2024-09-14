package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // Kakao 결제
        String payOption1 = "kakao";
        int amount1 = 10000;
        payService.processPay(payOption1, amount1);

        // Naver 결제
        String payOption2 = "naver";
        int amount2 = 20000;
        payService.processPay(payOption2, amount2);

        // 알 수 없는 결제 수단
        String payOption3 = "unknown";
        int amount3 = 30000;
        payService.processPay(payOption3, amount3);
    }
}
