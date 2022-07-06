import java.util.Scanner;

public class delEArr {
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
        System.out.println("phan tu can tim:");
        int find= scanner.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(find==arr[i]) index=i;
        }
        System.out.println("Phan tu can tim xoa index="+index);
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
              arr[i+1]  =0;
        }
        System.out.println("mang là:");
        for (int y: arr) {
            System.out.println(y);
        }
        }
    }

