import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[]args) throws IOException {
        System.out.println("Choose what operation you want to preform : \n");
        System.out.println("A- Convert from any system to the decimal system ");
        System.out.println("B- Convert from decimal system to another system ");
        System.out.println("C- Summing up numbers from different systems ");
        System.out.println("D- Subtracting up numbers from different systems");
        System.out.println("E- Multiplying numbers from different systems ");
        System.out.println("F- Dividing numbers from different systems \n");
        System.out.println("W- Exit the program \n");
        System.out.println("Please Enter You Choice ");
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        var UserInput = rd.readLine();
    }
}
