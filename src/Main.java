import java.time.LocalDate;

public class Main {
    public static void space () {
        System.out.println();
    }
    public static void main(String[] args) {

        System.out.println("_________Задание 1_________");
        int year = 2020;
        isLeapYear(year);
        space();

        System.out.println("_________Задание 2_________");
        int clientOS2 = 1;
        int clientDeviceYear = 2012;
        chooseOSSystem(clientOS2);
        chooseDeviceYear(clientDeviceYear);
        space();

        System.out.println("_________Задание 3_________");
        short deliveryDistance = 25;
        calculateDeliveryDistance(deliveryDistance);
        space();
    }
    public static int isLeapYear (int year){
        if (year % 4 == 0) {
            System.out.println(year+" Год является високосным");
        } else {
            System.out.println(year+ " Год не является високосным");
        }
        return year;
    }
    public static int chooseOSSystem (int clientOS2) {
        if (clientOS2 == 1) {
            System.out.println("Установите версию приложение для iOS");
        } else if (clientOS2 == 2) {
            System.out.println("Установите версию приложение для Android");
        }
        return clientOS2;
    }
    public static int chooseDeviceYear (int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            System.out.println("");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения");
        }
        return clientDeviceYear;
    }
    public static int calculateDeliveryDistance (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: сутки ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: два дня ");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: три дня ");
        } else if (deliveryDistance >= 100) {
            System.out.println("Потребуется дней: от четырех дней ");}
        System.out.println();
        return deliveryDistance;
    }
}