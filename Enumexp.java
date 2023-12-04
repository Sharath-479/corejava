enum Laptop
{
    Macbook(2000),XPS(2200), ThinkPad(1800),Lenova;

    private int price;

    

    private Laptop() { // default constructor 
        price=500;
    }

    private Laptop(int price) {  //  parameterized constructor
        this.price = price;
    }

    public int getPrice() {  //getter
        return price;
    }

    public void setPrice(int price) {  //setter
        this.price = price;
    }

}


public class Enumexp {
    public static void main(String a[])
    {
        for(Laptop lap : Laptop.values()){  // access all object of enum class.
            System.out.println(lap + " " + lap.getPrice());
        }
    }
}
