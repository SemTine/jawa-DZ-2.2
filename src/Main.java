public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int replenishment = 1000;

        if (replenishment >= 1000) {
            int bonus = replenishment / 100;
            int price = replenishment + bonus + balans;

            System.out.println("Вы пополненли от 1000 и мы вам начисленли " + bonus + " бонусных рублей , и теперь ваш баланс " + price);


        } else {
            int result = balans + replenishment;
            System.out.println(result + " на балансе");
        }


    }
}