
class StudentSub extends StudentSup {
    int k = 5;

    public StudentSub() {
        super(101, "raj"); // … cal parent constructor
    }

    public void showSub() {
        super.showstud(); // … call parent method
        System.out.println("From Parent K =" + super.k);
    }
    public void show()
    {
        System.out.println("Jai Hanu Man ");
        super.show();
        
    }
}

public class j25SuperDemo {
    public static void main(String[] args) {
        StudentSub obj = new StudentSub();
        obj.showSub();
        obj.show();
    }
}

class StudentSup {
    private int rollno;
    private String name;
    protected int k = 11;

    public StudentSup(int rno, String nm) // …………. Constructor
    {
        rollno = rno;
        name = nm;
    }

    public void showstud() // …………. Method
    {
        System.out.println("Roll no : " + rollno);
        System.out.println("Name  : " + name);
    }

    public void show()
    {
        System.out.println("Jai am Shree Ram Jai Jai Ram");
    }
}
