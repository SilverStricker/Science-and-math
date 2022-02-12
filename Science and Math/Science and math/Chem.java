import java.util.Scanner;
/**
 * Write a description of class Chem.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chem
{
    private static Output op=new Output();
    private static Input in=new Input();
    Chem()
    {

    }

    private static void opt()
    {
        op.println("The options are");
        op.println("1. for percentage composition");
        op.println("2. for finding solubility");
        op.println("3. for finding binding energy in an nucleon");
    }

    public static void che()
    {
        opt();
        int ch=in.num("");
        switch(ch)
        {
            case 1:
            op.println("Enter RMM of the compound");
            double rmm=in.num();
            op.println("Enter the RAM of the element or the RMM of the part of the compound like water of crystallization or the mass of the radical");
            double ram=in.num();
            op.println("Percentage composition is "+ram/rmm*100);
            break;
            case 2:
            op.println("Enter weight of solute");
            double solute=in.num();
            op.println("Enter weight of solvent");
            double solvent=in.num();
            op.println("Solubility is "+solute/solvent*100);
            break;
            case 3:
            op.println("Enter total binding energy");
            double tbe=in.num();
            op.println("Enter mass number");
            double ma=in.num();
            op.println("Binding energy per nucleon is "+tbe/ma);
            break;
        }
    }
}