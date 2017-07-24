package booleans;

public class Booleans {

   
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3222;
        y=4222;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        System.out.println("There are 6 operators. They are equa (==), not equal (!=), greater than (>), less that (<), greater than or equal to (>=), and less than or equal to (<=).");
   String s1 = "Good morning!";
   String s2 = "Hi there!";
   String s3 = "Howdy partner!";
        boolean g = s1.equals(s2);
   int h = s1.compareTo(s2);
   int i = s2.compareTo(s3);
   boolean b1 = true;
   boolean b2 = false;
   System.out.println("true and true" + (b1 && b1));
   System.out.println("true and false" + (b1 && !b1));
    System.out.println("false and false" + (b2 && b2));
            System.out.println("false and true" + (b2 && b1));
                    System.out.println("true and true" + (!b2 && !b2));
    }
}

