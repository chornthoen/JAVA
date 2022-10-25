package Array_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
       // searchArrayInt();
        //searchArrayString();
        //insertElement();
        //removeElement();
        //ascendingElement();
        //descendingElement();
        //subEven();
        subOdd();
    }
    public static void subOdd(){
        int[] a={3,5,4,8,2,4,9};
        System.out.println(Arrays.toString(a));
        int count = 0;
        int[] b= new int[a.length];
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                b[count]=a[i];
                count++;
            }
        }
        int[] c = new int[count];
        for (int i=0;i<count;i++){
            c[i]=b[i];
        }
        System.out.println(Arrays.toString(c));

    }

    public static void subEven(){
        int[] a={3,5,4,8,2,4,9};
        System.out.println(Arrays.toString(a));
        int count = 0;
        int[] b= new int[a.length];
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                b[count]=a[i];
                count++;
            }
        }
        int[] c = new int[count];
        for (int i=0;i<count;i++){
            c[i]=b[i];
        }
        System.out.println(Arrays.toString(c));

    }

    public static void descendingElement(){
        int[] arr={3,7,5,4,1,9};
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ascendingElement(){
        int[] arr={3,7,5,4,1,9};
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElement(){
        String[] arr={"Fanta","Coca","Coke","Pepsi","Marinda"};
        System.out.println(Arrays.toString(arr));
        int removeIndex = 1;
        String[] strings= new String[arr.length-1];
        for (int i=0;i<removeIndex;i++){
            strings[i]=arr[i];
        }
        for (int i=removeIndex;i<arr.length;i++){
            strings[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(strings));

    }

    public static void insertElement(){
        String[] arr={"Fanta","Coca","Coke","Pepsi"};
        System.out.println(Arrays.toString(arr));
        String addElement="Water";
        int index = 2;
        String[] strings = new String[arr.length+1];
        for (int i1 = 0; i1< index; i1++) {
            strings[i1] = arr[i1];
        }
        strings[index]=addElement;
        for (int i= index+1;i<strings.length;i++){
            strings[i] =arr[i-1];
        }
        System.out.println(Arrays.toString(strings));
    }

    public static void searchArrayString(){

        String[] arr={"BMW","FORT","Coca","Coke"};
        String searchElement="coca";
        int index =-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(searchElement)){
                index=i;
                break;
            }
        }
        System.out.println("Found at index= "+index);
    }

    public static void searchArrayInt(){
        int[] arr = {3,4,5,6,7,8};
        int searchElement=7;
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==searchElement){
                index=i;
                break;
            }
        }
        System.out.println("Found at index = "+index);
    }
}
