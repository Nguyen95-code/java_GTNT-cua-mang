import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap size ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("size vuot qua gioi han.");
            }
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap du lieu "+(i+1)+" :");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("mang vua nhap la :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min=array[0];
        for (int j=0;j<array.length;j++){
            if (min>array[j]){
                min=array[j];
            }
        }
        System.out.println("Min la : "+min);
    }
}
