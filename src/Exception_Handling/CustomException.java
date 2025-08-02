package Exception_Handling;

import java.util.Scanner;

public class CustomException {
    
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age>100) {
                throw new MyException("Your age can't be more than 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());//
        }//


        //  if (age>100) {
        //         throw new MyException("Your age can't be more than 100");
        //     }
    }
    

}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
