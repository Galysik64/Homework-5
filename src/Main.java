public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Нет такой операционной системы.");
        }
        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs != 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите приложение.");
        }

        System.out.println("Задание 3");
        int year = 2020;
        boolean leapBone = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapBone = true;
                } else {
                    leapBone = true;
                }
            }
            if (leapBone) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год не високосный");
            }
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int travelTime = 1;
        if (deliveryDistance < 20) {
            travelTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            travelTime = 2;

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            travelTime = 3;
        } else {
            travelTime = -1;
        } if (travelTime != -1) {
            System.out.println("Потребуется дней: " + travelTime + " дня срок доставки.");
        } else { System.out.println("Доставки нет");
        }

        System.out.println("Задание 5");

     int monthNumber = 12;
     switch (monthNumber) {
         case 12:
         case 1:
         case 2:
             System.out.println("Зима.");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("Весна.");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("Лето.");
             break;
         case 9:
         case 10:
         case 11:
             System.out.println("Осень.");
             break;
         default:
             System.out.println("Еще не придумали.");
     }

     }



    }

