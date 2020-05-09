public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        float payment = service.calculate(24, 1000000);
        System.out.println(payment);

        float payment2 = service.calculate(24, 1000000);
        System.out.println(payment2);

        float payment3 = service.calculate(36, 1000000);
        System.out.println(payment3);

    }
}