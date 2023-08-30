public class Main {
    public static void main(String[] args) {

        int amount = 100; // на счете у клиента
        int add = 1050; // сумма пополнения счета

        System.out.println("Сумма денежных средств на Вашем счете составляет:");
        System.out.println((amount + add) + " рублей");

        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус:");
        System.out.println(bonus);
    }
}
