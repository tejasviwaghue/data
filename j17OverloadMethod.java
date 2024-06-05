public class j17OverloadMethod {
    int n1 , n2 ;
public j17OverloadMethod()
{
    n1 = 5 ;
    n2 = 7 ;
}

public j17OverloadMethod(int a , int b )
{
    n1 = a ;
    n2 = b ;
}

public j17OverloadMethod(int x )
{
    n1 = x ;
    n2 = x ;
}
    public void addNos()
    {
        int ans = n1 + n2 ;
        System.out.println("Addition is " + ans);
    }

    // public int addNos()
    // {
    //     int ans = n1 + n2 ;
    //     return(ans);
    // }
    public static void main(String[] args) {
        j17OverloadMethod obj = new j17OverloadMethod();
        obj.addNos();

        j17OverloadMethod obj1 = new j17OverloadMethod(13,20);
        obj1.addNos();

        j17OverloadMethod obj2 = new j17OverloadMethod(7);
        obj2.addNos();
    }
}
