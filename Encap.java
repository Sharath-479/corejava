class Enc
{
    private int age;
    private String name;


    public int getage(){
        return age;
    }
    public void setage(int x){
        age=x;
    }

    public String getname(){
        return name;
    }
    public void setname(String y){
        name=y;
    }

}


public class Encap
{
    public static void main(String a[])
    {
        Enc obj=new Enc();

        obj.setage(22);
        obj.setname("Sharath");
        System.out.println(obj.getage()+ " : "+ obj.getname());
    }
        
}

//This keyword
// ""This"" refer to the current object, which the method being called.