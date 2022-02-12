/**
 * Write a description of class Relativity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phy
{
    Output op=new Output();
    double mc(double kg)
    {
        return kg*Math.pow(299792458,2);
    }

    double resist(double r[])
    {
        double s=0;
        for(int i=0;i<r.length;i++)
            s+=r[i];
        return s;
    }

    double resist(double r[],boolean b)
    {
        double s=0;
        for(int i=0;i<r.length;i++)
            s+=1.0/r[i];
        return Math.pow(s,-1);
    }

    double temp(double m1,double t1,double c1, double m2,double t2,double c2)
    {
        double x=(m2*c2)/(m1*c1);
        return (x*t2+t1)/(1+x);
    }

    double work(double f,double t, double s)
    {
        return f*Math.cos(t)*s;
    }

    double torque(double f,double s)
    {
        return f*s;
    }

    double couple(double f ,double s1,double s2)
    {
        return f*(s1+s2);
    }

    double u(double m,double g,double h)
    {
        return m*g*h;
    }

    double k(double m,double v)
    {
        return 0.5*m*v*v;
    }

    double rf(double i,double r)
    {
        return i/r;
    }

    double rf(double i,double r,boolean b)
    {
        return Math.sin(i)/Math.sin(r);
    }

    double wl(double v,double f)
    {
        return v/f;
    }

    double vwl(double w,double f)
    {
        return w*f;
    }

    private void options()
    {
        op.println("1. for calculating energy released by a radioactive substance");
        op.println("2. for calculating kinetic energy of a body");
        op.println("3. for calculating the final temperature when two bodies are kept at contact by principle of calorimetry");
        op.println("4. for calculating velocity of a wave");
        op.println("5. for calculating time period of a simple pendulum on Earth");
        op.println("6. for calculating resistance in series");
        op.println("7. for calculating resistance in parallal");
        op.println("8. for calculating angular velocity");
        op.println("9. for calculating centrepetal force");
        op.println("10. for calculating heat dissipated in an electric circuit by Joule's law");
        
    }

    public static void phy()
    {
        Phy ob=new Phy();
        Input in=new Input();
        Output op=new Output();
        double kg=0,v=0,m1=0,m2=0,t1=0,t2=0,c1=0,c2=0,wl=0,fr=0;
        op.println("Enter options");
        ob.options();
        op.println("Enter the values in SI units");
        int opt=(int)in.num();
        switch(opt)
        {
            case 1:
            op.println("Enter mass of the substance in kg");
            kg=in.num();
            op.println("The energy released is "+ob.mc(kg)+"J");
            break;
            case 2:
            op.println("Enter mass of the substance in kg"); 
            kg=in.num();
            op.println("Enter velocity of the object's motion");
            v=in.num();
            op.println("Kinetic Energy is "+ob.k(kg,v)+"J");
            break;
            case 3:
            op.println("Enter mass of the hot body");
            m1=in.num();
            op.println("Enter original temperature of the hot body");
            t1=in.num();
            op.println("Enter specific heat capacity of the hot body");
            c1=in.num();
            op.println("Enter mass of the cold body");
            m2=in.num();
            op.println("Enter original temperature of the cold body");
            t2=in.num();
            op.println("Enter specific heat capacity of the hot body");
            c2=in.num();
            op.println("The final temperature is "+ob.temp(m1,t1,c1,m2,t2,c2)+"K");
            break;
            case 4:
            op.println("Enter wavelength");
            wl=in.num();
            op.println("Enter frequency");
            fr=in.num();
            op.println("The speed of the wave is "+(wl*fr)+"m.s-1");
            break;
            case 5:
            op.println("Enter length of the pendulum");
            double l=in.num();
            double LG=Math.sqrt(l/9.8106);
            op.println("The time period of the simple pendulum is "+(2*Math.PI*LG));
            break;
            case 6:
            op.println("Enter no. of resistors in the circuit");
            m1=in.num(9);
            double r[]=new double[(int)m1];
            for(int i=0;i<r.length;i++)
            {
                op.println("Enter value of resistor "+(i+1));
                r[i]=in.num();
            }
            op.println("The total resistance is "+ob.resist(r));
            break;
            case 7:
            op.println("Enter no. of resistors in the circuit");
            m1=in.num(9);
            double r1[]=new double[(int)m1];
            for(int i=0;i<r1.length;i++)
            {
                op.println("Enter value of resistor "+(i+1));
                r1[i]=in.num();
            }
            op.println("The total resistance is "+ob.resist(r1,true));
            break;
            case 8:
            op.println("Enter distance in radians");
            double s=in.num();
            op.println("Enter time in seconds");
            double t=in.num();
            op.println("The angular velocity is "+(s/t));
            break;
            case 9:
            op.println("Enter radius of the celestial object in metre");
            double rco=in.num();
            op.println("Enter mass of the celestial object in metre");
            double mco=in.num();
            op.println("Enter velocity of the celestial body");
            v=in.num();
            op.println("The centrepetal force is "+(mco*v)/rco);
            break;
            case 10:
            op.println("Enter current flowing through the circuit");
            double I=in.num();
            op.println("Enter resistance in the circuit");
            double R=in.num();
            op.println("Enter time");
            t1=in.num();
            op.println("The heat dissipated is "+I*I*R*t1);
            default:
            op.println("Invalid option");
        }
    }
}