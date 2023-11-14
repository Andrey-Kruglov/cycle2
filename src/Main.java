public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");

        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
            System.out.println();
            System.out.println("Задача 3");
            long population = 12_000_000;
            int spawnOneThousand = 17;
            int deadOneThousand = 8;
            long growth = 0;
            for (int l = 1; l <= 10; l++) {
                population = population + growth;
                growth = population / 1000 * (spawnOneThousand - deadOneThousand);
                System.out.println("Год " + l + ", численность насиления составляет " + population);
            }
            System.out.println("Задача 4");
            float contribution = 15000;
            float percent = 0.07f;
            for (int u = 0; contribution < 12_000_000; u++) {
                contribution = contribution + contribution * percent;
                System.out.println("В " + u + " месяц, на вкладе " + contribution);
            }
            System.out.println("Задача 5");
            float contribution1 = 15000;
            float percent1 = 0.07f;
            for (int z = 1; contribution1 < 12_000_000; z++) {
                contribution1 = contribution1 + contribution1 * percent1;
                if (z % 6 == 0) {
                    System.out.println("В " + z + " месяц, на вкладе " + contribution1);
                }
            }
            System.out.println("Задача 6");
            float contribution2 = 15000;
            float percent2 = 0.07f;
            int yearsY9 = 12 * 9;
            for (int r = 1; r < yearsY9; r++) {
                contribution2 = contribution2 + contribution2 * percent2;
                if (r % 6 == 0) {
                    System.out.println("В " + r + " месяц, на вкладе " + contribution2);
                }

            }


            System.out.println("Задача 7");
            int f = 6;
            if (f <= 7) {
                for (int a = 1; a <= 31; a++) {
                    int friday = a + 7;
                    if ((friday - f) % 7 == 0) {
                        System.out.println("Сегодня пятница," + a + "-е число. необходимо подготовить отчет.");

                    }


                }
                System.out.println("Задача 8");
                int years = 2023;
                int beforeYears = years - 200;
                int afterYears = years + 100;
                for (int y = 0; y <afterYears; y += 79){
                    if (y > beforeYears){
                        System.out.println(y);
                    }
                }



            }


        }


    }

}