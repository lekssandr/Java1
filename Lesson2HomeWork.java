/**
 * Java 1. Homework 2
 * 
 * @author Aleksandr
 * @version 17.01.2022
 */
 class Lesson2HomeWork {
    public static void main(String[] args) {
        iswithin10and20(15, 3);
        isPositiveOrNegative(15);
        isNegative(0);
        printWordNTimes(10, "Java 1. Homework 2");
    }
    static boolean iswithin10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void isPositiveOrNegative(int a) {
        System.out.println (a >= 0? "Positive" : "Negative");
    }
    
    static boolean isNegative (int a) {
        return (a < 0);
    }
    
    static void printWordNTimes(int a, String b) {
        for (int i = 0; i < a; i++){
            System.out.println (b);
        }
    }
}