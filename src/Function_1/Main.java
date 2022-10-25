package Function_1;

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,6,8};
        sayHello();
        disPlay(arr);
        System.out.println();
        System.out.println("sum = "+sum(arr));
        System.out.println("total of average = "+average(arr));
        System.out.println("Max of array = " + max(arr));

        System.out.println("Min of array = " + min(arr));
        System.out.println("Ascending of array ");
        sortAscending(arr);
        disPlay(arr);
        System.out.println();
        System.out.println("Descending of array ");
        sortDescending(arr);
        disPlay(arr);
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello ");
        }

    }
    public static void sortDescending(int [] a){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
    public static void sortAscending(int [] a){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
    public static int min(int [] arr){
        int min =arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static int max(int [] arr){
        int max =arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static double average(int [] a){
        int i = sum(a) / a.length;
        return i;
    }
    public static int sum(int [] a){
        int sum=0;
        for (int i=0;i< a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void disPlay(int [] arr){
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] +",");
        }
    }
    public static void sayHello(){
        System.out.println("Hello thoen");
    }
}
