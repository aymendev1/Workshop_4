import java.awt.*;

public class Task_2 {
    private static class car{
        private String model, brand, year, Color;
        private float price ,quantity;
        public void Car(String model, String brand, String year, String Color, float price, float quantity){
            this.model=model;
            this.brand=brand;
            this.year=year;
            this.Color=Color;
            this.price=price;
            this.quantity=quantity;


        }
        String GetModel(){return model;}
        String GetBrand(){return brand;}
        String GetYear(){return year;}
        String GetColor(){return Color;}
        float GetPrice(){return price;}
        float GetQuantity(){return quantity;}
        void SetModel(String nw){model=nw;}
        void SetBrand(String nw){brand=nw;}
        void SetYear(String nw){year=nw;}
        void SetColor(String nw){Color=nw;}
        void SetPrice(float nw){price=nw;}
        void SetQuantity(float nw){quantity=nw;}
        void Delivery(){quantity+=1;}
        void Sell(){quantity-=1;}
        String ToString(){
            return "Model :"+model+"\n"+
                    "Brand :"+brand+"\n"+
                    "Year :"+year+"\n"+
                    "Color :"+Color+"\n"+
                    "Price :"+price+"\n"+
                    "Quantity :"+quantity+"\n";
        }

    }
    public static void main(String[] args){
    car obj = new car();
    // create object of the Car class by using the constructor
    obj.Car("AMG","Mercedes","2020","White",5000000,20);
    //call and print what the toString() method passes,
    String data=obj.ToString();
    System.out.println(data);
    // call sell
    obj.Sell();
    // calling using GET Method
    String txt="Model : "+obj.GetModel()+" , Brand :"+obj.GetBrand() +" , Year :"+obj.GetYear()+" , Color :"+obj.GetColor()+" , Price : "+obj.GetPrice()+" , Quantity :"+obj.GetQuantity();
    System.out.println(txt);
    //Changing infos using set method
    obj.SetColor("Black");
    obj.SetPrice(6000000);
    obj.SetYear("2022");
    // printing new data after changing
        System.out.println("\nData After Changing using Set Method :");
        System.out.println(obj.ToString());
    }

}

