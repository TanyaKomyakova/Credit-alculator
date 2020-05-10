public class CreditPaymentService {
    public long calculate (int time, int credit){
        double percent = 9.99;
        double year = 12;
        double percentinmontn = percent / year / 100;
        double sum = 1 + percentinmontn;

        double degree = (double) (Math.pow(sum, time));
        double coefficient = ((percentinmontn) * (degree)) / (degree - 1);
        double payment = credit * coefficient;
        final long payment1 = (long) payment;
        return payment1;

    }


}

