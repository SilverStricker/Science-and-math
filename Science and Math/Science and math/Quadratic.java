import java.util.Scanner;
/**
 * Write a description of class Quadratic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quadratic
{
    private static Output op=new Output();
    private static Input in=new Input();
    public static double r1(double a,double b,double c)
    {
        return ((-b)+(Math.sqrt(d(a,b,c))))/(2*a);
    }

    public static double r2(double a,double b,double c)
    {
        return ((-b)-(Math.sqrt(d(a,b,c))))/(2*a);
    }

    public static double d(double a,double b,double c)
    {
        return ((Math.pow(b,2))-(4*a*c));
    }

    public static void d(double a,double b,double c,boolean b1)
    {
        if(d(a,b,c)==0)
            op.println("real and equal");
        else if(d(a,b,c)>0)
            op.println("real and unequal");
        else
            op.println("imaginary and unequal");
    }   

    public static void quad()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            op.println("Enter the values of the following quadratic equation in the format:");
            op.println("a*x*x +b*x+c=0");
            op.print("a=");
            double a=in.num();
            op.print("b=");
            double b=in.num();
            op.print("c=");
            double c=in.num();
            op.print("The roots are ");
            d(a,b,c,true);
            op.println("Solution set is {"+r1(a,b,c)+","+r2(a,b,c)+"}");
            op.println("Enter 1 to exit quadratic or press any key to repeat");
            String ch=sc.nextLine();
            if(ch.equals("1"))
            break;
        }
    }
}