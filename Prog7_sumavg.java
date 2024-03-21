import java.applet.*;
import java.awt.*;

/*<applet code =Prog7_sumavg width=400 height=400>
<param Name ="a1"Value ="10">
<param Name ="a2"Value ="20">
</applet>*/
public class Prog7_sumavg extends Applet
{
    public void init()
    {
        setBackground(Color.red);
        setBackground(Color.blue);
    }
    public void paint(Graphics g)
    {
        String str1,str2;
        int n1,n2,sum=0,avg=0;

        str1=getParameter("a1");
        str2=getParameter("a2");

        n1=Integer.parseInt(str1);
        n2=Integer.parseInt(str2);

        sum=n1+n2;
        avg=sum/2;
        g.drawString("The Sum is:"+sum,50,100);
        g.drawString("The Average is:"+avg,50,200);
    }
}