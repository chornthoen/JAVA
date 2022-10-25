package Array_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        maxArray();
        sumArray();
        //updateArrayUsingDo();
        updateArrayUsingWhile();
        //inputArray();

    }

    public static void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Number "+(i+1) + ": ");
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }

    }
    public static void maxArray(){
        int[] arr= {3,5,7,8,9,22};
        int max=0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Max of Array = "+max);
    }
    public static void sumArray(){
        int[] arr= {3,5,7,8,9,22};
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of Array = "+sum);
    }
    public static void updateArrayUsingDo(){
        Scanner scanner=new Scanner(System.in);
        int[] arr= {3,5,7,8,9,22};
        System.out.println("Original Array...");
        System.out.println(Arrays.toString(arr));
        int index=0;
        do {
            System.out.print("Input index to update:");
            index=scanner.nextInt();
            System.out.println("Invalid index, please input again!!");
        }while (index<0 || index>arr.length-1);

        System.out.print("Input new value:");
        int newValue=scanner.nextInt();

        arr[index]=newValue;
        System.out.println("After update...");
        System.out.println(Arrays.toString(arr));
    }


    public static void updateArrayUsingWhile(){
        Scanner scanner=new Scanner(System.in);
        int[] arr= {3,5,7,8,9,22};
        System.out.println("Original Array...");
        System.out.println(Arrays.toString(arr));
        System.out.print("Input index to update:");
        int index=scanner.nextInt();
        while (index<0 || index>arr.length-1){
            System.out.println("Invalid index, please input again!!");
            System.out.print("Input index to update:");
            index = scanner.nextInt();
        }
        System.out.print("Input new value:");
        int newValue=scanner.nextInt();

        arr[index]=newValue;
        System.out.println("After update...");
        System.out.println(Arrays.toString(arr));
    }


}


