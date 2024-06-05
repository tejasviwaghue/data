public class j19Volumn {

    public void vol(int s)
    {
        v = s *s *s ;
        System.out.println("Volumn Square : " + v );
    }
    public void area(double s)
    {
        v = s *s *s ;
        System.out.println("Area of Square : " + v );
    }
    public void vol(int r,int h)
    {
        final double PI = 3.14;
        v = 2 * PI * r * r  ;
        System.out.println("Volumn Cylinder : " + v );
    }
    public void vol(int l,int b,int h)
    {
        
        v = l * b * h  ;
        System.out.println("Volumn Rectangle : " + v );
    }

    public static void main(String[] args) {
        j19Volumn obj = new j19Volumn(7);
        obj.vol(9,7,5);
        obj.vol(5);
        obj.vol(7,5);
        obj.area(5);
        
    }
}
