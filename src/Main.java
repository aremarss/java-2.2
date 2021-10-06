public class Main {
    public static void main(String[] args) {
        int cash = 100; // Количество денег у клиента на счету.
        int cashAdd = 1100; // Количество денег, которые хочет пополнить клиент.
        int bonusAmount; // Сумма бонусов.

        if (cashAdd >= 1000) {
            bonusAmount = cashAdd / 100; // Можно менять количество рублей, с которых будет начисляться один бонус.
        } else {
            bonusAmount = 0;
        }

        int cashTotal = cash + cashAdd + bonusAmount; // Итоговое количество денег на счете.

        System.out.println("Количество денег на текущем счете клиента: " + cashTotal + " руб.");
        System.out.println("Количество бонусных рублей: " + bonusAmount + " руб.");
    }
}