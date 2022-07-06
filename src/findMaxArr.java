import java.util.Scanner;

public class findMaxArr {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("enter a size:");
            size= scanner.nextInt();
            if(size>20) System.out.println("size not 20");
        }while (size>20);
        array= new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter"+(i+1)+":");
            array[i]= scanner.nextInt();


        }
        int max= array[0];
        int index=1;
        for (int j = 0; j < array.length; j++) {
            if(array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println(max+""+index);
    }
}
