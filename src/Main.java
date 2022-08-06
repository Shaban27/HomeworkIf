public class Main {
    public static void main(String[] args) {

        // задание 1
        int clientOS = 0;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке»");

        // задание №2
        int clientDeviceYear = 2014;
        int android = 2015;
        if (android > clientDeviceYear) {
            System.out.print("Установите облегченную версию приложения");
        } else {
            System.out.print("Установить версию приложения для");
        }
        if (clientOS >= 1) {
            System.out.println(" iOS по ссылке");
        } else {
            System.out.println(" Android по ссылке»");
        }

        // задание № 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year +"год высокосный");
       } else {
            System.out.println(year + "год не высокосный");
        }

        //задание № 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int distance = 40;
        int firstdistance =20;
        if (deliveryDistance <= firstdistance) {
            deliveryDays = 1;
        } else {
           deliveryDays = deliveryDays + (int)Math.ceil ((deliveryDistance - firstdistance)/ (double) distance);
        }
           System.out.println("Потребуется дней;" + deliveryDays);


        // задание №5
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
                System.out.println("Декабрь");

        }



    }
}












