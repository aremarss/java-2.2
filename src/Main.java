public class Main {
    public static void main(String[] args) {
        int cash = 100; // Количество денег у клиента на счету.
        int cashAdd = 1100; // Количество денег, которые хочет пополнить клиент.
        int bonusAmount; // Сумма бонусов.
        int totalCash; // Итоговое количество денег не счете.

        if (cashAdd >= 1000) {
            bonusAmount = cashAdd / 100; // Можно менять количество рублей, с которых будет начисляться один бонус.
            totalCash = cash + cashAdd + bonusAmount;

        } else {
            bonusAmount = 0;
            totalCash = cash + cashAdd;
        }
        System.out.println("Количество денег на текущем счете клиента: " + totalCash + " руб.");
        System.out.println("Количество бонусных рублей: " + bonusAmount + " руб.");// Бонусы не показываются.
    }
}