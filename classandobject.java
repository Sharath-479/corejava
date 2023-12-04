class Addition
{
    int a;

    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}
public class classandobject
{
    public static void main(String a[])
    {
        int x=4;
        int y=5;

        Addition ad=new Addition();

        int res=ad.add(x,y);
        System.out.println(res);

    }
}