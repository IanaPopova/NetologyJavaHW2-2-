public class Main {
    public static void main(String[] args) {

        int account = 300;
        int amount = 500;
        boolean amountExceeds = true;
        int bonus;
        int bonusAmount = amount / 100;
        int totalAmount = account + amount + bonusAmount;


        if (amountExceeds) {
            bonus = 1;
            totalAmount = account + amount + bonusAmount;

            if (amount > 1000) {
                bonus = 1;
            } else {
                bonus = 0;
            }
            if (amount < 1000) {
                bonus = 0;
                totalAmount = account + amount;
            }

            System.out.println("Сумма счёта: " + totalAmount);
        }
    }
}
