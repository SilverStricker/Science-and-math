import java.util.Scanner;
/**
 * Write a description of class Series here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Series
{
    private static Input in=new Input();
    private static Output op=new Output();
    public static void se()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            op.println("Enter 1 for generating A.P");
            op.println("Enter 2 for generating G.P");
            int ch=in.num("");
            switch(ch)
            {
                case 1:
                ap();
                break;
                case 2:
                gp();
                break;
                default:
                op.println("Invalid option");
            }
            op.println("Enter 1 to exit or press any key to continue");
            String c=sc.nextLine();
            if(c.equals("1"))
                break;
        }
    }

    private static void ap()
    {
        op.println("Enter starting term");
        double a=in.num();
        op.println("Enter common difference");
        double d=in.num();
        op.println("Enter number terms");
        int n=in.num("");
        double an=0;
        double sum=a;
        op.print(a+"\t");
        for(int i=2;i<=n;i++)
        {
            an=a+(i-1)*d;
            op.print(an+("\t"));
            sum=sum+an;
        }
        op.println("\nThe total sum is "+sum);
    }

    private static void gp()
    {
        op.println("Enter starting term");
        double a=in.num();
        op.println("Enter common ratio");
        double r=in.num();
        op.println("Enter number terms");
        int n=in.num("");
        double an=0;
        op.print(a+"\t");
        double sum=a;
        for(int i=2;i<=n;i++)
        {
            an=a*Math.pow(r,i-1);
            op.print(an+"\t");
            sum=sum+an;
        }
        op.println("\nThe total sum is "+sum);
    }
}
