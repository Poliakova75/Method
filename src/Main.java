import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int clientDeviceYear = 2014;
        String clientOS = "Android";

        if (clientDeviceYear < 2015) {
            if (clientOS.equals("iOS")) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS.equals("Android")) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите приложение по ссылке");
        }
    }
    public static void task2(){
        System.out.println("\nЗадача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0; //(0 - iOS, 1 - Android)

        showDownloadMessage(clientOS, clientDeviceYear);
    }
    public static void showDownloadMessage(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для " + (clientOS == 0 ? "iOS" : "Android") + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + (clientOS == 0 ? "iOS" : "Android") + " по ссылке");
        }
    }
    public static void task3(){
        System.out.println("\nЗадача 3");
        int deliveryDistance = 19; // Дистанция до клиента

        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}


