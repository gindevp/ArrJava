import java.util.Scanner;

public class addEArr {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        arr=new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("mang là:");
        for (int x: arr) {
            System.out.println(x);
        }
        System.out.println("index can them:");
        int index = scanner.nextInt();
        System.out.println("pt can them");
        int num = scanner.nextInt();

        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];

        }
        arr[index]=num;
        System.out.println("mang là:");
        for (int x: arr) {
            System.out.println(x);
        }
    }
}
