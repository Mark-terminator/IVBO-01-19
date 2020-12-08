package Lab_8;
import java.io.*;
import java.util.*;
public class Test {
    public static void main(String arg[]){
    Scanner scanner = new Scanner(System.in);
    String str;
    int ch;
    str = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("C:\\Users\\ychet\\IdeaProjects\\Lab_8\\src\\Lab_8\\T.txt", false);
            writer.write(str);
            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\ychet\\IdeaProjects\\Lab_8\\src\\Lab_8\\T.txt");
            str = "";
            while((ch = reader.read()) != -1){
                str +=(char) ch;

            }
            System.out.println(str);
            str = scanner.nextLine();
            writer.write(str);
            str = scanner.nextLine();
            writer.append(str);
            writer.flush();
            str = "";
            while((ch = reader.read()) != -1){
                str +=(char) ch;

            }
            System.out.println(str);
            writer.flush();
            writer.close();

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
