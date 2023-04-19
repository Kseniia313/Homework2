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
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var overAllWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров " + overAllWeight + " кг");
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между боксерами " + difference + " кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var difference1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между боксерами первым способом " + difference1 + " кг");
        var difference2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между боксерами вторым способом " + difference2 + " кг");

    }

    public static void task8() {
        System.out.println("Задача 8");
        var allWorkHours1 = 640;
        var workHourForOneEmployer = 8;
        var TotalEmployees1 = allWorkHours1/workHourForOneEmployer;
        System.out.println("Всего работников в компании " + TotalEmployees1 + " человек");
        var TotalEmployees2 = TotalEmployees1+94;
        var allWorkhours2 = TotalEmployees2*8;
        System.out.println("Если в компании работает " + TotalEmployees2 + " человек, то всего " + allWorkhours2 + " часов работы может быть поделено между сотрудниками.");



    }
}