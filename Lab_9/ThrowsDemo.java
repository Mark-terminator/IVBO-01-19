package Lab_9;
import java.util.Scanner;
public class ThrowsDemo {
    public void getKey(){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter Key");
        String key;
        while(true){
        key = myScanner.nextLine();
        try{
        printDetails(key);
        break;
        }
        catch (Exception e){
            continue;
        }
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception{
        if(key.equals("")){
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
