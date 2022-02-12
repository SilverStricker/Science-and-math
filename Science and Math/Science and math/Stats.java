import java.util.Scanner;
/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats
{
    static Input in=new Input();
    static Output op=new Output();
    public static void stat()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            op.println("Enter 1 for calculating mean for grouped data with no class interval");
            op.println("Enter 2 for calculating mean for grouped data with class intervals");
            op.println("Enter 3 for calculating median for ungrouped data");
            op.println("Enter 4 for calculating mean for ungrouped data");
            op.println("Enter 5 for sorting a list");
            op.println("Enter 6 for creating a horizontal bar graph");
            op.println("Enter 7 for knowing the rules");
            int ch=in.num(4);
            switch(ch)
            {
                case 1:
                Stats.meanUgData();
                break;
                case 2:
                Stats.meanGdata();
                break;
                case 3:
                Stats.median();
                break;
                case 4:
                Stats.mug();
                break;
                case 5:
                Stats.sort();
                break;
                case 6:
                Stats.horgraph();
                break;
                case 7:
                rule();
                break;
                default:
                op.println("Invalid option");
                break;
            }
            op.println("Enter exit to quit statistics and any key to continue");
            String exit=sc.nextLine();
            if(exit.equalsIgnoreCase("exit"))
                break;
        }
    }

    private static void rule()
    {
        op.println("When entering grouped data please enter in inclusive manner");
        op.println("Please be careful when entering data otherwise the computer will print something weird answer");
        op.println("So plese do what the software says to input");
    }

    private static void sort()
    { 
        while(true)
        {
            Scanner sc=new Scanner(System.in);  
            op.println("Enter no of terms");
            int n=in.num("S");
            double list[]=new double[n];
            op.println("Enter the terms");
            for(int i=0;i<n;i++)
            {
                list[i]=in.num();
            }
            op.println("1. for ascending and 2 for descending order");
            String ch = sc.nextLine();
            list=list(list,ch);
            for(int i=0;i<n;i++)
            {
                System.out.println(list[i]);
            }
            op.println("Enter 1 to exit sorting or any key to continue");
            ch=sc.nextLine();
            if(ch.equals("1"))
                break;
        }
    }

    private static double []list(double arr[],String ch)
    {
        if(ch.equals("1"))
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        double t=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
        else if(ch.equals("2"))
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        double t=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
        return arr;
    }

    private static void mug()
    {
        while(true)
        {
            long c=0;
            double sum=0;
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                op.println("Enter exit to quit");
                String ch=sc.nextLine();
                if(ch.equalsIgnoreCase("exit"))
                    break;
                else
                {
                    op.println("Enter a no");
                    double n=in.num();
                    sum=sum+n;
                    c++;
                }
            }
            op.println("The average is "+sum/c);
            op.println("Enter exit to quit mean.");
            String c1=sc.nextLine();
            if(c1.equalsIgnoreCase("exit"))
                break;
        }
    }

    public static void horgraph()
    { 
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            op.println("Enter category of y axis");
            String cgx=sc.nextLine();
            op.println("Enter category of x axis");
            String cgy=sc.nextLine();
            op.println("Enter no of items for y axis");
            int n=in.num("");
            String itemlist[]=new String[n];
            double no[]=new double[n];
            for(int i=0;i<n;i++)
            {
                op.println("Enter what is item no. " +(i+1));
                itemlist[i]=sc.nextLine();
                op.println("Enter quantity of that item");
                no[i]=in.num();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=no[i];j++)
                {
                    op.print("_");
                }
                op.println(itemlist[i]);
            }
            op.println(cgy+"-----"+'\u00BB');
            op.println("Enter 1 to quit horizontal graph");
            String s=sc.nextLine();
            if(s.equals("1"))
                break;
        }
    }

    private double fixi(double xi,double fi)
    {
        return fi*xi;
    }

    private double mean(double sifixi,double sifi)
    {
        return sifixi/sifi;
    }

    private double cm(double ub,double lb)
    {
        return (ub+lb)/2;
    }

    private double di(double xi,double a)
    {
        return xi-a;
    }

    public static void meanUgData()
    {
        Stats ob=new Stats();
        op.println("Enter no. of terms");
        double occ =in.num();
        double xi[]=new double[(int)occ];
        int fi[]=new int[(int)occ];
        for(int i=0;i<occ;i++)
        {
            op.println("Enter xi");
            xi[i]=in.num();
            op.println("Now enter corresponding frequencies");
            fi[i]=(int)in.num();
        }       
        op.println("xi"+'\t'+"fi"+'\t'+"fixi");
        for(int i=0;i<occ;i++)
        {
            op.println(xi[i]+"\t"+fi[i]+"\t"+ob.fixi(fi[i],xi[i]));
        }
        double s=0;
        for(int i=0;i<occ;i++)
        {
            s+=fi[i];
        }
        int dfixi=0;
        for(int i=0;i<occ;i++)
        {
            dfixi+=ob.fixi(xi[i],fi[i]);
        }
        op.println(" "+"\t"+s+"\t"+dfixi);
        op.println("The mean is "+ob.mean(dfixi,s));
    }

    public static void meanGdata()
    {
        Stats ob=new Stats();
        op.println("Enter no. of terms");
        double occ =in.num();
        double xi[]=new double[(int)occ];
        double lb[]=new double[(int)occ];
        double ub[]=new double[(int)occ];
        int fi[]=new int[(int)occ];
        for(int i=0;i<occ;i++)
        {
            op.println("Enter lower bound");
            lb[i]=in.num();
            op.println("Now enter corresponding upperbound");
            ub[i]=(int)in.num();
            op.println("Now enter corresponding frequencies");
            fi[i]=(int)in.num();
        }
        double a=(lb[(int)occ/2]+ub[(int)occ/2])/2;
        for(int i=0;i<occ;i++)
        {
            xi[i]=ob.cm(ub[i],lb[i]);
        }
        op.println("Class Interval"+'\t'+"fi"+'\t'+"xi"+'\t'+"fixi");
        for(int i=0;i<occ;i++)
        {
            op.println(lb[i]+"-"+ub[i]+"\t"+fi[i]+"\t"+xi[i]+'\t'+ob.fixi(xi[i],fi[i]));
        }
        double sf=0;
        for(int i=0;i<occ;i++)
        {
            sf+=fi[i];
        }
        double sfixi=0;
        for(int i=0;i<occ;i++)
        {
            sfixi+=ob.fixi(xi[i],fi[i]);
        }
        op.println("\t\t"+sf+"\t"+sfixi);
        op.println("The mean is "+ob.mean(sfixi,sf));
    }

    private double median(double arr[],boolean oe,int n)
    {
        if(oe)        
        {
            n=n-1;
            return 0.5*(arr[((n+1)/2)-1]+arr[(int)(n/2)+1-1]);
        }
        else
        {
            return arr[(n+1)/2-1];
        }
    }

    private double q1(double arr[],boolean oe,int n)
    {
        if(oe)        
        {
            double t=n/4.0;
            t=t-1;
            return arr[(int)t];
        }
        else
        {
            double t=(n+1)/4.0;
            t=t-1;
            return arr[(int)t];
        }
    }

    private double q3(double arr[],boolean oe,int n)
    {
        if(oe)        
        {
            double t=3*n/4.0;
            t=t-1;
            return arr[(int)t];
        }
        else
        {
            double t=3*(n+1)/4.0;
            t=t-1;
            return arr[(int)t];
        }
    }

    private double q3q1(double arr[],boolean oe,int n)
    {
        return q3(arr,oe,n)-q1(arr,oe,n);
    }

    public static void median()
    {
        Stats ob=new Stats();
        op.println("Enter no. of terms");
        double n =in.num();
        double data[]=new double[(int)n];
        op.println("Enter terms");
        for(int i=0;i<n;i++)
        {
            data[i]=in.num();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(data[j]>data[j+1])
                {
                    double t=data[j];
                    data[j]=data[j+1];
                    data[j+1]=t;
                }
            }
        }
        boolean b = (n%2==0);
        op.println("Median is "+ob.median(data,b,(int)(n+1)));
        op.println("Q1 is "+ob.q1(data,b,(int)(n+1)));
        op.println("Q3 is "+ob.q3(data,b,(int)(n+1)));
        op.println("Inter-quartile range is "+ob.q3q1(data,b,(int)(n+1)));
        op.println("Semi-Inter-quartile range is "+ob.q3q1(data,b,(int)(n+1))/2);
    }
}