public class Main {
    public static void main(String[] args) {
        System.out.println("Task8");
        int summInMonth = 29000;
        int allMoney = 0;
        for (int i = 1; i <= 12; i++) {
            allMoney = allMoney + summInMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + allMoney + " рублей");
        }

        System.out.println("Task9");
        summInMonth = 29000;
        int allMoneyInBank = 0;
        for (int i = 1; i <= 12; i++) {
            allMoneyInBank = allMoneyInBank + summInMonth;
            allMoneyInBank = allMoneyInBank + allMoneyInBank / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + allMoneyInBank + " рублей");
        }
    }
}