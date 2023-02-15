public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2)
            if (i % 2 == 0) {
                System.out.println("Интерация " + i);
            }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int y = 1904; y < 2096; y = y + 4) {
            System.out.println(y + " является високосным годом.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i=1; i<=10; i++){
            int k = 2;
            System.out.println(k*i);
        }
    }
}