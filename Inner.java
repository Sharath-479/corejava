class A 
{
    public int age = 15;

    public void show()
    {
        System.out.println("In show");
    }

    class B 
    {
        public void config(){
            System.out.println("In config");
        }
    }

    static class C{
        public void play(){
            System.out.println("In play");
        }
    }

}




public class Inner {
    public static void main(String a[]){

        A obj = new A();

        obj.show();
        System.out.println(obj.age);

        A.B obj1 = obj.new B();
        obj1.config();


        // If inner class is static then we can use Class name for creating object.

        A.C obj2 = new A.C();

        obj2.play();
    }
}
