public class Main {
    public static void main(String[] args) {
        task1();// задача 1
        task2();// задача 2
        task3();// задача 3
        task4();// задача 4
        task5();// задача 5
        task6();// задача 6
        task7();// задача 7
        task8();// задача 8
        task9();// задача 9
        task10();//задача 10
        //task11();
    }


    public static void task1() {
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация" + i);
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация" + i);
        }
    }

    public static void task3() {
        System.out.println("\nЗадание 3");

        for (int i = 1; i <= 17; i++) {
            System.out.println("Итерация " + i);
        }
    }

    public static void task4() {
        System.out.println("\nЗадание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация " + i);
        }
    }

    public static void task5() {
        System.out.println("\nЗадание 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Год является високосным " + i);
        }
    }

    public static void task6() {
        System.out.println("\nЗадание 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Последоватьельность " + i);
        }
    }

    public static void task7() {
        System.out.println("\nЗадание 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность " + i);
        }
    }

    public static void task8() {
        System.out.println("\nЗадание 8");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("\nЗадание 9");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("\nЗадание 10");

        int a = 2;
        for (int i = 2; i <= 10; i++ ) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
