public class Main {
    public static void main(String[] args) {
        int cash = 100; // Количество денег у клиента на счету.
        int cashAdd = 1100; // Количество денег, которые хочет пополнить клиент.
        int bonusAmount; // Сумма бонусов.
        int cashTotal; // Итоговое количество денег не счете.

        if (cashAdd >= 1000) {
            bonusAmount = cashAdd / 100; // Можно менять количество рублей, с которых будет начисляться один бонус.
            cashTotal = cash + cashAdd + bonusAmount;

        } else {
            bonusAmount = 0;
            cashTotal = cash + cashAdd;
        }
        System.out.println("Количество денег на текущем счете клиента: " + cashTotal + " руб.");
        System.out.println("Количество бонусных рублей: " + bonusAmount + " руб.");
    }
}