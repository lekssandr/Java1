/**
 * Java 1. Homework 2
 * 
 * @author Aleksandr
 * @version 17.01.2022
 */
 class Lesson2HomeWork {
    public static void main(String[] args) {
        within10and20(15, 3);
        isPositiveOrNegative(15);
        isNegative(0);
        printWordNTimes(10, "Java 1. Homework 2");
        }
    static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static void isPositiveOrNegative(int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
    static boolean isNegative (int a) {
        if (a < 0) {
            return true;
        } else{
            return false;
        }
    }
    static void printWordNTimes(int a, String b) {
        for (int i = 0; i < a; i++){
            System.out.println (b);
        }
    }
}