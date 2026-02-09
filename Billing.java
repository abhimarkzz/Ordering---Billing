public class Billing {

    public double total(double price[], int qty[]) {
        double sum = 0;
        for (int i = 0; i < price.length; i++) sum += price[i] * qty[i];
        return sum;
    }

    public double gst(double amt) {
        return amt + amt * 0.18;
    }

    public double cashback(double amt) {
        if (amt > 500) return amt - amt * 0.05;
        return amt;
    }

    public int points(double amt) {
        return (int)(amt / 100);
    }
}
