package com.company;
public class Main {

    public static void main(String[] args) {
        int [] inArray = new int[]{14,2,-5, 1, 8,-3,7,13,-20,-3};
        printArray(inArray);
        firstArray(inArray);
        twoMax(inArray);
    }

    private static void twoMax(int [] inArray){
        int max1,max2;
        max1 = Integer.MIN_VALUE;
        max2 = Integer.MIN_VALUE;

        System.out.println("Вторая часть:");
        for (int i = 1; i < inArray.length; i++) {
            if(inArray[i]>max1){
                max2= max1;
                max1 = inArray[i];
            }
        }
        if(inArray[inArray.length-1]>max2){
            max2=inArray[inArray.length-1];
        }
        System.out.println("max1 = "+max1);
        System.out.println("max2 = "+max2);

        //эффективность метода inArray.length
    }

    private static void firstArray(int[] inArray){
        System.out.println("Первая задача");
        for (int i = 0; i < inArray.length; i++) {
            for (int j = i+1; j < inArray.length; j++) {
                for (int k = j+1; k < inArray.length; k++) {
                    if((inArray[i]+inArray[j]+inArray[k] == 0)){
                        System.out.print(inArray[i]+" "+inArray[j]+" " +inArray[k]+" ");
                        System.out.println();
                    }
                }
            }
        }
        //эффективность метода inArray.length^3
    }

    private static void printArray(int[] inArray){
        for (int i = 0; i < inArray.length; i++) {
            System.out.print(inArray[i]+ " ");
        }
        System.out.println();
    }
}
