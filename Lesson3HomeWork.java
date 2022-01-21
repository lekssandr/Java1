/**
 * Java 1. Homework 3
 * 
 * @author Aleksandr
 * @version 21.01.2022
 */
 import java.util.Arrays;
 
  class Lesson3HomeWork {
    public static void main(String[] args) {
        invertArray();
        changeArray();
        fillArray();
        fillDiagonal();
        returnArray(15, 5);
    }
    
    static void invertArray() {
        int[] arrFirst = { 1, 0, 0, 1, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arrFirst));
        for (int i = 0; i < arrFirst.length; i++) {
            if (arrFirst[i] == 1) {
                arrFirst[i] = 0;
            } else {
                arrFirst[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arrFirst));
    }
    
    static void fillArray() {
        int[] arrSecond = new int[100];
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrSecond));
    }
    
    static void changeArray(){
        int[] arrThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }
    
    static void fillDiagonal() {
        int[][] arrFour = new int[5][5];
        for (int i = 0; i < arrFour.length; i++) {
            arrFour[i][i] = 1;
        }
        Arrays.stream(arrFour).map(Arrays::toString).forEach(System.out::println);
    }
    
    static int [] returnArray(int a, int b) {
        int[] arrFive = new int[a];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = b;
        }
        return arrFive;
        //System.out.println(Arrays.toString(arrFive));
    }
}
