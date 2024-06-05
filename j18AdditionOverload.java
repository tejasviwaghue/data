public class j18AdditionOverload {
    
    public void sum(int x , int y )
    {
        int ans = x + y ;
        System.out.println("Addition is : "+ ans );
    }

    public void sum(String s1 , String s2 )
    {
        String ans = (s1 + s2).toUpperCase() ;
        System.out.println("Concat  : "+ ans );
    }

    public static void main(String[] args) {
        j18AdditionOverload obj = new j18AdditionOverload();
        obj.sum("raj", "Ram");
        obj.sum(5, 7);
    }

}
