import java.util.Scanner;
/**
 * Write a description of class Science here.
 * 
 * @author (Anubroto Ghose) 
 * @version (6.5)
 */
public class Science
{
    static Phy p=new Phy();
    static Chem c=new Chem();
    static Output op=new Output();
    static Input in=new Input();
    static Scanner sc=new Scanner(System.in);
    public static void dis()
    {
        while(true)
        {
            op.println("Enter 1 for physics");
            op.println("Enter 2 for chemistry");
            int c=in.num(1);
            switch((int)c)
            {
                case 1:
                Phy.phy();
                break;
                case 2:
                Chem.che();
                break;
                default:
                op.println("Invalid option");
                break;
            }
            op.println("Enter exit to quit scientific calculations or any key to continue");
            String S=sc.nextLine();
            if(S.equals("exit"))
            break;
        }
    }
}
