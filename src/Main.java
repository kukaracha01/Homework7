public class Main {
    public static void main(String[] args) {
        System.out.println("OldTask8");
        int summInMonth = 29000;
        int allMoney = 0;
        for (int i = 1; i <= 12; i++) {
            allMoney = allMoney + summInMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + allMoney + " рублей");
        }

        System.out.println("OldTask9");
        summInMonth = 29000;
        int allMoneyInBank = 0;
        for (int i = 1; i <= 12; i++) {
            allMoneyInBank = allMoneyInBank + summInMonth;
            allMoneyInBank = allMoneyInBank + allMoneyInBank / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + allMoneyInBank + " рублей");
        }

        System.out.println("Task1");
        summInMonth = 15000;
        allMoneyInBank = 0;
        int month = 1;
        while (allMoneyInBank <= 2_459_000) {
            allMoneyInBank = allMoneyInBank + summInMonth;
            allMoneyInBank = allMoneyInBank + allMoneyInBank / 100;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + allMoneyInBank + " рублей");
        }

        System.out.println("Task2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Task3");
        int populationOfTheCountryY = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            populationOfTheCountryY = populationOfTheCountryY + ((birthRate - mortality) * 1000);
            System.out.println("Год " + year + ", численность населения составляет " + populationOfTheCountryY);
        }

    }
}