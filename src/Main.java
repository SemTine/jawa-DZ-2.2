public class Main {
    public static void main(String[] args) {
        int balans = 111;
        int price = 999;
        int replenishment = (balans + price);

        if (price > 1000) {
            int bonus = price / 100 * 1;
            System.out.println(replenishment + " рублей теберь на балансе ");
            System.out.println("Плюс " + bonus + " бонусных рублей ");


        } else {
            System.out.println(replenishment + " на балансе");
        }


    }
}