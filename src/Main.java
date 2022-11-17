public class Main {
    public static void main(String[] args) {
        int startingScore = 200;
        int refill = 1300;
        int finalScore = startingScore + refill;
        boolean present = refill > 1000;

        int bonus;
        if (present) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println((finalScore) + " Счёт клиента после пополнения ");
        System.out.println((bonus) + " Бонус за пополнение счёта на 1000 рублей и больше ");
    }
}