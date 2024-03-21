import java.awt.*;
import java.applet.*;
/*
<applet code =Prog9_dividecircle width=400 height=450>
</applet>*/

public class Prog9_dividecircle extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(10,10,100,100);
        g.drawLine(60,10,60,110);
        g.drawLine(10,60,110,60);
        g.drawLine(25,25,95,95);
        g.drawLine(95,25,25,95);
    }
}