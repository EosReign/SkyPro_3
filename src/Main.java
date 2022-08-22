public class Main {
    public static void main(String[] args) {
        //----------FirstTask---------------
        System.out.println("=============FirstTask=============");

        long clientOS = Math.round(Math.random());
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        //----------SecondTask---------------
        System.out.println("=============SecondTask=============");

        long clientDeviceYear = Math.round(2000 + (Math.random() * 10) * 3);
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //----------ThirdTask---------------
        System.out.println("=============ThirdTask=============");

        long year = Math.round(Math.random() * 10000);
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //----------FourthTask---------------
        System.out.println("=============FourthTask=============");

        short distanceToClient = 95;
        short deliveryTime = 2;
        if (distanceToClient <= 20) {
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        } else if (distanceToClient <= 60) {
            deliveryTime++;
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        } else if (distanceToClient <= 100) {
            deliveryTime += 2;
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        }
        //----------FifthTask---------------
        System.out.println("=============FifthTask=============");

        short monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует. Если вы инопланетянин или человек из далекого прошлого или будущего, то на данный момент версия приложения не актуальна. Glib-Gloop");
        }
    }
}