package org.waspec;

public class Main {

    public static void main(String[] args) {
        //21题改：Merge Two Sorted Arrays
        int[] myArray1 = {1, 1};
        int[] myArray2 = {0, 0};
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int[] mergedArray = new int[myArray1.length + myArray2.length];
        while (index1 < myArray1.length && index2 < myArray2.length) {
            if (myArray1[index1] <= myArray2[index2]) {
                mergedArray[index] = myArray1[index1];
                index1++;
                index++;
            } else {
                mergedArray[index] = myArray2[index2];
                index++;
                index2++;
            }
        }
        if (index1 == myArray1.length) {
            while (index2 < myArray2.length) {
                mergedArray[index] = myArray2[index2];
                index++;
                index2++;
            }
        } else {
            while (index1 < myArray1.length) {
                mergedArray[index] = myArray1[index1];
                index++;
                index1++;
            }
        }
        for (int e : mergedArray){
            System.out.println(e);
        }
    }
}
