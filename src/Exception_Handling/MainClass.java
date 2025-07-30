package Exception_Handling;

public class MainClass {

    public static void main(String[] args) {
        int arr[] = new int[5];

        System.out.println("Hello Guys ");

        // try {
        // int result = 5 /0;
        // System.out.println(arr[8]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array is out of bound");
        // }catch(ArithmeticException e){
        // System.out.println("Exception: "+ e.getMessage());
        // System.out.println(e.getStackTrace());
        // System.out.println(e);
        // }

        // 2nd way of handling exception

        // try {
        // int result = 8/0;
        // System.out.println(arr[7]);

        // } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
        // System.out.println("Handling the exception.");
        // }

        // 3rd Way to handle exception

        try {
            int result = 8 / 0;
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println("Handling all types of exceptions. ");
        }
    }

}
