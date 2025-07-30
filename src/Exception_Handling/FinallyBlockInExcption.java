package Exception_Handling;

public class FinallyBlockInExcption {
    public static void main(String[] args) {
        
        int arr[] = new int[6];

        try{
            System.out.println(arr[3]);
        // }catch(Exception e ){
        //     System.out.println(e.getMessage());
        }finally{
            System.out.println("I will always Execute");
        }
    }
}
