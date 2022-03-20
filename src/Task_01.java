import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task_01 {
   public static void main(String[] args) throws IOException{
RectangleArea obj = new RectangleArea();
obj.GetData();
obj.ComputeField();
obj.FieldDisplay();

   }
   public static class RectangleArea {
    float length;
    float width;
    float result;

       void GetData() throws IOException {
         BufferedReader rD = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Welcome ");
               System.out.println("Please enter Your Length ");
               length=Float.parseFloat(rD.readLine());
               System.out.println("Please enter Your Width ");
                width=Float.parseFloat(rD.readLine());
      };
       void ComputeField(){
          //Computing the Area
          result=length * width;
       }
       void FieldDisplay(){
          System.out.println("The Area of your rectangle is : "+result);
       }

   }
}
