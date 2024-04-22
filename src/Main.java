public class Main {
    public static void main(String[] args) {

        int account = 300;
        int amount = 2300;
        int amountForBonus = 1000;
        int bonus;
        int bonusAmount = amount / 100;
        int totalAmount;

        if (amount > amountForBonus) {
            //     bonus = 1;
            totalAmount = account + amount + bonusAmount;
        } else {
            //     bonus = 0;
            totalAmount = account + amount;
        }
        System.out.println("Сумма счёта: " + totalAmount);
    }
}


