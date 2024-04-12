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

        System.out.println("Task4");
        int summInBankForVasiliy = 15000;
        month = 0;
        while (summInBankForVasiliy <= 12_000_000) {
            summInBankForVasiliy = summInBankForVasiliy / 100 * 107;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summInBankForVasiliy);
        }

        System.out.println("Task5");
        month = 0;
        summInBankForVasiliy = 15000;
        while (summInBankForVasiliy <= 12_000_000) {
            summInBankForVasiliy = summInBankForVasiliy / 100 * 107;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + summInBankForVasiliy);
            }
        }

        System.out.println("Task6");
        month = 0;
        summInBankForVasiliy = 15000;
        int allTime = 9 * 12;
        while (month <= allTime) {
            summInBankForVasiliy = summInBankForVasiliy / 100 * 107;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + summInBankForVasiliy);
            }
        }

        System.out.println("Task7");
        int sreemerFriday = 1;
        for (int dayInMonth = 1; dayInMonth <= 31; dayInMonth++) {
            if (dayInMonth == sreemerFriday) {
                sreemerFriday = sreemerFriday + 7;
                System.out.println("Сегодня пятница," + dayInMonth + "-е число. Необходимо подготовить отчет");
            }
        }


    }
}