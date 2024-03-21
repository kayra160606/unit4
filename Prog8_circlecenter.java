import java.applet.*;
import java.awt.*;
import java.util.Random;
/*
<applet code =Prog8_circlecenter width=400 height=400>
<param Name ="radius"Value="100">
</applet>*/
public class Prog8_circlecenter extends Applet
{
    public void paint(Graphics g)
    {
        Dimension d=getSize();
        int xc=d.width/2;
        int yc=d.width/2;
        String str1;
        int r1;
        str1=getParameter("radius");
        r1=Integer.parseInt(str1);
        g.setColor(Color.cyan);
        g.fillOval(xc-r1,yc-r1,2*r1,2*r1);
    }
}