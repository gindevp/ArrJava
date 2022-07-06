public class combineArr {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4,5,6};
        int arr2[]= {7,8,9,10,11,12};

        int [] arr3= new int[arr1.length+arr2.length];
        int index=0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
            index=i;
        }
        System.out.println("index:"+index);
        for (int i = index+1; i < arr3.length ; i++) {
            arr3[i]=arr2[i- arr1.length];
        }
        System.out.println("arr3");
        for (int x:arr3
             ) {
            System.out.println(x);
        }
    }
}
