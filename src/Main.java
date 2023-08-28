public class Main {
    public static void main(String[] args) {

        int amount = 100; // на счете у клиента
        int add = 10000; // сумма пополнения счета
        int all = amount + add;

        System.out.println("Сумма денежных средств на Вашем счете составляет:");
        System.out.println((amount + add) + " рублей");

        int bonus = all - 1000;
        if (bonus > 1000) {
            bonus = all - 1000;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус:");
        System.out.println(bonus);
    }
}
