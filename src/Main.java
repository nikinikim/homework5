public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();

    }

    public static void Task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }

    }

    public static void Task2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложеня для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегчнную версию приложения для Android по ссылке");
        }

    }

    public static void Task3() {
        int year = 2021;
        boolean leapYear= ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }

    }

    public static void Task4() {
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryTime + 1));
        }else{
            System.out.println("Потребуется дней " + (deliveryTime + 2));
        }
    }

    public static void Task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}

