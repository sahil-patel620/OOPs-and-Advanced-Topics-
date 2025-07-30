package Exception_Handling;

public class MainClass {
    
    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("Hello Guys ");

        try {
            System.out.println(arr[8]);
            int result = 5 /0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of bound");
        }
    }

    
}
