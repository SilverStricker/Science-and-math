import java.util.Scanner;
/**
 * Write a description of class Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input
{
    private static Scanner sc=new Scanner(System.in);
    private static Input ob=new Input();
    private static Output op=new Output();
    /**
     * Constructor for objects of class Input
     */
    public Input()
    {

    }

    private void mes()
    {
        Output op=new Output();
        op.println("Enter again\nInvalid Input to the context");
    }

    public double num()
    {  double k=0;String s="";
        do
        {
            s=sc.nextLine();
            try
            {
                k= Double.parseDouble(s);
                break;
            }
            catch(Exception ob)
            {
                op.println("Invalid input\nPlease input numbers only");
                continue;
            }
        }while(true);
        return k;
    }

    public int num(String x)
    {  int k=0;String s="";
        do
        {
            s=sc.nextLine();
            try
            {
                k= Integer.parseInt(s);
                break;
            }
            catch(Exception ob)
            {
                op.println("Invalid input\nPlease input numbers only");
                continue;
            }
        }while(true);
        return k;
    }

    public int num(int x)
    {  int k=0;int s=0;
        do
        {
            k=0;
            try
            {
                s=sc.nextInt();
                sc.nextLine();
            } 
            catch(Exception e)
            {
                ob.mes();
                k++;
            }   
        }while(k==1);
        return (s);
    }
}